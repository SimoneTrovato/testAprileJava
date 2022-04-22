package testAprileJava.model.saldo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PayloadSaldo {
	
	 Date date;
	 Integer balance;
	 Long availableBalance;
	 String currency;
	
	
	
	public PayloadSaldo() {
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
	public Long getAvailableBalance() {
		return availableBalance;
	}
	public void setAvailableBalance(Long availableBalance) {
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
		return "PayloadSaldo [date=" + date + ", balance=" + balance + ", availableBalance=" + availableBalance
				+ ", currency=" + currency + "]";
	}
	
	

}
