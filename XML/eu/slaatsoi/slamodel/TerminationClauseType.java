//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2015.05.04 alle 06:00:58 PM CEST 
//


package eu.slaatsoi.slamodel;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per TerminationClauseType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TerminationClauseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.slaatsoi.eu/slamodel}IDType"/>
 *         &lt;element name="TerminationInitiator" type="{http://www.slaatsoi.eu/slamodel}STNDType"/>
 *         &lt;element name="TerminationClauseType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TerminationClauseDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NotificationPeriod" type="{http://www.slaatsoi.eu/slamodel}CONSTType"/>
 *         &lt;element name="NotificationMethod" type="{http://www.slaatsoi.eu/slamodel}STNDType"/>
 *         &lt;element name="Fees" type="{http://www.slaatsoi.eu/slamodel}CONSTType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TerminationClauseType", propOrder = {
    "id",
    "terminationInitiator",
    "terminationClauseType",
    "terminationClauseDescription",
    "notificationPeriod",
    "notificationMethod",
    "fees"
})
public class TerminationClauseType {

    @XmlList
    @XmlElement(name = "ID", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected List<String> id;
    @XmlList
    @XmlElement(name = "TerminationInitiator", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected List<String> terminationInitiator;
    @XmlElement(name = "TerminationClauseType", required = true)
    protected String terminationClauseType;
    @XmlElement(name = "TerminationClauseDescription", required = true)
    protected String terminationClauseDescription;
    @XmlElement(name = "NotificationPeriod", required = true)
    protected CONSTType notificationPeriod;
    @XmlList
    @XmlElement(name = "NotificationMethod", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected List<String> notificationMethod;
    @XmlElement(name = "Fees")
    protected CONSTType fees;

    /**
     * Gets the value of the id property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the id property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getID() {
        if (id == null) {
            id = new ArrayList<String>();
        }
        return this.id;
    }

    /**
     * Gets the value of the terminationInitiator property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the terminationInitiator property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTerminationInitiator().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTerminationInitiator() {
        if (terminationInitiator == null) {
            terminationInitiator = new ArrayList<String>();
        }
        return this.terminationInitiator;
    }

    /**
     * Recupera il valore della proprietà terminationClauseType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminationClauseType() {
        return terminationClauseType;
    }

    /**
     * Imposta il valore della proprietà terminationClauseType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminationClauseType(String value) {
        this.terminationClauseType = value;
    }

    /**
     * Recupera il valore della proprietà terminationClauseDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminationClauseDescription() {
        return terminationClauseDescription;
    }

    /**
     * Imposta il valore della proprietà terminationClauseDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminationClauseDescription(String value) {
        this.terminationClauseDescription = value;
    }

    /**
     * Recupera il valore della proprietà notificationPeriod.
     * 
     * @return
     *     possible object is
     *     {@link CONSTType }
     *     
     */
    public CONSTType getNotificationPeriod() {
        return notificationPeriod;
    }

    /**
     * Imposta il valore della proprietà notificationPeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link CONSTType }
     *     
     */
    public void setNotificationPeriod(CONSTType value) {
        this.notificationPeriod = value;
    }

    /**
     * Gets the value of the notificationMethod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notificationMethod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotificationMethod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNotificationMethod() {
        if (notificationMethod == null) {
            notificationMethod = new ArrayList<String>();
        }
        return this.notificationMethod;
    }

    /**
     * Recupera il valore della proprietà fees.
     * 
     * @return
     *     possible object is
     *     {@link CONSTType }
     *     
     */
    public CONSTType getFees() {
        return fees;
    }

    /**
     * Imposta il valore della proprietà fees.
     * 
     * @param value
     *     allowed object is
     *     {@link CONSTType }
     *     
     */
    public void setFees(CONSTType value) {
        this.fees = value;
    }

}
