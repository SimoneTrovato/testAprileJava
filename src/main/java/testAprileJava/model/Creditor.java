package testAprileJava.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public class Creditor {

	private String name;
	private CreditorAccount account;
	private CreditorAddress address;
	public Creditor() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public CreditorAccount getAccount() {
		return account;
	}
	public void setAccount(CreditorAccount account) {
		this.account = account;
	}
	public CreditorAddress getAddress() {
		return address;
	}
	public void setAddress(CreditorAddress address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Creditor [name=" + name + ", account=" + account + ", address=" + address + "]";
	}
	
	
	
}
