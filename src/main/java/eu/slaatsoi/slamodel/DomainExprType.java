//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2015.05.04 alle 06:00:58 PM CEST 
//


package eu.slaatsoi.slamodel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per DomainExprType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DomainExprType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="SimpleDomainExpr" type="{http://www.slaatsoi.eu/slamodel}SimpleDomainExprType"/>
 *         &lt;element name="CompoundDomainExpr" type="{http://www.slaatsoi.eu/slamodel}CompoundDomainExprType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DomainExprType", propOrder = {
    "simpleDomainExpr",
    "compoundDomainExpr"
})
public class DomainExprType {

    @XmlElement(name = "SimpleDomainExpr")
    protected SimpleDomainExprType simpleDomainExpr;
    @XmlElement(name = "CompoundDomainExpr")
    protected CompoundDomainExprType compoundDomainExpr;

    /**
     * Recupera il valore della proprietà simpleDomainExpr.
     * 
     * @return
     *     possible object is
     *     {@link SimpleDomainExprType }
     *     
     */
    public SimpleDomainExprType getSimpleDomainExpr() {
        return simpleDomainExpr;
    }

    /**
     * Imposta il valore della proprietà simpleDomainExpr.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleDomainExprType }
     *     
     */
    public void setSimpleDomainExpr(SimpleDomainExprType value) {
        this.simpleDomainExpr = value;
    }

    /**
     * Recupera il valore della proprietà compoundDomainExpr.
     * 
     * @return
     *     possible object is
     *     {@link CompoundDomainExprType }
     *     
     */
    public CompoundDomainExprType getCompoundDomainExpr() {
        return compoundDomainExpr;
    }

    /**
     * Imposta il valore della proprietà compoundDomainExpr.
     * 
     * @param value
     *     allowed object is
     *     {@link CompoundDomainExprType }
     *     
     */
    public void setCompoundDomainExpr(CompoundDomainExprType value) {
        this.compoundDomainExpr = value;
    }

}
