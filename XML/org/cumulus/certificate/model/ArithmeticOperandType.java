//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2015.05.04 alle 06:00:58 PM CEST 
//


package org.cumulus.certificate.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ArithmeticOperandType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ArithmeticOperandType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="evidenceRefOperand" type="{http://www.cumulus.org/certificate/model}EvidenceRefOperandType"/>
 *         &lt;element name="Constant" type="{http://www.cumulus.org/certificate/model}ConstantType"/>
 *         &lt;element name="Function">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded">
 *                   &lt;element name="ArithmeticExpression" type="{http://www.cumulus.org/certificate/model}ArithmeticExpressionType"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="name">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="MAX"/>
 *                       &lt;enumeration value="MIN"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArithmeticOperandType", propOrder = {
    "evidenceRefOperand",
    "constant",
    "function"
})
public class ArithmeticOperandType {

    protected EvidenceRefOperandType evidenceRefOperand;
    @XmlElement(name = "Constant")
    protected ConstantType constant;
    @XmlElement(name = "Function")
    protected ArithmeticOperandType.Function function;

    /**
     * Recupera il valore della proprietà evidenceRefOperand.
     * 
     * @return
     *     possible object is
     *     {@link EvidenceRefOperandType }
     *     
     */
    public EvidenceRefOperandType getEvidenceRefOperand() {
        return evidenceRefOperand;
    }

    /**
     * Imposta il valore della proprietà evidenceRefOperand.
     * 
     * @param value
     *     allowed object is
     *     {@link EvidenceRefOperandType }
     *     
     */
    public void setEvidenceRefOperand(EvidenceRefOperandType value) {
        this.evidenceRefOperand = value;
    }

    /**
     * Recupera il valore della proprietà constant.
     * 
     * @return
     *     possible object is
     *     {@link ConstantType }
     *     
     */
    public ConstantType getConstant() {
        return constant;
    }

    /**
     * Imposta il valore della proprietà constant.
     * 
     * @param value
     *     allowed object is
     *     {@link ConstantType }
     *     
     */
    public void setConstant(ConstantType value) {
        this.constant = value;
    }

    /**
     * Recupera il valore della proprietà function.
     * 
     * @return
     *     possible object is
     *     {@link ArithmeticOperandType.Function }
     *     
     */
    public ArithmeticOperandType.Function getFunction() {
        return function;
    }

    /**
     * Imposta il valore della proprietà function.
     * 
     * @param value
     *     allowed object is
     *     {@link ArithmeticOperandType.Function }
     *     
     */
    public void setFunction(ArithmeticOperandType.Function value) {
        this.function = value;
    }


    /**
     * <p>Classe Java per anonymous complex type.
     * 
     * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence maxOccurs="unbounded">
     *         &lt;element name="ArithmeticExpression" type="{http://www.cumulus.org/certificate/model}ArithmeticExpressionType"/>
     *       &lt;/sequence>
     *       &lt;attribute name="name">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="MAX"/>
     *             &lt;enumeration value="MIN"/>
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
    @XmlType(name = "", propOrder = {
        "arithmeticExpression"
    })
    public static class Function {

        @XmlElement(name = "ArithmeticExpression", required = true)
        protected List<ArithmeticExpressionType> arithmeticExpression;
        @XmlAttribute(name = "name")
        protected String name;

        /**
         * Gets the value of the arithmeticExpression property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the arithmeticExpression property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getArithmeticExpression().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ArithmeticExpressionType }
         * 
         * 
         */
        public List<ArithmeticExpressionType> getArithmeticExpression() {
            if (arithmeticExpression == null) {
                arithmeticExpression = new ArrayList<ArithmeticExpressionType>();
            }
            return this.arithmeticExpression;
        }

        /**
         * Recupera il valore della proprietà name.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Imposta il valore della proprietà name.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

    }

}
