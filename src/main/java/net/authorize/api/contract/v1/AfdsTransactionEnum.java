//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.11.22 at 06:00:08 PM IST 
//


package net.authorize.api.contract.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for afdsTransactionEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="afdsTransactionEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="approve"/>
 *     &lt;enumeration value="decline"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "afdsTransactionEnum")
@XmlEnum
public enum AfdsTransactionEnum {

    @XmlEnumValue("approve")
    APPROVE("approve"),
    @XmlEnumValue("decline")
    DECLINE("decline");
    private final String value;

    AfdsTransactionEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AfdsTransactionEnum fromValue(String v) {
        for (AfdsTransactionEnum c: AfdsTransactionEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
