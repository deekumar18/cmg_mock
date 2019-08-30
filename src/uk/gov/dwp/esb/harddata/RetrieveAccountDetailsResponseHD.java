package uk.gov.dwp.esb.harddata;

import java.util.ArrayList;
import java.util.List;

import uk.gov.dwp.esb.vo.AccountDetail;
import uk.gov.dwp.esb.vo.FinCorpDetail;
import uk.gov.dwp.esb.vo.ResponseHeader;
import uk.gov.dwp.esb.vo.RetrieveAccountDetailsResponseVO;

public class RetrieveAccountDetailsResponseHD {

	private RetrieveAccountDetailsResponseVO data;

	public RetrieveAccountDetailsResponseHD() {
		data = new RetrieveAccountDetailsResponseVO();
		this.setData();
	}

	private void setData() {
		this.setHeader();
		this.setFinancialAccountDetails();
	}

	private void setHeader() {
		ResponseHeader header = new ResponseHeader();
		header.setResponseCode(0);
		header.setResponseMessage("Success");
		data.setResponseHeader(header);
	}

	private AccountDetail setAccDetai1101() {
		AccountDetail acc = new AccountDetail();
		acc.setName("Green");
		acc.setCMECAccountNumber("12345678");
		acc.setCMECSortCode("090000");
		acc.setAccountType("Current Account");
		acc.setMethodOfPayment("Direct Payment");
		acc.setStatus("Active");
		acc.setStartDate("06/20/2019 08:34:54");
		acc.setMOPSequenceNumber("1");

		return acc;
	}

	private AccountDetail setAccDetai1201() {
		AccountDetail acc = new AccountDetail();
		acc.setName("Green");
		acc.setCMECAccountNumber("12345678");
		acc.setCMECSortCode("090000");
		acc.setAccountType("Current Account");
		acc.setMethodOfPayment("Direct Payment");
		acc.setStatus("Active");
		acc.setStartDate("06/20/2019 09:25:14");
		acc.setMOPSequenceNumber("1");

		return acc;
	}

	private AccountDetail setAccDetai1301() {
		AccountDetail acc = new AccountDetail();
		acc.setMethodOfPayment("BHOCA");
		acc.setStatus("Active");
		acc.setStartDate("06/19/2019 16:15:06");
		acc.setMOPSequenceNumber("1");
		acc.setCollectionDate("Monday");

		return acc;
	}

	private List<AccountDetail> setAccDetai1s1() {
		List<AccountDetail> accDets = new ArrayList<AccountDetail>();
		accDets.add(setAccDetai1101());

		return accDets;
	}

	private List<AccountDetail> setAccDetai1s2() {
		List<AccountDetail> accDets = new ArrayList<AccountDetail>();
		accDets.add(setAccDetai1201());

		return accDets;
	}

	private List<AccountDetail> setAccDetai1s3() {
		List<AccountDetail> accDets = new ArrayList<AccountDetail>();
		accDets.add(setAccDetai1301());

		return accDets;
	}

	private FinCorpDetail setFinAccDetail1() {
		FinCorpDetail finDet = new FinCorpDetail();

		finDet.setAccountNumber("3000762637");
		finDet.setAccountType("PWC Account");
		finDet.setCaseNumber("1-38556291876");
		finDet.setContactCIF("10110783");
		finDet.setAccountDetails(setAccDetai1s1());

		return finDet;
	}

	private FinCorpDetail setFinAccDetail2() {
		FinCorpDetail finDet = new FinCorpDetail();

		finDet.setAccountNumber("3000762659");
		finDet.setAccountType("PWC Account");
		finDet.setCaseNumber("1-38558969907");
		finDet.setContactCIF("10110783");
		finDet.setAccountDetails(setAccDetai1s2());

		return finDet;
	}

	private FinCorpDetail setFinAccDetail3() {
		FinCorpDetail finDet = new FinCorpDetail();

		finDet.setAccountNumber("3000762592");
		finDet.setAccountType("NRP Account");
		finDet.setContactCIF("10110783");
		finDet.setAccountDetails(setAccDetai1s3());

		return finDet;
	}

	private void setFinancialAccountDetails() {
		List<FinCorpDetail> finDets = new ArrayList<FinCorpDetail>(3);
		finDets.add(setFinAccDetail1());
		finDets.add(setFinAccDetail2());
		finDets.add(setFinAccDetail3());

		data.setFinCorpAccntDtls(finDets);
	}

	public RetrieveAccountDetailsResponseVO getData() {
		return data;
	}
}
