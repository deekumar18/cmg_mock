/**
 * CMECAddressDetailsServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECAddressDetailsService;

public class CMECAddressDetailsServiceLocator extends org.apache.axis.client.Service implements uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECAddressDetailsService.CMECAddressDetailsService {

    public CMECAddressDetailsServiceLocator() {
    }


    public CMECAddressDetailsServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CMECAddressDetailsServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CMECAddressDetailsServicePort
    private java.lang.String CMECAddressDetailsServicePort_address = "http://10.30.20.15:8080/CMECSearchAddressServiceEsbWeb/sca/CMECAddressDetailsWSExport";

    public java.lang.String getCMECAddressDetailsServicePortAddress() {
        return CMECAddressDetailsServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CMECAddressDetailsServicePortWSDDServiceName = "CMECAddressDetailsServicePort";

    public java.lang.String getCMECAddressDetailsServicePortWSDDServiceName() {
        return CMECAddressDetailsServicePortWSDDServiceName;
    }

    public void setCMECAddressDetailsServicePortWSDDServiceName(java.lang.String name) {
        CMECAddressDetailsServicePortWSDDServiceName = name;
    }

    public uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECAddressDetailsService.CMECAddressDetails getCMECAddressDetailsServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CMECAddressDetailsServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCMECAddressDetailsServicePort(endpoint);
    }

    public uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECAddressDetailsService.CMECAddressDetails getCMECAddressDetailsServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECAddressDetailsService.CMECAddressDetailsBindingStub _stub = new uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECAddressDetailsService.CMECAddressDetailsBindingStub(portAddress, this);
            _stub.setPortName(getCMECAddressDetailsServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCMECAddressDetailsServicePortEndpointAddress(java.lang.String address) {
        CMECAddressDetailsServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECAddressDetailsService.CMECAddressDetails.class.isAssignableFrom(serviceEndpointInterface)) {
                uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECAddressDetailsService.CMECAddressDetailsBindingStub _stub = new uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECAddressDetailsService.CMECAddressDetailsBindingStub(new java.net.URL(CMECAddressDetailsServicePort_address), this);
                _stub.setPortName(getCMECAddressDetailsServicePortWSDDServiceName());
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
        if ("CMECAddressDetailsServicePort".equals(inputPortName)) {
            return getCMECAddressDetailsServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/interfaces/CMECAddressDetailsService", "CMECAddressDetailsService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/interfaces/CMECAddressDetailsService", "CMECAddressDetailsServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("CMECAddressDetailsServicePort".equals(portName)) {
            setCMECAddressDetailsServicePortEndpointAddress(address);
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
