//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2015.05.04 alle 06:00:58 PM CEST 
//


package org.cumulus.certificate.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ConditionType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ConditionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="evidenceSufficiencyCondition" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="conflictCondition" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="expirationCondition" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="evidenceCondition" type="{http://www.cumulus.org/certificate/model}EvidenceConditionType"/>
 *         &lt;element name="collectorCondition" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConditionType", propOrder = {
    "evidenceSufficiencyCondition",
    "conflictCondition",
    "expirationCondition",
    "evidenceCondition",
    "collectorCondition"
})
public class ConditionType {

    protected String evidenceSufficiencyCondition;
    protected String conflictCondition;
    protected String expirationCondition;
    protected EvidenceConditionType evidenceCondition;
    protected String collectorCondition;

    /**
     * Recupera il valore della proprietà evidenceSufficiencyCondition.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvidenceSufficiencyCondition() {
        return evidenceSufficiencyCondition;
    }

    /**
     * Imposta il valore della proprietà evidenceSufficiencyCondition.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEvidenceSufficiencyCondition(String value) {
        this.evidenceSufficiencyCondition = value;
    }

    /**
     * Recupera il valore della proprietà conflictCondition.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConflictCondition() {
        return conflictCondition;
    }

    /**
     * Imposta il valore della proprietà conflictCondition.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConflictCondition(String value) {
        this.conflictCondition = value;
    }

    /**
     * Recupera il valore della proprietà expirationCondition.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpirationCondition() {
        return expirationCondition;
    }

    /**
     * Imposta il valore della proprietà expirationCondition.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpirationCondition(String value) {
        this.expirationCondition = value;
    }

    /**
     * Recupera il valore della proprietà evidenceCondition.
     * 
     * @return
     *     possible object is
     *     {@link EvidenceConditionType }
     *     
     */
    public EvidenceConditionType getEvidenceCondition() {
        return evidenceCondition;
    }

    /**
     * Imposta il valore della proprietà evidenceCondition.
     * 
     * @param value
     *     allowed object is
     *     {@link EvidenceConditionType }
     *     
     */
    public void setEvidenceCondition(EvidenceConditionType value) {
        this.evidenceCondition = value;
    }

    /**
     * Recupera il valore della proprietà collectorCondition.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollectorCondition() {
        return collectorCondition;
    }

    /**
     * Imposta il valore della proprietà collectorCondition.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollectorCondition(String value) {
        this.collectorCondition = value;
    }

}
