/**
 * CMECInquireDEOSchdDiffWebservice_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECInquireDEOSchdDiffWebservice;

public class CMECInquireDEOSchdDiffWebservice_ServiceLocator extends org.apache.axis.client.Service implements uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECInquireDEOSchdDiffWebservice.CMECInquireDEOSchdDiffWebservice_Service {

    public CMECInquireDEOSchdDiffWebservice_ServiceLocator() {
    }


    public CMECInquireDEOSchdDiffWebservice_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CMECInquireDEOSchdDiffWebservice_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CMECInquireDEOSchdDiffWebservice
    private java.lang.String CMECInquireDEOSchdDiffWebservice_address = "http://10.30.20.15:8080/CMECInqDEODiffServiceEsbWeb/sca/CMECInquireDEOSchdDiffWebserviceExport";

    public java.lang.String getCMECInquireDEOSchdDiffWebserviceAddress() {
        return CMECInquireDEOSchdDiffWebservice_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CMECInquireDEOSchdDiffWebserviceWSDDServiceName = "CMECInquireDEOSchdDiffWebservice";

    public java.lang.String getCMECInquireDEOSchdDiffWebserviceWSDDServiceName() {
        return CMECInquireDEOSchdDiffWebserviceWSDDServiceName;
    }

    public void setCMECInquireDEOSchdDiffWebserviceWSDDServiceName(java.lang.String name) {
        CMECInquireDEOSchdDiffWebserviceWSDDServiceName = name;
    }

    public uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECInquireDEOSchdDiffWebservice.CMECInquireDEOSchdDiffWebservice_PortType getCMECInquireDEOSchdDiffWebservice() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CMECInquireDEOSchdDiffWebservice_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCMECInquireDEOSchdDiffWebservice(endpoint);
    }

    public uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECInquireDEOSchdDiffWebservice.CMECInquireDEOSchdDiffWebservice_PortType getCMECInquireDEOSchdDiffWebservice(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECInquireDEOSchdDiffWebservice.CMECInquireDEOSchdDiffWebserviceSOAPStub _stub = new uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECInquireDEOSchdDiffWebservice.CMECInquireDEOSchdDiffWebserviceSOAPStub(portAddress, this);
            _stub.setPortName(getCMECInquireDEOSchdDiffWebserviceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCMECInquireDEOSchdDiffWebserviceEndpointAddress(java.lang.String address) {
        CMECInquireDEOSchdDiffWebservice_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECInquireDEOSchdDiffWebservice.CMECInquireDEOSchdDiffWebservice_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECInquireDEOSchdDiffWebservice.CMECInquireDEOSchdDiffWebserviceSOAPStub _stub = new uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECInquireDEOSchdDiffWebservice.CMECInquireDEOSchdDiffWebserviceSOAPStub(new java.net.URL(CMECInquireDEOSchdDiffWebservice_address), this);
                _stub.setPortName(getCMECInquireDEOSchdDiffWebserviceWSDDServiceName());
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
        if ("CMECInquireDEOSchdDiffWebservice".equals(inputPortName)) {
            return getCMECInquireDEOSchdDiffWebservice();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/interfaces/CMECInquireDEOSchdDiffWebservice", "CMECInquireDEOSchdDiffWebservice");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/interfaces/CMECInquireDEOSchdDiffWebservice", "CMECInquireDEOSchdDiffWebservice"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("CMECInquireDEOSchdDiffWebservice".equals(portName)) {
            setCMECInquireDEOSchdDiffWebserviceEndpointAddress(address);
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
