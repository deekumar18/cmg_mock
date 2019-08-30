package uk.gov.dwp.esb.harddata;

import java.util.ArrayList;
import java.util.List;

import uk.gov.dwp.esb.vo.ClientPaymentHistoryResponseVO;
import uk.gov.dwp.esb.vo.ClientPmtHisDetails;
import uk.gov.dwp.esb.vo.ResponseHeader;

public class ClientPaymentHistoryResponseHD {
	private ClientPaymentHistoryResponseVO data;

	public ClientPaymentHistoryResponseHD() {
		data = new ClientPaymentHistoryResponseVO();
		this.setData();
	}

	private void setData() {
		this.setHeader();
		this.setStraightData();
		this.setPaymentDetails();
	}

	private void setHeader() {
		ResponseHeader header = new ResponseHeader();
		header.setResponseCode(0);
		header.setResponseMessage("Success");
		data.setResponseHeader(header);
	}

	private void setPaymentDetails() {
		List<ClientPmtHisDetails> paymentDetails = new ArrayList<ClientPmtHisDetails>();

		paymentDetails.add(new ClientPmtHisDetails("05/24/2019", "69.02", "", "Child maintenance due-3000752277", "-69.02"));
		paymentDetails.add(new ClientPmtHisDetails("05/24/2019", "6.93", "", "Collect &amp; Pay fee added", "-75.95"));

		paymentDetails.add(new ClientPmtHisDetails("05/24/2019", "69.02", "", "Child maintenance due-3000752277", "-144.97"));
		paymentDetails.add(new ClientPmtHisDetails("05/24/2019", "6.93", "", "Collect &amp; Pay fee added", "-151.90"));

		paymentDetails.add(new ClientPmtHisDetails("05/24/2019", "69.02", "", "Child maintenance due-3000752277", "-220.92"));
		paymentDetails.add(new ClientPmtHisDetails("05/24/2019", "6.93", "", "Collect &amp; Pay fee added", "-227.85"));

		paymentDetails.add(new ClientPmtHisDetails("05/24/2019", "19.72", "", "Child maintenance due-3000752277", "-247.57"));
		paymentDetails.add(new ClientPmtHisDetails("05/24/2019", "1.98", "", "Collect &amp; Pay fee added", "-249.55"));

		paymentDetails.add(new ClientPmtHisDetails("05/24/2019", "69.02", "", "Child maintenance due-3000752277", "-318.57"));
		paymentDetails.add(new ClientPmtHisDetails("05/24/2019", "6.93", "", "Collect &amp; Pay fee added", "-325.50"));

		paymentDetails.add(new ClientPmtHisDetails("05/24/2019", "69.02", "", "Child maintenance due-3000752277", "-394.45"));
		paymentDetails.add(new ClientPmtHisDetails("05/24/2019", "6.93", "", "Collect &amp; Pay fee added", "-401.45"));

		paymentDetails.add(new ClientPmtHisDetails("05/24/2019", "69.02", "", "Child maintenance due-3000752277", "-470.47"));
		paymentDetails.add(new ClientPmtHisDetails("05/24/2019", "6.93", "", "Collect &amp; Pay fee added", "-477.40"));

		paymentDetails.add(new ClientPmtHisDetails("05/24/2019", "19.72", "", "Child maintenance due-3000752277", "-497.12"));
		paymentDetails.add(new ClientPmtHisDetails("05/24/2019", "1.98", "", "Collect &amp; Pay fee added", "-499.0"));

		paymentDetails.add(new ClientPmtHisDetails("05/28/2019", "49.30", "", "Child maintenance due-3000752277", "-548.40"));
		paymentDetails.add(new ClientPmtHisDetails("05/28/2019", "4.95", "", "Collect &amp; Pay fee added", "-553-35"));

		data.setClientPmtHisDetails(paymentDetails);
	}

	private void setStraightData() {
		data.setStartDate("05/31/2018");
		data.setEndDate("05/30/2019");
		data.setOpeningBal("0.00");
		data.setPaymentsDue("502.86");
		data.setPaymentsMade("0.00");
		data.setChqReturned("0.00");
		data.setPendingWrtOff("0.00");
		data.setCompPayment("0.00");
		data.setClosingBal("-553.35");
		data.setActvResArr("0.00");
		data.setSuspResArr("0.00");
		data.setDeferResArr("0.00");
		data.setCollChrgApplied("50.49");
		data.setCollChrgPaid("0.00");
		data.setCollChrgRemaining("140.58");
		data.setCollChrgAutoSatisfied("0.00");
		data.setCollChrgSaved("0.00");
		data.setEnfChrg("0.00");
		data.setEnfChrg("0.00");
		data.setWrtnOffAmt("0.00");
	}

	public ClientPaymentHistoryResponseVO getData() {
		return data;
	}
}
