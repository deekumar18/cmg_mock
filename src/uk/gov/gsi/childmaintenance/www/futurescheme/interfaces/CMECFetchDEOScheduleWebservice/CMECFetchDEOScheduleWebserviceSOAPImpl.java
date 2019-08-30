/**
 * CMECFetchDEOScheduleWebserviceSOAPImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECFetchDEOScheduleWebservice;

import com.google.gson.Gson;
import com.mongodb.DB;

import uk.gov.dwp.esb.utils.CommonUtil;
import uk.gov.dwp.esb.utils.DBUtil;
import uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.deoSchedule.CMECFetchDEODetailsResponse.CMECFetchDEODetailsResponse;
import uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.deoSchedule.CMECFetchDEODetailsResponse.FetchDEOResponse;
import uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.deoSchedule.CMECFetchDEODetailsResponse.NRPScheduleDetails;

public class CMECFetchDEOScheduleWebserviceSOAPImpl implements
		uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECFetchDEOScheduleWebservice.CMECFetchDEOScheduleWebservice_PortType {
	public uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.deoSchedule.CMECFetchDEODetailsResponse.CMECFetchDEODetailsResponse fetchDEOSchedule(
			uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.deoSchedule.CMECFetchDEODetailsRequest.CMECFetchDEODetailsRequest fetchDEOScheduleInput)
			throws java.rmi.RemoteException {
		DB db = DBUtil.getMongoDatabase();
		return getCMECFetchDEODetailsResponse();
	}

	private static CMECFetchDEODetailsResponse getCMECFetchDEODetailsResponse() {
		CMECFetchDEODetailsResponse cmecFetchDEODetailsResponse = new CMECFetchDEODetailsResponse();
		FetchDEOResponse fetchDEOResponse = new FetchDEOResponse();
		fetchDEOResponse.setAction("test");
		fetchDEOResponse.setDueDate("test");
		fetchDEOResponse.setEmployerAccountId("test");
		fetchDEOResponse.setEndDate("test");

		NRPScheduleDetails[] nrpScheduleDetailsArray = new NRPScheduleDetails[1];
		NRPScheduleDetails nrpScheduleDetails = new NRPScheduleDetails();
		nrpScheduleDetails.setActualAmount("test");
		nrpScheduleDetails.setCSAIdentifier("test");
		nrpScheduleDetails.setCSARefNum("test");
		nrpScheduleDetails.setFirstName("test");
		nrpScheduleDetails.setLastName("test");
		nrpScheduleDetails.setNino("test");
		nrpScheduleDetails.setReasonCode("test");
		nrpScheduleDetails.setSCIN("test");
		nrpScheduleDetails.setTargetAmount("test");

		nrpScheduleDetailsArray[0] = nrpScheduleDetails;
		fetchDEOResponse.setNRPScheduleDetailsCollection(nrpScheduleDetailsArray);
		fetchDEOResponse.setScheduleDate("test");
		fetchDEOResponse.setScheduleId("test");
		fetchDEOResponse.setScheduleStatus("test");
		fetchDEOResponse.setStartDate("test");

		cmecFetchDEODetailsResponse.setFetchDEOResponse(fetchDEOResponse);
		cmecFetchDEODetailsResponse.setResponseHeader(CommonUtil.getResponse());

		return cmecFetchDEODetailsResponse;
	}
	
	public static void main(String[] args) {
		Gson g = new Gson();
		System.out.println(g.toJson(getCMECFetchDEODetailsResponse()));
	}

}
