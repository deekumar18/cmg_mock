/**
 * CMECFetchDEOTemplateWebserviceSOAPImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECFetchDEOTemplateWebservice;

import uk.gov.dwp.esb.utils.CommonUtil;
import uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.deoSchedule.CMECFetchDEODetailsResponse.FetchDEOResponse;
import uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.deoSchedule.CMECFetchTemplateDEOResponse.CMECFetchTemplateDEOResponse;

public class CMECFetchDEOTemplateWebserviceSOAPImpl implements
		uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECFetchDEOTemplateWebservice.CMECFetchDEOTemplateWebservice_PortType {
	public uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.deoSchedule.CMECFetchTemplateDEOResponse.CMECFetchTemplateDEOResponse fetchDEOTemplate(
			uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.deoSchedule.CMECFetchTemplateDEORequest.CMECFetchTemplateDEORequest fetchDEOTemplateInput)
			throws java.rmi.RemoteException {
		return getCMECFetchTemplateDEOResponse();
	}

	private CMECFetchTemplateDEOResponse getCMECFetchTemplateDEOResponse() {
		CMECFetchTemplateDEOResponse cmecFetchTemplateDEOResponse = new CMECFetchTemplateDEOResponse();
		cmecFetchTemplateDEOResponse.setFetchDEOResponse(new FetchDEOResponse());
		cmecFetchTemplateDEOResponse.setResponseHeader(CommonUtil.getResponse());
		return cmecFetchTemplateDEOResponse;
	}

}
