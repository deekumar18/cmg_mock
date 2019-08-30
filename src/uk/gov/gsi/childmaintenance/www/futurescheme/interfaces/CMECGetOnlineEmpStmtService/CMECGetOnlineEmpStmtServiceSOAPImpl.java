/**
 * CMECGetOnlineEmpStmtServiceSOAPImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECGetOnlineEmpStmtService;

import java.lang.reflect.InvocationTargetException;

import org.apache.commons.beanutils.BeanUtils;

import com.google.gson.Gson;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.Mongo;

import uk.gov.dwp.esb.vo.EmpStmtDetailsCollection;
import uk.gov.dwp.esb.vo.GetEmpStmtResponseVO;
import uk.gov.gsi.childmaintenance.www.futurescheme.bo.CMECGetOnlineEmpStmtResponse.CMECGetOnlineEmpStmtResponse;
import uk.gov.gsi.childmaintenance.www.futurescheme.bo.EmpStmtDetails.EmpStmtDetails;
import uk.gov.gsi.childmaintenance.www.futurescheme.bo.common.Response_xsd.Response;

public class CMECGetOnlineEmpStmtServiceSOAPImpl implements
		uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECGetOnlineEmpStmtService.CMECGetOnlineEmpStmtService_PortType {
	public uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECGetOnlineEmpStmtService.GetEmpStmtResponse getEmpStmt(
			uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECGetOnlineEmpStmtService.GetEmpStmtRequest getEmpStmtParameters)
			throws java.rmi.RemoteException {

		Mongo mongo = new Mongo("localhost", 27017);
		DB db = mongo.getDB("cmg_mock");
		DBCollection collection = db.getCollection("onlineempstmt");
		BasicDBObject criteria = new BasicDBObject();
		criteria.append("getEmpStmtOutput.accountId", getEmpStmtParameters.getGetEmpStmtInput().getAccountId());
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

		GetEmpStmtResponseVO getEmpStmtResponseVO = new Gson().fromJson(sb.toString(), GetEmpStmtResponseVO.class);

		GetEmpStmtResponse result = new GetEmpStmtResponse();
		CMECGetOnlineEmpStmtResponse cmecGetOnlineEmpStmtResponse = new CMECGetOnlineEmpStmtResponse();

		cmecGetOnlineEmpStmtResponse.setAccountId(getEmpStmtResponseVO.getGetEmpStmtOutput().getAccountId());
		cmecGetOnlineEmpStmtResponse.setCurrencyCode(getEmpStmtResponseVO.getGetEmpStmtOutput().getCurrencyCode());

		EmpStmtDetails[] empStmtDetailsCollection = new EmpStmtDetails[getEmpStmtResponseVO.getGetEmpStmtOutput()
				.getEmpStmtDetailsCollection().size()];

		int i = 0;
		for (EmpStmtDetailsCollection ele : getEmpStmtResponseVO.getGetEmpStmtOutput().getEmpStmtDetailsCollection()) {
			EmpStmtDetails empStmtDetails = new EmpStmtDetails();

			try {
				BeanUtils.copyProperties(empStmtDetails, ele);
			} catch (IllegalAccessException | InvocationTargetException e) {
				e.printStackTrace();
			}

			empStmtDetailsCollection[i] = empStmtDetails;
			i++;
		}

		cmecGetOnlineEmpStmtResponse.setEmpStmtDetailsCollection(empStmtDetailsCollection);
		cmecGetOnlineEmpStmtResponse.setListToDate(getEmpStmtResponseVO.getGetEmpStmtOutput().getListToDate());
		cmecGetOnlineEmpStmtResponse.setStatementDate(getEmpStmtResponseVO.getGetEmpStmtOutput().getStatementDate());

		Response responseHeader = new Response();
		responseHeader
				.setResponseCode(getEmpStmtResponseVO.getGetEmpStmtOutput().getResponseHeader().getResponseCode());
		responseHeader.setResponseMessage(
				getEmpStmtResponseVO.getGetEmpStmtOutput().getResponseHeader().getResponseMessage());
		cmecGetOnlineEmpStmtResponse.setResponseHeader(responseHeader);

		result.setGetEmpStmtOutput(cmecGetOnlineEmpStmtResponse);
		return result;
	}

}
