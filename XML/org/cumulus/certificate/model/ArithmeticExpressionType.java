//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2015.04.28 alle 02:17:59 PM CEST 
//


package org.cumulus.certificate.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ArithmeticExpressionType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ArithmeticExpressionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="ArithmeticOperand" type="{http://www.cumulus.org/certificate/model}ArithmeticOperandType"/>
 *           &lt;element name="ArithmeticExpression" type="{http://www.cumulus.org/certificate/model}ArithmeticExpressionType"/>
 *         &lt;/choice>
 *         &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="ArithmeticOperator">
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                 &lt;enumeration value="PLUS"/>
 *                 &lt;enumeration value="MINUS"/>
 *                 &lt;enumeration value="MULTIPLY"/>
 *                 &lt;enumeration value="DIVIDE"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/element>
 *           &lt;choice>
 *             &lt;element name="ArithmeticOperand" type="{http://www.cumulus.org/certificate/model}ArithmeticOperandType"/>
 *             &lt;element name="ArithmeticExpression" type="{http://www.cumulus.org/certificate/model}ArithmeticExpressionType"/>
 *           &lt;/choice>
 *         &lt;/sequence>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArithmeticExpressionType", propOrder = {
    "arithmeticOperandChoice",
    "arithmeticExpression",
    "arithmeticOperatorAndArithmeticOperandOrArithmeticExpression"
})
public class ArithmeticExpressionType {

    @XmlElement(name = "ArithmeticOperand")
    protected ArithmeticOperandType arithmeticOperandChoice;
    @XmlElement(name = "ArithmeticExpression")
    protected ArithmeticExpressionType arithmeticExpression;
    @XmlElements({
        @XmlElement(name = "ArithmeticOperator", type = String.class),
        @XmlElement(name = "ArithmeticOperand", type = ArithmeticOperandType.class),
        @XmlElement(name = "ArithmeticExpression", type = ArithmeticExpressionType.class)
    })
    protected List<Object> arithmeticOperatorAndArithmeticOperandOrArithmeticExpression;

    /**
     * Recupera il valore della proprietà arithmeticOperandChoice.
     * 
     * @return
     *     possible object is
     *     {@link ArithmeticOperandType }
     *     
     */
    public ArithmeticOperandType getArithmeticOperandChoice() {
        return arithmeticOperandChoice;
    }

    /**
     * Imposta il valore della proprietà arithmeticOperandChoice.
     * 
     * @param value
     *     allowed object is
     *     {@link ArithmeticOperandType }
     *     
     */
    public void setArithmeticOperandChoice(ArithmeticOperandType value) {
        this.arithmeticOperandChoice = value;
    }

    /**
     * Recupera il valore della proprietà arithmeticExpression.
     * 
     * @return
     *     possible object is
     *     {@link ArithmeticExpressionType }
     *     
     */
    public ArithmeticExpressionType getArithmeticExpression() {
        return arithmeticExpression;
    }

    /**
     * Imposta il valore della proprietà arithmeticExpression.
     * 
     * @param value
     *     allowed object is
     *     {@link ArithmeticExpressionType }
     *     
     */
    public void setArithmeticExpression(ArithmeticExpressionType value) {
        this.arithmeticExpression = value;
    }

    /**
     * Gets the value of the arithmeticOperatorAndArithmeticOperandOrArithmeticExpression property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the arithmeticOperatorAndArithmeticOperandOrArithmeticExpression property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArithmeticOperatorAndArithmeticOperandOrArithmeticExpression().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * {@link ArithmeticOperandType }
     * {@link ArithmeticExpressionType }
     * 
     * 
     */
    public List<Object> getArithmeticOperatorAndArithmeticOperandOrArithmeticExpression() {
        if (arithmeticOperatorAndArithmeticOperandOrArithmeticExpression == null) {
            arithmeticOperatorAndArithmeticOperandOrArithmeticExpression = new ArrayList<Object>();
        }
        return this.arithmeticOperatorAndArithmeticOperandOrArithmeticExpression;
    }

}
