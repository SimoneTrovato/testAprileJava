package testAprileJava.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public class CreditorAccount {
	private String accountCode;
	private String bicCode;
	
	
	
	public CreditorAccount() {
		super();
	}
	public String getAccountCode() {
		return accountCode;
	}
	public void setAccountCode(String accountCode) {
		this.accountCode = accountCode;
	}
	public String getBicCode() {
		return bicCode;
	}
	public void setBicCode(String bicCode) {
		this.bicCode = bicCode;
	}
	@Override
	public String toString() {
		return "CreditorAccount [accountCode=" + accountCode + ", bicCode=" + bicCode + "]";
	}
	
	
}
