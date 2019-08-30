package uk.gov.dwp.esb.vo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BankWizardResponseVO {
	@SerializedName("_id")
	@Expose
	private Id id;
	@SerializedName("responseAccountNumber")
	@Expose
	private String responseAccountNumber = "";
	@SerializedName("responseSortCode")
	@Expose
	private String responseSortCode = "";
	@SerializedName("responseRollNumber")
	@Expose
	private String responseRollNumber = "";
	@SerializedName("responseHeader")
	@Expose
	private BwzResponseHeader responseHeader;

	public Id getId() {
		return id;
	}

	public void setId(Id id) {
		this.id = id;
	}

	public BwzResponseHeader getResponseHeader() {
		return responseHeader;
	}

	public void setResponseHeader(BwzResponseHeader responseHeader) {
		this.responseHeader = responseHeader;
	}

	public String getResponseSortCode() {
		return responseSortCode;
	}

	public void setResponseSortCode(String responseSortCode) {
		this.responseSortCode = responseSortCode;
	}

	public String getResponseAccountNumber() {
		return responseAccountNumber;
	}

	public void setResponseAccountNumber(String responseAccountNumber) {
		this.responseAccountNumber = responseAccountNumber;
	}

	public String getResponseRollNumber() {
		return responseRollNumber;
	}

	public void setResponseRollNumber(String responseRollNumber) {
		this.responseRollNumber = responseRollNumber;
	}
}
