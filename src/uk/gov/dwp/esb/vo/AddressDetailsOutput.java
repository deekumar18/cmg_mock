package uk.gov.dwp.esb.vo;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AddressDetailsOutput {
	@SerializedName("responseHeader")
	@Expose
	private ResponseHeader responseHeader;

	@SerializedName("addresses")
	@Expose
	private List<ClientAddress> addresses;

	public ResponseHeader getResponseHeader() {
		return responseHeader;
	}

	public void setResponseHeader(ResponseHeader responseHeader) {
		this.responseHeader = responseHeader;
	}

	public List<ClientAddress> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<ClientAddress> addresses) {
		this.addresses = addresses;
	}
}