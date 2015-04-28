//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2015.04.28 alle 02:17:59 PM CEST 
//


package org.cumulus.certificate.model.test;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per AbstracCollectorType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="AbstracCollectorType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TestCategory" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Actionability" type="{http://www.cumulus.org/certificate/model/test}ActionabilityType" minOccurs="0"/>
 *         &lt;element name="Capability" type="{http://www.cumulus.org/certificate/model/test}CapabilityType" minOccurs="0"/>
 *         &lt;element name="TestType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TestDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TestGenerationModelLink" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element name="TestAttributes">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded">
 *                   &lt;element name="TestAttribute" type="{http://www.cumulus.org/certificate/model/test}TestAttributeType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TestCases">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded">
 *                   &lt;element name="TestCase" type="{http://www.cumulus.org/certificate/model/test}TestCaseType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="Id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstracCollectorType", propOrder = {
    "testCategory",
    "actionability",
    "capability",
    "testType",
    "testDescription",
    "testGenerationModelLink",
    "testAttributes",
    "testCases"
})
public class AbstracCollectorType {

    @XmlElement(name = "TestCategory", required = true)
    protected String testCategory;
    @XmlElement(name = "Actionability")
    protected ActionabilityType actionability;
    @XmlElement(name = "Capability")
    protected CapabilityType capability;
    @XmlElement(name = "TestType", required = true)
    protected String testType;
    @XmlElement(name = "TestDescription", required = true)
    protected String testDescription;
    @XmlElement(name = "TestGenerationModelLink", required = true, defaultValue = "http://www.cumulus-project.eu")
    @XmlSchemaType(name = "anyURI")
    protected String testGenerationModelLink;
    @XmlElement(name = "TestAttributes", required = true)
    protected AbstracCollectorType.TestAttributes testAttributes;
    @XmlElement(name = "TestCases", required = true)
    protected AbstracCollectorType.TestCases testCases;
    @XmlAttribute(name = "Id", required = true)
    protected String id;

    /**
     * Recupera il valore della proprietà testCategory.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTestCategory() {
        return testCategory;
    }

    /**
     * Imposta il valore della proprietà testCategory.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTestCategory(String value) {
        this.testCategory = value;
    }

    /**
     * Recupera il valore della proprietà actionability.
     * 
     * @return
     *     possible object is
     *     {@link ActionabilityType }
     *     
     */
    public ActionabilityType getActionability() {
        return actionability;
    }

    /**
     * Imposta il valore della proprietà actionability.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionabilityType }
     *     
     */
    public void setActionability(ActionabilityType value) {
        this.actionability = value;
    }

    /**
     * Recupera il valore della proprietà capability.
     * 
     * @return
     *     possible object is
     *     {@link CapabilityType }
     *     
     */
    public CapabilityType getCapability() {
        return capability;
    }

    /**
     * Imposta il valore della proprietà capability.
     * 
     * @param value
     *     allowed object is
     *     {@link CapabilityType }
     *     
     */
    public void setCapability(CapabilityType value) {
        this.capability = value;
    }

    /**
     * Recupera il valore della proprietà testType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTestType() {
        return testType;
    }

    /**
     * Imposta il valore della proprietà testType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTestType(String value) {
        this.testType = value;
    }

    /**
     * Recupera il valore della proprietà testDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTestDescription() {
        return testDescription;
    }

    /**
     * Imposta il valore della proprietà testDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTestDescription(String value) {
        this.testDescription = value;
    }

    /**
     * Recupera il valore della proprietà testGenerationModelLink.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTestGenerationModelLink() {
        return testGenerationModelLink;
    }

    /**
     * Imposta il valore della proprietà testGenerationModelLink.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTestGenerationModelLink(String value) {
        this.testGenerationModelLink = value;
    }

    /**
     * Recupera il valore della proprietà testAttributes.
     * 
     * @return
     *     possible object is
     *     {@link AbstracCollectorType.TestAttributes }
     *     
     */
    public AbstracCollectorType.TestAttributes getTestAttributes() {
        return testAttributes;
    }

    /**
     * Imposta il valore della proprietà testAttributes.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstracCollectorType.TestAttributes }
     *     
     */
    public void setTestAttributes(AbstracCollectorType.TestAttributes value) {
        this.testAttributes = value;
    }

    /**
     * Recupera il valore della proprietà testCases.
     * 
     * @return
     *     possible object is
     *     {@link AbstracCollectorType.TestCases }
     *     
     */
    public AbstracCollectorType.TestCases getTestCases() {
        return testCases;
    }

    /**
     * Imposta il valore della proprietà testCases.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstracCollectorType.TestCases }
     *     
     */
    public void setTestCases(AbstracCollectorType.TestCases value) {
        this.testCases = value;
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
     *       &lt;sequence maxOccurs="unbounded">
     *         &lt;element name="TestAttribute" type="{http://www.cumulus.org/certificate/model/test}TestAttributeType"/>
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
        "testAttribute"
    })
    public static class TestAttributes {

        @XmlElement(name = "TestAttribute", required = true)
        protected List<TestAttributeType> testAttribute;

        /**
         * Gets the value of the testAttribute property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the testAttribute property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTestAttribute().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TestAttributeType }
         * 
         * 
         */
        public List<TestAttributeType> getTestAttribute() {
            if (testAttribute == null) {
                testAttribute = new ArrayList<TestAttributeType>();
            }
            return this.testAttribute;
        }

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
     *       &lt;sequence maxOccurs="unbounded">
     *         &lt;element name="TestCase" type="{http://www.cumulus.org/certificate/model/test}TestCaseType"/>
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
        "testCase"
    })
    public static class TestCases {

        @XmlElement(name = "TestCase", required = true)
        protected List<TestCaseType> testCase;

        /**
         * Gets the value of the testCase property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the testCase property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTestCase().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TestCaseType }
         * 
         * 
         */
        public List<TestCaseType> getTestCase() {
            if (testCase == null) {
                testCase = new ArrayList<TestCaseType>();
            }
            return this.testCase;
        }

    }

}
