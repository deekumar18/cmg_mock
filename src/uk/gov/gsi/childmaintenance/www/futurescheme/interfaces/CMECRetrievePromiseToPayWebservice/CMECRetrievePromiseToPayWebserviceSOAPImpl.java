/**
 * CMECRetrievePromiseToPayWebserviceSOAPImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECRetrievePromiseToPayWebservice;

import com.google.gson.Gson;

import uk.gov.dwp.esb.utils.CommonUtil;
import uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.maintenance.CmecCollectionSchdDetails.CmecPromiseToPaySchdDetails;
import uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.maintenance.CmecRetrievePromiseToPaySchdResponse.CmecRetrievePromiseToPaySchdResponse;

public class CMECRetrievePromiseToPayWebserviceSOAPImpl implements
		uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECRetrievePromiseToPayWebservice.CMECRetrievePromiseToPayWebservice_PortType {
	public uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.maintenance.CmecRetrievePromiseToPaySchdResponse.CmecRetrievePromiseToPaySchdResponse retrievePromiseToPaySchedule(
			uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.maintenance.CMECRetrievePromiseToPaySchdRequest.CmecRetrievePromiseToPaySchdRequest retrievePromiseToPaySchdInput)
			throws java.rmi.RemoteException {
		return getCmecRetrievePromiseToPaySchdResponse();
	}

	private static CmecRetrievePromiseToPaySchdResponse getCmecRetrievePromiseToPaySchdResponse() {
		CmecRetrievePromiseToPaySchdResponse cmecRetrievePromiseToPaySchdResponse = new CmecRetrievePromiseToPaySchdResponse();
		cmecRetrievePromiseToPaySchdResponse.setNrpAccountNumber("3000755450");
		CmecPromiseToPaySchdDetails[] cmeDetails = new CmecPromiseToPaySchdDetails[1];

		CmecPromiseToPaySchdDetails cmecPromiseToPaySchdDetails = new CmecPromiseToPaySchdDetails();
		cmecPromiseToPaySchdDetails.setAmountDue("35.84");
		cmecPromiseToPaySchdDetails.setAmountReceived("0.00");
		cmecPromiseToPaySchdDetails.setCollectionDate("08/19/2019");
		cmecPromiseToPaySchdDetails.setMopId("1");
		cmecPromiseToPaySchdDetails.setMopType("BHOCA");
		cmecPromiseToPaySchdDetails.setNegoAcceptFlag("N");
		cmecPromiseToPaySchdDetails.setPwcAccountNumber("test");
		cmecPromiseToPaySchdDetails.setRefId("999998641271");
		cmecPromiseToPaySchdDetails.setServiceType("Calc and Collection");
		cmecPromiseToPaySchdDetails.setStatus("Active");
		cmecPromiseToPaySchdDetails.setVersionNumber("1");
		cmeDetails[0] = cmecPromiseToPaySchdDetails;

		cmecRetrievePromiseToPaySchdResponse.setPromiseToPayScheduleDetailsCollection(cmeDetails);
		cmecRetrievePromiseToPaySchdResponse.setResponse(CommonUtil.getResponse());
		Gson gson = new Gson();
		System.out.println(gson.toJson(cmecRetrievePromiseToPaySchdResponse).toString());
		return cmecRetrievePromiseToPaySchdResponse;
	}

	public static void main(String[] args) {
		getCmecRetrievePromiseToPaySchdResponse();
	}
}
