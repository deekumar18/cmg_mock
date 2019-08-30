/**
 * CMECUpdEmplyrCntctWebServiceSOAPImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECUpdEmplyrCntctWebService;

import com.google.gson.Gson;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.Mongo;
import com.mongodb.util.JSON;

import uk.gov.dwp.esb.utils.DBUtil;
import uk.gov.gsi.childmaintenance.www.futurescheme.bo.common.Response_xsd.Response;
import uk.gov.gsi.childmaintenance.www.futurescheme.bo.common.Response_xsd.ResponseResponseDetails;
import uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecUpdEmplyrResponse.CmecUpdEmplyrResponse;

public class CMECUpdEmplyrCntctWebServiceSOAPImpl implements
		uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECUpdEmplyrCntctWebService.CMECUpdEmplyrCntctWebService_PortType {
	public uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecUpdEmplyrResponse.CmecUpdEmplyrResponse addEmployerContact(
			uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecAddUpdEmplyrCntctRequest.CmecAddUpdEmplyrCntctRequest addEmplyrCntctRequest)
			throws java.rmi.RemoteException {

		DBCollection collection = getMongoDB();
		DBObject dbObject = (DBObject) JSON.parse(new Gson().toJson(addEmplyrCntctRequest));

		collection.insert(dbObject);

		CmecUpdEmplyrResponse result = new CmecUpdEmplyrResponse();
		uk.gov.gsi.childmaintenance.www.futurescheme.bo.common.Response_xsd.Response responseHeader = new Response();
		responseHeader.setResponseCode(200);
		responseHeader.setResponseMessage("Document Created");
		result.setResponseHeader(responseHeader);

		return result;
	}

	private DBCollection getMongoDB() {
		DB db = DBUtil.getMongoDatabase();
		DBCollection collection = db.getCollection("updemplyrcntctdetails");
		return collection;
	}

	public uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecUpdEmplyrResponse.CmecUpdEmplyrResponse updateEmployerContact(
			uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecAddUpdEmplyrCntctRequest.CmecAddUpdEmplyrCntctRequest updEmplyrCntctRequest)
			throws java.rmi.RemoteException {
		CmecUpdEmplyrResponse result = new CmecUpdEmplyrResponse();
		Response responseHeader = new Response();

		responseHeader.setResponseCode(200);
		ResponseResponseDetails[] responseDetails = new ResponseResponseDetails[1];
		ResponseResponseDetails res = new ResponseResponseDetails();
		res.setCode("200");
		res.setDescription("test");
		res.setResponseFrom("test");
		responseDetails[0] = res;

		responseHeader.setResponseDetails(responseDetails);
		result.setResponseHeader(responseHeader);

		return result;
	}

	public uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecUpdEmplyrResponse.CmecUpdEmplyrResponse deleteEmployerContact(
			uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecDelEmplyrCntctRequest.CmecDelEmplyrCntctRequest delEmplyrCntctRequest)
			throws java.rmi.RemoteException {
		DBCollection collection = getMongoDB();
		BasicDBObject document = new BasicDBObject();
		document.put("ern", delEmplyrCntctRequest.getErn());
		collection.remove(document);

		CmecUpdEmplyrResponse result = new CmecUpdEmplyrResponse();
		Response responseHeader = new Response();
		responseHeader.setResponseCode(200);
		responseHeader.setResponseMessage("Document Deleted");
		result.setResponseHeader(responseHeader);

		return result;
	}
}
