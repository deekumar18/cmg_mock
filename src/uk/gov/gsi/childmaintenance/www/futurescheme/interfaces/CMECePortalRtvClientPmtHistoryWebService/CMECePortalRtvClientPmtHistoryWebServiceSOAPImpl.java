/**
 * CMECePortalRtvClientPmtHistoryWebServiceSOAPImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECePortalRtvClientPmtHistoryWebService;

import java.lang.reflect.InvocationTargetException;

import com.google.gson.Gson;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;

import uk.gov.dwp.esb.harddata.ClientPaymentHistoryResponseHD;
import uk.gov.dwp.esb.utils.DBUtil;
import uk.gov.dwp.esb.vo.ClientPaymentHistoryResponseVO;
import uk.gov.dwp.esb.vo.ClientPmtHisDetails;
import uk.gov.gsi.childmaintenance.www.futurescheme.bo.common.Response_xsd.Response;
import uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CMECePortalRtvClientPmtHisResponse.CMECePortalRtvClientPmtHisResponse;
import uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CMECePortalRtvClientPmtHistoryDetails.CMECePortalRtvClientPmtHistoryDetails;

public class CMECePortalRtvClientPmtHistoryWebServiceSOAPImpl implements uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECePortalRtvClientPmtHistoryWebService.CMECePortalRtvClientPmtHistoryWebService_PortType{
    public uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CMECePortalRtvClientPmtHisResponse.CMECePortalRtvClientPmtHisResponse rtvClientPmtHistory(uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CMECePortalRtvClientPmtHisRequest.CMECePortalRtvClientPmtHisRequest rtvClientPmtHistoryInput) throws java.rmi.RemoteException {

    	final boolean DYNAMIC_FLAG = false;

    	CMECePortalRtvClientPmtHisResponse result = new CMECePortalRtvClientPmtHisResponse();
    	ClientPaymentHistoryResponseHD hardData = new ClientPaymentHistoryResponseHD();
    	ClientPaymentHistoryResponseVO clientPaymentHistoryResponseVO = hardData.getData();

    	if (DYNAMIC_FLAG) {
    		DB db = DBUtil.getMongoDatabase();
			DBCollection collection = db.getCollection("clientpaymenthistory");
			BasicDBObject criteria = new BasicDBObject();
			criteria.append("request.accNum", rtvClientPmtHistoryInput.getAccNum());
			DBCursor cursor = collection.find(criteria);

			StringBuilder sb = new StringBuilder();
			try {
				while (cursor.hasNext()) {
					sb.append(cursor.next());
				}
			} finally {
				cursor.close();
			}

			clientPaymentHistoryResponseVO = new Gson().fromJson(sb.toString(), ClientPaymentHistoryResponseVO.class);
    	}

		result.setStartDate(clientPaymentHistoryResponseVO.getStartDate());
		result.setEndDate(clientPaymentHistoryResponseVO.getEndDate());
		result.setOpeningBal(clientPaymentHistoryResponseVO.getOpeningBal());
		result.setPaymentsDue(clientPaymentHistoryResponseVO.getPaymentsDue());
		result.setPaymentsMade(clientPaymentHistoryResponseVO.getPaymentsMade());
		result.setChqReturned(clientPaymentHistoryResponseVO.getChqReturned());
		result.setPendingWrtOff(clientPaymentHistoryResponseVO.getPendingWrtOff());
		result.setCompPayment(clientPaymentHistoryResponseVO.getCompPayment());
		result.setClosingBal(clientPaymentHistoryResponseVO.getClosingBal());
		result.setActvResArr(clientPaymentHistoryResponseVO.getActvResArr());
		result.setSuspResArr(clientPaymentHistoryResponseVO.getSuspResArr());
		result.setDeferResArr(clientPaymentHistoryResponseVO.getDeferResArr());
		result.setCollChrgApplied(clientPaymentHistoryResponseVO.getCollChrgApplied());
		result.setCollChrgAutoSatisfied(clientPaymentHistoryResponseVO.getCollChrgAutoSatisfied());
		result.setCollChrgPaid(clientPaymentHistoryResponseVO.getCollChrgPaid());
		result.setCollChrgRemaining(clientPaymentHistoryResponseVO.getCollChrgRemaining());
		result.setCollChrgSaved(clientPaymentHistoryResponseVO.getCollChrgSaved());
		result.setEnfChrg(clientPaymentHistoryResponseVO.getEnfChrg());
		result.setTotalArreasSusp(clientPaymentHistoryResponseVO.getTotalArreasSusp());
		result.setWrtnOffAmt(clientPaymentHistoryResponseVO.getWrtnOffAmt());

		CMECePortalRtvClientPmtHistoryDetails[] cientPaymentHistoryDetails = new CMECePortalRtvClientPmtHistoryDetails[clientPaymentHistoryResponseVO.getClientPmtHisDetails().size()];
		int i = 0;
		for (ClientPmtHisDetails ele : clientPaymentHistoryResponseVO.getClientPmtHisDetails()) {
			CMECePortalRtvClientPmtHistoryDetails paymentDetail = new CMECePortalRtvClientPmtHistoryDetails();
			try {
				org.apache.commons.beanutils.BeanUtils.copyProperties(paymentDetail, ele);
			} catch (IllegalAccessException | InvocationTargetException e) {
				e.printStackTrace();
			}
			cientPaymentHistoryDetails[i] = paymentDetail;
			i++;
		}

		result.setClientPmtHistory(cientPaymentHistoryDetails);

		Response res = new Response();
		try {
			org.apache.commons.beanutils.BeanUtils.copyProperties(res, clientPaymentHistoryResponseVO.getResponseHeader());
		} catch (IllegalAccessException | InvocationTargetException e) {
			e.printStackTrace();
		}
		result.setResponseHeader(res);

		return result;
    }

}
