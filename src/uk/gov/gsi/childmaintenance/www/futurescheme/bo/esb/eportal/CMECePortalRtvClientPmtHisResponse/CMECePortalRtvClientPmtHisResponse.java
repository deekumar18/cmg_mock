/**
 * CMECePortalRtvClientPmtHisResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CMECePortalRtvClientPmtHisResponse;

public class CMECePortalRtvClientPmtHisResponse  implements java.io.Serializable {
    private uk.gov.gsi.childmaintenance.www.futurescheme.bo.common.Response_xsd.Response responseHeader;

    private java.lang.String startDate;

    private java.lang.String endDate;

    private java.lang.String openingBal;

    private java.lang.String paymentsDue;

    private java.lang.String paymentsMade;

    private java.lang.String chqReturned;

    private java.lang.String pendingWrtOff;

    private java.lang.String compPayment;

    private java.lang.String closingBal;

    private java.lang.String actvResArr;

    private java.lang.String suspResArr;

    private java.lang.String deferResArr;

    private java.lang.String collChrgApplied;

    private java.lang.String collChrgPaid;

    private java.lang.String collChrgRemaining;

    private java.lang.String collChrgAutoSatisfied;

    private java.lang.String collChrgSaved;

    private java.lang.String enfChrg;

    private java.lang.String totalArreasSusp;

    private java.lang.String wrtnOffAmt;

    private uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CMECePortalRtvClientPmtHistoryDetails.CMECePortalRtvClientPmtHistoryDetails[] clientPmtHistory;

    public CMECePortalRtvClientPmtHisResponse() {
    }

    public CMECePortalRtvClientPmtHisResponse(
           uk.gov.gsi.childmaintenance.www.futurescheme.bo.common.Response_xsd.Response responseHeader,
           java.lang.String startDate,
           java.lang.String endDate,
           java.lang.String openingBal,
           java.lang.String paymentsDue,
           java.lang.String paymentsMade,
           java.lang.String chqReturned,
           java.lang.String pendingWrtOff,
           java.lang.String compPayment,
           java.lang.String closingBal,
           java.lang.String actvResArr,
           java.lang.String suspResArr,
           java.lang.String deferResArr,
           java.lang.String collChrgApplied,
           java.lang.String collChrgPaid,
           java.lang.String collChrgRemaining,
           java.lang.String collChrgAutoSatisfied,
           java.lang.String collChrgSaved,
           java.lang.String enfChrg,
           java.lang.String totalArreasSusp,
           java.lang.String wrtnOffAmt,
           uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CMECePortalRtvClientPmtHistoryDetails.CMECePortalRtvClientPmtHistoryDetails[] clientPmtHistory) {
           this.responseHeader = responseHeader;
           this.startDate = startDate;
           this.endDate = endDate;
           this.openingBal = openingBal;
           this.paymentsDue = paymentsDue;
           this.paymentsMade = paymentsMade;
           this.chqReturned = chqReturned;
           this.pendingWrtOff = pendingWrtOff;
           this.compPayment = compPayment;
           this.closingBal = closingBal;
           this.actvResArr = actvResArr;
           this.suspResArr = suspResArr;
           this.deferResArr = deferResArr;
           this.collChrgApplied = collChrgApplied;
           this.collChrgPaid = collChrgPaid;
           this.collChrgRemaining = collChrgRemaining;
           this.collChrgAutoSatisfied = collChrgAutoSatisfied;
           this.collChrgSaved = collChrgSaved;
           this.enfChrg = enfChrg;
           this.totalArreasSusp = totalArreasSusp;
           this.wrtnOffAmt = wrtnOffAmt;
           this.clientPmtHistory = clientPmtHistory;
    }


    /**
     * Gets the responseHeader value for this CMECePortalRtvClientPmtHisResponse.
     * 
     * @return responseHeader
     */
    public uk.gov.gsi.childmaintenance.www.futurescheme.bo.common.Response_xsd.Response getResponseHeader() {
        return responseHeader;
    }


    /**
     * Sets the responseHeader value for this CMECePortalRtvClientPmtHisResponse.
     * 
     * @param responseHeader
     */
    public void setResponseHeader(uk.gov.gsi.childmaintenance.www.futurescheme.bo.common.Response_xsd.Response responseHeader) {
        this.responseHeader = responseHeader;
    }


    /**
     * Gets the startDate value for this CMECePortalRtvClientPmtHisResponse.
     * 
     * @return startDate
     */
    public java.lang.String getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this CMECePortalRtvClientPmtHisResponse.
     * 
     * @param startDate
     */
    public void setStartDate(java.lang.String startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the endDate value for this CMECePortalRtvClientPmtHisResponse.
     * 
     * @return endDate
     */
    public java.lang.String getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this CMECePortalRtvClientPmtHisResponse.
     * 
     * @param endDate
     */
    public void setEndDate(java.lang.String endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the openingBal value for this CMECePortalRtvClientPmtHisResponse.
     * 
     * @return openingBal
     */
    public java.lang.String getOpeningBal() {
        return openingBal;
    }


    /**
     * Sets the openingBal value for this CMECePortalRtvClientPmtHisResponse.
     * 
     * @param openingBal
     */
    public void setOpeningBal(java.lang.String openingBal) {
        this.openingBal = openingBal;
    }


    /**
     * Gets the paymentsDue value for this CMECePortalRtvClientPmtHisResponse.
     * 
     * @return paymentsDue
     */
    public java.lang.String getPaymentsDue() {
        return paymentsDue;
    }


    /**
     * Sets the paymentsDue value for this CMECePortalRtvClientPmtHisResponse.
     * 
     * @param paymentsDue
     */
    public void setPaymentsDue(java.lang.String paymentsDue) {
        this.paymentsDue = paymentsDue;
    }


    /**
     * Gets the paymentsMade value for this CMECePortalRtvClientPmtHisResponse.
     * 
     * @return paymentsMade
     */
    public java.lang.String getPaymentsMade() {
        return paymentsMade;
    }


    /**
     * Sets the paymentsMade value for this CMECePortalRtvClientPmtHisResponse.
     * 
     * @param paymentsMade
     */
    public void setPaymentsMade(java.lang.String paymentsMade) {
        this.paymentsMade = paymentsMade;
    }


    /**
     * Gets the chqReturned value for this CMECePortalRtvClientPmtHisResponse.
     * 
     * @return chqReturned
     */
    public java.lang.String getChqReturned() {
        return chqReturned;
    }


    /**
     * Sets the chqReturned value for this CMECePortalRtvClientPmtHisResponse.
     * 
     * @param chqReturned
     */
    public void setChqReturned(java.lang.String chqReturned) {
        this.chqReturned = chqReturned;
    }


    /**
     * Gets the pendingWrtOff value for this CMECePortalRtvClientPmtHisResponse.
     * 
     * @return pendingWrtOff
     */
    public java.lang.String getPendingWrtOff() {
        return pendingWrtOff;
    }


    /**
     * Sets the pendingWrtOff value for this CMECePortalRtvClientPmtHisResponse.
     * 
     * @param pendingWrtOff
     */
    public void setPendingWrtOff(java.lang.String pendingWrtOff) {
        this.pendingWrtOff = pendingWrtOff;
    }


    /**
     * Gets the compPayment value for this CMECePortalRtvClientPmtHisResponse.
     * 
     * @return compPayment
     */
    public java.lang.String getCompPayment() {
        return compPayment;
    }


    /**
     * Sets the compPayment value for this CMECePortalRtvClientPmtHisResponse.
     * 
     * @param compPayment
     */
    public void setCompPayment(java.lang.String compPayment) {
        this.compPayment = compPayment;
    }


    /**
     * Gets the closingBal value for this CMECePortalRtvClientPmtHisResponse.
     * 
     * @return closingBal
     */
    public java.lang.String getClosingBal() {
        return closingBal;
    }


    /**
     * Sets the closingBal value for this CMECePortalRtvClientPmtHisResponse.
     * 
     * @param closingBal
     */
    public void setClosingBal(java.lang.String closingBal) {
        this.closingBal = closingBal;
    }


    /**
     * Gets the actvResArr value for this CMECePortalRtvClientPmtHisResponse.
     * 
     * @return actvResArr
     */
    public java.lang.String getActvResArr() {
        return actvResArr;
    }


    /**
     * Sets the actvResArr value for this CMECePortalRtvClientPmtHisResponse.
     * 
     * @param actvResArr
     */
    public void setActvResArr(java.lang.String actvResArr) {
        this.actvResArr = actvResArr;
    }


    /**
     * Gets the suspResArr value for this CMECePortalRtvClientPmtHisResponse.
     * 
     * @return suspResArr
     */
    public java.lang.String getSuspResArr() {
        return suspResArr;
    }


    /**
     * Sets the suspResArr value for this CMECePortalRtvClientPmtHisResponse.
     * 
     * @param suspResArr
     */
    public void setSuspResArr(java.lang.String suspResArr) {
        this.suspResArr = suspResArr;
    }


    /**
     * Gets the deferResArr value for this CMECePortalRtvClientPmtHisResponse.
     * 
     * @return deferResArr
     */
    public java.lang.String getDeferResArr() {
        return deferResArr;
    }


    /**
     * Sets the deferResArr value for this CMECePortalRtvClientPmtHisResponse.
     * 
     * @param deferResArr
     */
    public void setDeferResArr(java.lang.String deferResArr) {
        this.deferResArr = deferResArr;
    }


    /**
     * Gets the collChrgApplied value for this CMECePortalRtvClientPmtHisResponse.
     * 
     * @return collChrgApplied
     */
    public java.lang.String getCollChrgApplied() {
        return collChrgApplied;
    }


    /**
     * Sets the collChrgApplied value for this CMECePortalRtvClientPmtHisResponse.
     * 
     * @param collChrgApplied
     */
    public void setCollChrgApplied(java.lang.String collChrgApplied) {
        this.collChrgApplied = collChrgApplied;
    }


    /**
     * Gets the collChrgPaid value for this CMECePortalRtvClientPmtHisResponse.
     * 
     * @return collChrgPaid
     */
    public java.lang.String getCollChrgPaid() {
        return collChrgPaid;
    }


    /**
     * Sets the collChrgPaid value for this CMECePortalRtvClientPmtHisResponse.
     * 
     * @param collChrgPaid
     */
    public void setCollChrgPaid(java.lang.String collChrgPaid) {
        this.collChrgPaid = collChrgPaid;
    }


    /**
     * Gets the collChrgRemaining value for this CMECePortalRtvClientPmtHisResponse.
     * 
     * @return collChrgRemaining
     */
    public java.lang.String getCollChrgRemaining() {
        return collChrgRemaining;
    }


    /**
     * Sets the collChrgRemaining value for this CMECePortalRtvClientPmtHisResponse.
     * 
     * @param collChrgRemaining
     */
    public void setCollChrgRemaining(java.lang.String collChrgRemaining) {
        this.collChrgRemaining = collChrgRemaining;
    }


    /**
     * Gets the collChrgAutoSatisfied value for this CMECePortalRtvClientPmtHisResponse.
     * 
     * @return collChrgAutoSatisfied
     */
    public java.lang.String getCollChrgAutoSatisfied() {
        return collChrgAutoSatisfied;
    }


    /**
     * Sets the collChrgAutoSatisfied value for this CMECePortalRtvClientPmtHisResponse.
     * 
     * @param collChrgAutoSatisfied
     */
    public void setCollChrgAutoSatisfied(java.lang.String collChrgAutoSatisfied) {
        this.collChrgAutoSatisfied = collChrgAutoSatisfied;
    }


    /**
     * Gets the collChrgSaved value for this CMECePortalRtvClientPmtHisResponse.
     * 
     * @return collChrgSaved
     */
    public java.lang.String getCollChrgSaved() {
        return collChrgSaved;
    }


    /**
     * Sets the collChrgSaved value for this CMECePortalRtvClientPmtHisResponse.
     * 
     * @param collChrgSaved
     */
    public void setCollChrgSaved(java.lang.String collChrgSaved) {
        this.collChrgSaved = collChrgSaved;
    }


    /**
     * Gets the enfChrg value for this CMECePortalRtvClientPmtHisResponse.
     * 
     * @return enfChrg
     */
    public java.lang.String getEnfChrg() {
        return enfChrg;
    }


    /**
     * Sets the enfChrg value for this CMECePortalRtvClientPmtHisResponse.
     * 
     * @param enfChrg
     */
    public void setEnfChrg(java.lang.String enfChrg) {
        this.enfChrg = enfChrg;
    }


    /**
     * Gets the totalArreasSusp value for this CMECePortalRtvClientPmtHisResponse.
     * 
     * @return totalArreasSusp
     */
    public java.lang.String getTotalArreasSusp() {
        return totalArreasSusp;
    }


    /**
     * Sets the totalArreasSusp value for this CMECePortalRtvClientPmtHisResponse.
     * 
     * @param totalArreasSusp
     */
    public void setTotalArreasSusp(java.lang.String totalArreasSusp) {
        this.totalArreasSusp = totalArreasSusp;
    }


    /**
     * Gets the wrtnOffAmt value for this CMECePortalRtvClientPmtHisResponse.
     * 
     * @return wrtnOffAmt
     */
    public java.lang.String getWrtnOffAmt() {
        return wrtnOffAmt;
    }


    /**
     * Sets the wrtnOffAmt value for this CMECePortalRtvClientPmtHisResponse.
     * 
     * @param wrtnOffAmt
     */
    public void setWrtnOffAmt(java.lang.String wrtnOffAmt) {
        this.wrtnOffAmt = wrtnOffAmt;
    }


    /**
     * Gets the clientPmtHistory value for this CMECePortalRtvClientPmtHisResponse.
     * 
     * @return clientPmtHistory
     */
    public uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CMECePortalRtvClientPmtHistoryDetails.CMECePortalRtvClientPmtHistoryDetails[] getClientPmtHistory() {
        return clientPmtHistory;
    }


    /**
     * Sets the clientPmtHistory value for this CMECePortalRtvClientPmtHisResponse.
     * 
     * @param clientPmtHistory
     */
    public void setClientPmtHistory(uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CMECePortalRtvClientPmtHistoryDetails.CMECePortalRtvClientPmtHistoryDetails[] clientPmtHistory) {
        this.clientPmtHistory = clientPmtHistory;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CMECePortalRtvClientPmtHisResponse)) return false;
        CMECePortalRtvClientPmtHisResponse other = (CMECePortalRtvClientPmtHisResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.responseHeader==null && other.getResponseHeader()==null) || 
             (this.responseHeader!=null &&
              this.responseHeader.equals(other.getResponseHeader()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.openingBal==null && other.getOpeningBal()==null) || 
             (this.openingBal!=null &&
              this.openingBal.equals(other.getOpeningBal()))) &&
            ((this.paymentsDue==null && other.getPaymentsDue()==null) || 
             (this.paymentsDue!=null &&
              this.paymentsDue.equals(other.getPaymentsDue()))) &&
            ((this.paymentsMade==null && other.getPaymentsMade()==null) || 
             (this.paymentsMade!=null &&
              this.paymentsMade.equals(other.getPaymentsMade()))) &&
            ((this.chqReturned==null && other.getChqReturned()==null) || 
             (this.chqReturned!=null &&
              this.chqReturned.equals(other.getChqReturned()))) &&
            ((this.pendingWrtOff==null && other.getPendingWrtOff()==null) || 
             (this.pendingWrtOff!=null &&
              this.pendingWrtOff.equals(other.getPendingWrtOff()))) &&
            ((this.compPayment==null && other.getCompPayment()==null) || 
             (this.compPayment!=null &&
              this.compPayment.equals(other.getCompPayment()))) &&
            ((this.closingBal==null && other.getClosingBal()==null) || 
             (this.closingBal!=null &&
              this.closingBal.equals(other.getClosingBal()))) &&
            ((this.actvResArr==null && other.getActvResArr()==null) || 
             (this.actvResArr!=null &&
              this.actvResArr.equals(other.getActvResArr()))) &&
            ((this.suspResArr==null && other.getSuspResArr()==null) || 
             (this.suspResArr!=null &&
              this.suspResArr.equals(other.getSuspResArr()))) &&
            ((this.deferResArr==null && other.getDeferResArr()==null) || 
             (this.deferResArr!=null &&
              this.deferResArr.equals(other.getDeferResArr()))) &&
            ((this.collChrgApplied==null && other.getCollChrgApplied()==null) || 
             (this.collChrgApplied!=null &&
              this.collChrgApplied.equals(other.getCollChrgApplied()))) &&
            ((this.collChrgPaid==null && other.getCollChrgPaid()==null) || 
             (this.collChrgPaid!=null &&
              this.collChrgPaid.equals(other.getCollChrgPaid()))) &&
            ((this.collChrgRemaining==null && other.getCollChrgRemaining()==null) || 
             (this.collChrgRemaining!=null &&
              this.collChrgRemaining.equals(other.getCollChrgRemaining()))) &&
            ((this.collChrgAutoSatisfied==null && other.getCollChrgAutoSatisfied()==null) || 
             (this.collChrgAutoSatisfied!=null &&
              this.collChrgAutoSatisfied.equals(other.getCollChrgAutoSatisfied()))) &&
            ((this.collChrgSaved==null && other.getCollChrgSaved()==null) || 
             (this.collChrgSaved!=null &&
              this.collChrgSaved.equals(other.getCollChrgSaved()))) &&
            ((this.enfChrg==null && other.getEnfChrg()==null) || 
             (this.enfChrg!=null &&
              this.enfChrg.equals(other.getEnfChrg()))) &&
            ((this.totalArreasSusp==null && other.getTotalArreasSusp()==null) || 
             (this.totalArreasSusp!=null &&
              this.totalArreasSusp.equals(other.getTotalArreasSusp()))) &&
            ((this.wrtnOffAmt==null && other.getWrtnOffAmt()==null) || 
             (this.wrtnOffAmt!=null &&
              this.wrtnOffAmt.equals(other.getWrtnOffAmt()))) &&
            ((this.clientPmtHistory==null && other.getClientPmtHistory()==null) || 
             (this.clientPmtHistory!=null &&
              java.util.Arrays.equals(this.clientPmtHistory, other.getClientPmtHistory())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getResponseHeader() != null) {
            _hashCode += getResponseHeader().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getOpeningBal() != null) {
            _hashCode += getOpeningBal().hashCode();
        }
        if (getPaymentsDue() != null) {
            _hashCode += getPaymentsDue().hashCode();
        }
        if (getPaymentsMade() != null) {
            _hashCode += getPaymentsMade().hashCode();
        }
        if (getChqReturned() != null) {
            _hashCode += getChqReturned().hashCode();
        }
        if (getPendingWrtOff() != null) {
            _hashCode += getPendingWrtOff().hashCode();
        }
        if (getCompPayment() != null) {
            _hashCode += getCompPayment().hashCode();
        }
        if (getClosingBal() != null) {
            _hashCode += getClosingBal().hashCode();
        }
        if (getActvResArr() != null) {
            _hashCode += getActvResArr().hashCode();
        }
        if (getSuspResArr() != null) {
            _hashCode += getSuspResArr().hashCode();
        }
        if (getDeferResArr() != null) {
            _hashCode += getDeferResArr().hashCode();
        }
        if (getCollChrgApplied() != null) {
            _hashCode += getCollChrgApplied().hashCode();
        }
        if (getCollChrgPaid() != null) {
            _hashCode += getCollChrgPaid().hashCode();
        }
        if (getCollChrgRemaining() != null) {
            _hashCode += getCollChrgRemaining().hashCode();
        }
        if (getCollChrgAutoSatisfied() != null) {
            _hashCode += getCollChrgAutoSatisfied().hashCode();
        }
        if (getCollChrgSaved() != null) {
            _hashCode += getCollChrgSaved().hashCode();
        }
        if (getEnfChrg() != null) {
            _hashCode += getEnfChrg().hashCode();
        }
        if (getTotalArreasSusp() != null) {
            _hashCode += getTotalArreasSusp().hashCode();
        }
        if (getWrtnOffAmt() != null) {
            _hashCode += getWrtnOffAmt().hashCode();
        }
        if (getClientPmtHistory() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getClientPmtHistory());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getClientPmtHistory(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CMECePortalRtvClientPmtHisResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/esb/eportal/CMECePortalRtvClientPmtHisResponse", "CMECePortalRtvClientPmtHisResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ResponseHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/common/Response.xsd", "Response"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "StartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("openingBal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OpeningBal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentsDue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PaymentsDue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentsMade");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PaymentsMade"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chqReturned");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ChqReturned"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pendingWrtOff");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PendingWrtOff"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("compPayment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CompPayment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("closingBal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ClosingBal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actvResArr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ActvResArr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("suspResArr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SuspResArr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deferResArr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DeferResArr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("collChrgApplied");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CollChrgApplied"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("collChrgPaid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CollChrgPaid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("collChrgRemaining");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CollChrgRemaining"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("collChrgAutoSatisfied");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CollChrgAutoSatisfied"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("collChrgSaved");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CollChrgSaved"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enfChrg");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EnfChrg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalArreasSusp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TotalArreasSusp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wrtnOffAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "WrtnOffAmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientPmtHistory");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ClientPmtHistory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/esb/eportal/CMECePortalRtvClientPmtHistoryDetails", "CMECePortalRtvClientPmtHistoryDetails"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "ClientPmtHisDetails"));
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
