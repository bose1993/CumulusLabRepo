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
 * <p>Classe Java per ConstraintExprType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ConstraintExprType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="CompoundConstraintExpr" type="{http://www.slaatsoi.eu/slamodel}CompoundConstraintExprType"/>
 *         &lt;element name="TypeConstraintExpr" type="{http://www.slaatsoi.eu/slamodel}TypeConstraintExprType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConstraintExprType", propOrder = {
    "compoundConstraintExpr",
    "typeConstraintExpr"
})
public class ConstraintExprType {

    @XmlElement(name = "CompoundConstraintExpr")
    protected CompoundConstraintExprType compoundConstraintExpr;
    @XmlElement(name = "TypeConstraintExpr")
    protected TypeConstraintExprType typeConstraintExpr;

    /**
     * Recupera il valore della proprietà compoundConstraintExpr.
     * 
     * @return
     *     possible object is
     *     {@link CompoundConstraintExprType }
     *     
     */
    public CompoundConstraintExprType getCompoundConstraintExpr() {
        return compoundConstraintExpr;
    }

    /**
     * Imposta il valore della proprietà compoundConstraintExpr.
     * 
     * @param value
     *     allowed object is
     *     {@link CompoundConstraintExprType }
     *     
     */
    public void setCompoundConstraintExpr(CompoundConstraintExprType value) {
        this.compoundConstraintExpr = value;
    }

    /**
     * Recupera il valore della proprietà typeConstraintExpr.
     * 
     * @return
     *     possible object is
     *     {@link TypeConstraintExprType }
     *     
     */
    public TypeConstraintExprType getTypeConstraintExpr() {
        return typeConstraintExpr;
    }

    /**
     * Imposta il valore della proprietà typeConstraintExpr.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeConstraintExprType }
     *     
     */
    public void setTypeConstraintExpr(TypeConstraintExprType value) {
        this.typeConstraintExpr = value;
    }

}
