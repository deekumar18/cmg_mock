/**
 * RcvInboundMsgBindingSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECRcvInboundMessageInterface;

public class RcvInboundMsgBindingSkeleton implements uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECRcvInboundMessageInterface.CMECRcvInboundMessageInterface, org.apache.axis.wsdl.Skeleton {
    private uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECRcvInboundMessageInterface.CMECRcvInboundMessageInterface impl;
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
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RcvInboundMessagesReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/esb/eportal/CMECRcvInboundMessageReq", "CMECRcvInboundMessageReq"), uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CMECRcvInboundMessageReq.CMECRcvInboundMessageReq.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("rcvInboundMessage", _params, new javax.xml.namespace.QName("", "RcvInboundMessagesRes"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/esb/eportal/CMECRcvInboundMessageRes", "CMECRcvInboundMessageRes"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/interfaces/CMECRcvInboundMessageInterface", "RcvInboundMessage"));
        _oper.setSoapAction("http://www.childmaintenance.gsi.gov.uk/futurescheme/interfaces/CMECRcvInboundMessageInterface/RcvInboundMessage");
        _myOperationsList.add(_oper);
        if (_myOperations.get("rcvInboundMessage") == null) {
            _myOperations.put("rcvInboundMessage", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("rcvInboundMessage")).add(_oper);
    }

    public RcvInboundMsgBindingSkeleton() {
        this.impl = new uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECRcvInboundMessageInterface.RcvInboundMsgBindingImpl();
    }

    public RcvInboundMsgBindingSkeleton(uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECRcvInboundMessageInterface.CMECRcvInboundMessageInterface impl) {
        this.impl = impl;
    }
    public uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CMECRcvInboundMessageRes.CMECRcvInboundMessageRes rcvInboundMessage(uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CMECRcvInboundMessageReq.CMECRcvInboundMessageReq rcvInboundMessagesReq) throws java.rmi.RemoteException
    {
        uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CMECRcvInboundMessageRes.CMECRcvInboundMessageRes ret = impl.rcvInboundMessage(rcvInboundMessagesReq);
        return ret;
    }

}
