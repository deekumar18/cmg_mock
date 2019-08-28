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
		cmecRetrievePromiseToPaySchdResponse.setNrpAccountNumber("test");
		CmecPromiseToPaySchdDetails[] cmeDetails = new CmecPromiseToPaySchdDetails[1];

		CmecPromiseToPaySchdDetails cmecPromiseToPaySchdDetails = new CmecPromiseToPaySchdDetails();
		cmecPromiseToPaySchdDetails.setAmountDue("test");
		cmecPromiseToPaySchdDetails.setAmountReceived("test");
		cmecPromiseToPaySchdDetails.setCollectionDate("test");
		cmecPromiseToPaySchdDetails.setMopId("test");
		cmecPromiseToPaySchdDetails.setMopType("test");
		cmecPromiseToPaySchdDetails.setNegoAcceptFlag("test");
		cmecPromiseToPaySchdDetails.setPwcAccountNumber("test");
		cmecPromiseToPaySchdDetails.setRefId("test");
		cmecPromiseToPaySchdDetails.setServiceType("test");
		cmecPromiseToPaySchdDetails.setStatus("test");
		cmecPromiseToPaySchdDetails.setVersionNumber("test");
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
