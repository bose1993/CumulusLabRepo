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
 * <p>Classe Java per GuaranteedActionDefnType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="GuaranteedActionDefnType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.slaatsoi.eu/slamodel}AnnotatedType">
 *       &lt;choice>
 *         &lt;element name="TerminationAction" type="{http://www.slaatsoi.eu/slamodel}TerminationActionType"/>
 *         &lt;element name="PenaltyAction" type="{http://www.slaatsoi.eu/slamodel}PenaltyActionType"/>
 *         &lt;element name="ProductOfferingPrice" type="{http://www.slaatsoi.eu/slamodel}ProductOfferingPriceType"/>
 *         &lt;element name="TerminationClause" type="{http://www.slaatsoi.eu/slamodel}TerminationClauseType"/>
 *         &lt;element name="CompoundAction" type="{http://www.slaatsoi.eu/slamodel}CompoundActionType"/>
 *         &lt;element name="CustomAction" type="{http://www.slaatsoi.eu/slamodel}CustomActionType"/>
 *         &lt;element name="Invocation" type="{http://www.slaatsoi.eu/slamodel}InvocationType"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GuaranteedActionDefnType", propOrder = {
    "terminationAction",
    "penaltyAction",
    "productOfferingPrice",
    "terminationClause",
    "compoundAction",
    "customAction",
    "invocation"
})
public class GuaranteedActionDefnType
    extends AnnotatedType
{

    @XmlElement(name = "TerminationAction")
    protected TerminationActionType terminationAction;
    @XmlElement(name = "PenaltyAction")
    protected PenaltyActionType penaltyAction;
    @XmlElement(name = "ProductOfferingPrice")
    protected ProductOfferingPriceType productOfferingPrice;
    @XmlElement(name = "TerminationClause")
    protected TerminationClauseType terminationClause;
    @XmlElement(name = "CompoundAction")
    protected CompoundActionType compoundAction;
    @XmlElement(name = "CustomAction")
    protected CustomActionType customAction;
    @XmlElement(name = "Invocation")
    protected InvocationType invocation;

    /**
     * Recupera il valore della proprietà terminationAction.
     * 
     * @return
     *     possible object is
     *     {@link TerminationActionType }
     *     
     */
    public TerminationActionType getTerminationAction() {
        return terminationAction;
    }

    /**
     * Imposta il valore della proprietà terminationAction.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminationActionType }
     *     
     */
    public void setTerminationAction(TerminationActionType value) {
        this.terminationAction = value;
    }

    /**
     * Recupera il valore della proprietà penaltyAction.
     * 
     * @return
     *     possible object is
     *     {@link PenaltyActionType }
     *     
     */
    public PenaltyActionType getPenaltyAction() {
        return penaltyAction;
    }

    /**
     * Imposta il valore della proprietà penaltyAction.
     * 
     * @param value
     *     allowed object is
     *     {@link PenaltyActionType }
     *     
     */
    public void setPenaltyAction(PenaltyActionType value) {
        this.penaltyAction = value;
    }

    /**
     * Recupera il valore della proprietà productOfferingPrice.
     * 
     * @return
     *     possible object is
     *     {@link ProductOfferingPriceType }
     *     
     */
    public ProductOfferingPriceType getProductOfferingPrice() {
        return productOfferingPrice;
    }

    /**
     * Imposta il valore della proprietà productOfferingPrice.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductOfferingPriceType }
     *     
     */
    public void setProductOfferingPrice(ProductOfferingPriceType value) {
        this.productOfferingPrice = value;
    }

    /**
     * Recupera il valore della proprietà terminationClause.
     * 
     * @return
     *     possible object is
     *     {@link TerminationClauseType }
     *     
     */
    public TerminationClauseType getTerminationClause() {
        return terminationClause;
    }

    /**
     * Imposta il valore della proprietà terminationClause.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminationClauseType }
     *     
     */
    public void setTerminationClause(TerminationClauseType value) {
        this.terminationClause = value;
    }

    /**
     * Recupera il valore della proprietà compoundAction.
     * 
     * @return
     *     possible object is
     *     {@link CompoundActionType }
     *     
     */
    public CompoundActionType getCompoundAction() {
        return compoundAction;
    }

    /**
     * Imposta il valore della proprietà compoundAction.
     * 
     * @param value
     *     allowed object is
     *     {@link CompoundActionType }
     *     
     */
    public void setCompoundAction(CompoundActionType value) {
        this.compoundAction = value;
    }

    /**
     * Recupera il valore della proprietà customAction.
     * 
     * @return
     *     possible object is
     *     {@link CustomActionType }
     *     
     */
    public CustomActionType getCustomAction() {
        return customAction;
    }

    /**
     * Imposta il valore della proprietà customAction.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomActionType }
     *     
     */
    public void setCustomAction(CustomActionType value) {
        this.customAction = value;
    }

    /**
     * Recupera il valore della proprietà invocation.
     * 
     * @return
     *     possible object is
     *     {@link InvocationType }
     *     
     */
    public InvocationType getInvocation() {
        return invocation;
    }

    /**
     * Imposta il valore della proprietà invocation.
     * 
     * @param value
     *     allowed object is
     *     {@link InvocationType }
     *     
     */
    public void setInvocation(InvocationType value) {
        this.invocation = value;
    }

}
