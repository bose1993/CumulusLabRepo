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
 * <p>Classe Java per VariableDeclrType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="VariableDeclrType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.slaatsoi.eu/slamodel}AnnotatedType">
 *       &lt;choice>
 *         &lt;sequence>
 *           &lt;element name="Var" type="{http://www.slaatsoi.eu/slamodel}IDType"/>
 *           &lt;element name="Expr" type="{http://www.slaatsoi.eu/slamodel}ExprType"/>
 *         &lt;/sequence>
 *         &lt;element name="Customisable" type="{http://www.slaatsoi.eu/slamodel}CustomisableType"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VariableDeclrType", propOrder = {
    "var",
    "expr",
    "customisable"
})
public class VariableDeclrType
    extends AnnotatedType
{

    @XmlList
    @XmlElement(name = "Var")
    @XmlSchemaType(name = "anySimpleType")
    protected List<String> var;
    @XmlElement(name = "Expr")
    protected ExprType expr;
    @XmlElement(name = "Customisable")
    protected CustomisableType customisable;

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
     * Recupera il valore della proprietà expr.
     * 
     * @return
     *     possible object is
     *     {@link ExprType }
     *     
     */
    public ExprType getExpr() {
        return expr;
    }

    /**
     * Imposta il valore della proprietà expr.
     * 
     * @param value
     *     allowed object is
     *     {@link ExprType }
     *     
     */
    public void setExpr(ExprType value) {
        this.expr = value;
    }

    /**
     * Recupera il valore della proprietà customisable.
     * 
     * @return
     *     possible object is
     *     {@link CustomisableType }
     *     
     */
    public CustomisableType getCustomisable() {
        return customisable;
    }

    /**
     * Imposta il valore della proprietà customisable.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomisableType }
     *     
     */
    public void setCustomisable(CustomisableType value) {
        this.customisable = value;
    }

}
