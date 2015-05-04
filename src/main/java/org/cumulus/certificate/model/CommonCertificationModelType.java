//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2015.05.04 alle 06:00:58 PM CEST 
//


package org.cumulus.certificate.model;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
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
 *         &lt;element name="CertificationModelID">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    protected CommonCertificationModelType.CertificationModelID certificationModelID;
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
     *     {@link CommonCertificationModelType.CertificationModelID }
     *     
     */
    public CommonCertificationModelType.CertificationModelID getCertificationModelID() {
        return certificationModelID;
    }

    /**
     * Imposta il valore della proprietà certificationModelID.
     * 
     * @param value
     *     allowed object is
     *     {@link CommonCertificationModelType.CertificationModelID }
     *     
     */
    public void setCertificationModelID(CommonCertificationModelType.CertificationModelID value) {
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


    /**
     * <p>Classe Java per anonymous complex type.
     * 
     * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class CertificationModelID {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "version")
        protected BigDecimal version;

        /**
         * Recupera il valore della proprietà value.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Imposta il valore della proprietà value.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Recupera il valore della proprietà version.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getVersion() {
            return version;
        }

        /**
         * Imposta il valore della proprietà version.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setVersion(BigDecimal value) {
            this.version = value;
        }

    }

}
