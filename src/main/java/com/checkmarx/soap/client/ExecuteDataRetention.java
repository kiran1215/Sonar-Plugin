/**
 * ExecuteDataRetention.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.checkmarx.soap.client;

public class ExecuteDataRetention  implements java.io.Serializable {
    private String sessionID;

    private CxDataRetentionConfiguration dataRetentionConfiguration;

    public ExecuteDataRetention() {
    }

    public ExecuteDataRetention(
           String sessionID,
           CxDataRetentionConfiguration dataRetentionConfiguration) {
           this.sessionID = sessionID;
           this.dataRetentionConfiguration = dataRetentionConfiguration;
    }


    /**
     * Gets the sessionID value for this ExecuteDataRetention.
     *
     * @return sessionID
     */
    public String getSessionID() {
        return sessionID;
    }


    /**
     * Sets the sessionID value for this ExecuteDataRetention.
     *
     * @param sessionID
     */
    public void setSessionID(String sessionID) {
        this.sessionID = sessionID;
    }


    /**
     * Gets the dataRetentionConfiguration value for this ExecuteDataRetention.
     *
     * @return dataRetentionConfiguration
     */
    public CxDataRetentionConfiguration getDataRetentionConfiguration() {
        return dataRetentionConfiguration;
    }


    /**
     * Sets the dataRetentionConfiguration value for this ExecuteDataRetention.
     *
     * @param dataRetentionConfiguration
     */
    public void setDataRetentionConfiguration(CxDataRetentionConfiguration dataRetentionConfiguration) {
        this.dataRetentionConfiguration = dataRetentionConfiguration;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ExecuteDataRetention)) return false;
        ExecuteDataRetention other = (ExecuteDataRetention) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
            ((this.sessionID==null && other.getSessionID()==null) ||
             (this.sessionID!=null &&
              this.sessionID.equals(other.getSessionID()))) &&
            ((this.dataRetentionConfiguration==null && other.getDataRetentionConfiguration()==null) ||
             (this.dataRetentionConfiguration!=null &&
              this.dataRetentionConfiguration.equals(other.getDataRetentionConfiguration())));
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
        if (getSessionID() != null) {
            _hashCode += getSessionID().hashCode();
        }
        if (getDataRetentionConfiguration() != null) {
            _hashCode += getDataRetentionConfiguration().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExecuteDataRetention.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://Checkmarx.com/v7", ">ExecuteDataRetention"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Checkmarx.com/v7", "SessionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataRetentionConfiguration");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Checkmarx.com/v7", "dataRetentionConfiguration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://Checkmarx.com/v7", "CxDataRetentionConfiguration"));
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
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}