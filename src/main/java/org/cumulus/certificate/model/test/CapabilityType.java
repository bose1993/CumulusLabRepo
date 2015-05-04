//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2015.05.04 alle 06:00:58 PM CEST 
//


package org.cumulus.certificate.model.test;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per CapabilityType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="CapabilityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded">
 *         &lt;element name="Attacker" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AttackName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AttackerCapabilities">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded">
 *                   &lt;element name="CapabilityId" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="AttackerCapability" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CapabilityType", propOrder = {
    "attackerAndAttackNameAndAttackerCapabilities"
})
public class CapabilityType {

    @XmlElementRefs({
        @XmlElementRef(name = "Attacker", type = JAXBElement.class),
        @XmlElementRef(name = "AttackName", type = JAXBElement.class),
        @XmlElementRef(name = "AttackerCapabilities", type = JAXBElement.class)
    })
    protected List<JAXBElement<?>> attackerAndAttackNameAndAttackerCapabilities;

    /**
     * Gets the value of the attackerAndAttackNameAndAttackerCapabilities property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attackerAndAttackNameAndAttackerCapabilities property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttackerAndAttackNameAndAttackerCapabilities().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link CapabilityType.AttackerCapabilities }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getAttackerAndAttackNameAndAttackerCapabilities() {
        if (attackerAndAttackNameAndAttackerCapabilities == null) {
            attackerAndAttackNameAndAttackerCapabilities = new ArrayList<JAXBElement<?>>();
        }
        return this.attackerAndAttackNameAndAttackerCapabilities;
    }


    /**
     * <p>Classe Java per anonymous complex type.
     * 
     * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence maxOccurs="unbounded">
     *         &lt;element name="CapabilityId" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="AttackerCapability" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "capabilityIdAndAttackerCapability"
    })
    public static class AttackerCapabilities {

        @XmlElements({
            @XmlElement(name = "CapabilityId", required = true, type = BigInteger.class),
            @XmlElement(name = "AttackerCapability", required = true, type = String.class)
        })
        protected List<Serializable> capabilityIdAndAttackerCapability;

        /**
         * Gets the value of the capabilityIdAndAttackerCapability property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the capabilityIdAndAttackerCapability property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCapabilityIdAndAttackerCapability().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BigInteger }
         * {@link String }
         * 
         * 
         */
        public List<Serializable> getCapabilityIdAndAttackerCapability() {
            if (capabilityIdAndAttackerCapability == null) {
                capabilityIdAndAttackerCapability = new ArrayList<Serializable>();
            }
            return this.capabilityIdAndAttackerCapability;
        }

    }

}
