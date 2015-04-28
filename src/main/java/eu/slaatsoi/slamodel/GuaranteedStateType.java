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
 * <p>Classe Java per GuaranteedStateType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="GuaranteedStateType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.slaatsoi.eu/slamodel}IDType"/>
 *         &lt;element name="Priority" type="{http://www.slaatsoi.eu/slamodel}CONSTType"/>
 *         &lt;element name="Constraint" type="{http://www.slaatsoi.eu/slamodel}ConstraintExprType"/>
 *         &lt;element name="Precondition" type="{http://www.slaatsoi.eu/slamodel}ConstraintExprType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GuaranteedStateType", propOrder = {
    "id",
    "priority",
    "constraint",
    "precondition"
})
public class GuaranteedStateType {

    @XmlList
    @XmlElement(name = "ID", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected List<String> id;
    @XmlElement(name = "Priority", required = true, nillable = true)
    protected CONSTType priority;
    @XmlElement(name = "Constraint", required = true)
    protected ConstraintExprType constraint;
    @XmlElement(name = "Precondition")
    protected ConstraintExprType precondition;

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
     * Recupera il valore della proprietà priority.
     * 
     * @return
     *     possible object is
     *     {@link CONSTType }
     *     
     */
    public CONSTType getPriority() {
        return priority;
    }

    /**
     * Imposta il valore della proprietà priority.
     * 
     * @param value
     *     allowed object is
     *     {@link CONSTType }
     *     
     */
    public void setPriority(CONSTType value) {
        this.priority = value;
    }

    /**
     * Recupera il valore della proprietà constraint.
     * 
     * @return
     *     possible object is
     *     {@link ConstraintExprType }
     *     
     */
    public ConstraintExprType getConstraint() {
        return constraint;
    }

    /**
     * Imposta il valore della proprietà constraint.
     * 
     * @param value
     *     allowed object is
     *     {@link ConstraintExprType }
     *     
     */
    public void setConstraint(ConstraintExprType value) {
        this.constraint = value;
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

}
