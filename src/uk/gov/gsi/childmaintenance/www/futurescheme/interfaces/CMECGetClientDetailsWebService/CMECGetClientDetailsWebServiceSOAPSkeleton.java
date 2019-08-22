/**
 * CMECGetClientDetailsWebServiceSOAPSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECGetClientDetailsWebService;

public class CMECGetClientDetailsWebServiceSOAPSkeleton implements uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECGetClientDetailsWebService.CMECePortalGetClientWebService_PortType, org.apache.axis.wsdl.Skeleton {
    private uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECGetClientDetailsWebService.CMECePortalGetClientWebService_PortType impl;
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
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "getClientDetailsInput"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/esb/eportal/CmecGetClientDetailsRequest", "CmecGetClientDetailsRequest"), uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecGetClientDetailsRequest.CmecGetClientDetailsRequest.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getClientDetails", _params, new javax.xml.namespace.QName("", "getClientDetailsOutput"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/esb/eportal/CmecGetClientDetailsResponse", "CmecGetClientDetailsResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/interfaces/CMECGetClientDetailsWebService", "getClientDetails"));
        _oper.setSoapAction("http://www.childmaintenance.gsi.gov.uk/futurescheme/interfaces/CMECePortalGetClientWebServiceExport_CMECePortalGetClientWebServiceHttp_Service/GetClientDetails");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getClientDetails") == null) {
            _myOperations.put("getClientDetails", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getClientDetails")).add(_oper);
    }

    public CMECGetClientDetailsWebServiceSOAPSkeleton() {
        this.impl = new uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECGetClientDetailsWebService.CMECGetClientDetailsWebServiceSOAPImpl();
    }

    public CMECGetClientDetailsWebServiceSOAPSkeleton(uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECGetClientDetailsWebService.CMECePortalGetClientWebService_PortType impl) {
        this.impl = impl;
    }
    public uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecGetClientDetailsResponse.CmecGetClientDetailsResponse getClientDetails(uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecGetClientDetailsRequest.CmecGetClientDetailsRequest getClientDetailsInput) throws java.rmi.RemoteException
    {
        uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecGetClientDetailsResponse.CmecGetClientDetailsResponse ret = impl.getClientDetails(getClientDetailsInput);
        return ret;
    }

}
