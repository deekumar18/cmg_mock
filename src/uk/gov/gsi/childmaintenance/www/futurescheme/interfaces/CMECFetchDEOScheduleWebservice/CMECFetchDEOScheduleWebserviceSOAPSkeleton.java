/**
 * CMECFetchDEOScheduleWebserviceSOAPSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECFetchDEOScheduleWebservice;

public class CMECFetchDEOScheduleWebserviceSOAPSkeleton implements uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECFetchDEOScheduleWebservice.CMECFetchDEOScheduleWebservice_PortType, org.apache.axis.wsdl.Skeleton {
    private uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECFetchDEOScheduleWebservice.CMECFetchDEOScheduleWebservice_PortType impl;
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
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "fetchDEOScheduleInput"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/esb/deoSchedule/CMECFetchDEODetailsRequest", "CMECFetchDEODetailsRequest"), uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.deoSchedule.CMECFetchDEODetailsRequest.CMECFetchDEODetailsRequest.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("fetchDEOSchedule", _params, new javax.xml.namespace.QName("", "fetchDEOScheduleOutput"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/esb/deoSchedule/CMECFetchDEODetailsResponse", "CMECFetchDEODetailsResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/interfaces/CMECFetchDEOScheduleWebservice", "FetchDEOSchedule"));
        _oper.setSoapAction("http://www.childmaintenance.gsi.gov.uk/futurescheme/interfaces/CMECFetchDEOScheduleWebservice/FetchDEOSchedule");
        _myOperationsList.add(_oper);
        if (_myOperations.get("fetchDEOSchedule") == null) {
            _myOperations.put("fetchDEOSchedule", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("fetchDEOSchedule")).add(_oper);
    }

    public CMECFetchDEOScheduleWebserviceSOAPSkeleton() {
        this.impl = new uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECFetchDEOScheduleWebservice.CMECFetchDEOScheduleWebserviceSOAPImpl();
    }

    public CMECFetchDEOScheduleWebserviceSOAPSkeleton(uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECFetchDEOScheduleWebservice.CMECFetchDEOScheduleWebservice_PortType impl) {
        this.impl = impl;
    }
    public uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.deoSchedule.CMECFetchDEODetailsResponse.CMECFetchDEODetailsResponse fetchDEOSchedule(uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.deoSchedule.CMECFetchDEODetailsRequest.CMECFetchDEODetailsRequest fetchDEOScheduleInput) throws java.rmi.RemoteException
    {
        uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.deoSchedule.CMECFetchDEODetailsResponse.CMECFetchDEODetailsResponse ret = impl.fetchDEOSchedule(fetchDEOScheduleInput);
        return ret;
    }

}
