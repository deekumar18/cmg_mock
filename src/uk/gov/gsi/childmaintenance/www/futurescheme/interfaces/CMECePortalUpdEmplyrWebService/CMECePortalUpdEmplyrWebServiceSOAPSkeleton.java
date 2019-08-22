/**
 * CMECePortalUpdEmplyrWebServiceSOAPSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECePortalUpdEmplyrWebService;

public class CMECePortalUpdEmplyrWebServiceSOAPSkeleton implements uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECePortalUpdEmplyrWebService.CMECePortalUpdEmplyrWebService_PortType, org.apache.axis.wsdl.Skeleton {
    private uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECePortalUpdEmplyrWebService.CMECePortalUpdEmplyrWebService_PortType impl;
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
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "updEmplyrRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/esb/eportal/CmecUpdEmplyrBasicDtlsRequest", "CmecUpdEmplyrBasicDtlsRequest"), uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecUpdEmplyrBasicDtlsRequest.CmecUpdEmplyrBasicDtlsRequest.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("updateEmployerBasicDtls", _params, new javax.xml.namespace.QName("", "updEmplyrResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/esb/eportal/CmecUpdEmplyrResponse", "CmecUpdEmplyrResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/interfaces/CMECePortalUpdEmplyrWebService", "updateEmployerBasicDtls"));
        _oper.setSoapAction("http://www.childmaintenance.gsi.gov.uk/futurescheme/interfaces/CMECePortalUpdEmplyrWebService/updateEmployerBasicDtls");
        _myOperationsList.add(_oper);
        if (_myOperations.get("updateEmployerBasicDtls") == null) {
            _myOperations.put("updateEmployerBasicDtls", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("updateEmployerBasicDtls")).add(_oper);
    }

    public CMECePortalUpdEmplyrWebServiceSOAPSkeleton() {
        this.impl = new uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECePortalUpdEmplyrWebService.CMECePortalUpdEmplyrWebServiceSOAPImpl();
    }

    public CMECePortalUpdEmplyrWebServiceSOAPSkeleton(uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECePortalUpdEmplyrWebService.CMECePortalUpdEmplyrWebService_PortType impl) {
        this.impl = impl;
    }
    public uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecUpdEmplyrResponse.CmecUpdEmplyrResponse updateEmployerBasicDtls(uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecUpdEmplyrBasicDtlsRequest.CmecUpdEmplyrBasicDtlsRequest updEmplyrRequest) throws java.rmi.RemoteException
    {
        uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecUpdEmplyrResponse.CmecUpdEmplyrResponse ret = impl.updateEmployerBasicDtls(updEmplyrRequest);
        return ret;
    }

}
