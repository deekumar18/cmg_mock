package uk.gov.dwp.esb.harddata;

import uk.gov.dwp.esb.vo.BankWizardResponseVO;
import uk.gov.dwp.esb.vo.BwzResponseHeader;
import uk.gov.dwp.esb.vo.BwzResponsesWrapper;

public class BankWizardResponseHD {

	private BankWizardResponseVO data;

	public BankWizardResponseHD() {
		data = new BankWizardResponseVO();
		this.setData();
	}

	private void setData() {
		this.setHeader();
		this.setStraightData();
	}

	private void setHeader() {
		BwzResponseHeader header = new BwzResponseHeader();
		header.setResponseCode("0");
		header.setResponseStatus("Bank Wizard Success");
		header.setBwzResponsesWrapper(new BwzResponsesWrapper());
		data.setResponseHeader(header);
	}

	private void setStraightData() {
		data.setResponseAccountNumber("37492517");
		data.setResponseSortCode("400113");
		data.setResponseRollNumber("57");
	}

	public BankWizardResponseVO getData() {
		return data;
	}
}
