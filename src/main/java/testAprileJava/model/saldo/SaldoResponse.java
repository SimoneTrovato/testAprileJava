package testAprileJava.model.saldo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
public class SaldoResponse {

	private Date date;
	private Integer balance;
	private Integer availableBalance;
	private String currency;
	
	public SaldoResponse() {
		super();
	}
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Integer getBalance() {
		return balance;
	}
	public void setBalance(Integer balance) {
		this.balance = balance;
	}
	public Integer getAvailableBalance() {
		return availableBalance;
	}
	public void setAvailableBalance(Integer availableBalance) {
		this.availableBalance = availableBalance;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	@Override
	public String toString() {
		return "SaldoResponse [date=" + date + ", balance=" + balance + ", availableBalance=" + availableBalance
				+ ", currency=" + currency + "]";
	}
	
	
	
}
