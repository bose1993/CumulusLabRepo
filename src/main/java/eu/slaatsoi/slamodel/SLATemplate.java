//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2015.04.28 alle 02:17:59 PM CEST 
//


package eu.slaatsoi.slamodel;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per anonymous complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.slaatsoi.eu/slamodel}AnnotatedType">
 *       &lt;sequence>
 *         &lt;element name="UUID" type="{http://www.slaatsoi.eu/slamodel}UUIDType"/>
 *         &lt;element name="ModelVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Party" type="{http://www.slaatsoi.eu/slamodel}AgreementPartyType" maxOccurs="unbounded"/>
 *         &lt;element name="InterfaceDeclr" type="{http://www.slaatsoi.eu/slamodel}InterfaceDeclrType" maxOccurs="unbounded"/>
 *         &lt;element name="VariableDeclr" type="{http://www.slaatsoi.eu/slamodel}VariableDeclrType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AgreementTerm" type="{http://www.slaatsoi.eu/slamodel}AgreementTermType" maxOccurs="unbounded"/>
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
    "modelVersion",
    "party",
    "interfaceDeclr",
    "variableDeclr",
    "agreementTerm"
})
@XmlRootElement(name = "SLATemplate")
public class SLATemplate
    extends AnnotatedType
{

    @XmlElement(name = "UUID", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String uuid;
    @XmlElement(name = "ModelVersion", required = true)
    protected String modelVersion;
    @XmlElement(name = "Party", required = true)
    protected List<AgreementPartyType> party;
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
     * Recupera il valore della proprietà modelVersion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelVersion() {
        return modelVersion;
    }

    /**
     * Imposta il valore della proprietà modelVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelVersion(String value) {
        this.modelVersion = value;
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
