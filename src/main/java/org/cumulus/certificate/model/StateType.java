//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2015.05.04 alle 06:00:58 PM CEST 
//


package org.cumulus.certificate.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per StateType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="StateType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="atomicState" type="{http://www.cumulus.org/certificate/model}AtomicStateType" minOccurs="0"/>
 *         &lt;element name="compositeState" type="{http://www.cumulus.org/certificate/model}CompositeStateType" minOccurs="0"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StateType", propOrder = {
    "atomicState",
    "compositeState"
})
public class StateType {

    protected AtomicStateType atomicState;
    protected CompositeStateType compositeState;

    /**
     * Recupera il valore della proprietà atomicState.
     * 
     * @return
     *     possible object is
     *     {@link AtomicStateType }
     *     
     */
    public AtomicStateType getAtomicState() {
        return atomicState;
    }

    /**
     * Imposta il valore della proprietà atomicState.
     * 
     * @param value
     *     allowed object is
     *     {@link AtomicStateType }
     *     
     */
    public void setAtomicState(AtomicStateType value) {
        this.atomicState = value;
    }

    /**
     * Recupera il valore della proprietà compositeState.
     * 
     * @return
     *     possible object is
     *     {@link CompositeStateType }
     *     
     */
    public CompositeStateType getCompositeState() {
        return compositeState;
    }

    /**
     * Imposta il valore della proprietà compositeState.
     * 
     * @param value
     *     allowed object is
     *     {@link CompositeStateType }
     *     
     */
    public void setCompositeState(CompositeStateType value) {
        this.compositeState = value;
    }

}
