/**
 * CMECCorrespondenceWebServiceBindingImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECCorrespondenceWebService;

import java.lang.reflect.InvocationTargetException;

import com.google.gson.Gson;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;

import CMECLibraryR6.uk.gov.futurescheme.cmec.bo.esb.correspondence.RetrieveDocumentResponse.RetrieveDocumentResponse;
import uk.gov.dwp.esb.harddata.CorrespondenceResponseHD;
import uk.gov.dwp.esb.utils.DBUtil;
import uk.gov.dwp.esb.vo.CorrespondenceResponseVO;
import uk.gov.gsi.childmaintenance.www.futurescheme.bo.common.Response_xsd.Response;
import uk.gov.gsi.childmaintenance.www.futurescheme.bo.gbo.correspondence.Content_xsd.Content;

public class CMECCorrespondenceWebServiceBindingImpl implements uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECCorrespondenceWebService.CMECCorrespondenceWebService{
    public CMECLibraryR6.uk.gov.futurescheme.cmec.bo.esb.correspondence.RetrieveDocumentResponse.RetrieveDocumentResponse retrieveDocument(uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.correspondence.RetrieveDocumentRequest.RetrieveDocumentRequest retrieveDocumentRequest) throws java.rmi.RemoteException {

    	final boolean DYNAMIC_FLAG = false;

    	RetrieveDocumentResponse result = new RetrieveDocumentResponse();
    	CorrespondenceResponseHD hardData = new CorrespondenceResponseHD();
    	CorrespondenceResponseVO correspondenceResponseVO = hardData.getData();

    	if (DYNAMIC_FLAG) {
    		DB db = DBUtil.getMongoDatabase();
			DBCollection collection = db.getCollection("correspondence");
			BasicDBObject criteria = new BasicDBObject();
			criteria.append("documentDetails.docLink", retrieveDocumentRequest.getDocumentDetails().getDocLink());
			DBCursor cursor = collection.find(criteria);

			StringBuilder sb = new StringBuilder();
			try {
				while (cursor.hasNext()) {
					sb.append(cursor.next());
				}
			} finally {
				cursor.close();
			}

			correspondenceResponseVO = new Gson().fromJson(sb.toString(), CorrespondenceResponseVO.class);
    	}

		Content content = new Content();
		content.setFileName(correspondenceResponseVO.getDocumentDetails().getFileName());
        byte[] dataBytes = correspondenceResponseVO.getDocumentDetails().getFileContent().getBytes();
        content.setFileContent(dataBytes);
		result.setDocumentDetails(content);

		Response res = new Response();
		try {
			org.apache.commons.beanutils.BeanUtils.copyProperties(res, correspondenceResponseVO.getResponseHeader());
		} catch (IllegalAccessException | InvocationTargetException e) {
			e.printStackTrace();
		}
		result.setResponseHeader(res);

		return result;
    }

}
