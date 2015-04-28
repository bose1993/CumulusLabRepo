//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2015.04.28 alle 02:17:59 PM CEST 
//


package org.cumulus.certificate.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import eu.slaatsoi.slamodel.InterfaceDeclrType;


/**
 * <p>Classe Java per StateTransitionModelType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="StateTransitionModelType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InitialState" type="{http://www.cumulus.org/certificate/model}PseudoStateType"/>
 *         &lt;element name="states" type="{http://www.cumulus.org/certificate/model}StatesType" maxOccurs="unbounded"/>
 *         &lt;element name="transitions" type="{http://www.cumulus.org/certificate/model}TransitionsType" maxOccurs="unbounded"/>
 *         &lt;element name="FinalState" type="{http://www.cumulus.org/certificate/model}PseudoStateType" minOccurs="0"/>
 *         &lt;element name="historyState" type="{http://www.cumulus.org/certificate/model}HistoryStateType" minOccurs="0"/>
 *         &lt;element name="requiresInterface" type="{http://www.slaatsoi.eu/slamodel}InterfaceDeclrType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="providesInterface" type="{http://www.slaatsoi.eu/slamodel}InterfaceDeclrType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StateTransitionModelType", propOrder = {
    "initialState",
    "states",
    "transitions",
    "finalState",
    "historyState",
    "requiresInterface",
    "providesInterface"
})
public class StateTransitionModelType {

    @XmlElement(name = "InitialState", required = true)
    protected PseudoStateType initialState;
    @XmlElement(required = true)
    protected List<StatesType> states;
    @XmlElement(required = true)
    protected List<TransitionsType> transitions;
    @XmlElement(name = "FinalState")
    protected PseudoStateType finalState;
    protected HistoryStateType historyState;
    protected List<InterfaceDeclrType> requiresInterface;
    protected List<InterfaceDeclrType> providesInterface;

    /**
     * Recupera il valore della proprietà initialState.
     * 
     * @return
     *     possible object is
     *     {@link PseudoStateType }
     *     
     */
    public PseudoStateType getInitialState() {
        return initialState;
    }

    /**
     * Imposta il valore della proprietà initialState.
     * 
     * @param value
     *     allowed object is
     *     {@link PseudoStateType }
     *     
     */
    public void setInitialState(PseudoStateType value) {
        this.initialState = value;
    }

    /**
     * Gets the value of the states property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the states property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatesType }
     * 
     * 
     */
    public List<StatesType> getStates() {
        if (states == null) {
            states = new ArrayList<StatesType>();
        }
        return this.states;
    }

    /**
     * Gets the value of the transitions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transitions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransitions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransitionsType }
     * 
     * 
     */
    public List<TransitionsType> getTransitions() {
        if (transitions == null) {
            transitions = new ArrayList<TransitionsType>();
        }
        return this.transitions;
    }

    /**
     * Recupera il valore della proprietà finalState.
     * 
     * @return
     *     possible object is
     *     {@link PseudoStateType }
     *     
     */
    public PseudoStateType getFinalState() {
        return finalState;
    }

    /**
     * Imposta il valore della proprietà finalState.
     * 
     * @param value
     *     allowed object is
     *     {@link PseudoStateType }
     *     
     */
    public void setFinalState(PseudoStateType value) {
        this.finalState = value;
    }

    /**
     * Recupera il valore della proprietà historyState.
     * 
     * @return
     *     possible object is
     *     {@link HistoryStateType }
     *     
     */
    public HistoryStateType getHistoryState() {
        return historyState;
    }

    /**
     * Imposta il valore della proprietà historyState.
     * 
     * @param value
     *     allowed object is
     *     {@link HistoryStateType }
     *     
     */
    public void setHistoryState(HistoryStateType value) {
        this.historyState = value;
    }

    /**
     * Gets the value of the requiresInterface property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requiresInterface property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequiresInterface().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InterfaceDeclrType }
     * 
     * 
     */
    public List<InterfaceDeclrType> getRequiresInterface() {
        if (requiresInterface == null) {
            requiresInterface = new ArrayList<InterfaceDeclrType>();
        }
        return this.requiresInterface;
    }

    /**
     * Gets the value of the providesInterface property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the providesInterface property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProvidesInterface().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InterfaceDeclrType }
     * 
     * 
     */
    public List<InterfaceDeclrType> getProvidesInterface() {
        if (providesInterface == null) {
            providesInterface = new ArrayList<InterfaceDeclrType>();
        }
        return this.providesInterface;
    }

}
