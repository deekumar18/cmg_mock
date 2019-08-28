/**
 * CMECGetEmployerContactHistoryWebServiceSOAPSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECePortalGetEmployerContactHistoryWebService;

public class CMECGetEmployerContactHistoryWebServiceSOAPSkeleton implements uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECePortalGetEmployerContactHistoryWebService.CMECePortalGetEmployerContactHistoryWebService_PortType, org.apache.axis.wsdl.Skeleton {
    private uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECePortalGetEmployerContactHistoryWebService.CMECePortalGetEmployerContactHistoryWebService_PortType impl;
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
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "GetEmployerContactHistoryInput"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/esb/eportal/CmecGetEmployerContactHistoryDetailsRequest", "CmecGetEmployerContactHistoryDetailsRequest"), uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecGetEmployerContactHistoryDetailsRequest.CmecGetEmployerContactHistoryDetailsRequest.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getEmployerContactHistory", _params, new javax.xml.namespace.QName("", "GetEmployerContactHistoryOutput"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/esb/eportal/CmecGetEmployerContactHistoryDetailsResponse", "CmecGetEmployerContactHistoryDetailsResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/interfaces/CMECePortalGetEmployerContactHistoryWebService/", "getEmployerContactHistory"));
        _oper.setSoapAction("http://www.childmaintenance.gsi.gov.uk/futurescheme/interfaces/CMECePortalGetEmployerContactHistoryWebService/getEmployerContactHistory");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getEmployerContactHistory") == null) {
            _myOperations.put("getEmployerContactHistory", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getEmployerContactHistory")).add(_oper);
    }

    public CMECGetEmployerContactHistoryWebServiceSOAPSkeleton() {
        this.impl = new uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECePortalGetEmployerContactHistoryWebService.CMECGetEmployerContactHistoryWebServiceSOAPImpl();
    }

    public CMECGetEmployerContactHistoryWebServiceSOAPSkeleton(uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECePortalGetEmployerContactHistoryWebService.CMECePortalGetEmployerContactHistoryWebService_PortType impl) {
        this.impl = impl;
    }
    public uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecGetEmployerContactHistoryDetailsResponse.CmecGetEmployerContactHistoryDetailsResponse getEmployerContactHistory(uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecGetEmployerContactHistoryDetailsRequest.CmecGetEmployerContactHistoryDetailsRequest getEmployerContactHistoryInput) throws java.rmi.RemoteException
    {
        uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecGetEmployerContactHistoryDetailsResponse.CmecGetEmployerContactHistoryDetailsResponse ret = impl.getEmployerContactHistory(getEmployerContactHistoryInput);
        return ret;
    }

}
