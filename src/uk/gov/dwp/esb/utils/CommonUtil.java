package uk.gov.dwp.esb.utils;

import uk.gov.gsi.childmaintenance.www.futurescheme.bo.common.Response_xsd.Response;
import uk.gov.gsi.childmaintenance.www.futurescheme.bo.common.Response_xsd.ResponseResponseDetails;

public class CommonUtil {
	public static Response getResponse() {
		Response res = new Response();
		res.setResponseCode(200);
		res.setResponseMessage("Success");
		ResponseResponseDetails rd = new ResponseResponseDetails();
		rd.setCode("200");
		rd.setDescription("test");
		rd.setResponseFrom("test");
		ResponseResponseDetails[] r = new ResponseResponseDetails[1];
		r[0] = rd;
		res.setResponseDetails(r);
		return res;
	}

}
