/**
 * CMECGetClientContactHistoryWebServiceSOAPSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECePortalGetClientContactHistoryWebService;

public class CMECGetClientContactHistoryWebServiceSOAPSkeleton implements uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECePortalGetClientContactHistoryWebService.CMECePortalGetClientContactHistoryWebService_PortType, org.apache.axis.wsdl.Skeleton {
    private uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECePortalGetClientContactHistoryWebService.CMECePortalGetClientContactHistoryWebService_PortType impl;
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
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "GetClientContactHistoryInput"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/esb/eportal/CmecGetClientContactHistoryDetailsRequest", "CmecGetClientContactHistoryDetailsRequest"), uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecGetClientContactHistoryDetailsRequest.CmecGetClientContactHistoryDetailsRequest.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getClientContactHistory", _params, new javax.xml.namespace.QName("", "GetClientContactHistoryOutput"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/esb/eportal/CmecGetClientContactHistoryDetailsResponse", "CmecGetClientContactHistoryDetailsResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/interfaces/CMECePortalGetClientContactHistoryWebService/", "getClientContactHistory"));
        _oper.setSoapAction("http://www.childmaintenance.gsi.gov.uk/futurescheme/interfaces/CMECePortalGetClientContactHistoryWebServiceExport_CMECePortalGetClientContactHistoryWebServiceHttpPort/getClientContactHistory");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getClientContactHistory") == null) {
            _myOperations.put("getClientContactHistory", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getClientContactHistory")).add(_oper);
    }

    public CMECGetClientContactHistoryWebServiceSOAPSkeleton() {
        this.impl = new uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECePortalGetClientContactHistoryWebService.CMECGetClientContactHistoryWebServiceSOAPImpl();
    }

    public CMECGetClientContactHistoryWebServiceSOAPSkeleton(uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECePortalGetClientContactHistoryWebService.CMECePortalGetClientContactHistoryWebService_PortType impl) {
        this.impl = impl;
    }
    public uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecGetClientContactHistoryDetailsResponse.CmecGetClientContactHistoryDetailsResponse getClientContactHistory(uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecGetClientContactHistoryDetailsRequest.CmecGetClientContactHistoryDetailsRequest getClientContactHistoryInput) throws java.rmi.RemoteException
    {
        uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecGetClientContactHistoryDetailsResponse.CmecGetClientContactHistoryDetailsResponse ret = impl.getClientContactHistory(getClientContactHistoryInput);
        return ret;
    }

}
