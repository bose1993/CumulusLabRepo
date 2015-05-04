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
 * <p>Classe Java per InterfaceOperationPropertyType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="InterfaceOperationPropertyType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.slaatsoi.eu/slamodel}AnnotatedType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.slaatsoi.eu/slamodel}IDType"/>
 *         &lt;element name="Auxiliary" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Datatype" type="{http://www.slaatsoi.eu/slamodel}STNDType" minOccurs="0"/>
 *         &lt;element name="Domain" type="{http://www.slaatsoi.eu/slamodel}DomainExprType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InterfaceOperationPropertyType", propOrder = {
    "name",
    "auxiliary",
    "datatype",
    "domain"
})
public class InterfaceOperationPropertyType
    extends AnnotatedType
{

    @XmlList
    @XmlElement(name = "Name", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected List<String> name;
    @XmlElement(name = "Auxiliary")
    protected boolean auxiliary;
    @XmlList
    @XmlElement(name = "Datatype")
    @XmlSchemaType(name = "anySimpleType")
    protected List<String> datatype;
    @XmlElement(name = "Domain")
    protected DomainExprType domain;

    /**
     * Gets the value of the name property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the name property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getName() {
        if (name == null) {
            name = new ArrayList<String>();
        }
        return this.name;
    }

    /**
     * Recupera il valore della proprietà auxiliary.
     * 
     */
    public boolean isAuxiliary() {
        return auxiliary;
    }

    /**
     * Imposta il valore della proprietà auxiliary.
     * 
     */
    public void setAuxiliary(boolean value) {
        this.auxiliary = value;
    }

    /**
     * Gets the value of the datatype property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the datatype property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDatatype().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDatatype() {
        if (datatype == null) {
            datatype = new ArrayList<String>();
        }
        return this.datatype;
    }

    /**
     * Recupera il valore della proprietà domain.
     * 
     * @return
     *     possible object is
     *     {@link DomainExprType }
     *     
     */
    public DomainExprType getDomain() {
        return domain;
    }

    /**
     * Imposta il valore della proprietà domain.
     * 
     * @param value
     *     allowed object is
     *     {@link DomainExprType }
     *     
     */
    public void setDomain(DomainExprType value) {
        this.domain = value;
    }

}
