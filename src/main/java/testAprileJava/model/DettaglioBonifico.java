package testAprileJava.model;

import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public class DettaglioBonifico {
	private String status;
	private String[] errors;
	private PayloadBonifico payload;
	public DettaglioBonifico() {
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
	public PayloadBonifico getPayload() {
		return payload;
	}
	public void setPayload(PayloadBonifico payload) {
		this.payload = payload;
	}
	@Override
	public String toString() {
		return "DettaglioBonifico [status=" + status + ", errors=" + Arrays.toString(errors) + ", payload=" + payload
				+ "]";
	}
	
	
}
