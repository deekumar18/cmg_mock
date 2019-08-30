package uk.gov.dwp.esb.harddata;

import uk.gov.dwp.esb.vo.ResponseHeader;
import uk.gov.dwp.esb.vo.UpdateClientDetailsResponseVO;

public class UpdateClientDetailsResponseHD {

	private UpdateClientDetailsResponseVO data;

	public UpdateClientDetailsResponseHD() {
		data = new UpdateClientDetailsResponseVO();
		this.setData();
	}

	private void setData() {
		this.setHeader();
	}

	private void setHeader() {
		ResponseHeader header = new ResponseHeader();
		header.setResponseCode(0);
		header.setResponseMessage("Success");
		header.setSrNumber("Daxie");
		data.setResponseHeader(header);
	}

	public UpdateClientDetailsResponseVO getData() {
		return data;
	}
}
