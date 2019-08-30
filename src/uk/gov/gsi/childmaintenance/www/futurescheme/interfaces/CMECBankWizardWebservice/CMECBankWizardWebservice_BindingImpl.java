/**
 * CMECBankWizardWebservice_BindingImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECBankWizardWebservice;

import java.lang.reflect.InvocationTargetException;

import com.google.gson.Gson;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;

import uk.gov.dwp.esb.harddata.BankWizardResponseHD;
import uk.gov.dwp.esb.utils.DBUtil;
import uk.gov.dwp.esb.vo.BankWizardResponseVO;
import uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.payment.CmecSubmitBankValidationResponse.CmecSubmitBankValidationResponse;
import uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.payment.CmecSubmitBankValidationResponse.Response;

public class CMECBankWizardWebservice_BindingImpl implements uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECBankWizardWebservice.CMECBankWizardWebservice_PortType{
    public uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.payment.CmecSubmitBankValidationResponse.CmecSubmitBankValidationResponse submitBankValidation(uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.payment.CmecSubmitBankValidationRequest.CmecSubmitBankValidationRequest bankWizardRequest) throws java.rmi.RemoteException {

    	final boolean DYNAMIC_FLAG = false;

    	CmecSubmitBankValidationResponse result = new CmecSubmitBankValidationResponse();
    	BankWizardResponseHD hardData = new BankWizardResponseHD();
    	BankWizardResponseVO bankWizardResponseVO = hardData.getData();

    	if (DYNAMIC_FLAG) {
    		DB db = DBUtil.getMongoDatabase();
			DBCollection collection = db.getCollection("bankwizardresponse");
			BasicDBObject criteria = new BasicDBObject();
			criteria.append("responseAccountNumber", bankWizardRequest.getAccountNumber());
			DBCursor cursor = collection.find(criteria);

			StringBuilder sb = new StringBuilder();
			try {
				while (cursor.hasNext()) {
					sb.append(cursor.next());
				}
			} finally {
				cursor.close();
			}

			bankWizardResponseVO = new Gson().fromJson(sb.toString(), BankWizardResponseVO.class);
    	}

		result.setResponseAccountNumber(bankWizardResponseVO.getResponseAccountNumber());
		result.setResponseSortCode(bankWizardResponseVO.getResponseSortCode());
		result.setResponseRollNumber(bankWizardResponseVO.getResponseRollNumber());

		Response res = new Response();
		res.setResponseCode(bankWizardResponseVO.getResponseHeader().getResponseCode());
		res.setResponseStatus(bankWizardResponseVO.getResponseHeader().getResponseStatus());
		try {
			org.apache.commons.beanutils.BeanUtils.copyProperties(res, bankWizardResponseVO.getResponseHeader());
		} catch (IllegalAccessException | InvocationTargetException e) {
			e.printStackTrace();
		}
		result.setResponseHeader(res);

		return result;
	}
}
