package uk.gov.dwp.esb.harddata;

import uk.gov.dwp.esb.vo.ResponseHeader;
import uk.gov.dwp.esb.vo.UpdateEmployerResponseVO;

public class UpdateEmployerResponseHD {

	private UpdateEmployerResponseVO data;

	public UpdateEmployerResponseHD() {
		data = new UpdateEmployerResponseVO();
		this.setData();
	}

	private void setData() {
		this.setHeader();
	}

	private void setHeader() {
		ResponseHeader header = new ResponseHeader();
		header.setResponseCode(0);
		header.setResponseMessage("Success");
		getData().setResponseHeader(header);
	}

	public UpdateEmployerResponseVO getData() {
		return data;
	}
}
