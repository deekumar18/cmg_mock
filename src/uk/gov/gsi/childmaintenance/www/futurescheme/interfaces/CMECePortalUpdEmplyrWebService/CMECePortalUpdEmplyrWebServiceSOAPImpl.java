/**
 * CMECePortalUpdEmplyrWebServiceSOAPImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECePortalUpdEmplyrWebService;

import java.lang.reflect.InvocationTargetException;

import com.google.gson.Gson;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;

import uk.gov.dwp.esb.harddata.UpdateEmployerResponseHD;
import uk.gov.dwp.esb.utils.DBUtil;
import uk.gov.dwp.esb.vo.UpdateEmployerResponseVO;
import uk.gov.gsi.childmaintenance.www.futurescheme.bo.common.Response_xsd.Response;
import uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecUpdEmplyrResponse.CmecUpdEmplyrResponse;

public class CMECePortalUpdEmplyrWebServiceSOAPImpl implements uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECePortalUpdEmplyrWebService.CMECePortalUpdEmplyrWebService_PortType{
    public uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecUpdEmplyrResponse.CmecUpdEmplyrResponse updateEmployerBasicDtls(uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecUpdEmplyrBasicDtlsRequest.CmecUpdEmplyrBasicDtlsRequest updEmplyrRequest) throws java.rmi.RemoteException {

    	final boolean DYNAMIC_FLAG = false;

    	CmecUpdEmplyrResponse result = new CmecUpdEmplyrResponse();
    	UpdateEmployerResponseHD hardData = new UpdateEmployerResponseHD();
    	UpdateEmployerResponseVO updateEmployerResponseVO = hardData.getData();

    	if (DYNAMIC_FLAG) {
    		DB db = DBUtil.getMongoDatabase();
			DBCollection collection = db.getCollection("updateemployer");
			BasicDBObject criteria = new BasicDBObject();
			criteria.append("request.ern", updEmplyrRequest.getErn());
			DBCursor cursor = collection.find(criteria);

			StringBuilder sb = new StringBuilder();
			try {
				while (cursor.hasNext()) {
					sb.append(cursor.next());
				}
			} finally {
				cursor.close();
			}

			updateEmployerResponseVO = new Gson().fromJson(sb.toString(), UpdateEmployerResponseVO.class);
    	}

		Response res = new Response();
		try {
			org.apache.commons.beanutils.BeanUtils.copyProperties(res, updateEmployerResponseVO.getResponseHeader());
		} catch (IllegalAccessException | InvocationTargetException e) {
			e.printStackTrace();
		}
		result.setResponseHeader(res);

		return result;
    }

}
