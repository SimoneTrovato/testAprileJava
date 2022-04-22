package testAprileJava.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import testAprileJava.model.Bonifico;
import testAprileJava.model.DettaglioBonifico;
import testAprileJava.model.RequestBonifico;
import testAprileJava.model.Transazione;
import testAprileJava.model.saldo.PayloadSaldo;
import testAprileJava.model.saldo.SaldoResponse;
import testAprileJava.service.OperazioniService;

@RestController
@RequestMapping("/test")
public class Controller {
	@Autowired
	private OperazioniService service;
	
	@GetMapping(value="/transazioni")
	public ArrayList letturaTransazioni(){
		ArrayList<Transazione> transazioneLista = new ArrayList<Transazione>();
		System.out.println(service.getTransazioni().getPayload().getList().length);
		for(int i = 0; i<service.getTransazioni().getPayload().getList().length; i++) {
			Transazione transazioniR = new Transazione();

	transazioniR.setAmount(service.getTransazioni().getPayload().getList()[i].getAmount());
	transazioniR.setCurrency(service.getTransazioni().getPayload().getList()[i].getCurrency());
	transazioniR.setDate(service.getTransazioni().getPayload().getList()[i].getAccountingDate());
	transazioniR.setDescription(service.getTransazioni().getPayload().getList()[i].getDescription());
	//	System.out.println(transazioniR.getList()[i].getAmount());
				transazioneLista.add(transazioniR);
		}		return transazioneLista;
	
}
	
	@GetMapping(value="/saldo")
	public Integer letturaSaldo(){
		/*	PayloadSaldo ps = new PayloadSaldo();
		SaldoResponse saldo = new SaldoResponse();
		saldo.setBalance(service.getSaldo().getBalance());
		saldo.setCurrency(service.getSaldo().getCurrency());
		saldo.setDate(service.getSaldo().getDate());
		saldo.setAvailableBalance(service.getSaldo());
*/
		return service.getSaldo();
		
	}
	
	
	@PostMapping(value="/bonifico", consumes = "application/json", produces = "application/json")
	public Bonifico invioBonifico(@RequestBody RequestBonifico rBonifico) {
		Bonifico bonifico = new Bonifico();
		bonifico.setStatus(service.moneyTransfer(rBonifico).getPayload().getStatus());
		
		return bonifico;
		
		
	}
}
