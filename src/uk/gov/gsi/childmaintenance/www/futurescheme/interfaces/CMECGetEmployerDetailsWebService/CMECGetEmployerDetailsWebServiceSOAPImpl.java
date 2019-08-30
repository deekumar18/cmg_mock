/**
 * CMECGetEmployerDetailsWebServiceSOAPImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECGetEmployerDetailsWebService;

<<<<<<< HEAD
=======
import java.lang.reflect.InvocationTargetException;

>>>>>>> d7c2d3d9a022920211eca07cd940241f72f2d557
import com.google.gson.Gson;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.Mongo;

<<<<<<< HEAD
import uk.gov.dwp.esb.vo.ClientDetailsResponseVO;
=======
import uk.gov.dwp.esb.utils.DBUtil;
import uk.gov.dwp.esb.vo.AccountDetail;
import uk.gov.dwp.esb.vo.BwzResponsesWrapper;
import uk.gov.dwp.esb.vo.EmployerAddress;
import uk.gov.dwp.esb.vo.EmployerContact;
import uk.gov.dwp.esb.vo.EmployerDetailsResponseVO;
import uk.gov.dwp.esb.vo.FinCorpDetail;
>>>>>>> d7c2d3d9a022920211eca07cd940241f72f2d557
import uk.gov.gsi.childmaintenance.www.futurescheme.bo.common.Response_xsd.Response;
import uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalAccountDetails.CmecEPortalAccountDetails;
import uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalAddress.CmecEPortalAddress;
import uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalContactDetails.CmecEPortalContactDetails;
import uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalEmployerDetails.CmecEPortalEmployerDetails;
import uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalFinCorpAccountDetails.CmecEPortalFinCorpAccountDetails;
import uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecGetEmployerDetailsResponse.CmecGetEmployerDetailsResponse;
import uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.payment.BankWizardResponseDetail.BankWizardResponseDetail;

<<<<<<< HEAD
public class CMECGetEmployerDetailsWebServiceSOAPImpl implements uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECGetEmployerDetailsWebService.CMECePortalGetEmployerWebService_PortType{
    public uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecGetEmployerDetailsResponse.CmecGetEmployerDetailsResponse getEmployerDetails(uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecGetEmployerDetailsRequest.CmecGetEmployerDetailsRequest getEmployerDetailsInput) throws java.rmi.RemoteException {
       
    	CmecGetEmployerDetailsResponse result = new CmecGetEmployerDetailsResponse();
    	System.out.println(getEmployerDetailsInput.getEmployerReferenceNum());
    	
    	Response res = new Response();
    	res.setResponseCode(400);
    	result.setResponseHeader(res);
    	
		Mongo mongo = new Mongo("localhost", 27017);
		DB db = mongo.getDB("cmg_mock");
=======
public class CMECGetEmployerDetailsWebServiceSOAPImpl implements
		uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECGetEmployerDetailsWebService.CMECePortalGetEmployerWebService_PortType {
	public uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecGetEmployerDetailsResponse.CmecGetEmployerDetailsResponse getEmployerDetails(
			uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecGetEmployerDetailsRequest.CmecGetEmployerDetailsRequest getEmployerDetailsInput)
			throws java.rmi.RemoteException {

		CmecGetEmployerDetailsResponse result = new CmecGetEmployerDetailsResponse();
		System.out.println(getEmployerDetailsInput.getEmployerReferenceNum());

		DB db = DBUtil.getMongoDatabase();
>>>>>>> d7c2d3d9a022920211eca07cd940241f72f2d557
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
<<<<<<< HEAD
    	
		System.out.println(sb);
		//Employer`DetailsResponseVO clientDetailsResponseVO = new Gson().fromJson(sb.toString(),
			//	ClientDetailsResponseVO.class);

		
    	
    	return result;
    }
    
=======

		System.out.println(sb);
		EmployerDetailsResponseVO employerDetailsResponseVO = new Gson().fromJson(sb.toString(),
				EmployerDetailsResponseVO.class);

		System.out.println(employerDetailsResponseVO.getEmployerDetails().getEmailAddress());

		CmecEPortalAddress[] employerAddress = new CmecEPortalAddress[employerDetailsResponseVO.getEmployerAddress()
				.size()];

		int i = 0;
		for (EmployerAddress ele : employerDetailsResponseVO.getEmployerAddress()) {
			CmecEPortalAddress cmeAdd = new CmecEPortalAddress();
			try {
				org.apache.commons.beanutils.BeanUtils.copyProperties(cmeAdd, ele);
			} catch (IllegalAccessException | InvocationTargetException e) {
				e.printStackTrace();
			}
			employerAddress[i] = cmeAdd;
			i++;
		}

		result.setEmployerAddress(employerAddress);

		CmecEPortalContactDetails[] employerContact = new CmecEPortalContactDetails[1];
		int j = 0;
		for (EmployerContact ele : employerDetailsResponseVO.getEmployerContact()) {
			CmecEPortalContactDetails cmePortalDetails = new CmecEPortalContactDetails();
			try {
				org.apache.commons.beanutils.BeanUtils.copyProperties(cmePortalDetails, ele);
			} catch (IllegalAccessException | InvocationTargetException e) {
				e.printStackTrace();
			}
			employerContact[j] = cmePortalDetails;
			j++;
		}

		result.setEmployerContact(employerContact);

		CmecEPortalEmployerDetails employerDetails = new CmecEPortalEmployerDetails();
		try {
			org.apache.commons.beanutils.BeanUtils.copyProperties(employerDetails,
					employerDetailsResponseVO.getEmployerDetails());
		} catch (IllegalAccessException | InvocationTargetException e) {
			e.printStackTrace();
		}
		result.setEmployerDetails(employerDetails);

		CmecEPortalFinCorpAccountDetails[] finCorpDetails = new CmecEPortalFinCorpAccountDetails[employerDetailsResponseVO
				.getFinCorpDetails().size()];

		int k = 0;
		for (FinCorpDetail ele : employerDetailsResponseVO.getFinCorpDetails()) {
			CmecEPortalFinCorpAccountDetails cmecEPortalFinCorpAccountDetails = new CmecEPortalFinCorpAccountDetails();
			CmecEPortalAccountDetails[] cmecEPortalAccountDetails = new CmecEPortalAccountDetails[ele
					.getAccountDetails().size()];

			for (AccountDetail acDtl : ele.getAccountDetails()) {
				CmecEPortalAccountDetails accountDetails = new CmecEPortalAccountDetails();
				BankWizardResponseDetail[] bwzResponsesWrapper = new BankWizardResponseDetail[acDtl
						.getBwzResponsesWrapper().size()];

				int p = 0;
				for (BwzResponsesWrapper bwzWrapper : acDtl.getBwzResponsesWrapper()) {
					BankWizardResponseDetail bankWizardResponseDetail = new BankWizardResponseDetail();
					bankWizardResponseDetail.setResponseCode(bwzWrapper.getResponseCode());
					bankWizardResponseDetail.setResponseDescription(bwzWrapper.getResponseDescription());
					bankWizardResponseDetail.setResponseType(bwzWrapper.getResponseType());
					bwzResponsesWrapper[p] = bankWizardResponseDetail;
					p++;
				}
				accountDetails.setBwzResponsesWrapper(bwzResponsesWrapper);
				accountDetails.setAccountType(acDtl.getAccountType());
				accountDetails.setBwzAccountNumber(acDtl.getBwzAccountNumber());
				accountDetails.setBwzRollNo(acDtl.getBwzRollNo());
				accountDetails.setBwzSortCode(acDtl.getBwzSortCode());
				accountDetails.setCMECAccountNumber(acDtl.getCMECAccountNumber());
				accountDetails.setCMECAccountNumber(acDtl.getCMECAccountNumber());
				accountDetails.setCMECRollNo(acDtl.getCMECRollNo());
				accountDetails.setCMECSortCode(acDtl.getCMECSortCode());
				accountDetails.setCollectionDate(acDtl.getCollectionDate());
				accountDetails.setExpirqationDate(acDtl.getExpirqationDate());
				accountDetails.setMethodOfPayment(acDtl.getMethodOfPayment());
				accountDetails.setMOPSequenceNumber(acDtl.getMOPSequenceNumber());
				accountDetails.setName(acDtl.getName());

			}

			cmecEPortalFinCorpAccountDetails.setAccountDetails(cmecEPortalAccountDetails);
			cmecEPortalFinCorpAccountDetails.setAccountName(ele.getAccountNumber());
			cmecEPortalFinCorpAccountDetails.setAccountNumber(ele.getAccountNumber());
			cmecEPortalFinCorpAccountDetails.setAccountType(ele.getAccountType());
			cmecEPortalFinCorpAccountDetails.setCaseNumber(ele.getCaseNumber());
			cmecEPortalFinCorpAccountDetails.setContactCIF(ele.getContactCIF());
			finCorpDetails[k] = cmecEPortalFinCorpAccountDetails;
			k++;
		}
		result.setFinCorpDetails(finCorpDetails);

		Response res = new Response();
		res.setResponseCode(employerDetailsResponseVO.getResponseHeader().getResponseCode());
		res.setResponseMessage(employerDetailsResponseVO.getResponseHeader().getResponseMessage());
		res.setSRNumber(employerDetailsResponseVO.getResponseHeader().getSrNumber());

		result.setResponseHeader(res);

		return result;
	}

>>>>>>> d7c2d3d9a022920211eca07cd940241f72f2d557
}
