/**
 * CMECGetEmployerDetailsWebServiceSOAPSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECGetEmployerDetailsWebService;

public class CMECGetEmployerDetailsWebServiceSOAPSkeleton implements uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECGetEmployerDetailsWebService.CMECePortalGetEmployerWebService_PortType, org.apache.axis.wsdl.Skeleton {
    private uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECGetEmployerDetailsWebService.CMECePortalGetEmployerWebService_PortType impl;
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
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "getEmployerDetailsInput"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/esb/eportal/CmecGetEmployerDetailsRequest", "CmecGetEmployerDetailsRequest"), uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecGetEmployerDetailsRequest.CmecGetEmployerDetailsRequest.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getEmployerDetails", _params, new javax.xml.namespace.QName("", "getEmployerDetailsOutput"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/esb/eportal/CmecGetEmployerDetailsResponse", "CmecGetEmployerDetailsResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/interfaces/CMECGetEmployerDetailsWebService", "getEmployerDetails"));
        _oper.setSoapAction("http://www.childmaintenance.gsi.gov.uk/futurescheme/interfaces/CMECePortalGetEmployerWebServiceExport_CMECePortalGetEmployerWebServiceHttp_Service/GetEmployerDetails");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getEmployerDetails") == null) {
            _myOperations.put("getEmployerDetails", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getEmployerDetails")).add(_oper);
    }

    public CMECGetEmployerDetailsWebServiceSOAPSkeleton() {
        this.impl = new uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECGetEmployerDetailsWebService.CMECGetEmployerDetailsWebServiceSOAPImpl();
    }

    public CMECGetEmployerDetailsWebServiceSOAPSkeleton(uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECGetEmployerDetailsWebService.CMECePortalGetEmployerWebService_PortType impl) {
        this.impl = impl;
    }
    public uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecGetEmployerDetailsResponse.CmecGetEmployerDetailsResponse getEmployerDetails(uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecGetEmployerDetailsRequest.CmecGetEmployerDetailsRequest getEmployerDetailsInput) throws java.rmi.RemoteException
    {
        uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecGetEmployerDetailsResponse.CmecGetEmployerDetailsResponse ret = impl.getEmployerDetails(getEmployerDetailsInput);
        return ret;
    }

}
