//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2015.05.04 alle 06:00:58 PM CEST 
//


package org.cumulus.certificate.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per AssignmentType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="AssignmentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="var">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="varName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="varType">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="sting"/>
 *                       &lt;enumeration value="integer"/>
 *                       &lt;enumeration value="float"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="varValue" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssignmentType", propOrder = {
    "var"
})
public class AssignmentType {

    @XmlElement(required = true)
    protected AssignmentType.Var var;

    /**
     * Recupera il valore della proprietà var.
     * 
     * @return
     *     possible object is
     *     {@link AssignmentType.Var }
     *     
     */
    public AssignmentType.Var getVar() {
        return var;
    }

    /**
     * Imposta il valore della proprietà var.
     * 
     * @param value
     *     allowed object is
     *     {@link AssignmentType.Var }
     *     
     */
    public void setVar(AssignmentType.Var value) {
        this.var = value;
    }


    /**
     * <p>Classe Java per anonymous complex type.
     * 
     * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="varName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="varType">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="sting"/>
     *             &lt;enumeration value="integer"/>
     *             &lt;enumeration value="float"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="varValue" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Var {

        @XmlAttribute(name = "varName")
        protected String varName;
        @XmlAttribute(name = "varType")
        protected String varType;
        @XmlAttribute(name = "varValue")
        @XmlSchemaType(name = "anySimpleType")
        protected String varValue;

        /**
         * Recupera il valore della proprietà varName.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVarName() {
            return varName;
        }

        /**
         * Imposta il valore della proprietà varName.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVarName(String value) {
            this.varName = value;
        }

        /**
         * Recupera il valore della proprietà varType.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVarType() {
            return varType;
        }

        /**
         * Imposta il valore della proprietà varType.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVarType(String value) {
            this.varType = value;
        }

        /**
         * Recupera il valore della proprietà varValue.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVarValue() {
            return varValue;
        }

        /**
         * Imposta il valore della proprietà varValue.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVarValue(String value) {
            this.varValue = value;
        }

    }

}
