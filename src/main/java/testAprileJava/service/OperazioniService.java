package testAprileJava.service;

import org.springframework.stereotype.Service;

import testAprileJava.model.DettaglioBonifico;
import testAprileJava.model.DettaglioTransazioni;
import testAprileJava.model.RequestBonifico;
@Service
public interface OperazioniService {
	public DettaglioTransazioni getTransazioni();
	public Integer getSaldo();
	public DettaglioBonifico moneyTransfer(RequestBonifico rB);
}
