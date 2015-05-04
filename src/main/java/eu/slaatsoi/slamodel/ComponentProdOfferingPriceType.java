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
 * <p>Classe Java per ComponentProdOfferingPriceType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ComponentProdOfferingPriceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.slaatsoi.eu/slamodel}IDType"/>
 *         &lt;element name="PriceType" type="{http://www.slaatsoi.eu/slamodel}STNDType"/>
 *         &lt;element name="Price" type="{http://www.slaatsoi.eu/slamodel}CONSTType"/>
 *         &lt;element name="Quantity" type="{http://www.slaatsoi.eu/slamodel}CONSTType"/>
 *         &lt;element name="PriceModification" type="{http://www.slaatsoi.eu/slamodel}PriceModificationType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComponentProdOfferingPriceType", propOrder = {
    "id",
    "priceType",
    "price",
    "quantity",
    "priceModification"
})
public class ComponentProdOfferingPriceType {

    @XmlList
    @XmlElement(name = "ID", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected List<String> id;
    @XmlList
    @XmlElement(name = "PriceType", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected List<String> priceType;
    @XmlElement(name = "Price", required = true)
    protected CONSTType price;
    @XmlElement(name = "Quantity", required = true)
    protected CONSTType quantity;
    @XmlElement(name = "PriceModification")
    protected List<PriceModificationType> priceModification;

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
     * Gets the value of the priceType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the priceType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPriceType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPriceType() {
        if (priceType == null) {
            priceType = new ArrayList<String>();
        }
        return this.priceType;
    }

    /**
     * Recupera il valore della proprietà price.
     * 
     * @return
     *     possible object is
     *     {@link CONSTType }
     *     
     */
    public CONSTType getPrice() {
        return price;
    }

    /**
     * Imposta il valore della proprietà price.
     * 
     * @param value
     *     allowed object is
     *     {@link CONSTType }
     *     
     */
    public void setPrice(CONSTType value) {
        this.price = value;
    }

    /**
     * Recupera il valore della proprietà quantity.
     * 
     * @return
     *     possible object is
     *     {@link CONSTType }
     *     
     */
    public CONSTType getQuantity() {
        return quantity;
    }

    /**
     * Imposta il valore della proprietà quantity.
     * 
     * @param value
     *     allowed object is
     *     {@link CONSTType }
     *     
     */
    public void setQuantity(CONSTType value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the priceModification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the priceModification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPriceModification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PriceModificationType }
     * 
     * 
     */
    public List<PriceModificationType> getPriceModification() {
        if (priceModification == null) {
            priceModification = new ArrayList<PriceModificationType>();
        }
        return this.priceModification;
    }

}
