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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per HistoryStateType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="HistoryStateType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="stateId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="refersToStateId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HistoryStateType")
public class HistoryStateType {

    @XmlAttribute(name = "stateId", required = true)
    protected String stateId;
    @XmlAttribute(name = "refersToStateId", required = true)
    protected String refersToStateId;

    /**
     * Recupera il valore della proprietà stateId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateId() {
        return stateId;
    }

    /**
     * Imposta il valore della proprietà stateId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateId(String value) {
        this.stateId = value;
    }

    /**
     * Recupera il valore della proprietà refersToStateId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefersToStateId() {
        return refersToStateId;
    }

    /**
     * Imposta il valore della proprietà refersToStateId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefersToStateId(String value) {
        this.refersToStateId = value;
    }

}
