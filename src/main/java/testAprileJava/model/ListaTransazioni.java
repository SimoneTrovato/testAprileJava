package testAprileJava.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)

public class ListaTransazioni {
	private Long transactionId;
	private Long operationId;
	private Date accountingDate;
	private Date valueDate;
	private TypeTransazioni type;
	private Integer amount;
	private String currency;
	private String description;
	public ListaTransazioni() {
		super();
	}
	public Long getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(Long transactionId) {
		this.transactionId = transactionId;
	}
	public Long getOperationId() {
		return operationId;
	}
	public void setOperationId(Long operationId) {
		this.operationId = operationId;
	}
	public Date getAccountingDate() {
		return accountingDate;
	}
	public void setAccountingDate(Date accountingDate) {
		this.accountingDate = accountingDate;
	}
	public Date getValueDate() {
		return valueDate;
	}
	public void setValueDate(Date valueDate) {
		this.valueDate = valueDate;
	}
	public TypeTransazioni getType() {
		return type;
	}
	public void setType(TypeTransazioni type) {
		this.type = type;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "ListaTransazioni [transactionId=" + transactionId + ", operationId=" + operationId + ", accountingDate="
				+ accountingDate + ", valueDate=" + valueDate + ", type=" + type + ", amount=" + amount + ", currency="
				+ currency + ", description=" + description + "]";
	}

}
