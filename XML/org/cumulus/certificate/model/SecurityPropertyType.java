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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import eu.slaatsoi.slamodel.AgreementPartyType;
import eu.slaatsoi.slamodel.AgreementTermType;
import eu.slaatsoi.slamodel.InterfaceDeclrType;
import eu.slaatsoi.slamodel.VariableDeclrType;


/**
 * <p>Classe Java per securityPropertyType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="securityPropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sProperty" type="{http://www.cumulus.org/certificate/model}propertyType"/>
 *         &lt;element name="Assertion" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.cumulus.org/certificate/model}AnnotatedType">
 *                 &lt;sequence>
 *                   &lt;sequence>
 *                     &lt;element name="UUID" type="{http://www.slaatsoi.eu/slamodel}UUIDType"/>
 *                     &lt;element name="EffectiveFrom" type="{http://www.slaatsoi.eu/slamodel}TimeType"/>
 *                     &lt;element name="EffectiveUntil" type="{http://www.slaatsoi.eu/slamodel}TimeType"/>
 *                     &lt;element name="AgreedAt" type="{http://www.slaatsoi.eu/slamodel}TimeType"/>
 *                     &lt;element name="Party" type="{http://www.slaatsoi.eu/slamodel}AgreementPartyType" maxOccurs="unbounded"/>
 *                     &lt;element name="AbstractParty" type="{http://www.cumulus.org/certificate/model}AbstractPartyType" maxOccurs="unbounded" minOccurs="0"/>
 *                     &lt;element name="InterfaceDeclr" type="{http://www.slaatsoi.eu/slamodel}InterfaceDeclrType" maxOccurs="unbounded"/>
 *                     &lt;element name="VariableDeclr" type="{http://www.slaatsoi.eu/slamodel}VariableDeclrType" maxOccurs="unbounded" minOccurs="0"/>
 *                     &lt;element name="AgreementTerm" type="{http://www.slaatsoi.eu/slamodel}AgreementTermType" maxOccurs="unbounded"/>
 *                   &lt;/sequence>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="SecurityPropertyId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SecurityPropertyDefinition" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Vocabulary" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ShortName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "securityPropertyType", propOrder = {
    "sProperty",
    "assertion"
})
public class SecurityPropertyType {

    @XmlElement(required = true)
    protected PropertyType sProperty;
    @XmlElement(name = "Assertion")
    protected SecurityPropertyType.Assertion assertion;
    @XmlAttribute(name = "SecurityPropertyId")
    protected String securityPropertyId;
    @XmlAttribute(name = "SecurityPropertyDefinition", required = true)
    protected String securityPropertyDefinition;
    @XmlAttribute(name = "Vocabulary")
    protected String vocabulary;
    @XmlAttribute(name = "ShortName")
    protected String shortName;

    /**
     * Recupera il valore della proprietà sProperty.
     * 
     * @return
     *     possible object is
     *     {@link PropertyType }
     *     
     */
    public PropertyType getSProperty() {
        return sProperty;
    }

    /**
     * Imposta il valore della proprietà sProperty.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyType }
     *     
     */
    public void setSProperty(PropertyType value) {
        this.sProperty = value;
    }

    /**
     * Recupera il valore della proprietà assertion.
     * 
     * @return
     *     possible object is
     *     {@link SecurityPropertyType.Assertion }
     *     
     */
    public SecurityPropertyType.Assertion getAssertion() {
        return assertion;
    }

    /**
     * Imposta il valore della proprietà assertion.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityPropertyType.Assertion }
     *     
     */
    public void setAssertion(SecurityPropertyType.Assertion value) {
        this.assertion = value;
    }

    /**
     * Recupera il valore della proprietà securityPropertyId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecurityPropertyId() {
        return securityPropertyId;
    }

    /**
     * Imposta il valore della proprietà securityPropertyId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecurityPropertyId(String value) {
        this.securityPropertyId = value;
    }

    /**
     * Recupera il valore della proprietà securityPropertyDefinition.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecurityPropertyDefinition() {
        return securityPropertyDefinition;
    }

    /**
     * Imposta il valore della proprietà securityPropertyDefinition.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecurityPropertyDefinition(String value) {
        this.securityPropertyDefinition = value;
    }

    /**
     * Recupera il valore della proprietà vocabulary.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVocabulary() {
        return vocabulary;
    }

    /**
     * Imposta il valore della proprietà vocabulary.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVocabulary(String value) {
        this.vocabulary = value;
    }

    /**
     * Recupera il valore della proprietà shortName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortName() {
        return shortName;
    }

    /**
     * Imposta il valore della proprietà shortName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortName(String value) {
        this.shortName = value;
    }


    /**
     * <p>Classe Java per anonymous complex type.
     * 
     * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.cumulus.org/certificate/model}AnnotatedType">
     *       &lt;sequence>
     *         &lt;sequence>
     *           &lt;element name="UUID" type="{http://www.slaatsoi.eu/slamodel}UUIDType"/>
     *           &lt;element name="EffectiveFrom" type="{http://www.slaatsoi.eu/slamodel}TimeType"/>
     *           &lt;element name="EffectiveUntil" type="{http://www.slaatsoi.eu/slamodel}TimeType"/>
     *           &lt;element name="AgreedAt" type="{http://www.slaatsoi.eu/slamodel}TimeType"/>
     *           &lt;element name="Party" type="{http://www.slaatsoi.eu/slamodel}AgreementPartyType" maxOccurs="unbounded"/>
     *           &lt;element name="AbstractParty" type="{http://www.cumulus.org/certificate/model}AbstractPartyType" maxOccurs="unbounded" minOccurs="0"/>
     *           &lt;element name="InterfaceDeclr" type="{http://www.slaatsoi.eu/slamodel}InterfaceDeclrType" maxOccurs="unbounded"/>
     *           &lt;element name="VariableDeclr" type="{http://www.slaatsoi.eu/slamodel}VariableDeclrType" maxOccurs="unbounded" minOccurs="0"/>
     *           &lt;element name="AgreementTerm" type="{http://www.slaatsoi.eu/slamodel}AgreementTermType" maxOccurs="unbounded"/>
     *         &lt;/sequence>
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "uuid",
        "effectiveFrom",
        "effectiveUntil",
        "agreedAt",
        "party",
        "abstractParty",
        "interfaceDeclr",
        "variableDeclr",
        "agreementTerm"
    })
    public static class Assertion
        extends AnnotatedType
    {

        @XmlElement(name = "UUID", required = true)
        @XmlSchemaType(name = "anySimpleType")
        protected String uuid;
        @XmlElement(name = "EffectiveFrom", required = true)
        @XmlSchemaType(name = "anySimpleType")
        protected String effectiveFrom;
        @XmlElement(name = "EffectiveUntil", required = true)
        @XmlSchemaType(name = "anySimpleType")
        protected String effectiveUntil;
        @XmlElement(name = "AgreedAt", required = true)
        @XmlSchemaType(name = "anySimpleType")
        protected String agreedAt;
        @XmlElement(name = "Party", required = true)
        protected List<AgreementPartyType> party;
        @XmlElement(name = "AbstractParty")
        protected List<AbstractPartyType> abstractParty;
        @XmlElement(name = "InterfaceDeclr", required = true)
        protected List<InterfaceDeclrType> interfaceDeclr;
        @XmlElement(name = "VariableDeclr")
        protected List<VariableDeclrType> variableDeclr;
        @XmlElement(name = "AgreementTerm", required = true)
        protected List<AgreementTermType> agreementTerm;

        /**
         * Recupera il valore della proprietà uuid.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUUID() {
            return uuid;
        }

        /**
         * Imposta il valore della proprietà uuid.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUUID(String value) {
            this.uuid = value;
        }

        /**
         * Recupera il valore della proprietà effectiveFrom.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEffectiveFrom() {
            return effectiveFrom;
        }

        /**
         * Imposta il valore della proprietà effectiveFrom.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEffectiveFrom(String value) {
            this.effectiveFrom = value;
        }

        /**
         * Recupera il valore della proprietà effectiveUntil.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEffectiveUntil() {
            return effectiveUntil;
        }

        /**
         * Imposta il valore della proprietà effectiveUntil.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEffectiveUntil(String value) {
            this.effectiveUntil = value;
        }

        /**
         * Recupera il valore della proprietà agreedAt.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAgreedAt() {
            return agreedAt;
        }

        /**
         * Imposta il valore della proprietà agreedAt.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAgreedAt(String value) {
            this.agreedAt = value;
        }

        /**
         * Gets the value of the party property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the party property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getParty().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AgreementPartyType }
         * 
         * 
         */
        public List<AgreementPartyType> getParty() {
            if (party == null) {
                party = new ArrayList<AgreementPartyType>();
            }
            return this.party;
        }

        /**
         * Gets the value of the abstractParty property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the abstractParty property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAbstractParty().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AbstractPartyType }
         * 
         * 
         */
        public List<AbstractPartyType> getAbstractParty() {
            if (abstractParty == null) {
                abstractParty = new ArrayList<AbstractPartyType>();
            }
            return this.abstractParty;
        }

        /**
         * Gets the value of the interfaceDeclr property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the interfaceDeclr property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getInterfaceDeclr().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link InterfaceDeclrType }
         * 
         * 
         */
        public List<InterfaceDeclrType> getInterfaceDeclr() {
            if (interfaceDeclr == null) {
                interfaceDeclr = new ArrayList<InterfaceDeclrType>();
            }
            return this.interfaceDeclr;
        }

        /**
         * Gets the value of the variableDeclr property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the variableDeclr property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVariableDeclr().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link VariableDeclrType }
         * 
         * 
         */
        public List<VariableDeclrType> getVariableDeclr() {
            if (variableDeclr == null) {
                variableDeclr = new ArrayList<VariableDeclrType>();
            }
            return this.variableDeclr;
        }

        /**
         * Gets the value of the agreementTerm property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the agreementTerm property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAgreementTerm().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AgreementTermType }
         * 
         * 
         */
        public List<AgreementTermType> getAgreementTerm() {
            if (agreementTerm == null) {
                agreementTerm = new ArrayList<AgreementTermType>();
            }
            return this.agreementTerm;
        }

    }

}
