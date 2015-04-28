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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per targetOfTestsType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="targetOfTestsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ToT" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.cumulus.org/certificate/model}totType">
 *                 &lt;attribute name="collectorRefID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
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
@XmlType(name = "targetOfTestsType", propOrder = {
    "toT"
})
public class TargetOfTestsType {

    @XmlElement(name = "ToT", required = true)
    protected List<TargetOfTestsType.ToT> toT;

    /**
     * Gets the value of the toT property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the toT property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getToT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TargetOfTestsType.ToT }
     * 
     * 
     */
    public List<TargetOfTestsType.ToT> getToT() {
        if (toT == null) {
            toT = new ArrayList<TargetOfTestsType.ToT>();
        }
        return this.toT;
    }


    /**
     * <p>Classe Java per anonymous complex type.
     * 
     * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.cumulus.org/certificate/model}totType">
     *       &lt;attribute name="collectorRefID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ToT
        extends TotType
    {

        @XmlAttribute(name = "collectorRefID")
        protected String collectorRefID;

        /**
         * Recupera il valore della proprietà collectorRefID.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCollectorRefID() {
            return collectorRefID;
        }

        /**
         * Imposta il valore della proprietà collectorRefID.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCollectorRefID(String value) {
            this.collectorRefID = value;
        }

    }

}
