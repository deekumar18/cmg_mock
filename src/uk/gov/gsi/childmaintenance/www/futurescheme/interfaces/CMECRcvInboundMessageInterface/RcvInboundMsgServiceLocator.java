/**
 * RcvInboundMsgServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECRcvInboundMessageInterface;

public class RcvInboundMsgServiceLocator extends org.apache.axis.client.Service implements uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECRcvInboundMessageInterface.RcvInboundMsgService {

    public RcvInboundMsgServiceLocator() {
    }


    public RcvInboundMsgServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public RcvInboundMsgServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for RcvInboundMsgPort
    private java.lang.String RcvInboundMsgPort_address = "http://10.30.20.15:8080/CMECRcvInboundMessagePortalEsbWeb/sca/CMECRcvInboundMessageInterfaceExport1";

    public java.lang.String getRcvInboundMsgPortAddress() {
        return RcvInboundMsgPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String RcvInboundMsgPortWSDDServiceName = "RcvInboundMsgPort";

    public java.lang.String getRcvInboundMsgPortWSDDServiceName() {
        return RcvInboundMsgPortWSDDServiceName;
    }

    public void setRcvInboundMsgPortWSDDServiceName(java.lang.String name) {
        RcvInboundMsgPortWSDDServiceName = name;
    }

    public uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECRcvInboundMessageInterface.CMECRcvInboundMessageInterface getRcvInboundMsgPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(RcvInboundMsgPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getRcvInboundMsgPort(endpoint);
    }

    public uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECRcvInboundMessageInterface.CMECRcvInboundMessageInterface getRcvInboundMsgPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECRcvInboundMessageInterface.RcvInboundMsgBindingStub _stub = new uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECRcvInboundMessageInterface.RcvInboundMsgBindingStub(portAddress, this);
            _stub.setPortName(getRcvInboundMsgPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setRcvInboundMsgPortEndpointAddress(java.lang.String address) {
        RcvInboundMsgPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECRcvInboundMessageInterface.CMECRcvInboundMessageInterface.class.isAssignableFrom(serviceEndpointInterface)) {
                uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECRcvInboundMessageInterface.RcvInboundMsgBindingStub _stub = new uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECRcvInboundMessageInterface.RcvInboundMsgBindingStub(new java.net.URL(RcvInboundMsgPort_address), this);
                _stub.setPortName(getRcvInboundMsgPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("RcvInboundMsgPort".equals(inputPortName)) {
            return getRcvInboundMsgPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/interfaces/CMECRcvInboundMessageInterface", "RcvInboundMsgService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/interfaces/CMECRcvInboundMessageInterface", "RcvInboundMsgPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("RcvInboundMsgPort".equals(portName)) {
            setRcvInboundMsgPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
