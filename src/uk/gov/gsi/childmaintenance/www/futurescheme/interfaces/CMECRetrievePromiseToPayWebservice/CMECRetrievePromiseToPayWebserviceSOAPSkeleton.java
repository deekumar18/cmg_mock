/**
 * CMECRetrievePromiseToPayWebserviceSOAPSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECRetrievePromiseToPayWebservice;

public class CMECRetrievePromiseToPayWebserviceSOAPSkeleton implements uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECRetrievePromiseToPayWebservice.CMECRetrievePromiseToPayWebservice_PortType, org.apache.axis.wsdl.Skeleton {
    private uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECRetrievePromiseToPayWebservice.CMECRetrievePromiseToPayWebservice_PortType impl;
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
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "retrievePromiseToPaySchdInput"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/esb/maintenance/CMECRetrievePromiseToPaySchdRequest", "CmecRetrievePromiseToPaySchdRequest"), uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.maintenance.CMECRetrievePromiseToPaySchdRequest.CmecRetrievePromiseToPaySchdRequest.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("retrievePromiseToPaySchedule", _params, new javax.xml.namespace.QName("", "retrievePromiseToPaySchdOutput"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/esb/maintenance/CmecRetrievePromiseToPaySchdResponse", "CmecRetrievePromiseToPaySchdResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/interfaces/CMECRetrievePromiseToPayWebservice", "RetrievePromiseToPaySchedule"));
        _oper.setSoapAction("http://www.childmaintenance.gsi.gov.uk/futurescheme/interfaces/CMECRetrievePromiseToPayWebservice/RetrievePromiseToPaySchedule");
        _myOperationsList.add(_oper);
        if (_myOperations.get("retrievePromiseToPaySchedule") == null) {
            _myOperations.put("retrievePromiseToPaySchedule", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("retrievePromiseToPaySchedule")).add(_oper);
    }

    public CMECRetrievePromiseToPayWebserviceSOAPSkeleton() {
        this.impl = new uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECRetrievePromiseToPayWebservice.CMECRetrievePromiseToPayWebserviceSOAPImpl();
    }

    public CMECRetrievePromiseToPayWebserviceSOAPSkeleton(uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECRetrievePromiseToPayWebservice.CMECRetrievePromiseToPayWebservice_PortType impl) {
        this.impl = impl;
    }
    public uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.maintenance.CmecRetrievePromiseToPaySchdResponse.CmecRetrievePromiseToPaySchdResponse retrievePromiseToPaySchedule(uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.maintenance.CMECRetrievePromiseToPaySchdRequest.CmecRetrievePromiseToPaySchdRequest retrievePromiseToPaySchdInput) throws java.rmi.RemoteException
    {
        uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.maintenance.CmecRetrievePromiseToPaySchdResponse.CmecRetrievePromiseToPaySchdResponse ret = impl.retrievePromiseToPaySchedule(retrievePromiseToPaySchdInput);
        return ret;
    }

}
