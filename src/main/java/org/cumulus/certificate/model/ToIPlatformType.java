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
 * <p>Classe Java per toIPlatformType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="toIPlatformType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ToIPlatformComponents" type="{http://www.cumulus.org/certificate/model}componentsType"/>
 *         &lt;element name="PhysicalPlatformManufacturer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TPMManufacturer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AIKCredential" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="TPMVersion" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "toIPlatformType", propOrder = {
    "toIPlatformComponents",
    "physicalPlatformManufacturer",
    "tpmManufacturer",
    "aikCredential"
})
public class ToIPlatformType {

    @XmlElement(name = "ToIPlatformComponents", required = true)
    protected ComponentsType toIPlatformComponents;
    @XmlElement(name = "PhysicalPlatformManufacturer")
    protected String physicalPlatformManufacturer;
    @XmlElement(name = "TPMManufacturer")
    protected String tpmManufacturer;
    @XmlElement(name = "AIKCredential")
    protected String aikCredential;
    @XmlAttribute(name = "TPMVersion", required = true)
    protected String tpmVersion;

    /**
     * Recupera il valore della proprietà toIPlatformComponents.
     * 
     * @return
     *     possible object is
     *     {@link ComponentsType }
     *     
     */
    public ComponentsType getToIPlatformComponents() {
        return toIPlatformComponents;
    }

    /**
     * Imposta il valore della proprietà toIPlatformComponents.
     * 
     * @param value
     *     allowed object is
     *     {@link ComponentsType }
     *     
     */
    public void setToIPlatformComponents(ComponentsType value) {
        this.toIPlatformComponents = value;
    }

    /**
     * Recupera il valore della proprietà physicalPlatformManufacturer.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhysicalPlatformManufacturer() {
        return physicalPlatformManufacturer;
    }

    /**
     * Imposta il valore della proprietà physicalPlatformManufacturer.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhysicalPlatformManufacturer(String value) {
        this.physicalPlatformManufacturer = value;
    }

    /**
     * Recupera il valore della proprietà tpmManufacturer.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTPMManufacturer() {
        return tpmManufacturer;
    }

    /**
     * Imposta il valore della proprietà tpmManufacturer.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTPMManufacturer(String value) {
        this.tpmManufacturer = value;
    }

    /**
     * Recupera il valore della proprietà aikCredential.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAIKCredential() {
        return aikCredential;
    }

    /**
     * Imposta il valore della proprietà aikCredential.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAIKCredential(String value) {
        this.aikCredential = value;
    }

    /**
     * Recupera il valore della proprietà tpmVersion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTPMVersion() {
        return tpmVersion;
    }

    /**
     * Imposta il valore della proprietà tpmVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTPMVersion(String value) {
        this.tpmVersion = value;
    }

}
