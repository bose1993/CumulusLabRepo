//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2015.05.04 alle 06:00:58 PM CEST 
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
 * <p>Classe Java per InvocationType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="InvocationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Endpoint" type="{http://www.slaatsoi.eu/slamodel}IDType"/>
 *         &lt;element name="Operation" type="{http://www.slaatsoi.eu/slamodel}IDType"/>
 *         &lt;element name="Parameters" type="{http://www.slaatsoi.eu/slamodel}MapIdValueExpr" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvocationType", propOrder = {
    "endpoint",
    "operation",
    "parameters"
})
public class InvocationType {

    @XmlList
    @XmlElement(name = "Endpoint", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected List<String> endpoint;
    @XmlList
    @XmlElement(name = "Operation", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected List<String> operation;
    @XmlElement(name = "Parameters")
    protected MapIdValueExpr parameters;

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
     * {@link String }
     * 
     * 
     */
    public List<String> getEndpoint() {
        if (endpoint == null) {
            endpoint = new ArrayList<String>();
        }
        return this.endpoint;
    }

    /**
     * Gets the value of the operation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getOperation() {
        if (operation == null) {
            operation = new ArrayList<String>();
        }
        return this.operation;
    }

    /**
     * Recupera il valore della proprietà parameters.
     * 
     * @return
     *     possible object is
     *     {@link MapIdValueExpr }
     *     
     */
    public MapIdValueExpr getParameters() {
        return parameters;
    }

    /**
     * Imposta il valore della proprietà parameters.
     * 
     * @param value
     *     allowed object is
     *     {@link MapIdValueExpr }
     *     
     */
    public void setParameters(MapIdValueExpr value) {
        this.parameters = value;
    }

}
