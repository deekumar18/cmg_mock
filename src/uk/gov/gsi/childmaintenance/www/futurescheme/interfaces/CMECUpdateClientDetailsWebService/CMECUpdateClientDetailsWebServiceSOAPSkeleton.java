/**
 * CMECUpdateClientDetailsWebServiceSOAPSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECUpdateClientDetailsWebService;

public class CMECUpdateClientDetailsWebServiceSOAPSkeleton implements uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECUpdateClientDetailsWebService.CMECUpdateClientDetailsWebService_PortType, org.apache.axis.wsdl.Skeleton {
    private uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECUpdateClientDetailsWebService.CMECUpdateClientDetailsWebService_PortType impl;
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
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "UpdateContactDetailsReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/esb/eportal/CmecEPortalUpdCntctDetailsRequest", "CmecEPortalUpdCntctDetailsRequest"), uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalUpdCntctDetailsRequest.CmecEPortalUpdCntctDetailsRequest.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("updateContactDetails", _params, new javax.xml.namespace.QName("", "UpdateContactDetailsResp"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/esb/eportal/CmecEPortalUpdCntctDetailsResponse", "CmecEPortalUpdCntctDetailsResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/interfaces/CMECUpdateClientDetailsWebService", "updateContactDetails"));
        _oper.setSoapAction("http://www.childmaintenance.gsi.gov.uk/futurescheme/interfaces/CMECUpdateClientDetailsWebService/updateContactDetails");
        _myOperationsList.add(_oper);
        if (_myOperations.get("updateContactDetails") == null) {
            _myOperations.put("updateContactDetails", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("updateContactDetails")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHeader"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/common/CMECHeader.xsd", "CMECHeader"), uk.gov.gsi.childmaintenance.www.futurescheme.bo.common.CMECHeader_xsd.CMECHeader.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "CaseNumber"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "SCIN"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Title"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/esb/eportal/CmecEPortalUpdPrsnlDetailsRequest", ">CmecEPortalUpdPrsnlDetailsRequest>Title"), uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalUpdPrsnlDetailsRequest.CmecEPortalUpdPrsnlDetailsRequestTitle.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "NewFirstName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "NewLastName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "NewMiddleName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "NewGender"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "BirthDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Source"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("updatePersonalDetails", _params, new javax.xml.namespace.QName("", "ResponseHeader"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/common/Response.xsd", "Response"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/interfaces/CMECUpdateClientDetailsWebService", "UpdatePersonalDetailsParameters"));
        _oper.setSoapAction("http://www.childmaintenance.gsi.gov.uk/futurescheme/interfaces/CMECUpdateClientDetailsWebService/updatePersonalDetails");
        _myOperationsList.add(_oper);
        if (_myOperations.get("updatePersonalDetails") == null) {
            _myOperations.put("updatePersonalDetails", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("updatePersonalDetails")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "UpdatePreferredContactMethodreq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/esb/eportal/CmecEPortalUpdPCMRequest", "CmecEPortalUpdPCMRequest"), uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalUpdPCMRequest.CmecEPortalUpdPCMRequest.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("updatePreferredContactMethod", _params, new javax.xml.namespace.QName("", "UpdatePreferredContactMethodResp"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/esb/eportal/CmecEPortalUpdPCMResponse", "CmecEPortalUpdPCMResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/interfaces/CMECUpdateClientDetailsWebService", "updatePreferredContactMethod"));
        _oper.setSoapAction("http://www.childmaintenance.gsi.gov.uk/futurescheme/interfaces/CMECUpdateClientDetailsWebService/updatePreferredContactMethod");
        _myOperationsList.add(_oper);
        if (_myOperations.get("updatePreferredContactMethod") == null) {
            _myOperations.put("updatePreferredContactMethod", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("updatePreferredContactMethod")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "UpdateAddressDetailsReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/esb/eportal/CmecEPortalUpdAddrDetailsReq", "CmecEPortalUpdAddrDetailsReq"), uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalUpdAddrDetailsReq.CmecEPortalUpdAddrDetailsReq.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("updateAddressDetails", _params, new javax.xml.namespace.QName("", "UpdateAddressDetailsResp"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/esb/eportal/CmecEPortalUpdAddrDetailsResp", "CmecEPortalUpdAddrDetailsResp"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/interfaces/CMECUpdateClientDetailsWebService", "updateAddressDetails"));
        _oper.setSoapAction("http://www.childmaintenance.gsi.gov.uk/futurescheme/interfaces/CMECUpdateClientDetailsWebService/updateAddressDetails");
        _myOperationsList.add(_oper);
        if (_myOperations.get("updateAddressDetails") == null) {
            _myOperations.put("updateAddressDetails", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("updateAddressDetails")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "UpdateEmploymentDetailsReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/esb/eportal/CMECEPortalUpdEmplymntDetailsRequest", "CMECEPortalUpdEmplymntDetailsRequest"), uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CMECEPortalUpdEmplymntDetailsRequest.CMECEPortalUpdEmplymntDetailsRequest.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("updateEmploymentDetails", _params, new javax.xml.namespace.QName("", "UpdateEmploymentDetailsResp"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/esb/eportal/CMECEPortalUpdEmplymntDetailsResponse", "CMECEPortalUpdEmplymntDetailsResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/interfaces/CMECUpdateClientDetailsWebService", "updateEmploymentDetails"));
        _oper.setSoapAction("http://www.childmaintenance.gsi.gov.uk/futurescheme/interfaces/CMECUpdateClientDetailsWebService/updateEmploymentDetails");
        _myOperationsList.add(_oper);
        if (_myOperations.get("updateEmploymentDetails") == null) {
            _myOperations.put("updateEmploymentDetails", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("updateEmploymentDetails")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "UpdateMOPDetailsReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/esb/eportal/CmecEPortalUpdateMOPRequest", "CmecEPortalUpdateMOPRequest"), uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalUpdateMOPRequest.CmecEPortalUpdateMOPRequest.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("updateMOPDetails", _params, new javax.xml.namespace.QName("", "UpdateMOPDetailsResp"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/esb/eportal/CmecEPortalUpdateMOPResponse", "CmecEPortalUpdateMOPResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/interfaces/CMECUpdateClientDetailsWebService", "updateMOPDetails"));
        _oper.setSoapAction("http://www.childmaintenance.gsi.gov.uk/futurescheme/interfaces/CMECUpdateClientDetailsWebService/updateMOPDetails");
        _myOperationsList.add(_oper);
        if (_myOperations.get("updateMOPDetails") == null) {
            _myOperations.put("updateMOPDetails", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("updateMOPDetails")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "UpdatePINReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/esb/eportal/CmecEPortalUpdPINRequest", "CmecEPortalUpdPINRequest"), uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalUpdPINRequest.CmecEPortalUpdPINRequest.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("updatePIN", _params, new javax.xml.namespace.QName("", "UpdatePINResp"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/esb/eportal/CmecEPortalUpdPINResponse", "CmecEPortalUpdPINResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/interfaces/CMECUpdateClientDetailsWebService", "updatePIN"));
        _oper.setSoapAction("http://www.childmaintenance.gsi.gov.uk/futurescheme/interfaces/CMECUpdateClientDetailsWebService/updatePIN");
        _myOperationsList.add(_oper);
        if (_myOperations.get("updatePIN") == null) {
            _myOperations.put("updatePIN", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("updatePIN")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "UpdateLoginStatusReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/esb/eportal/CmecEPortalUpdLoginStatusRequest", "CmecEPortalUpdLoginStatusRequest"), uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalUpdLoginStatusRequest.CmecEPortalUpdLoginStatusRequest.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("updateLoginStatus", _params, new javax.xml.namespace.QName("", "UpdateLoginStatusResp"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/esb/eportal/CmecEPortalUpdLoginStatusResponse", "CmecEPortalUpdLoginStatusResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/interfaces/CMECUpdateClientDetailsWebService", "updateLoginStatus"));
        _oper.setSoapAction("http://www.childmaintenance.gsi.gov.uk/futurescheme/interfaces/CMECUpdateClientDetailsWebService/updateLoginStatus");
        _myOperationsList.add(_oper);
        if (_myOperations.get("updateLoginStatus") == null) {
            _myOperations.put("updateLoginStatus", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("updateLoginStatus")).add(_oper);
    }

    public CMECUpdateClientDetailsWebServiceSOAPSkeleton() {
        this.impl = new uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECUpdateClientDetailsWebService.CMECUpdateClientDetailsWebServiceSOAPImpl();
    }

    public CMECUpdateClientDetailsWebServiceSOAPSkeleton(uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECUpdateClientDetailsWebService.CMECUpdateClientDetailsWebService_PortType impl) {
        this.impl = impl;
    }
    public uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalUpdCntctDetailsResponse.CmecEPortalUpdCntctDetailsResponse updateContactDetails(uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalUpdCntctDetailsRequest.CmecEPortalUpdCntctDetailsRequest updateContactDetailsReq) throws java.rmi.RemoteException
    {
        uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalUpdCntctDetailsResponse.CmecEPortalUpdCntctDetailsResponse ret = impl.updateContactDetails(updateContactDetailsReq);
        return ret;
    }

    public uk.gov.gsi.childmaintenance.www.futurescheme.bo.common.Response_xsd.Response updatePersonalDetails(uk.gov.gsi.childmaintenance.www.futurescheme.bo.common.CMECHeader_xsd.CMECHeader requestHeader, java.lang.String caseNumber, java.lang.String SCIN, uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalUpdPrsnlDetailsRequest.CmecEPortalUpdPrsnlDetailsRequestTitle title, java.lang.String newFirstName, java.lang.String newLastName, java.lang.String newMiddleName, java.lang.String newGender, java.lang.String birthDate, java.lang.String source) throws java.rmi.RemoteException
    {
        uk.gov.gsi.childmaintenance.www.futurescheme.bo.common.Response_xsd.Response ret = impl.updatePersonalDetails(requestHeader, caseNumber, SCIN, title, newFirstName, newLastName, newMiddleName, newGender, birthDate, source);
        return ret;
    }

    public uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalUpdPCMResponse.CmecEPortalUpdPCMResponse updatePreferredContactMethod(uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalUpdPCMRequest.CmecEPortalUpdPCMRequest updatePreferredContactMethodreq) throws java.rmi.RemoteException
    {
        uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalUpdPCMResponse.CmecEPortalUpdPCMResponse ret = impl.updatePreferredContactMethod(updatePreferredContactMethodreq);
        return ret;
    }

    public uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalUpdAddrDetailsResp.CmecEPortalUpdAddrDetailsResp updateAddressDetails(uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalUpdAddrDetailsReq.CmecEPortalUpdAddrDetailsReq updateAddressDetailsReq) throws java.rmi.RemoteException
    {
        uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalUpdAddrDetailsResp.CmecEPortalUpdAddrDetailsResp ret = impl.updateAddressDetails(updateAddressDetailsReq);
        return ret;
    }

    public uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CMECEPortalUpdEmplymntDetailsResponse.CMECEPortalUpdEmplymntDetailsResponse updateEmploymentDetails(uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CMECEPortalUpdEmplymntDetailsRequest.CMECEPortalUpdEmplymntDetailsRequest updateEmploymentDetailsReq) throws java.rmi.RemoteException
    {
        uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CMECEPortalUpdEmplymntDetailsResponse.CMECEPortalUpdEmplymntDetailsResponse ret = impl.updateEmploymentDetails(updateEmploymentDetailsReq);
        return ret;
    }

    public uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalUpdateMOPResponse.CmecEPortalUpdateMOPResponse updateMOPDetails(uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalUpdateMOPRequest.CmecEPortalUpdateMOPRequest updateMOPDetailsReq) throws java.rmi.RemoteException
    {
        uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalUpdateMOPResponse.CmecEPortalUpdateMOPResponse ret = impl.updateMOPDetails(updateMOPDetailsReq);
        return ret;
    }

    public uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalUpdPINResponse.CmecEPortalUpdPINResponse updatePIN(uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalUpdPINRequest.CmecEPortalUpdPINRequest updatePINReq) throws java.rmi.RemoteException
    {
        uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalUpdPINResponse.CmecEPortalUpdPINResponse ret = impl.updatePIN(updatePINReq);
        return ret;
    }

    public uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalUpdLoginStatusResponse.CmecEPortalUpdLoginStatusResponse updateLoginStatus(uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalUpdLoginStatusRequest.CmecEPortalUpdLoginStatusRequest updateLoginStatusReq) throws java.rmi.RemoteException
    {
        uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalUpdLoginStatusResponse.CmecEPortalUpdLoginStatusResponse ret = impl.updateLoginStatus(updateLoginStatusReq);
        return ret;
    }

}
