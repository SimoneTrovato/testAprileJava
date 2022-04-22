package testAprileJava.model;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)

public class PayloadBonifico {
	
	private String moneyTransferId;
	private String status;
	private String direction;
	private Creditor creditor;
	private Debtor debtor;
	private String cro;
	private String uri;
	private String trn;
	private String description;
	private Date createdDateTime;
	private Date accountedDateTime;
	private Date debtorValueDate;
	private String creditorValueDate;
	private Amount amount;
	private Boolean isUrgent;
	private Boolean isInstant;
	private String feeType;
	private String feeAccountId;
	private Fees[] fees;
	private Boolean hasTaxRelief;
	public PayloadBonifico() {
		super();
	}
	public String getMoneyTransferId() {
		return moneyTransferId;
	}
	public void setMoneyTransferId(String moneyTransferId) {
		this.moneyTransferId = moneyTransferId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDirection() {
		return direction;
	}
	public void setDirection(String direction) {
		this.direction = direction;
	}
	public Creditor getCreditor() {
		return creditor;
	}
	public void setCreditor(Creditor creditor) {
		this.creditor = creditor;
	}
	public Debtor getDebtor() {
		return debtor;
	}
	public void setDebtor(Debtor debtor) {
		this.debtor = debtor;
	}
	public String getCro() {
		return cro;
	}
	public void setCro(String cro) {
		this.cro = cro;
	}
	public String getTrn() {
		return trn;
	}
	public void setTrn(String trn) {
		this.trn = trn;
	}
	public String getUri() {
		return uri;
	}
	public void setUri(String uri) {
		this.uri = uri;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	public Date getDebtorValueDate() {
		return debtorValueDate;
	}
	public void setDebtorValueDate(Date debtorValueDate) {
		this.debtorValueDate = debtorValueDate;
	}
	public String getCreditorValueDate() {
		return creditorValueDate;
	}
	public void setCreditorValueDate(String creditorValueDate) {
		this.creditorValueDate = creditorValueDate;
	}
	public Amount getAmount() {
		return amount;
	}
	public void setAmount(Amount amount) {
		this.amount = amount;
	}
	public Boolean getIsUrgent() {
		return isUrgent;
	}
	public void setIsUrgent(Boolean isUrgent) {
		this.isUrgent = isUrgent;
	}
	public Boolean getIsInstant() {
		return isInstant;
	}
	public void setIsInstant(Boolean isInstant) {
		this.isInstant = isInstant;
	}
	public String getFeeType() {
		return feeType;
	}
	public void setFeeType(String feeType) {
		this.feeType = feeType;
	}
	public String getFeeAccountId() {
		return feeAccountId;
	}
	public void setFeeAccountId(String feeAccountId) {
		this.feeAccountId = feeAccountId;
	}
	public Fees[] getFees() {
		return fees;
	}
	public void setFees(Fees[] fees) {
		this.fees = fees;
	}
	public Boolean getHasTaxRelief() {
		return hasTaxRelief;
	}
	public void setHasTaxRelief(Boolean hasTaxRelief) {
		this.hasTaxRelief = hasTaxRelief;
	}
	
	
	public Date getCreatedDateTime() {
		return createdDateTime;
	}
	public void setCreatedDateTime(Date createdDateTime) {
		this.createdDateTime = createdDateTime;
	}
	public Date getAccountedDateTime() {
		return accountedDateTime;
	}
	public void setAccountedDateTime(Date accountedDateTime) {
		this.accountedDateTime = accountedDateTime;
	}
	@Override
	public String toString() {
		return "PayloadBonifico [moneyTransferId=" + moneyTransferId + ", status=" + status + ", direction=" + direction
				+ ", creditor=" + creditor + ", debtor=" + debtor + ", cro=" + cro + ", uri=" + uri + ", trn=" + trn
				+ ", description=" + description + ", createdDateTime=" + createdDateTime + ", accountedDateTime="
				+ accountedDateTime + ", debtorValueDate=" + debtorValueDate + ", creditorValueDate="
				+ creditorValueDate + ", amount=" + amount + ", isUrgent=" + isUrgent + ", isInstant=" + isInstant
				+ ", feeType=" + feeType + ", feeAccountId=" + feeAccountId + ", fees=" + Arrays.toString(fees)
				+ ", hasTaxRelief=" + hasTaxRelief + "]";
	}

}
