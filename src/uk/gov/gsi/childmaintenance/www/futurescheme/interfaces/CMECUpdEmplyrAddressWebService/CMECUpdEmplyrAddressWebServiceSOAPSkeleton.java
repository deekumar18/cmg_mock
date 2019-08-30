/**
 * CMECUpdEmplyrAddressWebServiceSOAPSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECUpdEmplyrAddressWebService;

public class CMECUpdEmplyrAddressWebServiceSOAPSkeleton implements uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECUpdEmplyrAddressWebService.CMECUpdEmplyrAddressWebService_PortType, org.apache.axis.wsdl.Skeleton {
    private uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECUpdEmplyrAddressWebService.CMECUpdEmplyrAddressWebService_PortType impl;
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
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "addEmplyrAddrRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/esb/eportal/CmecAddDelEmplyrAddrRequest", "CmecAddDelEmplyrAddrRequest"), uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecAddDelEmplyrAddrRequest.CmecAddDelEmplyrAddrRequest.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("addEmployerAddress", _params, new javax.xml.namespace.QName("", "addEmplyrAddrResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/esb/eportal/CmecUpdEmplyrResponse", "CmecUpdEmplyrResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/interfaces/CMECUpdEmplyrAddressWebService", "addEmployerAddress"));
        _oper.setSoapAction("http://www.childmaintenance.gsi.gov.uk/futurescheme/interfaces/CMECUpdEmplyrAddressWebService/addEmployerAddress");
        _myOperationsList.add(_oper);
        if (_myOperations.get("addEmployerAddress") == null) {
            _myOperations.put("addEmployerAddress", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("addEmployerAddress")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "updEmplyrAddrRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/esb/eportal/CmecUpdEmplyrAddrRequest", "CmecUpdEmplyrAddrRequest"), uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecUpdEmplyrAddrRequest.CmecUpdEmplyrAddrRequest.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("updateEmployerAddress", _params, new javax.xml.namespace.QName("", "updEmplyrAddrResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/esb/eportal/CmecUpdEmplyrResponse", "CmecUpdEmplyrResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/interfaces/CMECUpdEmplyrAddressWebService", "updateEmployerAddress"));
        _oper.setSoapAction("http://www.childmaintenance.gsi.gov.uk/futurescheme/interfaces/CMECUpdEmplyrAddressWebService/updateEmployerAddress");
        _myOperationsList.add(_oper);
        if (_myOperations.get("updateEmployerAddress") == null) {
            _myOperations.put("updateEmployerAddress", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("updateEmployerAddress")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "delEmplyrAddrRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/esb/eportal/CmecAddDelEmplyrAddrRequest", "CmecAddDelEmplyrAddrRequest"), uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecAddDelEmplyrAddrRequest.CmecAddDelEmplyrAddrRequest.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("deleteEmployerAddress", _params, new javax.xml.namespace.QName("", "delEmplyrAddrResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/esb/eportal/CmecUpdEmplyrResponse", "CmecUpdEmplyrResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/interfaces/CMECUpdEmplyrAddressWebService", "deleteEmployerAddress"));
        _oper.setSoapAction("http://www.childmaintenance.gsi.gov.uk/futurescheme/interfaces/CMECUpdEmplyrAddressWebService/deleteEmployerAddress");
        _myOperationsList.add(_oper);
        if (_myOperations.get("deleteEmployerAddress") == null) {
            _myOperations.put("deleteEmployerAddress", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("deleteEmployerAddress")).add(_oper);
    }

    public CMECUpdEmplyrAddressWebServiceSOAPSkeleton() {
        this.impl = new uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECUpdEmplyrAddressWebService.CMECUpdEmplyrAddressWebServiceSOAPImpl();
    }

    public CMECUpdEmplyrAddressWebServiceSOAPSkeleton(uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECUpdEmplyrAddressWebService.CMECUpdEmplyrAddressWebService_PortType impl) {
        this.impl = impl;
    }
    public uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecUpdEmplyrResponse.CmecUpdEmplyrResponse addEmployerAddress(uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecAddDelEmplyrAddrRequest.CmecAddDelEmplyrAddrRequest addEmplyrAddrRequest) throws java.rmi.RemoteException
    {
        uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecUpdEmplyrResponse.CmecUpdEmplyrResponse ret = impl.addEmployerAddress(addEmplyrAddrRequest);
        return ret;
    }

    public uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecUpdEmplyrResponse.CmecUpdEmplyrResponse updateEmployerAddress(uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecUpdEmplyrAddrRequest.CmecUpdEmplyrAddrRequest updEmplyrAddrRequest) throws java.rmi.RemoteException
    {
        uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecUpdEmplyrResponse.CmecUpdEmplyrResponse ret = impl.updateEmployerAddress(updEmplyrAddrRequest);
        return ret;
    }

    public uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecUpdEmplyrResponse.CmecUpdEmplyrResponse deleteEmployerAddress(uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecAddDelEmplyrAddrRequest.CmecAddDelEmplyrAddrRequest delEmplyrAddrRequest) throws java.rmi.RemoteException
    {
        uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecUpdEmplyrResponse.CmecUpdEmplyrResponse ret = impl.deleteEmployerAddress(delEmplyrAddrRequest);
        return ret;
    }

}
