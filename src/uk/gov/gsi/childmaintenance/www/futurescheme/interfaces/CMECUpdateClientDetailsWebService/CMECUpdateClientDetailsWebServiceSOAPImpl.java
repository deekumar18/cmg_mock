/**
 * CMECUpdateClientDetailsWebServiceSOAPImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECUpdateClientDetailsWebService;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;

import uk.gov.dwp.esb.harddata.UpdateClientDetailsResponseHD;
import uk.gov.dwp.esb.utils.DBUtil;
import uk.gov.dwp.esb.vo.UpdateClientDetailsResponseVO;
import uk.gov.gsi.childmaintenance.www.futurescheme.bo.common.Response_xsd.Response;
import uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CMECEPortalUpdEmplymntDetailsResponse.CMECEPortalUpdEmplymntDetailsResponse;
import uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalUpdAddrDetailsResp.CmecEPortalUpdAddrDetailsResp;
import uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalUpdCntctDetailsResponse.CmecEPortalUpdCntctDetailsResponse;
import uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalUpdLoginStatusResponse.CmecEPortalUpdLoginStatusResponse;
import uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalUpdPCMResponse.CmecEPortalUpdPCMResponse;
import uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalUpdPINResponse.CmecEPortalUpdPINResponse;
import uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalUpdateMOPResponse.CmecEPortalUpdateMOPResponse;
import uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECUpdateClientDetailsWebService.InputData;

public class CMECUpdateClientDetailsWebServiceSOAPImpl implements uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECUpdateClientDetailsWebService.CMECUpdateClientDetailsWebService_PortType{

	private final boolean DYNAMIC_FLAG = false;
	private UpdateClientDetailsResponseHD hardData = new UpdateClientDetailsResponseHD();
	private UpdateClientDetailsResponseVO updateClientDetailsResponseVO = hardData.getData();

	private void setData(List<InputData> inputData) {

    	if (DYNAMIC_FLAG) {
    		DB db = DBUtil.getMongoDatabase();
			DBCollection collection = db.getCollection("updateclientdetails");
			BasicDBObject criteria = new BasicDBObject();
			for (InputData input: inputData) {
				criteria.append(input.getName(), input.getValue());
			}
			DBCursor cursor = collection.find(criteria);

			StringBuilder sb = new StringBuilder();
			try {
				while (cursor.hasNext()) {
					sb.append(cursor.next());
				}
			} finally {
				cursor.close();
			}

			updateClientDetailsResponseVO = new Gson().fromJson(sb.toString(), UpdateClientDetailsResponseVO.class);
    	}
	}

	//updateContactDetails
    public uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalUpdCntctDetailsResponse.CmecEPortalUpdCntctDetailsResponse updateContactDetails(uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalUpdCntctDetailsRequest.CmecEPortalUpdCntctDetailsRequest updateContactDetailsReq) throws java.rmi.RemoteException {
    	CmecEPortalUpdCntctDetailsResponse result = new CmecEPortalUpdCntctDetailsResponse();

    	List<InputData> inputData = new ArrayList<InputData>();
    	inputData.add(new InputData("request.scin", updateContactDetailsReq.getSCIN()));
    	this.setData(inputData);

    	Response res = new Response();
		try {
			org.apache.commons.beanutils.BeanUtils.copyProperties(res, updateClientDetailsResponseVO.getResponseHeader());
		} catch (IllegalAccessException | InvocationTargetException e) {
			e.printStackTrace();
		}
		res.setSRNumber(updateClientDetailsResponseVO.getResponseHeader().getSrNumber());
		result.setResponseHeader(res);

		return result;
    }

    // updatePersonalDetails
    public uk.gov.gsi.childmaintenance.www.futurescheme.bo.common.Response_xsd.Response updatePersonalDetails(uk.gov.gsi.childmaintenance.www.futurescheme.bo.common.CMECHeader_xsd.CMECHeader requestHeader, java.lang.String caseNumber, java.lang.String SCIN, uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalUpdPrsnlDetailsRequest.CmecEPortalUpdPrsnlDetailsRequestTitle title, java.lang.String newFirstName, java.lang.String newLastName, java.lang.String newMiddleName, java.lang.String newGender, java.lang.String birthDate, java.lang.String source) throws java.rmi.RemoteException {
    	Response result = new Response();

    	List<InputData> inputData = new ArrayList<InputData>();
    	inputData.add(new InputData("request.scin", SCIN));
    	this.setData(inputData);

		try {
			org.apache.commons.beanutils.BeanUtils.copyProperties(result, updateClientDetailsResponseVO.getResponseHeader());
		} catch (IllegalAccessException | InvocationTargetException e) {
			e.printStackTrace();
		}
		result.setSRNumber(updateClientDetailsResponseVO.getResponseHeader().getSrNumber());

		return result;
    }

    // updatePreferredContactMethod
    public uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalUpdPCMResponse.CmecEPortalUpdPCMResponse updatePreferredContactMethod(uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalUpdPCMRequest.CmecEPortalUpdPCMRequest updatePreferredContactMethodreq) throws java.rmi.RemoteException {
    	CmecEPortalUpdPCMResponse result = new CmecEPortalUpdPCMResponse();

    	List<InputData> inputData = new ArrayList<InputData>();
    	inputData.add(new InputData("request.scin", updatePreferredContactMethodreq.getSCIN()));
    	this.setData(inputData);

    	Response res = new Response();
		try {
			org.apache.commons.beanutils.BeanUtils.copyProperties(res, updateClientDetailsResponseVO.getResponseHeader());
		} catch (IllegalAccessException | InvocationTargetException e) {
			e.printStackTrace();
		}
		res.setSRNumber(updateClientDetailsResponseVO.getResponseHeader().getSrNumber());
		result.setResponse(res);

		return result;
    }

    // updateAddressDetails
    public uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalUpdAddrDetailsResp.CmecEPortalUpdAddrDetailsResp updateAddressDetails(uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalUpdAddrDetailsReq.CmecEPortalUpdAddrDetailsReq updateAddressDetailsReq) throws java.rmi.RemoteException {
    	CmecEPortalUpdAddrDetailsResp result = new CmecEPortalUpdAddrDetailsResp();

    	List<InputData> inputData = new ArrayList<InputData>();
    	inputData.add(new InputData("request.scin", updateAddressDetailsReq.getSCIN()));
    	this.setData(inputData);

    	Response res = new Response();
		try {
			org.apache.commons.beanutils.BeanUtils.copyProperties(res, updateClientDetailsResponseVO.getResponseHeader());
		} catch (IllegalAccessException | InvocationTargetException e) {
			e.printStackTrace();
		}
		res.setSRNumber(updateClientDetailsResponseVO.getResponseHeader().getSrNumber());
		result.setResponseHeader(res);

		return result;
    }

    // updateEmploymentDetails
    public uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CMECEPortalUpdEmplymntDetailsResponse.CMECEPortalUpdEmplymntDetailsResponse updateEmploymentDetails(uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CMECEPortalUpdEmplymntDetailsRequest.CMECEPortalUpdEmplymntDetailsRequest updateEmploymentDetailsReq) throws java.rmi.RemoteException {
    	CMECEPortalUpdEmplymntDetailsResponse result = new CMECEPortalUpdEmplymntDetailsResponse();

    	List<InputData> inputData = new ArrayList<InputData>();
    	inputData.add(new InputData("request.scin", updateEmploymentDetailsReq.getSCIN()));
    	this.setData(inputData);

    	Response res = new Response();
		try {
			org.apache.commons.beanutils.BeanUtils.copyProperties(res, updateClientDetailsResponseVO.getResponseHeader());
		} catch (IllegalAccessException | InvocationTargetException e) {
			e.printStackTrace();
		}
		res.setSRNumber(updateClientDetailsResponseVO.getResponseHeader().getSrNumber());
		result.setResponseHeader(res);

		return result;
    }

    // updateMOPDetails
    public uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalUpdateMOPResponse.CmecEPortalUpdateMOPResponse updateMOPDetails(uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalUpdateMOPRequest.CmecEPortalUpdateMOPRequest updateMOPDetailsReq) throws java.rmi.RemoteException {
    	CmecEPortalUpdateMOPResponse result = new CmecEPortalUpdateMOPResponse();

    	List<InputData> inputData = new ArrayList<InputData>();
    	inputData.add(new InputData("request.accountNumber", updateMOPDetailsReq.getFinCorpAccntDtls().getAccountNumber()));
    	this.setData(inputData);

    	Response res = new Response();
		try {
			org.apache.commons.beanutils.BeanUtils.copyProperties(res, updateClientDetailsResponseVO.getResponseHeader());
		} catch (IllegalAccessException | InvocationTargetException e) {
			e.printStackTrace();
		}
		res.setSRNumber(updateClientDetailsResponseVO.getResponseHeader().getSrNumber());
		result.setResponseHeader(res);

		return result;
    }

    // updatePIN
    public uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalUpdPINResponse.CmecEPortalUpdPINResponse updatePIN(uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalUpdPINRequest.CmecEPortalUpdPINRequest updatePINReq) throws java.rmi.RemoteException {
    	CmecEPortalUpdPINResponse result = new CmecEPortalUpdPINResponse();

    	List<InputData> inputData = new ArrayList<InputData>();
    	inputData.add(new InputData("request.scin", updatePINReq.getSCIN()));
    	this.setData(inputData);

    	Response res = new Response();
		try {
			org.apache.commons.beanutils.BeanUtils.copyProperties(res, updateClientDetailsResponseVO.getResponseHeader());
		} catch (IllegalAccessException | InvocationTargetException e) {
			e.printStackTrace();
		}
		res.setSRNumber(updateClientDetailsResponseVO.getResponseHeader().getSrNumber());
		result.setResponseHeader(res);

		return result;
    }

    // updateLoginStatus
    public uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalUpdLoginStatusResponse.CmecEPortalUpdLoginStatusResponse updateLoginStatus(uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalUpdLoginStatusRequest.CmecEPortalUpdLoginStatusRequest updateLoginStatusReq) throws java.rmi.RemoteException {
    	CmecEPortalUpdLoginStatusResponse result = new CmecEPortalUpdLoginStatusResponse();

    	List<InputData> inputData = new ArrayList<InputData>();
    	inputData.add(new InputData("request.scin", updateLoginStatusReq.getSCIN()));
    	this.setData(inputData);

    	Response res = new Response();
		try {
			org.apache.commons.beanutils.BeanUtils.copyProperties(res, updateClientDetailsResponseVO.getResponseHeader());
		} catch (IllegalAccessException | InvocationTargetException e) {
			e.printStackTrace();
		}
		result.setResponseHeader(res);

		return result;
    }

}
