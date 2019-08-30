package uk.gov.dwp.esb.vo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AddressDetailsResponseVO {

	@SerializedName("_id")
	@Expose
	private Id id;

	@SerializedName("addressDetailsOutput")
	@Expose
	private AddressDetailsOutput addressDetailsOutput;

	public Id getId() {
		return id;
	}

	public void setId(Id id) {
		this.id = id;
	}

	public AddressDetailsOutput getAddressDetailsOutput() {
		return addressDetailsOutput;
	}

	public void setAddressDetailsOutput(AddressDetailsOutput addressDetailsOutput) {
		this.addressDetailsOutput = addressDetailsOutput;
	}
}
