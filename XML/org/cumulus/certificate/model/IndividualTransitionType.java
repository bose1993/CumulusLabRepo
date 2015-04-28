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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per IndividualTransitionType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="IndividualTransitionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="WhenCondition" type="{http://www.cumulus.org/certificate/model}LogicalExpressionType" minOccurs="0"/>
 *           &lt;element name="CallEvent" type="{http://www.cumulus.org/certificate/model}OperationRefType" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="GuardCondition" type="{http://www.cumulus.org/certificate/model}LogicalExpressionType" minOccurs="0"/>
 *         &lt;element name="action" type="{http://www.cumulus.org/certificate/model}ActionType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="From" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="To" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Probability" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="Deviation" type="{http://www.w3.org/2001/XMLSchema}float" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndividualTransitionType", propOrder = {
    "whenCondition",
    "callEvent",
    "guardCondition",
    "action"
})
public class IndividualTransitionType {

    @XmlElement(name = "WhenCondition")
    protected LogicalExpressionType whenCondition;
    @XmlElement(name = "CallEvent")
    protected OperationRefType callEvent;
    @XmlElement(name = "GuardCondition")
    protected LogicalExpressionType guardCondition;
    protected List<ActionType> action;
    @XmlAttribute(name = "From", required = true)
    protected String from;
    @XmlAttribute(name = "To", required = true)
    protected String to;
    @XmlAttribute(name = "Probability")
    protected Float probability;
    @XmlAttribute(name = "Deviation")
    protected Float deviation;

    /**
     * Recupera il valore della proprietà whenCondition.
     * 
     * @return
     *     possible object is
     *     {@link LogicalExpressionType }
     *     
     */
    public LogicalExpressionType getWhenCondition() {
        return whenCondition;
    }

    /**
     * Imposta il valore della proprietà whenCondition.
     * 
     * @param value
     *     allowed object is
     *     {@link LogicalExpressionType }
     *     
     */
    public void setWhenCondition(LogicalExpressionType value) {
        this.whenCondition = value;
    }

    /**
     * Recupera il valore della proprietà callEvent.
     * 
     * @return
     *     possible object is
     *     {@link OperationRefType }
     *     
     */
    public OperationRefType getCallEvent() {
        return callEvent;
    }

    /**
     * Imposta il valore della proprietà callEvent.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationRefType }
     *     
     */
    public void setCallEvent(OperationRefType value) {
        this.callEvent = value;
    }

    /**
     * Recupera il valore della proprietà guardCondition.
     * 
     * @return
     *     possible object is
     *     {@link LogicalExpressionType }
     *     
     */
    public LogicalExpressionType getGuardCondition() {
        return guardCondition;
    }

    /**
     * Imposta il valore della proprietà guardCondition.
     * 
     * @param value
     *     allowed object is
     *     {@link LogicalExpressionType }
     *     
     */
    public void setGuardCondition(LogicalExpressionType value) {
        this.guardCondition = value;
    }

    /**
     * Gets the value of the action property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the action property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActionType }
     * 
     * 
     */
    public List<ActionType> getAction() {
        if (action == null) {
            action = new ArrayList<ActionType>();
        }
        return this.action;
    }

    /**
     * Recupera il valore della proprietà from.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrom() {
        return from;
    }

    /**
     * Imposta il valore della proprietà from.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrom(String value) {
        this.from = value;
    }

    /**
     * Recupera il valore della proprietà to.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTo() {
        return to;
    }

    /**
     * Imposta il valore della proprietà to.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTo(String value) {
        this.to = value;
    }

    /**
     * Recupera il valore della proprietà probability.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getProbability() {
        return probability;
    }

    /**
     * Imposta il valore della proprietà probability.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setProbability(Float value) {
        this.probability = value;
    }

    /**
     * Recupera il valore della proprietà deviation.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDeviation() {
        return deviation;
    }

    /**
     * Imposta il valore della proprietà deviation.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDeviation(Float value) {
        this.deviation = value;
    }

}
