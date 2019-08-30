/**
 * CMECCorrespondenceWebServiceBindingSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECCorrespondenceWebService;

public class CMECCorrespondenceWebServiceBindingSkeleton implements uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECCorrespondenceWebService.CMECCorrespondenceWebService, org.apache.axis.wsdl.Skeleton {
    private uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECCorrespondenceWebService.CMECCorrespondenceWebService impl;
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
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/esb/correspondence/RetrieveDocumentRequest", "retrieveDocumentRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/esb/correspondence/RetrieveDocumentRequest", "RetrieveDocumentRequest"), uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.correspondence.RetrieveDocumentRequest.RetrieveDocumentRequest.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("retrieveDocument", _params, new javax.xml.namespace.QName("http://CMECLibraryR6/uk/gov/futurescheme/cmec/bo/esb/correspondence/RetrieveDocumentResponse", "retrieveDocumentResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://CMECLibraryR6/uk/gov/futurescheme/cmec/bo/esb/correspondence/RetrieveDocumentResponse", "RetrieveDocumentResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "retrieveDocument"));
        _oper.setSoapAction("http://www.childmaintenance.gsi.gov.uk/futurescheme/interfaces/CMECCorrespondenceWebService/retrieveDocument");
        _myOperationsList.add(_oper);
        if (_myOperations.get("retrieveDocument") == null) {
            _myOperations.put("retrieveDocument", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("retrieveDocument")).add(_oper);
    }

    public CMECCorrespondenceWebServiceBindingSkeleton() {
        this.impl = new uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECCorrespondenceWebService.CMECCorrespondenceWebServiceBindingImpl();
    }

    public CMECCorrespondenceWebServiceBindingSkeleton(uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECCorrespondenceWebService.CMECCorrespondenceWebService impl) {
        this.impl = impl;
    }
    public CMECLibraryR6.uk.gov.futurescheme.cmec.bo.esb.correspondence.RetrieveDocumentResponse.RetrieveDocumentResponse retrieveDocument(uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.correspondence.RetrieveDocumentRequest.RetrieveDocumentRequest retrieveDocumentRequest) throws java.rmi.RemoteException
    {
        CMECLibraryR6.uk.gov.futurescheme.cmec.bo.esb.correspondence.RetrieveDocumentResponse.RetrieveDocumentResponse ret = impl.retrieveDocument(retrieveDocumentRequest);
        return ret;
    }

}
