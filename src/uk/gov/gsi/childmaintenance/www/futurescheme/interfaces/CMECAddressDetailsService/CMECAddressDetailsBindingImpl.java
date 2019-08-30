/**
 * CMECAddressDetailsBindingImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECAddressDetailsService;

import com.google.gson.Gson;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;

import uk.gov.dwp.esb.harddata.AddressDetailsResponseHD;
import uk.gov.dwp.esb.utils.DBUtil;
import uk.gov.dwp.esb.vo.AddressDetailsResponseVO;
import uk.gov.dwp.esb.vo.ClientAddress;
import uk.gov.dwp.esb.vo.ResponseHeader;
import uk.gov.gsi.childmaintenance.www.futurescheme.bo.asbo.address.Address.Address;
import uk.gov.gsi.childmaintenance.www.futurescheme.bo.common.Response_xsd.Response;

public class CMECAddressDetailsBindingImpl implements uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECAddressDetailsService.CMECAddressDetails{
    public uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECAddressDetailsService.GetAddressDetailsResponse getAddressDetails(uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECAddressDetailsService.GetAddressDetails getAddressDetailsRequest) throws java.rmi.RemoteException {

    	final boolean DYNAMIC_FLAG = false;

    	GetAddressDetailsResponse result = new GetAddressDetailsResponse();
    	AddressDetailsResponseHD hardData = new AddressDetailsResponseHD();
    	AddressDetailsResponseVO addressDetailsResponseVO = hardData.getData();

    	if (DYNAMIC_FLAG) {
    		DB db = DBUtil.getMongoDatabase();
			DBCollection collection = db.getCollection("addressdetails");
			BasicDBObject criteria = new BasicDBObject();
			criteria.append("request.address1", getAddressDetailsRequest.getGetAddressDetailsInput().getAddress().getAddress1());
			criteria.append("request.postcode", getAddressDetailsRequest.getGetAddressDetailsInput().getAddress().getPostCode());
			DBCursor cursor = collection.find(criteria);

			StringBuilder sb = new StringBuilder();
			try {
				while (cursor.hasNext()) {
					sb.append(cursor.next());
				}
			} finally {
				cursor.close();
			}

			addressDetailsResponseVO = new Gson().fromJson(sb.toString(), AddressDetailsResponseVO.class);
    	}

    	ResponseHeader voHeader = addressDetailsResponseVO.getAddressDetailsOutput().getResponseHeader();
    	ClientAddress voAddress = addressDetailsResponseVO.getAddressDetailsOutput().getAddresses().get(0);

		Response res = new Response();
		res.setResponseCode(voHeader.getResponseCode());
		res.setResponseMessage(voHeader.getResponseMessage());

		Address resAddress = new Address();
		Address[] resAddresses = new Address[1];
		resAddress.setAddress1(voAddress.getAddressLine1());
		resAddress.setAddress2(voAddress.getAddressLine2());
		resAddress.setAddress3(voAddress.getAddressLine3());
		resAddress.setAddress4(voAddress.getAddressLine4());
		resAddress.setAddress5(voAddress.getAddressLine5());
		resAddress.setCity(voAddress.getCity());
		resAddress.setCounty(voAddress.getCounty());
		resAddress.setCountry(voAddress.getCountry());
		resAddress.setPostCode(voAddress.getPostCode());
		resAddress.setDeliveryPointSuffix(voAddress.getDeliveryPointSuffix());
		resAddresses[0] = resAddress;

		uk.gov.gsi.childmaintenance.www.futurescheme.bo.asbo.address.GetAddressDetailsResponse.GetAddressDetailsResponse resOutput = new uk.gov.gsi.childmaintenance.www.futurescheme.bo.asbo.address.GetAddressDetailsResponse.GetAddressDetailsResponse();
		resOutput.setResponseHeader(res);
		resOutput.setAddresses(resAddresses);

		result.setGetAddressDetailsOutput(resOutput);
		return result;
    }

}
