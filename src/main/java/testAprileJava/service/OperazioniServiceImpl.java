package testAprileJava.service;

import java.util.Calendar;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import testAprileJava.model.DettaglioBonifico;
import testAprileJava.model.DettaglioTransazioni;
import testAprileJava.model.RequestBonifico;
import testAprileJava.model.saldo.DettaglioSaldo;
@Service

public class OperazioniServiceImpl implements OperazioniService {
	
	private static String domains = "https://sandbox.platfr.io/";
	
	@Override
	public DettaglioTransazioni getTransazioni() {
		RestTemplate restTemplate;
		RestTemplateBuilder builder = new RestTemplateBuilder();
		restTemplate = builder.build();
		try {
			ResponseEntity<DettaglioTransazioni> dettb =   chiamataTransazioni(restTemplate);
			return dettb.getBody();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;	 
	}
	
	public static ResponseEntity<DettaglioTransazioni>  chiamataTransazioni(RestTemplate restTemplate) throws Exception {
		HttpHeaders headers = new HttpHeaders();
		headers.set("Content-Type", "application/json");
		headers.set("Auth-Schema", "S2S");
		headers.set("Api-Key", "FXOVVXXHVCPVPBZXIJOBGUGSKHDNFRRQJP");

		HttpEntity entity = new HttpEntity(headers);
		ResponseEntity<DettaglioTransazioni> dettaglioTransazioni = restTemplate.exchange(
				domains + "api/gbs/banking/v4.0/accounts/14537780/transactions?fromAccountingDate=2019-01-01&toAccountingDate=2019-12-01", 
				HttpMethod.GET,entity,
				DettaglioTransazioni.class);
		return dettaglioTransazioni;
		
	}
	@Override
	public Integer getSaldo() {
		RestTemplate restTemplate;
		RestTemplateBuilder builder = new RestTemplateBuilder();
		restTemplate = builder.build();
		try {
			ResponseEntity<DettaglioSaldo> dett =   chiamataSaldo(restTemplate);
			return dett.getBody().getPayload().getBalance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;	 
	}
	
	public static ResponseEntity<DettaglioSaldo>  chiamataSaldo(RestTemplate restTemplate) throws Exception {
		HttpHeaders headers = new HttpHeaders();
		headers.set("Content-Type", "application/json");
		headers.set("Auth-Schema", "S2S");
		headers.set("Api-Key", "FXOVVXXHVCPVPBZXIJOBGUGSKHDNFRRQJP");

		HttpEntity entity = new HttpEntity(headers);
		ResponseEntity<DettaglioSaldo> dettaglioSaldo = restTemplate.exchange(
				domains + "api/gbs/banking/v4.0/accounts/14537780/balance", 
				HttpMethod.GET,entity,
				DettaglioSaldo.class);
		return dettaglioSaldo;
		
	}
	
	@Override
	public DettaglioBonifico moneyTransfer(RequestBonifico rb) {
		RestTemplate restTemplate;
		RestTemplateBuilder builder = new RestTemplateBuilder();
		restTemplate = builder.build();
		try {
			ResponseEntity<DettaglioBonifico> dett =   chiamataBonifico(restTemplate, rb);
			return dett.getBody();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;	
		
	}

	public static ResponseEntity<DettaglioBonifico>  chiamataBonifico(RestTemplate restTemplate,RequestBonifico rb ) throws Exception {
		HttpHeaders headers = new HttpHeaders();
		headers.set("Content-Type", "application/json");
		headers.set("Auth-Schema", "S2S");
		headers.set("Api-Key", "FXOVVXXHVCPVPBZXIJOBGUGSKHDNFRRQJP");
	//	RequestBonifico rb = new RequestBonifico();
		
	/*	rb.getCreditor().setName("John Doe");
		rb.getCreditor().getAccount().setAccountCode("IT23A0336844430152923804660");
		rb.getCreditor().getAccount().setBicCode("SELBIT2BXXX");
		rb.getCreditor().getAddress().setAddress(null);
		rb.getCreditor().getAddress().setCity(null);
		rb.getCreditor().getAddress().setCountryCode(null);
		 Calendar cal = Calendar.getInstance();
		 cal.set(Calendar.MONTH, 04);
	        cal.set(Calendar.DATE, 01);
	        cal.set(Calendar.YEAR, 2019);
		rb.setExecutionDate(cal.getTime());
		rb.setUri("REMITTANCE_INFORMATION");
		rb.setDescription("Payment invoice 75/2017");
		rb.setAmount(800);
		rb.setCurrency("EUR");
		rb.setIsUrgent(false);
		rb.setIsInstant(false);
		rb.setFeeType("SHA");
		rb.setFeeAccountId("45685475");
		rb.getTaxrelief().setTaxReliefId("L449");
		rb.getTaxrelief().setIsCondoUpgrade(false);
		rb.getTaxrelief().setCreditorFiscalCode("56258745832");
		rb.getTaxrelief().setBeneficiaryType("NATURAL_PERSON");
		rb.getTaxrelief().getNaturalPersonBeneficiary().setFiscalCOde1("MRLFNC81L04A859L");
		rb.getTaxrelief().getLegalPersonBeneficiary().setFiscalCode(null);
		rb.getTaxrelief().getLegalPersonBeneficiary().setLegalRapresentativeFiscalCode(null);
		*/
		
		
		HttpEntity entity = new HttpEntity(rb, headers);
		ResponseEntity<DettaglioBonifico> dettaglioBonifico = restTemplate.exchange(
				domains + "api/gbs/banking/v4.0/accounts/14537780/payments/money-transfers", 
				HttpMethod.POST,entity,
				DettaglioBonifico.class);
		System.out.print(dettaglioBonifico.getBody().getPayload().getCreatedDateTime());

		return dettaglioBonifico;
		
	}


}
