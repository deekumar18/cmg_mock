package uk.gov.dwp.esb.vo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UpdateEmployerResponseVO {

	@SerializedName("_id")
	@Expose
	private Id id;

	@SerializedName("responseHeader")
	@Expose
	private ResponseHeader responseHeader;

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
}
