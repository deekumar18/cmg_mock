/**
 * CMECAddressDetailsBindingImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECAddressDetailsService;

public class CMECAddressDetailsBindingImpl implements uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECAddressDetailsService.CMECAddressDetails{
    public uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECAddressDetailsService.GetAddressDetailsResponse getAddressDetails(uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECAddressDetailsService.GetAddressDetails getAddressDetailsRequest) throws java.rmi.RemoteException {
        
    	GetAddressDetailsResponse result = new GetAddressDetailsResponse();
    	
    	
    	GetAddressDetailsResponse addDetailsRes = new GetAddressDetailsResponse();
    	//addDetailsRes.setGetAddressDetailsOutput(getAddressDetailsOutput);
    	//result.setGetAddressDetailsOutput(getAddressDetailsOutput);
    	System.out.println(getAddressDetailsRequest.getGetAddressDetailsInput().getAddress().getCity());
    	return result;
    }
}
