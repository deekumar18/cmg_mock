/**
 * CMECFetchDEOTemplateWebserviceSOAPSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECFetchDEOTemplateWebservice;

public class CMECFetchDEOTemplateWebserviceSOAPSkeleton implements uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECFetchDEOTemplateWebservice.CMECFetchDEOTemplateWebservice_PortType, org.apache.axis.wsdl.Skeleton {
    private uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECFetchDEOTemplateWebservice.CMECFetchDEOTemplateWebservice_PortType impl;
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
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "fetchDEOTemplateInput"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/esb/deoSchedule/CMECFetchTemplateDEORequest", "CMECFetchTemplateDEORequest"), uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.deoSchedule.CMECFetchTemplateDEORequest.CMECFetchTemplateDEORequest.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("fetchDEOTemplate", _params, new javax.xml.namespace.QName("", "fetchDEOTemplateOutput"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/esb/deoSchedule/CMECFetchTemplateDEOResponse", "CMECFetchTemplateDEOResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/interfaces/CMECFetchDEOTemplateWebservice", "FetchDEOTemplate"));
        _oper.setSoapAction("http://www.childmaintenance.gsi.gov.uk/futurescheme/interfaces/CMECFetchDEOTemplateWebservice/FetchDEOTemplate");
        _myOperationsList.add(_oper);
        if (_myOperations.get("fetchDEOTemplate") == null) {
            _myOperations.put("fetchDEOTemplate", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("fetchDEOTemplate")).add(_oper);
    }

    public CMECFetchDEOTemplateWebserviceSOAPSkeleton() {
        this.impl = new uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECFetchDEOTemplateWebservice.CMECFetchDEOTemplateWebserviceSOAPImpl();
    }

    public CMECFetchDEOTemplateWebserviceSOAPSkeleton(uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECFetchDEOTemplateWebservice.CMECFetchDEOTemplateWebservice_PortType impl) {
        this.impl = impl;
    }
    public uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.deoSchedule.CMECFetchTemplateDEOResponse.CMECFetchTemplateDEOResponse fetchDEOTemplate(uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.deoSchedule.CMECFetchTemplateDEORequest.CMECFetchTemplateDEORequest fetchDEOTemplateInput) throws java.rmi.RemoteException
    {
        uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.deoSchedule.CMECFetchTemplateDEOResponse.CMECFetchTemplateDEOResponse ret = impl.fetchDEOTemplate(fetchDEOTemplateInput);
        return ret;
    }

}
