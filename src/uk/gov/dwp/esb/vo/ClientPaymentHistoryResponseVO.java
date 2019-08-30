package uk.gov.dwp.esb.vo;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ClientPaymentHistoryResponseVO {

	@SerializedName("_id")
	@Expose
	private Id id;

	@SerializedName("startDate")
	@Expose
	private String startDate;

	@SerializedName("endDate")
	@Expose
	private String endDate;

	@SerializedName("openingBal")
	@Expose
	private String openingBal;

	@SerializedName("paymentsDue")
	@Expose
	private String paymentsDue;

	@SerializedName("paymentsMade")
	@Expose
	private String paymentsMade;

	@SerializedName("chqReturned")
	@Expose
	private String chqReturned;

	@SerializedName("pendingWrtOff")
	@Expose
	private String pendingWrtOff;

	@SerializedName("compPayment")
	@Expose
	private String compPayment;

	@SerializedName("closingBal")
	@Expose
	private String closingBal;

	@SerializedName("actvResArr")
	@Expose
	private String actvResArr;

	@SerializedName("suspResArr")
	@Expose
	private String suspResArr;

	@SerializedName("deferResArr")
	@Expose
	private String deferResArr;

	@SerializedName("collChrgApplied")
	@Expose
	private String collChrgApplied;

	@SerializedName("collChrgPaid")
	@Expose
	private String collChrgPaid;

	@SerializedName("collChrgRemaining")
	@Expose
	private String collChrgRemaining;

	@SerializedName("collChrgAutoSatisfied")
	@Expose
	private String collChrgAutoSatisfied;

	@SerializedName("collChrgSaved")
	@Expose
	private String collChrgSaved;

	@SerializedName("enfChrg")
	@Expose
	private String enfChrg;

	@SerializedName("totalArreasSusp")
	@Expose
	private String totalArreasSusp;

	@SerializedName("wrtnOffAmt")
	@Expose
	private String wrtnOffAmt;

	@SerializedName("responseHeader")
	@Expose
	private ResponseHeader responseHeader;

	@SerializedName("clientPmtHisDetails")
	@Expose
	private List<ClientPmtHisDetails> clientPmtHisDetails;

	public Id getId() {
		return id;
	}

	public void setId(Id id) {
		this.id = id;
	}

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getOpeningBal() {
        return openingBal;
    }

    public void setOpeningBal(String openingBal) {
        this.openingBal = openingBal;
    }

    public String getPaymentsDue() {
        return paymentsDue;
    }

    public void setPaymentsDue(String paymentsDue) {
        this.paymentsDue = paymentsDue;
    }

    public String getPaymentsMade() {
        return paymentsMade;
    }

    public void setPaymentsMade(String paymentsMade) {
        this.paymentsMade = paymentsMade;
    }

    public String getChqReturned() {
        return chqReturned;
    }

    public void setChqReturned(String chqReturned) {
        this.chqReturned = chqReturned;
    }

    public String getPendingWrtOff() {
        return pendingWrtOff;
    }

    public void setPendingWrtOff(String pendingWrtOff) {
        this.pendingWrtOff = pendingWrtOff;
    }

    public String getCompPayment() {
        return compPayment;
    }

    public void setCompPayment(String compPayment) {
        this.compPayment = compPayment;
    }

    public String getClosingBal() {
        return closingBal;
    }

    public void setClosingBal(String closingBal) {
        this.closingBal = closingBal;
    }

    public String getActvResArr() {
        return actvResArr;
    }

    public void setActvResArr(String actvResArr) {
        this.actvResArr = actvResArr;
    }

    public String getSuspResArr() {
        return suspResArr;
    }

    public void setSuspResArr(String suspResArr) {
        this.suspResArr = suspResArr;
    }

    public String getDeferResArr() {
        return deferResArr;
    }

    public void setDeferResArr(String deferResArr) {
        this.deferResArr = deferResArr;
    }

    public String getCollChrgApplied() {
        return collChrgApplied;
    }

    public void setCollChrgApplied(String collChrgApplied) {
        this.collChrgApplied = collChrgApplied;
    }

    public String getCollChrgPaid() {
        return collChrgPaid;
    }

    public void setCollChrgPaid(String collChrgPaid) {
        this.collChrgPaid = collChrgPaid;
    }

    public String getCollChrgRemaining() {
        return collChrgRemaining;
    }

    public void setCollChrgRemaining(String collChrgRemaining) {
        this.collChrgRemaining = collChrgRemaining;
    }

    public String getCollChrgAutoSatisfied() {
        return collChrgAutoSatisfied;
    }

    public void setCollChrgAutoSatisfied(String collChrgAutoSatisfied) {
        this.collChrgAutoSatisfied = collChrgAutoSatisfied;
    }

    public String getCollChrgSaved() {
        return collChrgSaved;
    }

    public void setCollChrgSaved(String collChrgSaved) {
        this.collChrgSaved = collChrgSaved;
    }

    public String getEnfChrg() {
        return enfChrg;
    }

    public void setEnfChrg(String enfChrg) {
        this.enfChrg = enfChrg;
    }

    public String getTotalArreasSusp() {
        return totalArreasSusp;
    }

    public void setTotalArreasSusp(String totalArreasSusp) {
        this.totalArreasSusp = totalArreasSusp;
    }

    public String getWrtnOffAmt() {
        return wrtnOffAmt;
    }

    public void setWrtnOffAmt(String wrtnOffAmt) {
        this.wrtnOffAmt = wrtnOffAmt;
    }

    public ResponseHeader getResponseHeader() {
		return responseHeader;
	}

	public void setResponseHeader(ResponseHeader responseHeader) {
		this.responseHeader = responseHeader;
	}

	public List<ClientPmtHisDetails> getClientPmtHisDetails() {
		return clientPmtHisDetails;
	}

	public void setClientPmtHisDetails(List<ClientPmtHisDetails> clientPmtHisDetails) {
		this.clientPmtHisDetails = clientPmtHisDetails;
	}
}
