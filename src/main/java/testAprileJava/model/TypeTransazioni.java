package testAprileJava.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public class TypeTransazioni {

	private String enumeration;
	private String value;
	
	public TypeTransazioni() {
		super();
	}
	public String getEnumeration() {
		return enumeration;
	}
	public void setEnumeration(String enumeration) {
		this.enumeration = enumeration;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "TypeTransazioni [enumeration=" + enumeration + ", value=" + value + "]";
	}
}
