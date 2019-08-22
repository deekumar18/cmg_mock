/**
 * CMECUpdEmplyrCntctWebService_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECUpdEmplyrCntctWebService;

public interface CMECUpdEmplyrCntctWebService_PortType extends java.rmi.Remote {
    public uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecUpdEmplyrResponse.CmecUpdEmplyrResponse addEmployerContact(uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecAddUpdEmplyrCntctRequest.CmecAddUpdEmplyrCntctRequest addEmplyrCntctRequest) throws java.rmi.RemoteException;
    public uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecUpdEmplyrResponse.CmecUpdEmplyrResponse updateEmployerContact(uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecAddUpdEmplyrCntctRequest.CmecAddUpdEmplyrCntctRequest updEmplyrCntctRequest) throws java.rmi.RemoteException;
    public uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecUpdEmplyrResponse.CmecUpdEmplyrResponse deleteEmployerContact(uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecDelEmplyrCntctRequest.CmecDelEmplyrCntctRequest delEmplyrCntctRequest) throws java.rmi.RemoteException;
}
