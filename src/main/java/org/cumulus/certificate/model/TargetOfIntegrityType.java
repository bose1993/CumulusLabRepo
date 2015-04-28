//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2015.04.28 alle 02:17:59 PM CEST 
//


package org.cumulus.certificate.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per targetOfIntegrityType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="targetOfIntegrityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ToIComponents" type="{http://www.cumulus.org/certificate/model}componentsType"/>
 *         &lt;element name="ToIPlatform" type="{http://www.cumulus.org/certificate/model}toIPlatformType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "targetOfIntegrityType", propOrder = {
    "toIComponents",
    "toIPlatform"
})
public class TargetOfIntegrityType {

    @XmlElement(name = "ToIComponents", required = true)
    protected ComponentsType toIComponents;
    @XmlElement(name = "ToIPlatform", required = true)
    protected ToIPlatformType toIPlatform;

    /**
     * Recupera il valore della proprietà toIComponents.
     * 
     * @return
     *     possible object is
     *     {@link ComponentsType }
     *     
     */
    public ComponentsType getToIComponents() {
        return toIComponents;
    }

    /**
     * Imposta il valore della proprietà toIComponents.
     * 
     * @param value
     *     allowed object is
     *     {@link ComponentsType }
     *     
     */
    public void setToIComponents(ComponentsType value) {
        this.toIComponents = value;
    }

    /**
     * Recupera il valore della proprietà toIPlatform.
     * 
     * @return
     *     possible object is
     *     {@link ToIPlatformType }
     *     
     */
    public ToIPlatformType getToIPlatform() {
        return toIPlatform;
    }

    /**
     * Imposta il valore della proprietà toIPlatform.
     * 
     * @param value
     *     allowed object is
     *     {@link ToIPlatformType }
     *     
     */
    public void setToIPlatform(ToIPlatformType value) {
        this.toIPlatform = value;
    }

}
