//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2015.04.28 alle 02:17:59 PM CEST 
//


package eu.slaatsoi.slamodel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per TypeConstraintExprType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TypeConstraintExprType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Value" type="{http://www.slaatsoi.eu/slamodel}ValueExprType"/>
 *         &lt;element name="Domain" type="{http://www.slaatsoi.eu/slamodel}DomainExprType"/>
 *         &lt;element name="Error" type="{http://www.slaatsoi.eu/slamodel}CONSTType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TypeConstraintExprType", propOrder = {
    "value",
    "domain",
    "error"
})
public class TypeConstraintExprType {

    @XmlElement(name = "Value", required = true)
    protected ValueExprType value;
    @XmlElement(name = "Domain", required = true)
    protected DomainExprType domain;
    @XmlElement(name = "Error")
    protected CONSTType error;

    /**
     * Recupera il valore della proprietà value.
     * 
     * @return
     *     possible object is
     *     {@link ValueExprType }
     *     
     */
    public ValueExprType getValue() {
        return value;
    }

    /**
     * Imposta il valore della proprietà value.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueExprType }
     *     
     */
    public void setValue(ValueExprType value) {
        this.value = value;
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

    /**
     * Recupera il valore della proprietà error.
     * 
     * @return
     *     possible object is
     *     {@link CONSTType }
     *     
     */
    public CONSTType getError() {
        return error;
    }

    /**
     * Imposta il valore della proprietà error.
     * 
     * @param value
     *     allowed object is
     *     {@link CONSTType }
     *     
     */
    public void setError(CONSTType value) {
        this.error = value;
    }

}
