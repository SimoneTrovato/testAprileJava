package testAprileJava.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public class LegalPersonBeneficiary {

	private String fiscalCode;
	private String legalRapresentativeFiscalCode;
	public LegalPersonBeneficiary() {
		super();
	}
	public String getFiscalCode() {
		return fiscalCode;
	}
	public void setFiscalCode(String fiscalCode) {
		this.fiscalCode = fiscalCode;
	}
	public String getLegalRapresentativeFiscalCode() {
		return legalRapresentativeFiscalCode;
	}
	public void setLegalRapresentativeFiscalCode(String legalRapresentativeFiscalCode) {
		this.legalRapresentativeFiscalCode = legalRapresentativeFiscalCode;
	}
	@Override
	public String toString() {
		return "LegalPersonBeneficiary [fiscalCode=" + fiscalCode + ", legalRapresentativeFiscalCode="
				+ legalRapresentativeFiscalCode + "]";
	}
	
}
