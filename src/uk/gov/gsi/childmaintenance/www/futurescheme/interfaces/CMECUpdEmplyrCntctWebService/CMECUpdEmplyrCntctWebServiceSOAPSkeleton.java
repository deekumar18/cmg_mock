/**
 * CMECUpdEmplyrCntctWebServiceSOAPSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECUpdEmplyrCntctWebService;

public class CMECUpdEmplyrCntctWebServiceSOAPSkeleton implements uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECUpdEmplyrCntctWebService.CMECUpdEmplyrCntctWebService_PortType, org.apache.axis.wsdl.Skeleton {
    private uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECUpdEmplyrCntctWebService.CMECUpdEmplyrCntctWebService_PortType impl;
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
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "addEmplyrCntctRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/esb/eportal/CmecAddUpdEmplyrCntctRequest", "CmecAddUpdEmplyrCntctRequest"), uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecAddUpdEmplyrCntctRequest.CmecAddUpdEmplyrCntctRequest.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("addEmployerContact", _params, new javax.xml.namespace.QName("", "addEmplyrCntctResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/esb/eportal/CmecUpdEmplyrResponse", "CmecUpdEmplyrResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/interfaces/CMECUpdEmplyrCntctWebService", "addEmployerContact"));
        _oper.setSoapAction("http://www.childmaintenance.gsi.gov.uk/futurescheme/interfaces/CMECUpdEmplyrCntctWebService/addEmployerContact");
        _myOperationsList.add(_oper);
        if (_myOperations.get("addEmployerContact") == null) {
            _myOperations.put("addEmployerContact", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("addEmployerContact")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "updEmplyrCntctRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/esb/eportal/CmecAddUpdEmplyrCntctRequest", "CmecAddUpdEmplyrCntctRequest"), uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecAddUpdEmplyrCntctRequest.CmecAddUpdEmplyrCntctRequest.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("updateEmployerContact", _params, new javax.xml.namespace.QName("", "updEmplyrCntctResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/esb/eportal/CmecUpdEmplyrResponse", "CmecUpdEmplyrResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/interfaces/CMECUpdEmplyrCntctWebService", "updateEmployerContact"));
        _oper.setSoapAction("http://www.childmaintenance.gsi.gov.uk/futurescheme/interfaces/CMECUpdEmplyrCntctWebService/updateEmployerContact");
        _myOperationsList.add(_oper);
        if (_myOperations.get("updateEmployerContact") == null) {
            _myOperations.put("updateEmployerContact", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("updateEmployerContact")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "delEmplyrCntctRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/esb/eportal/CmecDelEmplyrCntctRequest", "CmecDelEmplyrCntctRequest"), uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecDelEmplyrCntctRequest.CmecDelEmplyrCntctRequest.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("deleteEmployerContact", _params, new javax.xml.namespace.QName("", "delEmplyrCntctResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/esb/eportal/CmecUpdEmplyrResponse", "CmecUpdEmplyrResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/interfaces/CMECUpdEmplyrCntctWebService", "deleteEmployerContact"));
        _oper.setSoapAction("http://www.childmaintenance.gsi.gov.uk/futurescheme/interfaces/CMECUpdEmplyrCntctWebService/deleteEmployerContact");
        _myOperationsList.add(_oper);
        if (_myOperations.get("deleteEmployerContact") == null) {
            _myOperations.put("deleteEmployerContact", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("deleteEmployerContact")).add(_oper);
    }

    public CMECUpdEmplyrCntctWebServiceSOAPSkeleton() {
        this.impl = new uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECUpdEmplyrCntctWebService.CMECUpdEmplyrCntctWebServiceSOAPImpl();
    }

    public CMECUpdEmplyrCntctWebServiceSOAPSkeleton(uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECUpdEmplyrCntctWebService.CMECUpdEmplyrCntctWebService_PortType impl) {
        this.impl = impl;
    }
    public uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecUpdEmplyrResponse.CmecUpdEmplyrResponse addEmployerContact(uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecAddUpdEmplyrCntctRequest.CmecAddUpdEmplyrCntctRequest addEmplyrCntctRequest) throws java.rmi.RemoteException
    {
        uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecUpdEmplyrResponse.CmecUpdEmplyrResponse ret = impl.addEmployerContact(addEmplyrCntctRequest);
        return ret;
    }

    public uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecUpdEmplyrResponse.CmecUpdEmplyrResponse updateEmployerContact(uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecAddUpdEmplyrCntctRequest.CmecAddUpdEmplyrCntctRequest updEmplyrCntctRequest) throws java.rmi.RemoteException
    {
        uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecUpdEmplyrResponse.CmecUpdEmplyrResponse ret = impl.updateEmployerContact(updEmplyrCntctRequest);
        return ret;
    }

    public uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecUpdEmplyrResponse.CmecUpdEmplyrResponse deleteEmployerContact(uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecDelEmplyrCntctRequest.CmecDelEmplyrCntctRequest delEmplyrCntctRequest) throws java.rmi.RemoteException
    {
        uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecUpdEmplyrResponse.CmecUpdEmplyrResponse ret = impl.deleteEmployerContact(delEmplyrCntctRequest);
        return ret;
    }

}
