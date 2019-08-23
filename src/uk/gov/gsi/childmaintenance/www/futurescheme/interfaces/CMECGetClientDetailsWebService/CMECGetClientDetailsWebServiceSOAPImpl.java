/**
 * CMECGetClientDetailsWebServiceSOAPImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECGetClientDetailsWebService;

import java.lang.reflect.InvocationTargetException;

import com.google.gson.Gson;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.Mongo;

import uk.gov.dwp.esb.vo.CientHLSCaseDetail;
import uk.gov.dwp.esb.vo.ClientAddress;
import uk.gov.dwp.esb.vo.ClientDetailsResponseVO;
import uk.gov.gsi.childmaintenance.www.futurescheme.bo.common.Response_xsd.Response;
import uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalAddress.CmecEPortalAddress;
import uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalContactDetails.CmecEPortalContactDetails;
import uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalHLSCaseDetails.CmecEPortalHLSCaseDetails;
import uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecGetClientDetailsResponse.CmecGetClientDetailsResponse;

public class CMECGetClientDetailsWebServiceSOAPImpl implements
		uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECGetClientDetailsWebService.CMECePortalGetClientWebService_PortType {
	public uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecGetClientDetailsResponse.CmecGetClientDetailsResponse getClientDetails(
			uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecGetClientDetailsRequest.CmecGetClientDetailsRequest getClientDetailsInput)
			throws java.rmi.RemoteException {

		CmecGetClientDetailsResponse result = new CmecGetClientDetailsResponse();

		Mongo mongo = new Mongo("localhost", 27017);
		DB db = mongo.getDB("cmg_mock");
		DBCollection collection = db.getCollection("clientdetailsresponse");
		BasicDBObject criteria = new BasicDBObject();
		criteria.append("clientDetails.scin", getClientDetailsInput.getSCIN());
		DBCursor cursor = collection.find(criteria);
		StringBuilder sb = new StringBuilder();
		try {
			while (cursor.hasNext()) {
				sb.append(cursor.next());
			}
		} finally {
			cursor.close();
		}

		ClientDetailsResponseVO clientDetailsResponseVO = new Gson().fromJson(sb.toString(),
				ClientDetailsResponseVO.class);

		CmecEPortalHLSCaseDetails[] cientHLSCaseDetails = new CmecEPortalHLSCaseDetails[clientDetailsResponseVO
				.getCientHLSCaseDetails().size()];

		int i = 0;
		for (CientHLSCaseDetail ele : clientDetailsResponseVO.getCientHLSCaseDetails()) {
			CmecEPortalHLSCaseDetails hlsCaseDetail = new CmecEPortalHLSCaseDetails();
			try {
				org.apache.commons.beanutils.BeanUtils.copyProperties(hlsCaseDetail, ele);
			} catch (IllegalAccessException | InvocationTargetException e) {
				e.printStackTrace();
			}
			cientHLSCaseDetails[i] = hlsCaseDetail;
			i++;
		}

		result.setCientHLSCaseDetails(cientHLSCaseDetails);

		CmecEPortalAddress[] clientAddress = new CmecEPortalAddress[clientDetailsResponseVO.getClientAddress().size()];

		int j = 0;
		for (ClientAddress clientAdd : clientDetailsResponseVO.getClientAddress()) {
			CmecEPortalAddress ePortalAdd = new CmecEPortalAddress();
			try {
				org.apache.commons.beanutils.BeanUtils.copyProperties(ePortalAdd, clientAdd);
			} catch (IllegalAccessException | InvocationTargetException e) {
				e.printStackTrace();
			}
			clientAddress[j] = ePortalAdd;
			j++;
		}
		
		result.setClientAddress(clientAddress);
		
		
		CmecEPortalContactDetails eportalContactDtl = new CmecEPortalContactDetails();
		
		try {
			org.apache.commons.beanutils.BeanUtils.copyProperties(eportalContactDtl, clientDetailsResponseVO.getClientDetails());
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		result.setClientDetails(eportalContactDtl);
		
		Response res = new Response();
		try {
			org.apache.commons.beanutils.BeanUtils.copyProperties(res, clientDetailsResponseVO.getResponseHeader());
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		result.setResponseHeader(res);

		return result;
	}

}
