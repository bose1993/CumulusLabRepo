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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ActionabilityType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ActionabilityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Mechanism" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MechanismURI" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActionabilityType", propOrder = {
    "description",
    "mechanism",
    "mechanismURI"
})
public class ActionabilityType {

    @XmlElement(name = "Description", required = true)
    protected String description;
    @XmlElement(name = "Mechanism", required = true)
    protected String mechanism;
    @XmlElement(name = "MechanismURI", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String mechanismURI;

    /**
     * Recupera il valore della proprietà description.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Imposta il valore della proprietà description.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Recupera il valore della proprietà mechanism.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMechanism() {
        return mechanism;
    }

    /**
     * Imposta il valore della proprietà mechanism.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMechanism(String value) {
        this.mechanism = value;
    }

    /**
     * Recupera il valore della proprietà mechanismURI.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMechanismURI() {
        return mechanismURI;
    }

    /**
     * Imposta il valore della proprietà mechanismURI.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMechanismURI(String value) {
        this.mechanismURI = value;
    }

}
