package testAprileJava.model.saldo;

import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DettaglioSaldo {
	private String status;
	private String[] errors;
	private PayloadSaldo payload;
	public DettaglioSaldo() {
		super();
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String[] getErrors() {
		return errors;
	}
	public void setErrors(String[] errors) {
		this.errors = errors;
	}
	public PayloadSaldo getPayload() {
		return payload;
	}
	public void setPayload(PayloadSaldo payload) {
		this.payload = payload;
	}
	@Override
	public String toString() {
		return "DettaglioSaldo [status=" + status + ", errors=" + Arrays.toString(errors) + ", payload=" + payload
				+ "]";
	}


	
	

}
