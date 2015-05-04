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
 * <p>Classe Java per interfaceToT complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="interfaceToT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="call" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *       &lt;attribute name="stateRef" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "interfaceToT", propOrder = {
    "type",
    "call"
})
public class InterfaceToT {

    @XmlElement(required = true)
    protected String type;
    @XmlElement(required = true)
    protected String call;
    @XmlAttribute(name = "stateRef")
    protected String stateRef;

    /**
     * Recupera il valore della proprietà type.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Imposta il valore della proprietà type.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Recupera il valore della proprietà call.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCall() {
        return call;
    }

    /**
     * Imposta il valore della proprietà call.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCall(String value) {
        this.call = value;
    }

    /**
     * Recupera il valore della proprietà stateRef.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateRef() {
        return stateRef;
    }

    /**
     * Imposta il valore della proprietà stateRef.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateRef(String value) {
        this.stateRef = value;
    }

}
