package testAprileJava.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public class Bonifico {

	private String status;

	public Bonifico() {
		super();
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Bonifico [status=" + status + "]";
	}
	
	
	
}
