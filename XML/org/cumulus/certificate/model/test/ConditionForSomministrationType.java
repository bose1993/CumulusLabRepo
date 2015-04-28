//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2015.04.28 alle 02:17:59 PM CEST 
//


package org.cumulus.certificate.model.test;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * <p>Classe Java per ConditionForSomministrationType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ConditionForSomministrationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="ThresholdTraffic" type="{http://www.cumulus.org/certificate/model/test}ThresholdTrafficType"/>
 *         &lt;element name="Event" type="{http://www.cumulus.org/certificate/model/test}EventType"/>
 *         &lt;element name="OtherCondition" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DeltaTime" type="{http://www.w3.org/2001/XMLSchema}duration"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConditionForSomministrationType", propOrder = {
    "thresholdTraffic",
    "event",
    "otherCondition",
    "deltaTime"
})
public class ConditionForSomministrationType {

    @XmlElement(name = "ThresholdTraffic")
    protected ThresholdTrafficType thresholdTraffic;
    @XmlElement(name = "Event")
    protected EventType event;
    @XmlElement(name = "OtherCondition")
    protected String otherCondition;
    @XmlElement(name = "DeltaTime")
    protected Duration deltaTime;

    /**
     * Recupera il valore della proprietà thresholdTraffic.
     * 
     * @return
     *     possible object is
     *     {@link ThresholdTrafficType }
     *     
     */
    public ThresholdTrafficType getThresholdTraffic() {
        return thresholdTraffic;
    }

    /**
     * Imposta il valore della proprietà thresholdTraffic.
     * 
     * @param value
     *     allowed object is
     *     {@link ThresholdTrafficType }
     *     
     */
    public void setThresholdTraffic(ThresholdTrafficType value) {
        this.thresholdTraffic = value;
    }

    /**
     * Recupera il valore della proprietà event.
     * 
     * @return
     *     possible object is
     *     {@link EventType }
     *     
     */
    public EventType getEvent() {
        return event;
    }

    /**
     * Imposta il valore della proprietà event.
     * 
     * @param value
     *     allowed object is
     *     {@link EventType }
     *     
     */
    public void setEvent(EventType value) {
        this.event = value;
    }

    /**
     * Recupera il valore della proprietà otherCondition.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherCondition() {
        return otherCondition;
    }

    /**
     * Imposta il valore della proprietà otherCondition.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherCondition(String value) {
        this.otherCondition = value;
    }

    /**
     * Recupera il valore della proprietà deltaTime.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getDeltaTime() {
        return deltaTime;
    }

    /**
     * Imposta il valore della proprietà deltaTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setDeltaTime(Duration value) {
        this.deltaTime = value;
    }

}
