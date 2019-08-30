/**
 * CMECBankWizardWebservice_BindingSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECBankWizardWebservice;

public class CMECBankWizardWebservice_BindingSkeleton implements uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECBankWizardWebservice.CMECBankWizardWebservice_PortType, org.apache.axis.wsdl.Skeleton {
    private uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECBankWizardWebservice.CMECBankWizardWebservice_PortType impl;
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
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "BankWizardRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/esb/payment/CmecSubmitBankValidationRequest", "CmecSubmitBankValidationRequest"), uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.payment.CmecSubmitBankValidationRequest.CmecSubmitBankValidationRequest.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("submitBankValidation", _params, new javax.xml.namespace.QName("", "BankWizardResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/esb/payment/CmecSubmitBankValidationResponse", "CmecSubmitBankValidationResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/interfaces/CMECBankWizardWebservice", "SubmitBankValidation"));
        _oper.setSoapAction("http://www.childmaintenance.gsi.gov.uk/futurescheme/interfaces/CMECBankWizardWebservice/SubmitBankValidation");
        _myOperationsList.add(_oper);
        if (_myOperations.get("submitBankValidation") == null) {
            _myOperations.put("submitBankValidation", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("submitBankValidation")).add(_oper);
    }

    public CMECBankWizardWebservice_BindingSkeleton() {
        this.impl = new uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECBankWizardWebservice.CMECBankWizardWebservice_BindingImpl();
    }

    public CMECBankWizardWebservice_BindingSkeleton(uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECBankWizardWebservice.CMECBankWizardWebservice_PortType impl) {
        this.impl = impl;
    }
    public uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.payment.CmecSubmitBankValidationResponse.CmecSubmitBankValidationResponse submitBankValidation(uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.payment.CmecSubmitBankValidationRequest.CmecSubmitBankValidationRequest bankWizardRequest) throws java.rmi.RemoteException
    {
        uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.payment.CmecSubmitBankValidationResponse.CmecSubmitBankValidationResponse ret = impl.submitBankValidation(bankWizardRequest);
        return ret;
    }

}
