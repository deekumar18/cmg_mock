/**
 * CMECBankWizardWebservice_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECBankWizardWebservice;

public interface CMECBankWizardWebservice_PortType extends java.rmi.Remote {
    public uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.payment.CmecSubmitBankValidationResponse.CmecSubmitBankValidationResponse submitBankValidation(uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.payment.CmecSubmitBankValidationRequest.CmecSubmitBankValidationRequest bankWizardRequest) throws java.rmi.RemoteException;
}
