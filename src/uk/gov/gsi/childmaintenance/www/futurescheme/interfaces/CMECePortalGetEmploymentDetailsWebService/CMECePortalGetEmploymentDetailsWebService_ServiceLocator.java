/**
 * CMECePortalGetEmploymentDetailsWebService_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECePortalGetEmploymentDetailsWebService;

public class CMECePortalGetEmploymentDetailsWebService_ServiceLocator extends org.apache.axis.client.Service implements uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECePortalGetEmploymentDetailsWebService.CMECePortalGetEmploymentDetailsWebService_Service {

    public CMECePortalGetEmploymentDetailsWebService_ServiceLocator() {
    }


    public CMECePortalGetEmploymentDetailsWebService_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CMECePortalGetEmploymentDetailsWebService_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CMECePortalGetEmploymentDetailsWebService
    private java.lang.String CMECePortalGetEmploymentDetailsWebService_address = "http://10.30.20.15:8080/CMECGetEmplymntDtlsEPortalEsbWeb/sca/CMECePortalGetEmploymentDetailsWebServiceExport";

    public java.lang.String getCMECePortalGetEmploymentDetailsWebServiceAddress() {
        return CMECePortalGetEmploymentDetailsWebService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CMECePortalGetEmploymentDetailsWebServiceWSDDServiceName = "CMECePortalGetEmploymentDetailsWebService";

    public java.lang.String getCMECePortalGetEmploymentDetailsWebServiceWSDDServiceName() {
        return CMECePortalGetEmploymentDetailsWebServiceWSDDServiceName;
    }

    public void setCMECePortalGetEmploymentDetailsWebServiceWSDDServiceName(java.lang.String name) {
        CMECePortalGetEmploymentDetailsWebServiceWSDDServiceName = name;
    }

    public uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECePortalGetEmploymentDetailsWebService.CMECePortalGetEmploymentDetailsWebService_PortType getCMECePortalGetEmploymentDetailsWebService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CMECePortalGetEmploymentDetailsWebService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCMECePortalGetEmploymentDetailsWebService(endpoint);
    }

    public uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECePortalGetEmploymentDetailsWebService.CMECePortalGetEmploymentDetailsWebService_PortType getCMECePortalGetEmploymentDetailsWebService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECePortalGetEmploymentDetailsWebService.CMECGetEmploymentDetailsWebServiceSOAPStub _stub = new uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECePortalGetEmploymentDetailsWebService.CMECGetEmploymentDetailsWebServiceSOAPStub(portAddress, this);
            _stub.setPortName(getCMECePortalGetEmploymentDetailsWebServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCMECePortalGetEmploymentDetailsWebServiceEndpointAddress(java.lang.String address) {
        CMECePortalGetEmploymentDetailsWebService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECePortalGetEmploymentDetailsWebService.CMECePortalGetEmploymentDetailsWebService_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECePortalGetEmploymentDetailsWebService.CMECGetEmploymentDetailsWebServiceSOAPStub _stub = new uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECePortalGetEmploymentDetailsWebService.CMECGetEmploymentDetailsWebServiceSOAPStub(new java.net.URL(CMECePortalGetEmploymentDetailsWebService_address), this);
                _stub.setPortName(getCMECePortalGetEmploymentDetailsWebServiceWSDDServiceName());
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
        if ("CMECePortalGetEmploymentDetailsWebService".equals(inputPortName)) {
            return getCMECePortalGetEmploymentDetailsWebService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/interfaces/CMECePortalGetEmploymentDetailsWebService", "CMECePortalGetEmploymentDetailsWebService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/interfaces/CMECePortalGetEmploymentDetailsWebService", "CMECePortalGetEmploymentDetailsWebService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("CMECePortalGetEmploymentDetailsWebService".equals(portName)) {
            setCMECePortalGetEmploymentDetailsWebServiceEndpointAddress(address);
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
