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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.cumulus.certificate.model.test.TestCertificationModel;


/**
 * <p>Classe Java per CommonCertificationModelType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="CommonCertificationModelType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CertificationModelID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LifeCycle" type="{http://www.cumulus.org/certificate/model}StateTransitionModelType"/>
 *         &lt;element name="Signature" type="{http://www.cumulus.org/certificate/model}signatureType"/>
 *         &lt;element name="ToC" type="{http://www.cumulus.org/certificate/model}tocType"/>
 *         &lt;element name="SecurityProperty" type="{http://www.cumulus.org/certificate/model}securityPropertyType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommonCertificationModelType", propOrder = {
    "certificationModelID",
    "lifeCycle",
    "signature",
    "toC",
    "securityProperty"
})
@XmlSeeAlso({
    TestCertificationModel.class
})
public class CommonCertificationModelType {

    @XmlElement(name = "CertificationModelID", required = true)
    protected String certificationModelID;
    @XmlElement(name = "LifeCycle", required = true)
    protected StateTransitionModelType lifeCycle;
    @XmlElement(name = "Signature", required = true)
    protected SignatureType signature;
    @XmlElement(name = "ToC", required = true)
    protected TocType toC;
    @XmlElement(name = "SecurityProperty", required = true)
    protected SecurityPropertyType securityProperty;

    /**
     * Recupera il valore della proprietà certificationModelID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificationModelID() {
        return certificationModelID;
    }

    /**
     * Imposta il valore della proprietà certificationModelID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificationModelID(String value) {
        this.certificationModelID = value;
    }

    /**
     * Recupera il valore della proprietà lifeCycle.
     * 
     * @return
     *     possible object is
     *     {@link StateTransitionModelType }
     *     
     */
    public StateTransitionModelType getLifeCycle() {
        return lifeCycle;
    }

    /**
     * Imposta il valore della proprietà lifeCycle.
     * 
     * @param value
     *     allowed object is
     *     {@link StateTransitionModelType }
     *     
     */
    public void setLifeCycle(StateTransitionModelType value) {
        this.lifeCycle = value;
    }

    /**
     * Recupera il valore della proprietà signature.
     * 
     * @return
     *     possible object is
     *     {@link SignatureType }
     *     
     */
    public SignatureType getSignature() {
        return signature;
    }

    /**
     * Imposta il valore della proprietà signature.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureType }
     *     
     */
    public void setSignature(SignatureType value) {
        this.signature = value;
    }

    /**
     * Recupera il valore della proprietà toC.
     * 
     * @return
     *     possible object is
     *     {@link TocType }
     *     
     */
    public TocType getToC() {
        return toC;
    }

    /**
     * Imposta il valore della proprietà toC.
     * 
     * @param value
     *     allowed object is
     *     {@link TocType }
     *     
     */
    public void setToC(TocType value) {
        this.toC = value;
    }

    /**
     * Recupera il valore della proprietà securityProperty.
     * 
     * @return
     *     possible object is
     *     {@link SecurityPropertyType }
     *     
     */
    public SecurityPropertyType getSecurityProperty() {
        return securityProperty;
    }

    /**
     * Imposta il valore della proprietà securityProperty.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityPropertyType }
     *     
     */
    public void setSecurityProperty(SecurityPropertyType value) {
        this.securityProperty = value;
    }

}
