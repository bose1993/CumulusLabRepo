//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2015.05.04 alle 06:00:58 PM CEST 
//


package org.cumulus.certificate.model.test;

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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per GeneralCollectorType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="GeneralCollectorType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ConditionForSomministration" type="{http://www.cumulus.org/certificate/model/test}ConditionForSomministrationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Aggregator">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="TestMetrics">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.cumulus.org/certificate/model/test}TestMetricsType">
 *                           &lt;attribute name="CombiningAlgorithm" type="{http://www.w3.org/2001/XMLSchema}string" default="AND" />
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="AggregatorDescription" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="transient" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AbstractCollectorRef">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="TestCase" type="{http://www.cumulus.org/certificate/model/test}TestCaseType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="driver" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ExpirationTime" type="{http://www.w3.org/2001/XMLSchema}gYearMonth" />
 *       &lt;attribute name="Descriptor" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Id" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="isStatic" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="toDeploy" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeneralCollectorType", propOrder = {
    "conditionForSomministration",
    "aggregator",
    "abstractCollectorRef",
    "driver"
})
public class GeneralCollectorType {

    @XmlElement(name = "ConditionForSomministration")
    protected List<ConditionForSomministrationType> conditionForSomministration;
    @XmlElement(name = "Aggregator", required = true)
    protected GeneralCollectorType.Aggregator aggregator;
    @XmlElement(name = "AbstractCollectorRef", required = true)
    protected GeneralCollectorType.AbstractCollectorRef abstractCollectorRef;
    @XmlElement(required = true)
    protected String driver;
    @XmlAttribute(name = "ExpirationTime")
    @XmlSchemaType(name = "gYearMonth")
    protected XMLGregorianCalendar expirationTime;
    @XmlAttribute(name = "Descriptor")
    protected String descriptor;
    @XmlAttribute(name = "Id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "isStatic", required = true)
    protected boolean isStatic;
    @XmlAttribute(name = "toDeploy")
    protected Boolean toDeploy;

    /**
     * Gets the value of the conditionForSomministration property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the conditionForSomministration property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConditionForSomministration().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConditionForSomministrationType }
     * 
     * 
     */
    public List<ConditionForSomministrationType> getConditionForSomministration() {
        if (conditionForSomministration == null) {
            conditionForSomministration = new ArrayList<ConditionForSomministrationType>();
        }
        return this.conditionForSomministration;
    }

    /**
     * Recupera il valore della proprietà aggregator.
     * 
     * @return
     *     possible object is
     *     {@link GeneralCollectorType.Aggregator }
     *     
     */
    public GeneralCollectorType.Aggregator getAggregator() {
        return aggregator;
    }

    /**
     * Imposta il valore della proprietà aggregator.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralCollectorType.Aggregator }
     *     
     */
    public void setAggregator(GeneralCollectorType.Aggregator value) {
        this.aggregator = value;
    }

    /**
     * Recupera il valore della proprietà abstractCollectorRef.
     * 
     * @return
     *     possible object is
     *     {@link GeneralCollectorType.AbstractCollectorRef }
     *     
     */
    public GeneralCollectorType.AbstractCollectorRef getAbstractCollectorRef() {
        return abstractCollectorRef;
    }

    /**
     * Imposta il valore della proprietà abstractCollectorRef.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralCollectorType.AbstractCollectorRef }
     *     
     */
    public void setAbstractCollectorRef(GeneralCollectorType.AbstractCollectorRef value) {
        this.abstractCollectorRef = value;
    }

    /**
     * Recupera il valore della proprietà driver.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDriver() {
        return driver;
    }

    /**
     * Imposta il valore della proprietà driver.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDriver(String value) {
        this.driver = value;
    }

    /**
     * Recupera il valore della proprietà expirationTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpirationTime() {
        return expirationTime;
    }

    /**
     * Imposta il valore della proprietà expirationTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpirationTime(XMLGregorianCalendar value) {
        this.expirationTime = value;
    }

    /**
     * Recupera il valore della proprietà descriptor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptor() {
        return descriptor;
    }

    /**
     * Imposta il valore della proprietà descriptor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptor(String value) {
        this.descriptor = value;
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
     * Recupera il valore della proprietà isStatic.
     * 
     */
    public boolean isIsStatic() {
        return isStatic;
    }

    /**
     * Imposta il valore della proprietà isStatic.
     * 
     */
    public void setIsStatic(boolean value) {
        this.isStatic = value;
    }

    /**
     * Recupera il valore della proprietà toDeploy.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isToDeploy() {
        return toDeploy;
    }

    /**
     * Imposta il valore della proprietà toDeploy.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setToDeploy(Boolean value) {
        this.toDeploy = value;
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
     *         &lt;element name="TestCase" type="{http://www.cumulus.org/certificate/model/test}TestCaseType" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    public static class AbstractCollectorRef {

        @XmlElement(name = "TestCase")
        protected List<TestCaseType> testCase;
        @XmlAttribute(name = "id", required = true)
        protected String id;

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
     *         &lt;element name="TestMetrics">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.cumulus.org/certificate/model/test}TestMetricsType">
     *                 &lt;attribute name="CombiningAlgorithm" type="{http://www.w3.org/2001/XMLSchema}string" default="AND" />
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="AggregatorDescription" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="transient" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "testMetrics"
    })
    public static class Aggregator {

        @XmlElement(name = "TestMetrics", required = true)
        protected GeneralCollectorType.Aggregator.TestMetrics testMetrics;
        @XmlAttribute(name = "AggregatorDescription")
        protected String aggregatorDescription;
        @XmlAttribute(name = "transient")
        protected String _transient;

        /**
         * Recupera il valore della proprietà testMetrics.
         * 
         * @return
         *     possible object is
         *     {@link GeneralCollectorType.Aggregator.TestMetrics }
         *     
         */
        public GeneralCollectorType.Aggregator.TestMetrics getTestMetrics() {
            return testMetrics;
        }

        /**
         * Imposta il valore della proprietà testMetrics.
         * 
         * @param value
         *     allowed object is
         *     {@link GeneralCollectorType.Aggregator.TestMetrics }
         *     
         */
        public void setTestMetrics(GeneralCollectorType.Aggregator.TestMetrics value) {
            this.testMetrics = value;
        }

        /**
         * Recupera il valore della proprietà aggregatorDescription.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAggregatorDescription() {
            return aggregatorDescription;
        }

        /**
         * Imposta il valore della proprietà aggregatorDescription.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAggregatorDescription(String value) {
            this.aggregatorDescription = value;
        }

        /**
         * Recupera il valore della proprietà transient.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTransient() {
            return _transient;
        }

        /**
         * Imposta il valore della proprietà transient.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTransient(String value) {
            this._transient = value;
        }


        /**
         * <p>Classe Java per anonymous complex type.
         * 
         * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.cumulus.org/certificate/model/test}TestMetricsType">
         *       &lt;attribute name="CombiningAlgorithm" type="{http://www.w3.org/2001/XMLSchema}string" default="AND" />
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class TestMetrics
            extends TestMetricsType
        {

            @XmlAttribute(name = "CombiningAlgorithm")
            protected String combiningAlgorithm;

            /**
             * Recupera il valore della proprietà combiningAlgorithm.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCombiningAlgorithm() {
                if (combiningAlgorithm == null) {
                    return "AND";
                } else {
                    return combiningAlgorithm;
                }
            }

            /**
             * Imposta il valore della proprietà combiningAlgorithm.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCombiningAlgorithm(String value) {
                this.combiningAlgorithm = value;
            }

        }

    }

}
