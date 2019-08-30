/**
 * CMECePortalRtrvAccountDetailsWebServiceSOAPSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECePortalRtrvAccountDetailsWebService;

public class CMECePortalRtrvAccountDetailsWebServiceSOAPSkeleton implements uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECePortalRtrvAccountDetailsWebService.CMECePortalRtrvAccountDetailsWebService_PortType, org.apache.axis.wsdl.Skeleton {
    private uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECePortalRtrvAccountDetailsWebService.CMECePortalRtrvAccountDetailsWebService_PortType impl;
    private static java.util.Map _myOperations = new java.util.Hashtable();
    private static java.util.Collection _myOperationsList = new java.util.ArrayList();

    /**
    * Returns List of OperationDesc objects with this name
    */
    public static java.util.List getOperationDescByName(java.lang.String methodName) {
        return (java.util.List)_myOperations.get(methodName);
    }

    /**
    * Returns Collection of OperationDescs
    */
    public static java.util.Collection getOperationDescs() {
        return _myOperationsList;
    }

    static {
        org.apache.axis.description.OperationDesc _oper;
        org.apache.axis.description.FaultDesc _fault;
        org.apache.axis.description.ParameterDesc [] _params;
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "rtrvAccountDetailsInput"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/esb/eportal/CmecRtrvAccountDetailsRequest", "CmecRtrvAccountDetailsRequest"), uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecRtrvAccountDetailsRequest.CmecRtrvAccountDetailsRequest.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("rtrvAccountDetails", _params, new javax.xml.namespace.QName("", "rtrvAccountDetailsOutput"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/esb/eportal/CmecRtrvAccountDetailsResponse", "CmecRtrvAccountDetailsResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/interfaces/CMECePortalRtrvAccountDetailsWebService/", "rtrvAccountDetails"));
        _oper.setSoapAction("http://www.childmaintenance.gsi.gov.uk/futurescheme/interfaces/CMECePortalRtrvAccountDetailsWebService/rtrvAccountDetails");
        _myOperationsList.add(_oper);
        if (_myOperations.get("rtrvAccountDetails") == null) {
            _myOperations.put("rtrvAccountDetails", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("rtrvAccountDetails")).add(_oper);
    }

    public CMECePortalRtrvAccountDetailsWebServiceSOAPSkeleton() {
        this.impl = new uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECePortalRtrvAccountDetailsWebService.CMECePortalRtrvAccountDetailsWebServiceSOAPImpl();
    }

    public CMECePortalRtrvAccountDetailsWebServiceSOAPSkeleton(uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECePortalRtrvAccountDetailsWebService.CMECePortalRtrvAccountDetailsWebService_PortType impl) {
        this.impl = impl;
    }
    public uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecRtrvAccountDetailsResponse.CmecRtrvAccountDetailsResponse rtrvAccountDetails(uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecRtrvAccountDetailsRequest.CmecRtrvAccountDetailsRequest rtrvAccountDetailsInput) throws java.rmi.RemoteException
    {
        uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecRtrvAccountDetailsResponse.CmecRtrvAccountDetailsResponse ret = impl.rtrvAccountDetails(rtrvAccountDetailsInput);
        return ret;
    }

}
