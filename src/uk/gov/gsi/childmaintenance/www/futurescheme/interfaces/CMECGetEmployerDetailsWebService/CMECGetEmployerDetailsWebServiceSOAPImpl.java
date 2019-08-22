/**
 * CMECGetEmployerDetailsWebServiceSOAPImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECGetEmployerDetailsWebService;

import com.google.gson.Gson;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.Mongo;

import uk.gov.dwp.esb.vo.ClientDetailsResponseVO;
import uk.gov.gsi.childmaintenance.www.futurescheme.bo.common.Response_xsd.Response;
import uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalAccountDetails.CmecEPortalAccountDetails;
import uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalAddress.CmecEPortalAddress;
import uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalContactDetails.CmecEPortalContactDetails;
import uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalEmployerDetails.CmecEPortalEmployerDetails;
import uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalFinCorpAccountDetails.CmecEPortalFinCorpAccountDetails;
import uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecGetEmployerDetailsResponse.CmecGetEmployerDetailsResponse;
import uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.payment.BankWizardResponseDetail.BankWizardResponseDetail;

public class CMECGetEmployerDetailsWebServiceSOAPImpl implements uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECGetEmployerDetailsWebService.CMECePortalGetEmployerWebService_PortType{
    public uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecGetEmployerDetailsResponse.CmecGetEmployerDetailsResponse getEmployerDetails(uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecGetEmployerDetailsRequest.CmecGetEmployerDetailsRequest getEmployerDetailsInput) throws java.rmi.RemoteException {
       
    	CmecGetEmployerDetailsResponse result = new CmecGetEmployerDetailsResponse();
    	System.out.println(getEmployerDetailsInput.getEmployerReferenceNum());
    	
    	Response res = new Response();
    	res.setResponseCode(400);
    	result.setResponseHeader(res);
    	
		Mongo mongo = new Mongo("localhost", 27017);
		DB db = mongo.getDB("cmg_mock");
		DBCollection collection = db.getCollection("employerdetails");
		BasicDBObject criteria = new BasicDBObject();
		criteria.append("employerDetails.employerRefNum", getEmployerDetailsInput.getEmployerReferenceNum());
		DBCursor cursor = collection.find(criteria);
		StringBuilder sb = new StringBuilder();
		try {
			while (cursor.hasNext()) {
				sb.append(cursor.next());
			}
		} finally {
			cursor.close();
		}
    	
		System.out.println(sb);
		//Employer`DetailsResponseVO clientDetailsResponseVO = new Gson().fromJson(sb.toString(),
			//	ClientDetailsResponseVO.class);

		
    	
    	return result;
    }
    
}
