package uk.gov.dwp.esb.vo;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RetrieveAccountDetailsResponseVO {

	@SerializedName("_id")
	@Expose
	private Id id;

	@SerializedName("responseHeader")
	@Expose
	private ResponseHeader responseHeader;

	@SerializedName("finCorpAccntDtls")
	@Expose
	private List<FinCorpDetail> finCorpAccntDtls;

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

	public List<FinCorpDetail> getFinCorpAccntDtls() {
		return finCorpAccntDtls;
	}

	public void setFinCorpAccntDtls(List<FinCorpDetail> finCorpAccntDtls) {
		this.finCorpAccntDtls = finCorpAccntDtls;
	}
}
