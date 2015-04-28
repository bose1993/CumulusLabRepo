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
 * <p>Classe Java per InterfaceDeclrType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="InterfaceDeclrType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.slaatsoi.eu/slamodel}AnnotatedType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.slaatsoi.eu/slamodel}IDType"/>
 *         &lt;element name="ProviderRef" type="{http://www.slaatsoi.eu/slamodel}IDType"/>
 *         &lt;element name="Endpoint" type="{http://www.slaatsoi.eu/slamodel}EndpointType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Interface" type="{http://www.slaatsoi.eu/slamodel}InterfaceType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InterfaceDeclrType", propOrder = {
    "id",
    "providerRef",
    "endpoint",
    "_interface"
})
public class InterfaceDeclrType
    extends AnnotatedType
{

    @XmlList
    @XmlElement(name = "ID", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected List<String> id;
    @XmlList
    @XmlElement(name = "ProviderRef", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected List<String> providerRef;
    @XmlElement(name = "Endpoint")
    protected List<EndpointType> endpoint;
    @XmlElement(name = "Interface", required = true)
    protected InterfaceType _interface;

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
     * Gets the value of the providerRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the providerRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProviderRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getProviderRef() {
        if (providerRef == null) {
            providerRef = new ArrayList<String>();
        }
        return this.providerRef;
    }

    /**
     * Gets the value of the endpoint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the endpoint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEndpoint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EndpointType }
     * 
     * 
     */
    public List<EndpointType> getEndpoint() {
        if (endpoint == null) {
            endpoint = new ArrayList<EndpointType>();
        }
        return this.endpoint;
    }

    /**
     * Recupera il valore della proprietà interface.
     * 
     * @return
     *     possible object is
     *     {@link InterfaceType }
     *     
     */
    public InterfaceType getInterface() {
        return _interface;
    }

    /**
     * Imposta il valore della proprietà interface.
     * 
     * @param value
     *     allowed object is
     *     {@link InterfaceType }
     *     
     */
    public void setInterface(InterfaceType value) {
        this._interface = value;
    }

}
