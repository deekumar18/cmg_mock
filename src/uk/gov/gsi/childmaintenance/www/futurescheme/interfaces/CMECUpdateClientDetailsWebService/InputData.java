package uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECUpdateClientDetailsWebService;

public class InputData {
	private String name;
	private String value;

	public InputData(String name, String value) {
		this.name = name;
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public String getValue() {
		return value;
	}
}
