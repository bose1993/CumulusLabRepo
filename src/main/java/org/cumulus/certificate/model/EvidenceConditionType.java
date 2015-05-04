//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2015.05.04 alle 06:00:58 PM CEST 
//


package org.cumulus.certificate.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per EvidenceConditionType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="EvidenceConditionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Operand1" type="{http://www.cumulus.org/certificate/model}RelationalOperandType"/>
 *         &lt;element name="Operand2" type="{http://www.cumulus.org/certificate/model}RelationalOperandType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="negated" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="relation" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="EQUAL-TO"/>
 *             &lt;enumeration value="NOT-EQUAL-TO"/>
 *             &lt;enumeration value="LESS-THAN"/>
 *             &lt;enumeration value="GREATER-THAN"/>
 *             &lt;enumeration value="LESS-THAN-EQUAL-TO"/>
 *             &lt;enumeration value="GREATER-THAN-EQUAL-TO"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EvidenceConditionType", propOrder = {
    "operand1",
    "operand2"
})
public class EvidenceConditionType {

    @XmlElement(name = "Operand1", required = true)
    protected RelationalOperandType operand1;
    @XmlElement(name = "Operand2", required = true)
    protected RelationalOperandType operand2;
    @XmlAttribute(name = "negated")
    protected Boolean negated;
    @XmlAttribute(name = "relation", required = true)
    protected String relation;

    /**
     * Recupera il valore della proprietà operand1.
     * 
     * @return
     *     possible object is
     *     {@link RelationalOperandType }
     *     
     */
    public RelationalOperandType getOperand1() {
        return operand1;
    }

    /**
     * Imposta il valore della proprietà operand1.
     * 
     * @param value
     *     allowed object is
     *     {@link RelationalOperandType }
     *     
     */
    public void setOperand1(RelationalOperandType value) {
        this.operand1 = value;
    }

    /**
     * Recupera il valore della proprietà operand2.
     * 
     * @return
     *     possible object is
     *     {@link RelationalOperandType }
     *     
     */
    public RelationalOperandType getOperand2() {
        return operand2;
    }

    /**
     * Imposta il valore della proprietà operand2.
     * 
     * @param value
     *     allowed object is
     *     {@link RelationalOperandType }
     *     
     */
    public void setOperand2(RelationalOperandType value) {
        this.operand2 = value;
    }

    /**
     * Recupera il valore della proprietà negated.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isNegated() {
        if (negated == null) {
            return false;
        } else {
            return negated;
        }
    }

    /**
     * Imposta il valore della proprietà negated.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNegated(Boolean value) {
        this.negated = value;
    }

    /**
     * Recupera il valore della proprietà relation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelation() {
        return relation;
    }

    /**
     * Imposta il valore della proprietà relation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelation(String value) {
        this.relation = value;
    }

}
