/**
 * CMECePortalRtrvAccountDetailsWebServiceSOAPImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECePortalRtrvAccountDetailsWebService;

import java.lang.reflect.InvocationTargetException;

import com.google.gson.Gson;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;

import uk.gov.dwp.esb.harddata.RetrieveAccountDetailsResponseHD;
import uk.gov.dwp.esb.utils.DBUtil;
import uk.gov.dwp.esb.vo.AccountDetail;
import uk.gov.dwp.esb.vo.FinCorpDetail;
import uk.gov.dwp.esb.vo.RetrieveAccountDetailsResponseVO;
import uk.gov.gsi.childmaintenance.www.futurescheme.bo.common.Response_xsd.Response;
import uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalAccountDetails.CmecEPortalAccountDetails;
import uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalFinCorpAccountDetails.CmecEPortalFinCorpAccountDetails;
import uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecRtrvAccountDetailsResponse.CmecRtrvAccountDetailsResponse;

public class CMECePortalRtrvAccountDetailsWebServiceSOAPImpl implements uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECePortalRtrvAccountDetailsWebService.CMECePortalRtrvAccountDetailsWebService_PortType{
    public uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecRtrvAccountDetailsResponse.CmecRtrvAccountDetailsResponse rtrvAccountDetails(uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecRtrvAccountDetailsRequest.CmecRtrvAccountDetailsRequest rtrvAccountDetailsInput) throws java.rmi.RemoteException {

    	final boolean DYNAMIC_FLAG = false;

    	CmecRtrvAccountDetailsResponse result = new CmecRtrvAccountDetailsResponse();
    	RetrieveAccountDetailsResponseHD hardData = new RetrieveAccountDetailsResponseHD();
    	RetrieveAccountDetailsResponseVO retrieveAccountDetailsResponseVO = hardData.getData();

    	if (DYNAMIC_FLAG) {
    		DB db = DBUtil.getMongoDatabase();
			DBCollection collection = db.getCollection("retrieveaccountdetails");
			BasicDBObject criteria = new BasicDBObject();
			criteria.append("request.scin", rtrvAccountDetailsInput.getSCIN());
			DBCursor cursor = collection.find(criteria);

			StringBuilder sb = new StringBuilder();
			try {
				while (cursor.hasNext()) {
					sb.append(cursor.next());
				}
			} finally {
				cursor.close();
			}

			retrieveAccountDetailsResponseVO = new Gson().fromJson(sb.toString(), RetrieveAccountDetailsResponseVO.class);
    	}

		CmecEPortalFinCorpAccountDetails[] finCorpAccntDtls = new CmecEPortalFinCorpAccountDetails[retrieveAccountDetailsResponseVO.getFinCorpAccntDtls().size()];
		int i = 0;
		for (FinCorpDetail ele : retrieveAccountDetailsResponseVO.getFinCorpAccntDtls()) {
			int j = 0;
			CmecEPortalAccountDetails[] eleAccountDetails = new CmecEPortalAccountDetails[ele.getAccountDetails().size()];
			for (AccountDetail accDet : ele.getAccountDetails()) {
				CmecEPortalAccountDetails eleAccDet = new CmecEPortalAccountDetails();
				try {
					org.apache.commons.beanutils.BeanUtils.copyProperties(eleAccDet, accDet);
				} catch (IllegalAccessException | InvocationTargetException e) {
					e.printStackTrace();
				}
				eleAccountDetails[j] = eleAccDet;
				j++;
			}
			ele.setAccountDetails(null);
			CmecEPortalFinCorpAccountDetails finDetail = new CmecEPortalFinCorpAccountDetails();
			try {
				org.apache.commons.beanutils.BeanUtils.copyProperties(finDetail, ele);
			} catch (IllegalAccessException | InvocationTargetException e) {
				e.printStackTrace();
			}
			finDetail.setAccountDetails(eleAccountDetails);
			finCorpAccntDtls[i] = finDetail;
			i++;
		}
		result.setFinCorpAccntDtls(finCorpAccntDtls);








		Response res = new Response();
		try {
			org.apache.commons.beanutils.BeanUtils.copyProperties(res, retrieveAccountDetailsResponseVO.getResponseHeader());
		} catch (IllegalAccessException | InvocationTargetException e) {
			e.printStackTrace();
		}
		result.setResponseHeader(res);

		return result;
    }

}
