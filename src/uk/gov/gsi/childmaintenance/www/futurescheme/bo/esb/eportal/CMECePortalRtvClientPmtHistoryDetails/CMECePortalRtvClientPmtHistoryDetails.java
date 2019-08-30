/**
 * CMECePortalRtvClientPmtHistoryDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CMECePortalRtvClientPmtHistoryDetails;

public class CMECePortalRtvClientPmtHistoryDetails  implements java.io.Serializable {
    private java.lang.String transactionDate;

    private java.lang.String debitAmt;

    private java.lang.String creditAmt;

    private java.lang.String description;

    private java.lang.String balance;

    public CMECePortalRtvClientPmtHistoryDetails() {
    }

    public CMECePortalRtvClientPmtHistoryDetails(
           java.lang.String transactionDate,
           java.lang.String debitAmt,
           java.lang.String creditAmt,
           java.lang.String description,
           java.lang.String balance) {
           this.transactionDate = transactionDate;
           this.debitAmt = debitAmt;
           this.creditAmt = creditAmt;
           this.description = description;
           this.balance = balance;
    }


    /**
     * Gets the transactionDate value for this CMECePortalRtvClientPmtHistoryDetails.
     * 
     * @return transactionDate
     */
    public java.lang.String getTransactionDate() {
        return transactionDate;
    }


    /**
     * Sets the transactionDate value for this CMECePortalRtvClientPmtHistoryDetails.
     * 
     * @param transactionDate
     */
    public void setTransactionDate(java.lang.String transactionDate) {
        this.transactionDate = transactionDate;
    }


    /**
     * Gets the debitAmt value for this CMECePortalRtvClientPmtHistoryDetails.
     * 
     * @return debitAmt
     */
    public java.lang.String getDebitAmt() {
        return debitAmt;
    }


    /**
     * Sets the debitAmt value for this CMECePortalRtvClientPmtHistoryDetails.
     * 
     * @param debitAmt
     */
    public void setDebitAmt(java.lang.String debitAmt) {
        this.debitAmt = debitAmt;
    }


    /**
     * Gets the creditAmt value for this CMECePortalRtvClientPmtHistoryDetails.
     * 
     * @return creditAmt
     */
    public java.lang.String getCreditAmt() {
        return creditAmt;
    }


    /**
     * Sets the creditAmt value for this CMECePortalRtvClientPmtHistoryDetails.
     * 
     * @param creditAmt
     */
    public void setCreditAmt(java.lang.String creditAmt) {
        this.creditAmt = creditAmt;
    }


    /**
     * Gets the description value for this CMECePortalRtvClientPmtHistoryDetails.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this CMECePortalRtvClientPmtHistoryDetails.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the balance value for this CMECePortalRtvClientPmtHistoryDetails.
     * 
     * @return balance
     */
    public java.lang.String getBalance() {
        return balance;
    }


    /**
     * Sets the balance value for this CMECePortalRtvClientPmtHistoryDetails.
     * 
     * @param balance
     */
    public void setBalance(java.lang.String balance) {
        this.balance = balance;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CMECePortalRtvClientPmtHistoryDetails)) return false;
        CMECePortalRtvClientPmtHistoryDetails other = (CMECePortalRtvClientPmtHistoryDetails) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.transactionDate==null && other.getTransactionDate()==null) || 
             (this.transactionDate!=null &&
              this.transactionDate.equals(other.getTransactionDate()))) &&
            ((this.debitAmt==null && other.getDebitAmt()==null) || 
             (this.debitAmt!=null &&
              this.debitAmt.equals(other.getDebitAmt()))) &&
            ((this.creditAmt==null && other.getCreditAmt()==null) || 
             (this.creditAmt!=null &&
              this.creditAmt.equals(other.getCreditAmt()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.balance==null && other.getBalance()==null) || 
             (this.balance!=null &&
              this.balance.equals(other.getBalance())));
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
        if (getTransactionDate() != null) {
            _hashCode += getTransactionDate().hashCode();
        }
        if (getDebitAmt() != null) {
            _hashCode += getDebitAmt().hashCode();
        }
        if (getCreditAmt() != null) {
            _hashCode += getCreditAmt().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getBalance() != null) {
            _hashCode += getBalance().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CMECePortalRtvClientPmtHistoryDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/esb/eportal/CMECePortalRtvClientPmtHistoryDetails", "CMECePortalRtvClientPmtHistoryDetails"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TransactionDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("debitAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DebitAmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CreditAmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Balance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
