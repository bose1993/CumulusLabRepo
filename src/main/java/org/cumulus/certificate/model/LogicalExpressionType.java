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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per LogicalExpressionType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="LogicalExpressionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="Condition" type="{http://www.cumulus.org/certificate/model}ConditionType"/>
 *           &lt;element name="LogicalExpression" type="{http://www.cumulus.org/certificate/model}LogicalExpressionType"/>
 *         &lt;/choice>
 *         &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="LogicalOperator">
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                 &lt;enumeration value="AND"/>
 *                 &lt;enumeration value="OR"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/element>
 *           &lt;element name="LogicalExpression" type="{http://www.cumulus.org/certificate/model}LogicalExpressionType"/>
 *         &lt;/sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="negated" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LogicalExpressionType", propOrder = {
    "condition",
    "logicalExpressionRoot",
    "logicalOperatorAndLogicalExpression"
})
public class LogicalExpressionType {

    @XmlElement(name = "Condition")
    protected ConditionType condition;
    @XmlElement(name = "LogicalExpression")
    protected LogicalExpressionType logicalExpressionRoot;
    @XmlElements({
        @XmlElement(name = "LogicalOperator", type = String.class),
        @XmlElement(name = "LogicalExpression", type = LogicalExpressionType.class)
    })
    protected List<Object> logicalOperatorAndLogicalExpression;
    @XmlAttribute(name = "negated")
    protected Boolean negated;

    /**
     * Recupera il valore della proprietà condition.
     * 
     * @return
     *     possible object is
     *     {@link ConditionType }
     *     
     */
    public ConditionType getCondition() {
        return condition;
    }

    /**
     * Imposta il valore della proprietà condition.
     * 
     * @param value
     *     allowed object is
     *     {@link ConditionType }
     *     
     */
    public void setCondition(ConditionType value) {
        this.condition = value;
    }

    /**
     * Recupera il valore della proprietà logicalExpressionRoot.
     * 
     * @return
     *     possible object is
     *     {@link LogicalExpressionType }
     *     
     */
    public LogicalExpressionType getLogicalExpressionRoot() {
        return logicalExpressionRoot;
    }

    /**
     * Imposta il valore della proprietà logicalExpressionRoot.
     * 
     * @param value
     *     allowed object is
     *     {@link LogicalExpressionType }
     *     
     */
    public void setLogicalExpressionRoot(LogicalExpressionType value) {
        this.logicalExpressionRoot = value;
    }

    /**
     * Gets the value of the logicalOperatorAndLogicalExpression property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the logicalOperatorAndLogicalExpression property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLogicalOperatorAndLogicalExpression().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * {@link LogicalExpressionType }
     * 
     * 
     */
    public List<Object> getLogicalOperatorAndLogicalExpression() {
        if (logicalOperatorAndLogicalExpression == null) {
            logicalOperatorAndLogicalExpression = new ArrayList<Object>();
        }
        return this.logicalOperatorAndLogicalExpression;
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

}
