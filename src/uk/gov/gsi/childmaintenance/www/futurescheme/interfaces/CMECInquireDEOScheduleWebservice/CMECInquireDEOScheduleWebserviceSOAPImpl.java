/**
 * CMECInquireDEOScheduleWebserviceSOAPImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECInquireDEOScheduleWebservice;

import java.rmi.RemoteException;

import com.google.gson.Gson;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;

import fr.xebia.extras.selma.Selma;
import uk.gov.dwp.esb.mappers.InquiryScheduleMapper;
import uk.gov.dwp.esb.utils.DBUtil;
import uk.gov.dwp.esb.vo.CMECInquireDEODetailsResponseVO;
import uk.gov.gsi.childmaintenance.www.futurescheme.bo.common.Response_xsd.Response;
import uk.gov.gsi.childmaintenance.www.futurescheme.bo.common.Response_xsd.ResponseResponseDetails;
import uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.deoSchedule.CMECInquireDEODetailsResponse.CMECInquireDEODetailsResponse;
import uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.deoSchedule.CMECInquireDEODetailsResponse.EmployerScheduleDetails;
import uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.deoSchedule.CMECInquireDEODetailsResponse.InquireDEOResponse;

public class CMECInquireDEOScheduleWebserviceSOAPImpl implements
		uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECInquireDEOScheduleWebservice.CMECInquireDEOScheduleWebservice_PortType {
	public uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.deoSchedule.CMECInquireDEODetailsResponse.CMECInquireDEODetailsResponse inquireDEOSchedule(
			uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.deoSchedule.CMECInquireDEODetailsRequest.CMECInquireDEODetailsRequest inquireDEOScheduleInput)
			throws java.rmi.RemoteException {

		DB db = DBUtil.getMongoDatabase();
		DBCollection collection = db.getCollection("inquirydeodetailsresponse");
		BasicDBObject criteria = new BasicDBObject();
		//TODO : Add criteria
		DBCursor cursor = collection.find(criteria);
		StringBuilder sb = new StringBuilder();
		try {
			while (cursor.hasNext()) {
				sb.append(cursor.next());
			}
		} finally {
			cursor.close();
		}
		CMECInquireDEODetailsResponseVO cmecInquireDEODetailsResponseVO = new Gson().fromJson(sb.toString(),
				CMECInquireDEODetailsResponseVO.class);
		return getCMECInquireDEODetailsResponse();
	}

	private static CMECInquireDEODetailsResponse getCMECInquireDEODetailsResponse() {
		CMECInquireDEODetailsResponse cDeoDetailsResponse = new CMECInquireDEODetailsResponse();

		InquireDEOResponse inquireDEOResponse = new InquireDEOResponse();
		inquireDEOResponse.setAction("test");
		inquireDEOResponse.setEmployerAccountId("test");

		EmployerScheduleDetails[] employerScheduleDetailsCollection = new EmployerScheduleDetails[1];
		EmployerScheduleDetails em = new EmployerScheduleDetails();
		em.setActualAmount("test");
		em.setDueDate("test");
		em.setFromDate("test");
		em.setOverDraftAmount("test");
		em.setReasonCode("test");
		em.setScheduleDate("test");
		em.setScheduleId("test");
		em.setScheduleStatus("test");
		em.setTargetAmount("test");
		em.setToDate("test");
		employerScheduleDetailsCollection[0] = em;
		inquireDEOResponse.setEmployerScheduleDetailsCollection(employerScheduleDetailsCollection);
		inquireDEOResponse.setFromDate("test");
		inquireDEOResponse.setScheduleStatus("test");
		inquireDEOResponse.setToDate("test");

		cDeoDetailsResponse.setInquireDEOResponse(inquireDEOResponse);
		cDeoDetailsResponse.setResponseHeader(getResponse());
		return cDeoDetailsResponse;
	}

	private static Response getResponse() {
		Response res = new Response();
		res.setResponseCode(200);
		res.setResponseMessage("Success");
		ResponseResponseDetails rd = new ResponseResponseDetails();
		rd.setCode("200");
		rd.setDescription("test");
		rd.setResponseFrom("test");
		ResponseResponseDetails[] r = new ResponseResponseDetails[1];
		r[0] = rd;
		res.setResponseDetails(r);
		return res;
	}

	public static void main(String args[]) throws RemoteException {
		InquiryScheduleMapper mapper = Selma.builder(InquiryScheduleMapper.class).build();

		// Map my InBean
		CMECInquireDEODetailsResponseVO res = mapper.getCMECInquireDEODetailsResponseVO(getCMECInquireDEODetailsResponse());
		System.out.println(res);
	}
}
