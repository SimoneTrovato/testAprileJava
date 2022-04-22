package testAprileJava.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public class Debtor {

	private String name;
	private DebtorAccount account;
	public Debtor() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public DebtorAccount getAccount() {
		return account;
	}
	public void setAccount(DebtorAccount account) {
		this.account = account;
	}
	@Override
	public String toString() {
		return "Debtor [name=" + name + ", account=" + account + "]";
	}
	

	
	
}
