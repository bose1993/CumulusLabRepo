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
 * <p>Classe Java per CustomisableType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="CustomisableType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Var" type="{http://www.slaatsoi.eu/slamodel}IDType"/>
 *         &lt;element name="Value" type="{http://www.slaatsoi.eu/slamodel}CONSTType"/>
 *         &lt;element name="Expr" type="{http://www.slaatsoi.eu/slamodel}DomainExprType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomisableType", propOrder = {
    "var",
    "value",
    "expr"
})
public class CustomisableType {

    @XmlList
    @XmlElement(name = "Var", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected List<String> var;
    @XmlElement(name = "Value", required = true)
    protected CONSTType value;
    @XmlElement(name = "Expr", required = true)
    protected DomainExprType expr;

    /**
     * Gets the value of the var property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the var property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVar().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getVar() {
        if (var == null) {
            var = new ArrayList<String>();
        }
        return this.var;
    }

    /**
     * Recupera il valore della proprietà value.
     * 
     * @return
     *     possible object is
     *     {@link CONSTType }
     *     
     */
    public CONSTType getValue() {
        return value;
    }

    /**
     * Imposta il valore della proprietà value.
     * 
     * @param value
     *     allowed object is
     *     {@link CONSTType }
     *     
     */
    public void setValue(CONSTType value) {
        this.value = value;
    }

    /**
     * Recupera il valore della proprietà expr.
     * 
     * @return
     *     possible object is
     *     {@link DomainExprType }
     *     
     */
    public DomainExprType getExpr() {
        return expr;
    }

    /**
     * Imposta il valore della proprietà expr.
     * 
     * @param value
     *     allowed object is
     *     {@link DomainExprType }
     *     
     */
    public void setExpr(DomainExprType value) {
        this.expr = value;
    }

}
