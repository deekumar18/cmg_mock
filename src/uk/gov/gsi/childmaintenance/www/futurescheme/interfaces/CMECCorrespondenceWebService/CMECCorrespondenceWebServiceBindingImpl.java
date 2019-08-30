/**
 * CMECCorrespondenceWebServiceBindingImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECCorrespondenceWebService;

import CMECLibraryR6.uk.gov.futurescheme.cmec.bo.esb.correspondence.RetrieveDocumentResponse.RetrieveDocumentResponse;
import uk.gov.gsi.childmaintenance.www.futurescheme.bo.common.Response_xsd.Response;

public class CMECCorrespondenceWebServiceBindingImpl implements uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECCorrespondenceWebService.CMECCorrespondenceWebService{
    public CMECLibraryR6.uk.gov.futurescheme.cmec.bo.esb.correspondence.RetrieveDocumentResponse.RetrieveDocumentResponse retrieveDocument(uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.correspondence.RetrieveDocumentRequest.RetrieveDocumentRequest retrieveDocumentRequest) throws java.rmi.RemoteException {
        
    	
    	System.out.println(retrieveDocumentRequest.getDocumentDetails().getFileName());
    	RetrieveDocumentResponse obj = new RetrieveDocumentResponse();
    	Response res = new Response();
    	res.setResponseCode(200);
    	obj.setResponseHeader(res);
    	
    	return obj;
    }

}
