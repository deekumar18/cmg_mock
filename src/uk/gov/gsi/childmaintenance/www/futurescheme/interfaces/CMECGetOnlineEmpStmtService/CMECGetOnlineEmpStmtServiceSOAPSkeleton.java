/**
 * CMECGetOnlineEmpStmtServiceSOAPSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECGetOnlineEmpStmtService;

public class CMECGetOnlineEmpStmtServiceSOAPSkeleton implements uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECGetOnlineEmpStmtService.CMECGetOnlineEmpStmtService_PortType, org.apache.axis.wsdl.Skeleton {
    private uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECGetOnlineEmpStmtService.CMECGetOnlineEmpStmtService_PortType impl;
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
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/interfaces/CMECGetOnlineEmpStmtService", "getEmpStmtRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/interfaces/CMECGetOnlineEmpStmtService", ">getEmpStmtRequest"), uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECGetOnlineEmpStmtService.GetEmpStmtRequest.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getEmpStmt", _params, new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/interfaces/CMECGetOnlineEmpStmtService", "getEmpStmtResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/interfaces/CMECGetOnlineEmpStmtService", ">getEmpStmtResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "getEmpStmt"));
        _oper.setSoapAction("http://www.childmaintenance.gsi.gov.uk/futurescheme/interfaces/CMECGetOnlineEmpStmtService/getEmplyrSchd");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getEmpStmt") == null) {
            _myOperations.put("getEmpStmt", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getEmpStmt")).add(_oper);
    }

    public CMECGetOnlineEmpStmtServiceSOAPSkeleton() {
        this.impl = new uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECGetOnlineEmpStmtService.CMECGetOnlineEmpStmtServiceSOAPImpl();
    }

    public CMECGetOnlineEmpStmtServiceSOAPSkeleton(uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECGetOnlineEmpStmtService.CMECGetOnlineEmpStmtService_PortType impl) {
        this.impl = impl;
    }
    public uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECGetOnlineEmpStmtService.GetEmpStmtResponse getEmpStmt(uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECGetOnlineEmpStmtService.GetEmpStmtRequest getEmpStmtParameters) throws java.rmi.RemoteException
    {
        uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECGetOnlineEmpStmtService.GetEmpStmtResponse ret = impl.getEmpStmt(getEmpStmtParameters);
        return ret;
    }

}
