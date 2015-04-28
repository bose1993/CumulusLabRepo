//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2015.04.28 alle 02:17:59 PM CEST 
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
 * <p>Classe Java per GuaranteedActionType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="GuaranteedActionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.slaatsoi.eu/slamodel}IDType"/>
 *         &lt;element name="ActorRef" type="{http://www.slaatsoi.eu/slamodel}IDType"/>
 *         &lt;element name="Policy" type="{http://www.slaatsoi.eu/slamodel}STNDType"/>
 *         &lt;element name="Precondition" type="{http://www.slaatsoi.eu/slamodel}EventExprType"/>
 *         &lt;element name="Postcondition" type="{http://www.slaatsoi.eu/slamodel}GuaranteedActionDefnType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GuaranteedActionType", propOrder = {
    "id",
    "actorRef",
    "policy",
    "precondition",
    "postcondition"
})
public class GuaranteedActionType {

    @XmlList
    @XmlElement(name = "ID", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected List<String> id;
    @XmlList
    @XmlElement(name = "ActorRef", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected List<String> actorRef;
    @XmlList
    @XmlElement(name = "Policy", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected List<String> policy;
    @XmlElement(name = "Precondition", required = true)
    protected EventExprType precondition;
    @XmlElement(name = "Postcondition", required = true)
    protected GuaranteedActionDefnType postcondition;

    /**
     * Gets the value of the id property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the id property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getID() {
        if (id == null) {
            id = new ArrayList<String>();
        }
        return this.id;
    }

    /**
     * Gets the value of the actorRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the actorRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActorRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getActorRef() {
        if (actorRef == null) {
            actorRef = new ArrayList<String>();
        }
        return this.actorRef;
    }

    /**
     * Gets the value of the policy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the policy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPolicy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPolicy() {
        if (policy == null) {
            policy = new ArrayList<String>();
        }
        return this.policy;
    }

    /**
     * Recupera il valore della proprietà precondition.
     * 
     * @return
     *     possible object is
     *     {@link EventExprType }
     *     
     */
    public EventExprType getPrecondition() {
        return precondition;
    }

    /**
     * Imposta il valore della proprietà precondition.
     * 
     * @param value
     *     allowed object is
     *     {@link EventExprType }
     *     
     */
    public void setPrecondition(EventExprType value) {
        this.precondition = value;
    }

    /**
     * Recupera il valore della proprietà postcondition.
     * 
     * @return
     *     possible object is
     *     {@link GuaranteedActionDefnType }
     *     
     */
    public GuaranteedActionDefnType getPostcondition() {
        return postcondition;
    }

    /**
     * Imposta il valore della proprietà postcondition.
     * 
     * @param value
     *     allowed object is
     *     {@link GuaranteedActionDefnType }
     *     
     */
    public void setPostcondition(GuaranteedActionDefnType value) {
        this.postcondition = value;
    }

}
