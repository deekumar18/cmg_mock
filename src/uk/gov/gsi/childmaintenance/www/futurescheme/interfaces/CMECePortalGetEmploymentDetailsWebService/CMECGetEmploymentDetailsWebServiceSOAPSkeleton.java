/**
 * CMECGetEmploymentDetailsWebServiceSOAPSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECePortalGetEmploymentDetailsWebService;

public class CMECGetEmploymentDetailsWebServiceSOAPSkeleton implements uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECePortalGetEmploymentDetailsWebService.CMECePortalGetEmploymentDetailsWebService_PortType, org.apache.axis.wsdl.Skeleton {
    private uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECePortalGetEmploymentDetailsWebService.CMECePortalGetEmploymentDetailsWebService_PortType impl;
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
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "getEmploymentDetailsInput"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/esb/eportal/CmecGetEmploymentDetailsRequest", "CmecGetEmploymentDetailsRequest"), uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecGetEmploymentDetailsRequest.CmecGetEmploymentDetailsRequest.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getEmploymentDetails", _params, new javax.xml.namespace.QName("", "getEmploymentDetailsOutput"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/esb/eportal/CmecGetEmploymentDetailsResponse", "CmecGetEmploymentDetailsResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/interfaces/CMECePortalGetEmploymentDetailsWebService", "getEmploymentDetails"));
        _oper.setSoapAction("http://www.childmaintenance.gsi.gov.uk/futurescheme/interfaces/CMECGetEmploymentDetailsWebService/NewOperation");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getEmploymentDetails") == null) {
            _myOperations.put("getEmploymentDetails", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getEmploymentDetails")).add(_oper);
    }

    public CMECGetEmploymentDetailsWebServiceSOAPSkeleton() {
        this.impl = new uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECePortalGetEmploymentDetailsWebService.CMECGetEmploymentDetailsWebServiceSOAPImpl();
    }

    public CMECGetEmploymentDetailsWebServiceSOAPSkeleton(uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECePortalGetEmploymentDetailsWebService.CMECePortalGetEmploymentDetailsWebService_PortType impl) {
        this.impl = impl;
    }
    public uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecGetEmploymentDetailsResponse.CmecGetEmploymentDetailsResponse getEmploymentDetails(uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecGetEmploymentDetailsRequest.CmecGetEmploymentDetailsRequest getEmploymentDetailsInput) throws java.rmi.RemoteException
    {
        uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecGetEmploymentDetailsResponse.CmecGetEmploymentDetailsResponse ret = impl.getEmploymentDetails(getEmploymentDetailsInput);
        return ret;
    }

}
