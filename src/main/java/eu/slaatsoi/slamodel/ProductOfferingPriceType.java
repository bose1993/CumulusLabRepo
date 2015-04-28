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
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ProductOfferingPriceType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ProductOfferingPriceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.slaatsoi.eu/slamodel}IDType"/>
 *         &lt;element name="Product" type="{http://www.slaatsoi.eu/slamodel}ProductType" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BillingFrequency" type="{http://www.slaatsoi.eu/slamodel}STNDType"/>
 *         &lt;element name="ValidFrom" type="{http://www.slaatsoi.eu/slamodel}TimeType"/>
 *         &lt;element name="ValidUntil" type="{http://www.slaatsoi.eu/slamodel}TimeType"/>
 *         &lt;element name="ComponentProdOfferingPrice" type="{http://www.slaatsoi.eu/slamodel}ComponentProdOfferingPriceType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductOfferingPriceType", propOrder = {
    "id",
    "product",
    "name",
    "description",
    "billingFrequency",
    "validFrom",
    "validUntil",
    "componentProdOfferingPrice"
})
public class ProductOfferingPriceType {

    @XmlList
    @XmlElement(name = "ID", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected List<String> id;
    @XmlElement(name = "Product")
    protected ProductType product;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Description", required = true)
    protected String description;
    @XmlList
    @XmlElement(name = "BillingFrequency", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected List<String> billingFrequency;
    @XmlElement(name = "ValidFrom", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String validFrom;
    @XmlElement(name = "ValidUntil", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String validUntil;
    @XmlElement(name = "ComponentProdOfferingPrice", required = true)
    protected List<ComponentProdOfferingPriceType> componentProdOfferingPrice;

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
     * Recupera il valore della proprietà product.
     * 
     * @return
     *     possible object is
     *     {@link ProductType }
     *     
     */
    public ProductType getProduct() {
        return product;
    }

    /**
     * Imposta il valore della proprietà product.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductType }
     *     
     */
    public void setProduct(ProductType value) {
        this.product = value;
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
     * Gets the value of the billingFrequency property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the billingFrequency property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBillingFrequency().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getBillingFrequency() {
        if (billingFrequency == null) {
            billingFrequency = new ArrayList<String>();
        }
        return this.billingFrequency;
    }

    /**
     * Recupera il valore della proprietà validFrom.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidFrom() {
        return validFrom;
    }

    /**
     * Imposta il valore della proprietà validFrom.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidFrom(String value) {
        this.validFrom = value;
    }

    /**
     * Recupera il valore della proprietà validUntil.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidUntil() {
        return validUntil;
    }

    /**
     * Imposta il valore della proprietà validUntil.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidUntil(String value) {
        this.validUntil = value;
    }

    /**
     * Gets the value of the componentProdOfferingPrice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the componentProdOfferingPrice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComponentProdOfferingPrice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ComponentProdOfferingPriceType }
     * 
     * 
     */
    public List<ComponentProdOfferingPriceType> getComponentProdOfferingPrice() {
        if (componentProdOfferingPrice == null) {
            componentProdOfferingPrice = new ArrayList<ComponentProdOfferingPriceType>();
        }
        return this.componentProdOfferingPrice;
    }

}
