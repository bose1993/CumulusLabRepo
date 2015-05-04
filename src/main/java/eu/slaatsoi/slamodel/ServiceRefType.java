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
 * <p>Classe Java per ServiceRefType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ServiceRefType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InterfaceList" type="{http://www.slaatsoi.eu/slamodel}IDListType" minOccurs="0"/>
 *         &lt;element name="OperationList" type="{http://www.slaatsoi.eu/slamodel}IDListType" minOccurs="0"/>
 *         &lt;element name="EndpointList" type="{http://www.slaatsoi.eu/slamodel}IDListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceRefType", propOrder = {
    "interfaceList",
    "operationList",
    "endpointList"
})
public class ServiceRefType {

    @XmlElement(name = "InterfaceList")
    protected IDListType interfaceList;
    @XmlElement(name = "OperationList")
    protected IDListType operationList;
    @XmlElement(name = "EndpointList")
    protected IDListType endpointList;

    /**
     * Recupera il valore della proprietà interfaceList.
     * 
     * @return
     *     possible object is
     *     {@link IDListType }
     *     
     */
    public IDListType getInterfaceList() {
        return interfaceList;
    }

    /**
     * Imposta il valore della proprietà interfaceList.
     * 
     * @param value
     *     allowed object is
     *     {@link IDListType }
     *     
     */
    public void setInterfaceList(IDListType value) {
        this.interfaceList = value;
    }

    /**
     * Recupera il valore della proprietà operationList.
     * 
     * @return
     *     possible object is
     *     {@link IDListType }
     *     
     */
    public IDListType getOperationList() {
        return operationList;
    }

    /**
     * Imposta il valore della proprietà operationList.
     * 
     * @param value
     *     allowed object is
     *     {@link IDListType }
     *     
     */
    public void setOperationList(IDListType value) {
        this.operationList = value;
    }

    /**
     * Recupera il valore della proprietà endpointList.
     * 
     * @return
     *     possible object is
     *     {@link IDListType }
     *     
     */
    public IDListType getEndpointList() {
        return endpointList;
    }

    /**
     * Imposta il valore della proprietà endpointList.
     * 
     * @param value
     *     allowed object is
     *     {@link IDListType }
     *     
     */
    public void setEndpointList(IDListType value) {
        this.endpointList = value;
    }

}
