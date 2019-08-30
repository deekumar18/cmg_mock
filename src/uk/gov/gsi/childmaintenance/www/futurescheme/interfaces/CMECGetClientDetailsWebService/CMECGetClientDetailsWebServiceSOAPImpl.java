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

import uk.gov.dwp.esb.utils.DBUtil;
import uk.gov.dwp.esb.vo.CientHLSCaseDetail;
import uk.gov.dwp.esb.vo.ClientAddress;
import uk.gov.dwp.esb.vo.ClientDetailsResponseVO;
import uk.gov.gsi.childmaintenance.www.futurescheme.bo.common.Response_xsd.Response;
import uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalAddress.CmecEPortalAddress;
import uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalCaseContactDetails.CmecEPortalCaseContactDetails;
import uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalContactDetails.CmecEPortalContactDetails;
import uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalHLSCaseDetails.CmecEPortalHLSCaseDetails;
import uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecGetClientDetailsResponse.CmecGetClientDetailsResponse;

public class CMECGetClientDetailsWebServiceSOAPImpl implements
		uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECGetClientDetailsWebService.CMECePortalGetClientWebService_PortType {
	public uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecGetClientDetailsResponse.CmecGetClientDetailsResponse getClientDetails(
			uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecGetClientDetailsRequest.CmecGetClientDetailsRequest getClientDetailsInput)
			throws java.rmi.RemoteException {

		CmecGetClientDetailsResponse result = new CmecGetClientDetailsResponse();

		//Mongo mongo = new Mongo("localhost", 27017);
		//DB db = mongo.getDB("cmg_mock");
		DB db = DBUtil.getMongoDatabase();
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
public static void main(String[] args) {
	
	
	
	CmecGetClientDetailsResponse result = new CmecGetClientDetailsResponse();
	CmecEPortalHLSCaseDetails[]  cientHLSCaseDetails = new CmecEPortalHLSCaseDetails[1];
	CmecEPortalHLSCaseDetails obj = new CmecEPortalHLSCaseDetails();
	obj.setAnniversaryDate("test");
	obj.setAnnualLiabilityAmount("test");
	obj.setApplicantType("test");
	CmecEPortalCaseContactDetails[] caseContactDetails = new CmecEPortalCaseContactDetails[1];
	CmecEPortalCaseContactDetails obj1 = new CmecEPortalCaseContactDetails();
	
	obj1.setBirthDate("test");
	obj1.setContactBANCSAccNum("test");
	obj1.setContactCaseRelation("test");
	obj1.setContactFirstName("test");
	obj1.setContactGender("test");
	obj1.setContactId("test");
	obj1.setContactLastName("test");
	obj1.setContactSCIN("test");
	obj1.setParentage("test");	
	caseContactDetails[0]= obj1;
	obj.setCaseContactDetails(caseContactDetails);
	obj.setCaseEffectiveDate("test");
	obj.setCaseId("test");
	obj.setCaseNum("test");
	obj.setCaseStage("test");
	obj.setCMECAnnualARNrpCCAmt("test");
	obj.setCMECAnnualARPwcCCAmt("test");
	obj.setCMECFullAnnualNrpCCAmt("test");
	obj.setCMECFullAnnualPwcCCAmt("test");
	obj.setCMECNrpOgmCharge("test");
	obj.setCMECNrpPmtFrequency("test");
	obj.setCMECPwcCOgmCharge("test");
	obj.setInitialDate("test");
	obj.setLiabilityAmount("test");
	obj.setMonthlyLiabilityAmount("test");
	obj.setName("test");
	obj.setRelationshiptype("test");
	obj.setStatus("test");
	obj.setSubStatus("test");
	obj.setWeeklyLiabilityAmount("test");
	cientHLSCaseDetails[0] = obj;
	result.setCientHLSCaseDetails(cientHLSCaseDetails); 
	CmecEPortalAddress[]  clientAddress = new CmecEPortalAddress[1];
	CmecEPortalAddress obj2 = new CmecEPortalAddress();
	obj2.setAddressID("test");
	obj2.setAddressLine1("test");
	obj2.setAddressLine2("test");
	obj2.setAddressLine3("test");
	obj2.setAddressLine4("test");
	obj2.setAddressLine5("test");
	obj2.setAddressSource("test");
	obj2.setAddressType("test");
	obj2.setCity("test");
	obj2.setCountry("test");
	obj2.setCounty("test");
	obj2.setDeliveryPointSuffix("test");
	obj2.setEndDate("test");
	obj2.setIsPrimary("test");
	obj2.setLocation("test");
	obj2.setPostCode("test");
	obj2.setStartDate("test");
	obj2.setState("test");
	clientAddress[0] = obj2;
	
	result.setClientAddress(clientAddress);
	CmecEPortalContactDetails clientDetails = new CmecEPortalContactDetails();
	clientDetails.setBirthDate("test");
	String[] cellularPhoneNum = {"test","test","test"};
	clientDetails.setCellularPhoneNum(cellularPhoneNum);
	clientDetails.setContactPreference("test");
	clientDetails.setEmailAddress("test");
	clientDetails.setFirstName("test");
	clientDetails.setGender("test");
	String[] homePhoneNum = {"test","test","test"};
	clientDetails.setHomePhoneNum(homePhoneNum);
	clientDetails.setJobRole("test");
	clientDetails.setLanguagePreference("test");
	clientDetails.setLastName("test");
	clientDetails.setMiddleName("test");
	clientDetails.setNINO("test");
	clientDetails.setPersonID("test");
	clientDetails.setPrimaryContactFlag("test");
	clientDetails.setReferenceCode("test");
	clientDetails.setSCIN("test");
	clientDetails.setSmsFlag("test");
	clientDetails.setTitle("test");
	String[] workPhoneNum = {"test","test","test"};
	clientDetails.setWorkPhoneNum(workPhoneNum);
	
	result.setClientDetails(clientDetails);
	
	Response responseHeader = new Response();
	responseHeader.setResponseCode(200);
	responseHeader.setResponseMessage("test");
	responseHeader.setSRNumber("test");
	result.setResponseHeader(responseHeader);
	System.out.println(new Gson().toJson(result));
}
}
