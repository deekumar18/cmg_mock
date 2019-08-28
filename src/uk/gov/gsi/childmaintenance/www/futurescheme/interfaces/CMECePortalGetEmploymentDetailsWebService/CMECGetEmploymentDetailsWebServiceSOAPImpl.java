/**
 * CMECGetEmploymentDetailsWebServiceSOAPImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECePortalGetEmploymentDetailsWebService;

import java.lang.reflect.InvocationTargetException;

import org.apache.commons.beanutils.BeanUtils;

import com.google.gson.Gson;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.Mongo;

import uk.gov.dwp.esb.vo.CmecGetEmploymentDetailsResponseVO;
import uk.gov.dwp.esb.vo.ContactEmploymentDetail;
import uk.gov.gsi.childmaintenance.www.futurescheme.bo.common.Response_xsd.Response;
import uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalAddress.CmecEPortalAddress;
import uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalEmploymentDetails.CmecEPortalEmploymentDetails;
import uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecGetEmploymentDetailsResponse.CmecGetEmploymentDetailsResponse;

public class CMECGetEmploymentDetailsWebServiceSOAPImpl implements
		uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECePortalGetEmploymentDetailsWebService.CMECePortalGetEmploymentDetailsWebService_PortType {
	public uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecGetEmploymentDetailsResponse.CmecGetEmploymentDetailsResponse getEmploymentDetails(
			uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecGetEmploymentDetailsRequest.CmecGetEmploymentDetailsRequest getEmploymentDetailsInput)
			throws java.rmi.RemoteException {

		CmecGetEmploymentDetailsResponse result = new CmecGetEmploymentDetailsResponse();

		Mongo mongo = new Mongo("localhost", 27017);
		DB db = mongo.getDB("cmg_mock");
		DBCollection collection = db.getCollection("employmentdetails");
		BasicDBObject criteria = new BasicDBObject();
		criteria.append("SCIN", getEmploymentDetailsInput.getSCIN());
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
		CmecGetEmploymentDetailsResponseVO cmecGetEmploymentDetailsResponseVO = new Gson().fromJson(sb.toString(),
				CmecGetEmploymentDetailsResponseVO.class);

		CmecEPortalEmploymentDetails[] contactEmploymentDetails = new CmecEPortalEmploymentDetails[cmecGetEmploymentDetailsResponseVO
				.getContactEmploymentDetails().size()];

		int i = 0;
		for (ContactEmploymentDetail ele : cmecGetEmploymentDetailsResponseVO.getContactEmploymentDetails()) {

			CmecEPortalEmploymentDetails cmecEPortalEmploymentDetails = new CmecEPortalEmploymentDetails();

			CmecEPortalAddress addressDetails = new CmecEPortalAddress();

			try {
				BeanUtils.copyProperties(addressDetails, ele.getAddressDetails());
			} catch (IllegalAccessException | InvocationTargetException e1) {
				e1.printStackTrace();
			}
			cmecEPortalEmploymentDetails.setAddressDetails(addressDetails);

			cmecEPortalEmploymentDetails.setAnnualGrossIncome(ele.getAnnualGrossIncome());
			cmecEPortalEmploymentDetails.setAnnualIrregularIncome(ele.getAnnualIrregularIncome());
			cmecEPortalEmploymentDetails.setAnnualPensionContribution(ele.getAnnualPensionContribution());
			cmecEPortalEmploymentDetails.setEmployerId(ele.getEmployerId());
			cmecEPortalEmploymentDetails.setEmployerName(ele.getEmployerName());
			cmecEPortalEmploymentDetails.setEmploymentEndDate(ele.getEmploymentEndDate());
			cmecEPortalEmploymentDetails.setEmploymentStartDate(ele.getEmploymentStartDate());
			cmecEPortalEmploymentDetails.setFaxNumber(ele.getFaxNumber());
			cmecEPortalEmploymentDetails.setForeignExchangeCosts(ele.getForeignExchangeCosts());
			cmecEPortalEmploymentDetails.setIncomeId(ele.getIncomeId());
			cmecEPortalEmploymentDetails.setModifiedFlag(ele.getModifiedFlag());
			cmecEPortalEmploymentDetails.setPhoneNumber(ele.getPhoneNumber());
			cmecEPortalEmploymentDetails.setSpecialEmploymentType(ele.getSpecialEmploymentType());
			cmecEPortalEmploymentDetails.setWorkPhoneNumExtn(ele.getWorkPhoneNumExtn());

			contactEmploymentDetails[i] = cmecEPortalEmploymentDetails;
			i++;
		}

		result.setContactEmploymentDetails(contactEmploymentDetails);
		result.setCurrencyOfPayment(cmecGetEmploymentDetailsResponseVO.getCurrencyOfPayment());
		result.setTotalIncomeAmount(cmecGetEmploymentDetailsResponseVO.getTotalIncomeAmount());
		Response responseHeader = new Response();
		responseHeader.setResponseCode(cmecGetEmploymentDetailsResponseVO.getResponseHeader().getResponseCode());
		responseHeader.setResponseMessage(cmecGetEmploymentDetailsResponseVO.getResponseHeader().getResponseMessage());
		responseHeader.setSRNumber(cmecGetEmploymentDetailsResponseVO.getResponseHeader().getSrNumber());
		result.setResponseHeader(responseHeader);

		return result;
	}

}
