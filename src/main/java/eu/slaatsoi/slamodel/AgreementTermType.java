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
 * <p>Classe Java per AgreementTermType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="AgreementTermType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.slaatsoi.eu/slamodel}AnnotatedType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.slaatsoi.eu/slamodel}IDType"/>
 *         &lt;element name="Precondition" type="{http://www.slaatsoi.eu/slamodel}ConstraintExprType" minOccurs="0"/>
 *         &lt;element name="VariableDeclr" type="{http://www.slaatsoi.eu/slamodel}VariableDeclrType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Guaranteed" type="{http://www.slaatsoi.eu/slamodel}GuaranteedType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgreementTermType", propOrder = {
    "id",
    "precondition",
    "variableDeclr",
    "guaranteed"
})
public class AgreementTermType
    extends AnnotatedType
{

    @XmlList
    @XmlElement(name = "ID", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected List<String> id;
    @XmlElement(name = "Precondition")
    protected ConstraintExprType precondition;
    @XmlElement(name = "VariableDeclr")
    protected List<VariableDeclrType> variableDeclr;
    @XmlElement(name = "Guaranteed", required = true)
    protected List<GuaranteedType> guaranteed;

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
     * Recupera il valore della proprietà precondition.
     * 
     * @return
     *     possible object is
     *     {@link ConstraintExprType }
     *     
     */
    public ConstraintExprType getPrecondition() {
        return precondition;
    }

    /**
     * Imposta il valore della proprietà precondition.
     * 
     * @param value
     *     allowed object is
     *     {@link ConstraintExprType }
     *     
     */
    public void setPrecondition(ConstraintExprType value) {
        this.precondition = value;
    }

    /**
     * Gets the value of the variableDeclr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the variableDeclr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVariableDeclr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VariableDeclrType }
     * 
     * 
     */
    public List<VariableDeclrType> getVariableDeclr() {
        if (variableDeclr == null) {
            variableDeclr = new ArrayList<VariableDeclrType>();
        }
        return this.variableDeclr;
    }

    /**
     * Gets the value of the guaranteed property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the guaranteed property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGuaranteed().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GuaranteedType }
     * 
     * 
     */
    public List<GuaranteedType> getGuaranteed() {
        if (guaranteed == null) {
            guaranteed = new ArrayList<GuaranteedType>();
        }
        return this.guaranteed;
    }

}
