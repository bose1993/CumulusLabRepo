//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2015.05.04 alle 06:00:58 PM CEST 
//


package eu.slaatsoi.slamodel;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per InterfaceOperationType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="InterfaceOperationType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.slaatsoi.eu/slamodel}AnnotatedType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.slaatsoi.eu/slamodel}IDType"/>
 *         &lt;element name="Input" type="{http://www.slaatsoi.eu/slamodel}InterfaceOperationPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Output" type="{http://www.slaatsoi.eu/slamodel}InterfaceOperationPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Related" type="{http://www.slaatsoi.eu/slamodel}InterfaceOperationPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Fault" type="{http://www.slaatsoi.eu/slamodel}STNDType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InterfaceOperationType", propOrder = {
    "name",
    "input",
    "output",
    "related",
    "fault"
})
public class InterfaceOperationType
    extends AnnotatedType
{

    @XmlList
    @XmlElement(name = "Name", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected List<String> name;
    @XmlElement(name = "Input")
    protected List<InterfaceOperationPropertyType> input;
    @XmlElement(name = "Output")
    protected List<InterfaceOperationPropertyType> output;
    @XmlElement(name = "Related")
    protected List<InterfaceOperationPropertyType> related;
    @XmlElementRef(name = "Fault", namespace = "http://www.slaatsoi.eu/slamodel", type = JAXBElement.class, required = false)
    protected List<JAXBElement<List<String>>> fault;

    /**
     * Gets the value of the name property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the name property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getName() {
        if (name == null) {
            name = new ArrayList<String>();
        }
        return this.name;
    }

    /**
     * Gets the value of the input property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the input property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInput().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InterfaceOperationPropertyType }
     * 
     * 
     */
    public List<InterfaceOperationPropertyType> getInput() {
        if (input == null) {
            input = new ArrayList<InterfaceOperationPropertyType>();
        }
        return this.input;
    }

    /**
     * Gets the value of the output property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the output property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutput().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InterfaceOperationPropertyType }
     * 
     * 
     */
    public List<InterfaceOperationPropertyType> getOutput() {
        if (output == null) {
            output = new ArrayList<InterfaceOperationPropertyType>();
        }
        return this.output;
    }

    /**
     * Gets the value of the related property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the related property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelated().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InterfaceOperationPropertyType }
     * 
     * 
     */
    public List<InterfaceOperationPropertyType> getRelated() {
        if (related == null) {
            related = new ArrayList<InterfaceOperationPropertyType>();
        }
        return this.related;
    }

    /**
     * Gets the value of the fault property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fault property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFault().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}
     * 
     * 
     */
    public List<JAXBElement<List<String>>> getFault() {
        if (fault == null) {
            fault = new ArrayList<JAXBElement<List<String>>>();
        }
        return this.fault;
    }

}
