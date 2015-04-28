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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per TestMetricsType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TestMetricsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TestMetric" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="expected" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="tested" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="operation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TestMetricsType", propOrder = {
    "testMetric"
})
@XmlSeeAlso({
    org.cumulus.certificate.model.test.GeneralCollectorType.Aggregator.TestMetrics.class
})
public class TestMetricsType {

    @XmlElement(name = "TestMetric", required = true)
    protected List<TestMetricsType.TestMetric> testMetric;

    /**
     * Gets the value of the testMetric property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the testMetric property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTestMetric().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TestMetricsType.TestMetric }
     * 
     * 
     */
    public List<TestMetricsType.TestMetric> getTestMetric() {
        if (testMetric == null) {
            testMetric = new ArrayList<TestMetricsType.TestMetric>();
        }
        return this.testMetric;
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
     *         &lt;element name="expected" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="tested" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="operation" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "expected",
        "tested",
        "operation"
    })
    public static class TestMetric {

        @XmlElement(required = true)
        protected String expected;
        @XmlElement(required = true)
        protected String tested;
        @XmlElement(required = true, defaultValue = ">")
        protected String operation;
        @XmlAttribute(name = "name")
        protected String name;

        /**
         * Recupera il valore della proprietà expected.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExpected() {
            return expected;
        }

        /**
         * Imposta il valore della proprietà expected.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExpected(String value) {
            this.expected = value;
        }

        /**
         * Recupera il valore della proprietà tested.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTested() {
            return tested;
        }

        /**
         * Imposta il valore della proprietà tested.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTested(String value) {
            this.tested = value;
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

        /**
         * Recupera il valore della proprietà name.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Imposta il valore della proprietà name.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

    }

}
