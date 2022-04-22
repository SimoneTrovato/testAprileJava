package testAprileJava.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public class NaturalPersonBeneficiary {

	private String fiscalCOde1;
	private String fiscalCOde2;
	private String fiscalCOde3;
	private String fiscalCOde4;
	private String fiscalCOde5;


	public String getFiscalCOde2() {
		return fiscalCOde2;
	}

	public void setFiscalCOde2(String fiscalCOde2) {
		this.fiscalCOde2 = fiscalCOde2;
	}

	public String getFiscalCOde3() {
		return fiscalCOde3;
	}

	public void setFiscalCOde3(String fiscalCOde3) {
		this.fiscalCOde3 = fiscalCOde3;
	}

	public String getFiscalCOde4() {
		return fiscalCOde4;
	}

	public void setFiscalCOde4(String fiscalCOde4) {
		this.fiscalCOde4 = fiscalCOde4;
	}

	public String getFiscalCOde5() {
		return fiscalCOde5;
	}

	public void setFiscalCOde5(String fiscalCOde5) {
		this.fiscalCOde5 = fiscalCOde5;
	}

	public NaturalPersonBeneficiary() {
		super();
	}

	public String getFiscalCOde1() {
		return fiscalCOde1;
	}

	public void setFiscalCOde1(String fiscalCOde1) {
		this.fiscalCOde1 = fiscalCOde1;
	}

	@Override
	public String toString() {
		return "NaturalPersonBeneficiary [fiscalCOde1=" + fiscalCOde1 + ", fiscalCOde2=" + fiscalCOde2
				+ ", fiscalCOde3=" + fiscalCOde3 + ", fiscalCOde4=" + fiscalCOde4 + ", fiscalCOde5=" + fiscalCOde5
				+ "]";
	}


	
}
