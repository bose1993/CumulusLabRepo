//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2015.04.28 alle 02:17:59 PM CEST 
//


package org.cumulus.certificate.model.test;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per TestInstanceType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TestInstanceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Preconditions" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="HiddenCommunications" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Input" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ExpectedOutput" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PostConditions" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Operation" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TestInstanceType", propOrder = {
    "preconditions",
    "hiddenCommunications",
    "input",
    "expectedOutput",
    "postConditions"
})
public class TestInstanceType {

    @XmlElement(name = "Preconditions", required = true)
    protected String preconditions;
    @XmlElement(name = "HiddenCommunications", required = true)
    protected String hiddenCommunications;
    @XmlElement(name = "Input", required = true)
    protected String input;
    @XmlElement(name = "ExpectedOutput", required = true)
    protected String expectedOutput;
    @XmlElement(name = "PostConditions", required = true)
    protected String postConditions;
    @XmlAttribute(name = "Operation", required = true)
    protected String operation;

    /**
     * Recupera il valore della proprietà preconditions.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreconditions() {
        return preconditions;
    }

    /**
     * Imposta il valore della proprietà preconditions.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreconditions(String value) {
        this.preconditions = value;
    }

    /**
     * Recupera il valore della proprietà hiddenCommunications.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHiddenCommunications() {
        return hiddenCommunications;
    }

    /**
     * Imposta il valore della proprietà hiddenCommunications.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHiddenCommunications(String value) {
        this.hiddenCommunications = value;
    }

    /**
     * Recupera il valore della proprietà input.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInput() {
        return input;
    }

    /**
     * Imposta il valore della proprietà input.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInput(String value) {
        this.input = value;
    }

    /**
     * Recupera il valore della proprietà expectedOutput.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpectedOutput() {
        return expectedOutput;
    }

    /**
     * Imposta il valore della proprietà expectedOutput.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpectedOutput(String value) {
        this.expectedOutput = value;
    }

    /**
     * Recupera il valore della proprietà postConditions.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostConditions() {
        return postConditions;
    }

    /**
     * Imposta il valore della proprietà postConditions.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostConditions(String value) {
        this.postConditions = value;
    }

    /**
     * Recupera il valore della proprietà operation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperation() {
        return operation;
    }

    /**
     * Imposta il valore della proprietà operation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperation(String value) {
        this.operation = value;
    }

}
