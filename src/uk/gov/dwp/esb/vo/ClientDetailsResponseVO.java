package uk.gov.dwp.esb.vo;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ClientDetailsResponseVO {

	@SerializedName("_id")
	@Expose
	private Id id;
	@SerializedName("responseHeader")
	@Expose
	private ResponseHeader responseHeader;
	@SerializedName("clientDetails")
	@Expose
	private ClientDetails clientDetails;
	@SerializedName("clientAddress")
	@Expose
	private List<ClientAddress> clientAddress = null;
	@SerializedName("cientHLSCaseDetails")
	@Expose
	private List<CientHLSCaseDetail> cientHLSCaseDetails = null;

	public Id getId() {
		return id;
	}

	public void setId(Id id) {
		this.id = id;
	}

	public ResponseHeader getResponseHeader() {
		return responseHeader;
	}

	public void setResponseHeader(ResponseHeader responseHeader) {
		this.responseHeader = responseHeader;
	}

	public ClientDetails getClientDetails() {
		return clientDetails;
	}

	public void setClientDetails(ClientDetails clientDetails) {
		this.clientDetails = clientDetails;
	}

	public List<ClientAddress> getClientAddress() {
		return clientAddress;
	}

	public void setClientAddress(List<ClientAddress> clientAddress) {
		this.clientAddress = clientAddress;
	}

	public List<CientHLSCaseDetail> getCientHLSCaseDetails() {
		return cientHLSCaseDetails;
	}

	public void setCientHLSCaseDetails(List<CientHLSCaseDetail> cientHLSCaseDetails) {
		this.cientHLSCaseDetails = cientHLSCaseDetails;
	}

}