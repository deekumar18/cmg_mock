/**
 * CMECGetClientContactHistoryWebServiceSOAPImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECePortalGetClientContactHistoryWebService;

import java.lang.reflect.InvocationTargetException;

import org.apache.commons.beanutils.BeanUtils;

import com.google.gson.Gson;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;

import uk.gov.dwp.esb.vo.ClientContactHistory;
import uk.gov.dwp.esb.vo.CmecGetClientContactHistoryDetailsResponseVO;
import uk.gov.dwp.esb.vo.ListOfDocument;
import uk.gov.dwp.esb.vo.ListOfEnclosure;
import uk.gov.gsi.childmaintenance.www.futurescheme.bo.common.Response_xsd.Response;
import uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalClientContactHistDetails.CmecEPortalContactHistDetails;
import uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalDocumentDetails.CmecEPortalDocumentDetails;
import uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalEnclosuresDetails.CmecEPortalEnclosuresDetails;
import uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecGetClientContactHistoryDetailsResponse.CmecGetClientContactHistoryDetailsResponse;

public class CMECGetClientContactHistoryWebServiceSOAPImpl implements
		uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECePortalGetClientContactHistoryWebService.CMECePortalGetClientContactHistoryWebService_PortType {
	public uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecGetClientContactHistoryDetailsResponse.CmecGetClientContactHistoryDetailsResponse getClientContactHistory(
			uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecGetClientContactHistoryDetailsRequest.CmecGetClientContactHistoryDetailsRequest getClientContactHistoryInput)
			throws java.rmi.RemoteException {

		CmecGetClientContactHistoryDetailsResponse result = new CmecGetClientContactHistoryDetailsResponse();

		MongoClient mongo = new MongoClient("localhost", 27017);
		DB db = mongo.getDB("cmg_mock");
		// mongo.getDatabase("cmg_mock");
		DBCollection collection = db.getCollection("clientcontacthistory");
		BasicDBObject criteria = new BasicDBObject();
		criteria.append("SCIN", getClientContactHistoryInput.getSCIN());
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
		CmecGetClientContactHistoryDetailsResponseVO clientContactHistoryDetailsResponseVO = new Gson()
				.fromJson(sb.toString(), CmecGetClientContactHistoryDetailsResponseVO.class);

		System.out.println(clientContactHistoryDetailsResponseVO.getSCIN());

		CmecEPortalContactHistDetails[] clientContactHistory = new CmecEPortalContactHistDetails[clientContactHistoryDetailsResponseVO
				.getClientContactHistory().size()];

		int total = 0;
		for (ClientContactHistory ele : clientContactHistoryDetailsResponseVO.getClientContactHistory()) {
			CmecEPortalContactHistDetails cmecEPortalContactHistDetails = new CmecEPortalContactHistDetails();

			CmecEPortalDocumentDetails[] listOfDocuments = new CmecEPortalDocumentDetails[ele.getListOfDocuments()
					.size()];
			int i = 0;
			for (ListOfDocument innerEle1 : ele.getListOfDocuments()) {
				CmecEPortalDocumentDetails cmecEPortalDocumentDetails = new CmecEPortalDocumentDetails();
				try {
					BeanUtils.copyProperties(cmecEPortalDocumentDetails, innerEle1);
				} catch (IllegalAccessException | InvocationTargetException e) {
					e.printStackTrace();
				}
				listOfDocuments[i] = cmecEPortalDocumentDetails;
				i++;
			}

			CmecEPortalEnclosuresDetails[] listOfEnclosures = new CmecEPortalEnclosuresDetails[ele.getListOfEnclosures()
					.size()];

			int j = 0;
			for (ListOfEnclosure innerEle2 : ele.getListOfEnclosures()) {
				CmecEPortalEnclosuresDetails cmecEPortalEnclosuresDetails = new CmecEPortalEnclosuresDetails();

				try {
					BeanUtils.copyProperties(cmecEPortalEnclosuresDetails, innerEle2);
				} catch (IllegalAccessException | InvocationTargetException e) {
					e.printStackTrace();
				}
				listOfEnclosures[j] = cmecEPortalEnclosuresDetails;
				j++;
			}

			cmecEPortalContactHistDetails.setListOfDocuments(listOfDocuments);
			cmecEPortalContactHistDetails.setListOfEnclosures(listOfEnclosures);
			cmecEPortalContactHistDetails.setCaseId(ele.getCaseId());
			cmecEPortalContactHistDetails.setClientFacingName(ele.getClientFacingName());
			cmecEPortalContactHistDetails.setDateOfCorrespondence(ele.getDateOfCorrespondence());
			cmecEPortalContactHistDetails.setDescription(ele.getDescription());
			cmecEPortalContactHistDetails.setLtrTmplCode(ele.getLtrTmplCode());
			cmecEPortalContactHistDetails.setMessageFlag(ele.getMessageFlag());
			cmecEPortalContactHistDetails.setRefId(ele.getRefId());
			cmecEPortalContactHistDetails.setSubject(ele.getSubject());
			cmecEPortalContactHistDetails.setTypeOfCorrespondence(ele.getTypeOfCorrespondence());

			clientContactHistory[total] = cmecEPortalContactHistDetails;
			total++;

		}

		result.setClientContactHistory(clientContactHistory);
		result.setPersonID(clientContactHistoryDetailsResponseVO.getPersonID());
		result.setSCIN(clientContactHistoryDetailsResponseVO.getSCIN());
		Response responseHeader = new Response();
		responseHeader.setResponseCode(clientContactHistoryDetailsResponseVO.getResponseHeader().getResponseCode());
		responseHeader
				.setResponseMessage(clientContactHistoryDetailsResponseVO.getResponseHeader().getResponseMessage());
		responseHeader.setSRNumber(clientContactHistoryDetailsResponseVO.getResponseHeader().getSrNumber());
		result.setResponseHeader(responseHeader);

		return result;
	}
}
