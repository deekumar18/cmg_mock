/**
 * CMECAddressDetailsBindingSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECAddressDetailsService;

public class CMECAddressDetailsBindingSkeleton implements uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECAddressDetailsService.CMECAddressDetails, org.apache.axis.wsdl.Skeleton {
    private uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECAddressDetailsService.CMECAddressDetails impl;
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
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/interfaces/CMECAddressDetailsService", "GetAddressDetails"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/interfaces/CMECAddressDetailsService", ">GetAddressDetails"), uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECAddressDetailsService.GetAddressDetails.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getAddressDetails", _params, new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/interfaces/CMECAddressDetailsService", "GetAddressDetailsResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/interfaces/CMECAddressDetailsService", ">GetAddressDetailsResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "getAddressDetails"));
        _oper.setSoapAction("http://www.example.org/CMECAddressDetails/getAddressDetails");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getAddressDetails") == null) {
            _myOperations.put("getAddressDetails", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getAddressDetails")).add(_oper);
    }

    public CMECAddressDetailsBindingSkeleton() {
        this.impl = new uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECAddressDetailsService.CMECAddressDetailsBindingImpl();
    }

    public CMECAddressDetailsBindingSkeleton(uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECAddressDetailsService.CMECAddressDetails impl) {
        this.impl = impl;
    }
    public uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECAddressDetailsService.GetAddressDetailsResponse getAddressDetails(uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECAddressDetailsService.GetAddressDetails getAddressDetailsRequest) throws java.rmi.RemoteException
    {
        uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECAddressDetailsService.GetAddressDetailsResponse ret = impl.getAddressDetails(getAddressDetailsRequest);
        return ret;
    }

}
