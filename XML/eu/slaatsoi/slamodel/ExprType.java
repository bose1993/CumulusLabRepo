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
 * <p>Classe Java per ExprType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ExprType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="ValueExpr" type="{http://www.slaatsoi.eu/slamodel}ValueExprType"/>
 *         &lt;element name="ConstraintExpr" type="{http://www.slaatsoi.eu/slamodel}ConstraintExprType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExprType", propOrder = {
    "valueExpr",
    "constraintExpr"
})
public class ExprType {

    @XmlElement(name = "ValueExpr")
    protected ValueExprType valueExpr;
    @XmlElement(name = "ConstraintExpr")
    protected ConstraintExprType constraintExpr;

    /**
     * Recupera il valore della proprietà valueExpr.
     * 
     * @return
     *     possible object is
     *     {@link ValueExprType }
     *     
     */
    public ValueExprType getValueExpr() {
        return valueExpr;
    }

    /**
     * Imposta il valore della proprietà valueExpr.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueExprType }
     *     
     */
    public void setValueExpr(ValueExprType value) {
        this.valueExpr = value;
    }

    /**
     * Recupera il valore della proprietà constraintExpr.
     * 
     * @return
     *     possible object is
     *     {@link ConstraintExprType }
     *     
     */
    public ConstraintExprType getConstraintExpr() {
        return constraintExpr;
    }

    /**
     * Imposta il valore della proprietà constraintExpr.
     * 
     * @param value
     *     allowed object is
     *     {@link ConstraintExprType }
     *     
     */
    public void setConstraintExpr(ConstraintExprType value) {
        this.constraintExpr = value;
    }

}
