package testAprileJava.model;

import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public class PayloadTransazioni {
	ListaTransazioni[] list;

	public PayloadTransazioni() {
		super();
	}

	public ListaTransazioni[] getList() {
		return list;
	}

	public void setList(ListaTransazioni[] list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "PayloadTransazioni [list=" + Arrays.toString(list) + "]";
	}
	
	
}
