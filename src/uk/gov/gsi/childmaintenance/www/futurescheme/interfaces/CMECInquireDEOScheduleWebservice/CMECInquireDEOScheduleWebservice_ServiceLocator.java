/**
 * CMECInquireDEOScheduleWebservice_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECInquireDEOScheduleWebservice;

public class CMECInquireDEOScheduleWebservice_ServiceLocator extends org.apache.axis.client.Service implements uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECInquireDEOScheduleWebservice.CMECInquireDEOScheduleWebservice_Service {

    public CMECInquireDEOScheduleWebservice_ServiceLocator() {
    }


    public CMECInquireDEOScheduleWebservice_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CMECInquireDEOScheduleWebservice_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CMECInquireDEOScheduleWebservice
    private java.lang.String CMECInquireDEOScheduleWebservice_address = "http://10.30.20.15:8080/CMECInquireDEOScheduleServiceEsbWeb/sca/CMECInquireDEOScheduleWebserviceExport";

    public java.lang.String getCMECInquireDEOScheduleWebserviceAddress() {
        return CMECInquireDEOScheduleWebservice_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CMECInquireDEOScheduleWebserviceWSDDServiceName = "CMECInquireDEOScheduleWebservice";

    public java.lang.String getCMECInquireDEOScheduleWebserviceWSDDServiceName() {
        return CMECInquireDEOScheduleWebserviceWSDDServiceName;
    }

    public void setCMECInquireDEOScheduleWebserviceWSDDServiceName(java.lang.String name) {
        CMECInquireDEOScheduleWebserviceWSDDServiceName = name;
    }

    public uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECInquireDEOScheduleWebservice.CMECInquireDEOScheduleWebservice_PortType getCMECInquireDEOScheduleWebservice() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CMECInquireDEOScheduleWebservice_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCMECInquireDEOScheduleWebservice(endpoint);
    }

    public uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECInquireDEOScheduleWebservice.CMECInquireDEOScheduleWebservice_PortType getCMECInquireDEOScheduleWebservice(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECInquireDEOScheduleWebservice.CMECInquireDEOScheduleWebserviceSOAPStub _stub = new uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECInquireDEOScheduleWebservice.CMECInquireDEOScheduleWebserviceSOAPStub(portAddress, this);
            _stub.setPortName(getCMECInquireDEOScheduleWebserviceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCMECInquireDEOScheduleWebserviceEndpointAddress(java.lang.String address) {
        CMECInquireDEOScheduleWebservice_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECInquireDEOScheduleWebservice.CMECInquireDEOScheduleWebservice_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECInquireDEOScheduleWebservice.CMECInquireDEOScheduleWebserviceSOAPStub _stub = new uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECInquireDEOScheduleWebservice.CMECInquireDEOScheduleWebserviceSOAPStub(new java.net.URL(CMECInquireDEOScheduleWebservice_address), this);
                _stub.setPortName(getCMECInquireDEOScheduleWebserviceWSDDServiceName());
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
        if ("CMECInquireDEOScheduleWebservice".equals(inputPortName)) {
            return getCMECInquireDEOScheduleWebservice();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/interfaces/CMECInquireDEOScheduleWebservice", "CMECInquireDEOScheduleWebservice");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/interfaces/CMECInquireDEOScheduleWebservice", "CMECInquireDEOScheduleWebservice"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("CMECInquireDEOScheduleWebservice".equals(portName)) {
            setCMECInquireDEOScheduleWebserviceEndpointAddress(address);
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
