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
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import eu.slaatsoi.slamodel.InterfaceDeclrType;


/**
 * <p>Classe Java per tocType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="tocType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CloudLayer" maxOccurs="unbounded">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="SaaS"/>
 *               &lt;enumeration value="PaaS"/>
 *               &lt;enumeration value="IaaS"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ConcreteToc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TocDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TocURI" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;choice>
 *           &lt;element name="ToTs" type="{http://www.cumulus.org/certificate/model}targetOfTestsType"/>
 *           &lt;element name="ToM">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="providesInterface" type="{http://www.slaatsoi.eu/slamodel}InterfaceDeclrType" maxOccurs="unbounded"/>
 *                     &lt;element name="requiresInterface" type="{http://www.slaatsoi.eu/slamodel}InterfaceDeclrType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="ToI" type="{http://www.cumulus.org/certificate/model}targetOfIntegrityType"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="Id" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tocType", propOrder = {
    "cloudLayer",
    "concreteToc",
    "tocDescription",
    "tocURI",
    "toTs",
    "toM",
    "toI"
})
public class TocType {

    @XmlElement(name = "CloudLayer", required = true)
    protected List<String> cloudLayer;
    @XmlElement(name = "ConcreteToc", required = true)
    protected String concreteToc;
    @XmlElement(name = "TocDescription", required = true)
    protected String tocDescription;
    @XmlElement(name = "TocURI", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String tocURI;
    @XmlElement(name = "ToTs")
    protected TargetOfTestsType toTs;
    @XmlElement(name = "ToM")
    protected TocType.ToM toM;
    @XmlElement(name = "ToI")
    protected TargetOfIntegrityType toI;
    @XmlAttribute(name = "Id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Gets the value of the cloudLayer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cloudLayer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCloudLayer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCloudLayer() {
        if (cloudLayer == null) {
            cloudLayer = new ArrayList<String>();
        }
        return this.cloudLayer;
    }

    /**
     * Recupera il valore della proprietà concreteToc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConcreteToc() {
        return concreteToc;
    }

    /**
     * Imposta il valore della proprietà concreteToc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConcreteToc(String value) {
        this.concreteToc = value;
    }

    /**
     * Recupera il valore della proprietà tocDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTocDescription() {
        return tocDescription;
    }

    /**
     * Imposta il valore della proprietà tocDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTocDescription(String value) {
        this.tocDescription = value;
    }

    /**
     * Recupera il valore della proprietà tocURI.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTocURI() {
        return tocURI;
    }

    /**
     * Imposta il valore della proprietà tocURI.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTocURI(String value) {
        this.tocURI = value;
    }

    /**
     * Recupera il valore della proprietà toTs.
     * 
     * @return
     *     possible object is
     *     {@link TargetOfTestsType }
     *     
     */
    public TargetOfTestsType getToTs() {
        return toTs;
    }

    /**
     * Imposta il valore della proprietà toTs.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetOfTestsType }
     *     
     */
    public void setToTs(TargetOfTestsType value) {
        this.toTs = value;
    }

    /**
     * Recupera il valore della proprietà toM.
     * 
     * @return
     *     possible object is
     *     {@link TocType.ToM }
     *     
     */
    public TocType.ToM getToM() {
        return toM;
    }

    /**
     * Imposta il valore della proprietà toM.
     * 
     * @param value
     *     allowed object is
     *     {@link TocType.ToM }
     *     
     */
    public void setToM(TocType.ToM value) {
        this.toM = value;
    }

    /**
     * Recupera il valore della proprietà toI.
     * 
     * @return
     *     possible object is
     *     {@link TargetOfIntegrityType }
     *     
     */
    public TargetOfIntegrityType getToI() {
        return toI;
    }

    /**
     * Imposta il valore della proprietà toI.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetOfIntegrityType }
     *     
     */
    public void setToI(TargetOfIntegrityType value) {
        this.toI = value;
    }

    /**
     * Recupera il valore della proprietà id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Imposta il valore della proprietà id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }


    /**
     * <p>Classe Java per anonymous complex type.
     * 
     * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="providesInterface" type="{http://www.slaatsoi.eu/slamodel}InterfaceDeclrType" maxOccurs="unbounded"/>
     *         &lt;element name="requiresInterface" type="{http://www.slaatsoi.eu/slamodel}InterfaceDeclrType" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "providesInterface",
        "requiresInterface"
    })
    public static class ToM {

        @XmlElement(required = true)
        protected List<InterfaceDeclrType> providesInterface;
        protected List<InterfaceDeclrType> requiresInterface;

        /**
         * Gets the value of the providesInterface property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the providesInterface property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getProvidesInterface().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link InterfaceDeclrType }
         * 
         * 
         */
        public List<InterfaceDeclrType> getProvidesInterface() {
            if (providesInterface == null) {
                providesInterface = new ArrayList<InterfaceDeclrType>();
            }
            return this.providesInterface;
        }

        /**
         * Gets the value of the requiresInterface property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the requiresInterface property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRequiresInterface().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link InterfaceDeclrType }
         * 
         * 
         */
        public List<InterfaceDeclrType> getRequiresInterface() {
            if (requiresInterface == null) {
                requiresInterface = new ArrayList<InterfaceDeclrType>();
            }
            return this.requiresInterface;
        }

    }

}
