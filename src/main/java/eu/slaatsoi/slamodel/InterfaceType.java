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
 * <p>Classe Java per InterfaceType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="InterfaceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="InterfaceRef" type="{http://www.slaatsoi.eu/slamodel}InterfaceRefType"/>
 *         &lt;element name="InterfaceSpec" type="{http://www.slaatsoi.eu/slamodel}InterfaceSpecType"/>
 *         &lt;element name="InterfaceResourceType" type="{http://www.slaatsoi.eu/slamodel}InterfaceResourceTypeType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InterfaceType", propOrder = {
    "interfaceRef",
    "interfaceSpec",
    "interfaceResourceType"
})
public class InterfaceType {

    @XmlElement(name = "InterfaceRef")
    protected InterfaceRefType interfaceRef;
    @XmlElement(name = "InterfaceSpec")
    protected InterfaceSpecType interfaceSpec;
    @XmlElement(name = "InterfaceResourceType")
    protected InterfaceResourceTypeType interfaceResourceType;

    /**
     * Recupera il valore della proprietà interfaceRef.
     * 
     * @return
     *     possible object is
     *     {@link InterfaceRefType }
     *     
     */
    public InterfaceRefType getInterfaceRef() {
        return interfaceRef;
    }

    /**
     * Imposta il valore della proprietà interfaceRef.
     * 
     * @param value
     *     allowed object is
     *     {@link InterfaceRefType }
     *     
     */
    public void setInterfaceRef(InterfaceRefType value) {
        this.interfaceRef = value;
    }

    /**
     * Recupera il valore della proprietà interfaceSpec.
     * 
     * @return
     *     possible object is
     *     {@link InterfaceSpecType }
     *     
     */
    public InterfaceSpecType getInterfaceSpec() {
        return interfaceSpec;
    }

    /**
     * Imposta il valore della proprietà interfaceSpec.
     * 
     * @param value
     *     allowed object is
     *     {@link InterfaceSpecType }
     *     
     */
    public void setInterfaceSpec(InterfaceSpecType value) {
        this.interfaceSpec = value;
    }

    /**
     * Recupera il valore della proprietà interfaceResourceType.
     * 
     * @return
     *     possible object is
     *     {@link InterfaceResourceTypeType }
     *     
     */
    public InterfaceResourceTypeType getInterfaceResourceType() {
        return interfaceResourceType;
    }

    /**
     * Imposta il valore della proprietà interfaceResourceType.
     * 
     * @param value
     *     allowed object is
     *     {@link InterfaceResourceTypeType }
     *     
     */
    public void setInterfaceResourceType(InterfaceResourceTypeType value) {
        this.interfaceResourceType = value;
    }

}
