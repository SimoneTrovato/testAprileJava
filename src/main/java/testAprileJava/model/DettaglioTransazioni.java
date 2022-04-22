package testAprileJava.model;

import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public class DettaglioTransazioni {
	private String status;
	private String[] errors;
	private PayloadTransazioni payload;
	public DettaglioTransazioni() {
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
	public PayloadTransazioni getPayload() {
		return payload;
	}
	public void setPayload(PayloadTransazioni payload) {
		this.payload = payload;
	}
	@Override
	public String toString() {
		return "DettaglioTransazioni [status=" + status + ", errors=" + Arrays.toString(errors) + ", payload=" + payload
				+ "]";
	}
		

}
