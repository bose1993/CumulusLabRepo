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
 * <p>Classe Java per AgreementPartyType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="AgreementPartyType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.slaatsoi.eu/slamodel}AnnotatedType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.slaatsoi.eu/slamodel}IDType"/>
 *         &lt;element name="Operative" type="{http://www.slaatsoi.eu/slamodel}OperativeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Role" type="{http://www.slaatsoi.eu/slamodel}STNDType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgreementPartyType", propOrder = {
    "id",
    "operative",
    "role"
})
public class AgreementPartyType
    extends AnnotatedType
{

    @XmlList
    @XmlElement(name = "ID", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected List<String> id;
    @XmlElement(name = "Operative")
    protected List<OperativeType> operative;
    @XmlList
    @XmlElement(name = "Role", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected List<String> role;

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
     * Gets the value of the operative property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operative property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperative().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OperativeType }
     * 
     * 
     */
    public List<OperativeType> getOperative() {
        if (operative == null) {
            operative = new ArrayList<OperativeType>();
        }
        return this.operative;
    }

    /**
     * Gets the value of the role property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the role property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRole().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRole() {
        if (role == null) {
            role = new ArrayList<String>();
        }
        return this.role;
    }

}
