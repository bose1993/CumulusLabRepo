//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2015.05.04 alle 06:00:58 PM CEST 
//


package org.cumulus.certificate.model.test;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ThresholdTrafficType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ThresholdTrafficType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="TrafficType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ThresholdUnit" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ThresholdValue" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ThresholdTrafficType")
public class ThresholdTrafficType {

    @XmlAttribute(name = "TrafficType", required = true)
    protected String trafficType;
    @XmlAttribute(name = "ThresholdUnit", required = true)
    protected String thresholdUnit;
    @XmlAttribute(name = "ThresholdValue", required = true)
    protected float thresholdValue;

    /**
     * Recupera il valore della proprietà trafficType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrafficType() {
        return trafficType;
    }

    /**
     * Imposta il valore della proprietà trafficType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrafficType(String value) {
        this.trafficType = value;
    }

    /**
     * Recupera il valore della proprietà thresholdUnit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThresholdUnit() {
        return thresholdUnit;
    }

    /**
     * Imposta il valore della proprietà thresholdUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThresholdUnit(String value) {
        this.thresholdUnit = value;
    }

    /**
     * Recupera il valore della proprietà thresholdValue.
     * 
     */
    public float getThresholdValue() {
        return thresholdValue;
    }

    /**
     * Imposta il valore della proprietà thresholdValue.
     * 
     */
    public void setThresholdValue(float value) {
        this.thresholdValue = value;
    }

}
