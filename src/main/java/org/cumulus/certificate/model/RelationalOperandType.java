//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2015.05.04 alle 06:00:58 PM CEST 
//


package org.cumulus.certificate.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per RelationalOperandType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="RelationalOperandType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="EvidenceRefOperand" type="{http://www.cumulus.org/certificate/model}EvidenceRefOperandType"/>
 *         &lt;element name="Constant" type="{http://www.cumulus.org/certificate/model}ConstantType"/>
 *         &lt;element name="ArithmeticExpression" type="{http://www.cumulus.org/certificate/model}ArithmeticExpressionType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelationalOperandType", propOrder = {
    "evidenceRefOperand",
    "constant",
    "arithmeticExpression"
})
public class RelationalOperandType {

    @XmlElement(name = "EvidenceRefOperand")
    protected EvidenceRefOperandType evidenceRefOperand;
    @XmlElement(name = "Constant")
    protected ConstantType constant;
    @XmlElement(name = "ArithmeticExpression")
    protected ArithmeticExpressionType arithmeticExpression;

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

}
