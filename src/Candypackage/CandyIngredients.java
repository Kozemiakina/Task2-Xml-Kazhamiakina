//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.12.01 at 10:15:37 PM MSK 
//


package Candypackage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for candyIngredients.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="candyIngredients">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="water"/>
 *     &lt;enumeration value="sugar"/>
 *     &lt;enumeration value="fructose"/>
 *     &lt;enumeration value="typeChocolate"/>
 *     &lt;enumeration value="vanillin"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "candyIngredients", namespace = "http://www.example.com/ingredients")
@XmlEnum
public enum CandyIngredients {

    @XmlEnumValue("water")
    WATER("water"),
    @XmlEnumValue("sugar")
    SUGAR("sugar"),
    @XmlEnumValue("fructose")
    FRUCTOSE("fructose"),
    @XmlEnumValue("typeChocolate")
    TYPE_CHOCOLATE("typeChocolate"),
    @XmlEnumValue("vanillin")
    VANILLIN("vanillin");
    private final String value;

    CandyIngredients(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CandyIngredients fromValue(String v) {
        for (CandyIngredients c: CandyIngredients.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

    @Override
    public String toString() {
        return "CandyIngredients{" +
                "value='" + value + '\'' +
                '}';
    }
}
