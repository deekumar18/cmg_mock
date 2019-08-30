package uk.gov.dwp.esb.vo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CorrespondenceResponseVO {
	@SerializedName("_id")
	@Expose
	private Id id;
	@SerializedName("responseHeader")
	@Expose
	private ResponseHeader responseHeader;
	@SerializedName("documentDetails")
	@Expose
	private DocumentDetails documentDetails;

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
	public DocumentDetails getDocumentDetails() {
		return documentDetails;
	}
	public void setDocumentDetails(DocumentDetails documentDetails) {
		this.documentDetails = documentDetails;
	}
}
