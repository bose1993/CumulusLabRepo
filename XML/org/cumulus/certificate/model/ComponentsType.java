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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per componentsType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="componentsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Component" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="NameID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Vendor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Release" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ElementRef" type="{http://www.w3.org/2001/XMLSchema}anyURI" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
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
@XmlType(name = "componentsType", propOrder = {
    "component"
})
public class ComponentsType {

    @XmlElement(name = "Component", required = true)
    protected List<ComponentsType.Component> component;

    /**
     * Gets the value of the component property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the component property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComponent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ComponentsType.Component }
     * 
     * 
     */
    public List<ComponentsType.Component> getComponent() {
        if (component == null) {
            component = new ArrayList<ComponentsType.Component>();
        }
        return this.component;
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
     *         &lt;element name="NameID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Vendor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Release" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ElementRef" type="{http://www.w3.org/2001/XMLSchema}anyURI" maxOccurs="unbounded" minOccurs="0"/>
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
        "nameID",
        "vendor",
        "release",
        "description",
        "elementRef"
    })
    public static class Component {

        @XmlElement(name = "NameID")
        protected String nameID;
        @XmlElement(name = "Vendor")
        protected String vendor;
        @XmlElement(name = "Release")
        protected String release;
        @XmlElement(name = "Description")
        protected String description;
        @XmlElement(name = "ElementRef")
        @XmlSchemaType(name = "anyURI")
        protected List<String> elementRef;

        /**
         * Recupera il valore della proprietà nameID.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNameID() {
            return nameID;
        }

        /**
         * Imposta il valore della proprietà nameID.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNameID(String value) {
            this.nameID = value;
        }

        /**
         * Recupera il valore della proprietà vendor.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVendor() {
            return vendor;
        }

        /**
         * Imposta il valore della proprietà vendor.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVendor(String value) {
            this.vendor = value;
        }

        /**
         * Recupera il valore della proprietà release.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRelease() {
            return release;
        }

        /**
         * Imposta il valore della proprietà release.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRelease(String value) {
            this.release = value;
        }

        /**
         * Recupera il valore della proprietà description.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDescription() {
            return description;
        }

        /**
         * Imposta il valore della proprietà description.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDescription(String value) {
            this.description = value;
        }

        /**
         * Gets the value of the elementRef property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the elementRef property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getElementRef().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getElementRef() {
            if (elementRef == null) {
                elementRef = new ArrayList<String>();
            }
            return this.elementRef;
        }

    }

}
