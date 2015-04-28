//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2015.04.28 alle 02:17:59 PM CEST 
//


package org.cumulus.certificate.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import eu.slaatsoi.slamodel.InvocationType;


/**
 * <p>Classe Java per OperationRefType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="OperationRefType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="invocation" type="{http://www.slaatsoi.eu/slamodel}InvocationType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="interfaceId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperationRefType", propOrder = {
    "invocation"
})
public class OperationRefType {

    @XmlElement(required = true)
    protected InvocationType invocation;
    @XmlAttribute(name = "interfaceId")
    protected String interfaceId;

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

    /**
     * Recupera il valore della proprietà interfaceId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterfaceId() {
        return interfaceId;
    }

    /**
     * Imposta il valore della proprietà interfaceId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterfaceId(String value) {
        this.interfaceId = value;
    }

}
