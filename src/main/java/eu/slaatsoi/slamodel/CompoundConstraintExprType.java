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
 * <p>Classe Java per CompoundConstraintExprType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="CompoundConstraintExprType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;sequence>
 *           &lt;element name="Subexpression" type="{http://www.slaatsoi.eu/slamodel}ConstraintExprType" maxOccurs="unbounded"/>
 *           &lt;element name="LogicalOp" type="{http://www.slaatsoi.eu/slamodel}STNDType"/>
 *         &lt;/sequence>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompoundConstraintExprType", propOrder = {
    "subexpression",
    "logicalOp"
})
public class CompoundConstraintExprType {

    @XmlElement(name = "Subexpression")
    protected List<ConstraintExprType> subexpression;
    @XmlList
    @XmlElement(name = "LogicalOp")
    @XmlSchemaType(name = "anySimpleType")
    protected List<String> logicalOp;

    /**
     * Gets the value of the subexpression property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subexpression property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubexpression().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConstraintExprType }
     * 
     * 
     */
    public List<ConstraintExprType> getSubexpression() {
        if (subexpression == null) {
            subexpression = new ArrayList<ConstraintExprType>();
        }
        return this.subexpression;
    }

    /**
     * Gets the value of the logicalOp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the logicalOp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLogicalOp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLogicalOp() {
        if (logicalOp == null) {
            logicalOp = new ArrayList<String>();
        }
        return this.logicalOp;
    }

}
