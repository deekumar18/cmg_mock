/**
 * CMECGetEmployerContactHistoryWebServiceSOAPImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECePortalGetEmployerContactHistoryWebService;

import java.lang.reflect.InvocationTargetException;

import org.apache.commons.beanutils.BeanUtils;

import com.google.gson.Gson;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.Mongo;

import uk.gov.dwp.esb.utils.DBUtil;
import uk.gov.dwp.esb.vo.CmecGetEmployerContactHistoryDetailsResponseVO;
import uk.gov.dwp.esb.vo.EmployerContactHistory;
import uk.gov.dwp.esb.vo.ListOfDocument;
import uk.gov.dwp.esb.vo.ListOfEnclosure;
import uk.gov.gsi.childmaintenance.www.futurescheme.bo.common.Response_xsd.Response;
import uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalClientContactHistDetails.CmecEPortalContactHistDetails;
import uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalDocumentDetails.CmecEPortalDocumentDetails;
import uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalEnclosuresDetails.CmecEPortalEnclosuresDetails;
import uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecGetEmployerContactHistoryDetailsResponse.CmecGetEmployerContactHistoryDetailsResponse;

public class CMECGetEmployerContactHistoryWebServiceSOAPImpl implements
		uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECePortalGetEmployerContactHistoryWebService.CMECePortalGetEmployerContactHistoryWebService_PortType {
	public uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecGetEmployerContactHistoryDetailsResponse.CmecGetEmployerContactHistoryDetailsResponse getEmployerContactHistory(
			uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecGetEmployerContactHistoryDetailsRequest.CmecGetEmployerContactHistoryDetailsRequest getEmployerContactHistoryInput)
			throws java.rmi.RemoteException {
		CmecGetEmployerContactHistoryDetailsResponse result = new CmecGetEmployerContactHistoryDetailsResponse();

		DB db = DBUtil.getMongoDatabase();
		DBCollection collection = db.getCollection("employercontacthistory");
		BasicDBObject criteria = new BasicDBObject();
		criteria.append("ERN", getEmployerContactHistoryInput.getERN());
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
		CmecGetEmployerContactHistoryDetailsResponseVO employerContDetailResponseVO = new Gson().fromJson(sb.toString(),
				CmecGetEmployerContactHistoryDetailsResponseVO.class);

		System.out.println(employerContDetailResponseVO.getERN());

		result.setEmployerID(employerContDetailResponseVO.getEmployerID());
		result.setERN(employerContDetailResponseVO.getERN());

		CmecEPortalContactHistDetails[] employerContactHistory = new CmecEPortalContactHistDetails[employerContDetailResponseVO
				.getEmployerContactHistory().size()];

		int total = 0;
		for (EmployerContactHistory ele : employerContDetailResponseVO.getEmployerContactHistory()) {
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

			cmecEPortalContactHistDetails.setListOfDocuments(listOfDocuments);

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

			employerContactHistory[total] = cmecEPortalContactHistDetails;
			total++;
		}

		result.setEmployerContactHistory(employerContactHistory);
		result.setEmployerID(employerContDetailResponseVO.getEmployerID());
		result.setERN(employerContDetailResponseVO.getERN());
		Response responseHeader = new Response();
		responseHeader.setResponseCode(employerContDetailResponseVO.getResponseHeader().getResponseCode());
		responseHeader.setResponseMessage(employerContDetailResponseVO.getResponseHeader().getResponseMessage());
		responseHeader.setSRNumber(employerContDetailResponseVO.getResponseHeader().getSrNumber());
		result.setResponseHeader(responseHeader);

		return result;
	}
}
