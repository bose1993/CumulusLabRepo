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
 * <p>Classe Java per ValueExprType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ValueExprType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="ID" type="{http://www.slaatsoi.eu/slamodel}IDType"/>
 *         &lt;element name="BOOL" type="{http://www.slaatsoi.eu/slamodel}BoolType"/>
 *         &lt;element name="CONST" type="{http://www.slaatsoi.eu/slamodel}CONSTType"/>
 *         &lt;element name="TIME" type="{http://www.slaatsoi.eu/slamodel}TimeType"/>
 *         &lt;element name="PATH" type="{http://www.slaatsoi.eu/slamodel}PathType"/>
 *         &lt;element name="UUID" type="{http://www.slaatsoi.eu/slamodel}UUIDType"/>
 *         &lt;element name="STND" type="{http://www.slaatsoi.eu/slamodel}STNDType"/>
 *         &lt;element name="FuncExpr" type="{http://www.slaatsoi.eu/slamodel}FuncExprType"/>
 *         &lt;element name="EventExpr" type="{http://www.slaatsoi.eu/slamodel}EventExprType"/>
 *         &lt;element name="DomainExpr" type="{http://www.slaatsoi.eu/slamodel}DomainExprType"/>
 *         &lt;element name="ServiceRef" type="{http://www.slaatsoi.eu/slamodel}ServiceRefType"/>
 *         &lt;element name="ListValueExpr" type="{http://www.slaatsoi.eu/slamodel}ListValueExprType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValueExprType", propOrder = {
    "id",
    "bool",
    "_const",
    "time",
    "path",
    "uuid",
    "stnd",
    "funcExpr",
    "eventExpr",
    "domainExpr",
    "serviceRef",
    "listValueExpr"
})
public class ValueExprType {

    @XmlList
    @XmlElement(name = "ID")
    @XmlSchemaType(name = "anySimpleType")
    protected List<String> id;
    @XmlElement(name = "BOOL")
    @XmlSchemaType(name = "anySimpleType")
    protected String bool;
    @XmlElement(name = "CONST")
    protected CONSTType _const;
    @XmlElement(name = "TIME")
    @XmlSchemaType(name = "anySimpleType")
    protected String time;
    @XmlElement(name = "PATH")
    protected String path;
    @XmlElement(name = "UUID")
    @XmlSchemaType(name = "anySimpleType")
    protected String uuid;
    @XmlList
    @XmlElement(name = "STND")
    @XmlSchemaType(name = "anySimpleType")
    protected List<String> stnd;
    @XmlElement(name = "FuncExpr")
    protected FuncExprType funcExpr;
    @XmlElement(name = "EventExpr")
    protected EventExprType eventExpr;
    @XmlElement(name = "DomainExpr")
    protected DomainExprType domainExpr;
    @XmlElement(name = "ServiceRef")
    protected ServiceRefType serviceRef;
    @XmlElement(name = "ListValueExpr")
    protected ListValueExprType listValueExpr;

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
     * Recupera il valore della proprietà bool.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBOOL() {
        return bool;
    }

    /**
     * Imposta il valore della proprietà bool.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBOOL(String value) {
        this.bool = value;
    }

    /**
     * Recupera il valore della proprietà const.
     * 
     * @return
     *     possible object is
     *     {@link CONSTType }
     *     
     */
    public CONSTType getCONST() {
        return _const;
    }

    /**
     * Imposta il valore della proprietà const.
     * 
     * @param value
     *     allowed object is
     *     {@link CONSTType }
     *     
     */
    public void setCONST(CONSTType value) {
        this._const = value;
    }

    /**
     * Recupera il valore della proprietà time.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIME() {
        return time;
    }

    /**
     * Imposta il valore della proprietà time.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIME(String value) {
        this.time = value;
    }

    /**
     * Recupera il valore della proprietà path.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPATH() {
        return path;
    }

    /**
     * Imposta il valore della proprietà path.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPATH(String value) {
        this.path = value;
    }

    /**
     * Recupera il valore della proprietà uuid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUUID() {
        return uuid;
    }

    /**
     * Imposta il valore della proprietà uuid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUUID(String value) {
        this.uuid = value;
    }

    /**
     * Gets the value of the stnd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stnd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSTND().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSTND() {
        if (stnd == null) {
            stnd = new ArrayList<String>();
        }
        return this.stnd;
    }

    /**
     * Recupera il valore della proprietà funcExpr.
     * 
     * @return
     *     possible object is
     *     {@link FuncExprType }
     *     
     */
    public FuncExprType getFuncExpr() {
        return funcExpr;
    }

    /**
     * Imposta il valore della proprietà funcExpr.
     * 
     * @param value
     *     allowed object is
     *     {@link FuncExprType }
     *     
     */
    public void setFuncExpr(FuncExprType value) {
        this.funcExpr = value;
    }

    /**
     * Recupera il valore della proprietà eventExpr.
     * 
     * @return
     *     possible object is
     *     {@link EventExprType }
     *     
     */
    public EventExprType getEventExpr() {
        return eventExpr;
    }

    /**
     * Imposta il valore della proprietà eventExpr.
     * 
     * @param value
     *     allowed object is
     *     {@link EventExprType }
     *     
     */
    public void setEventExpr(EventExprType value) {
        this.eventExpr = value;
    }

    /**
     * Recupera il valore della proprietà domainExpr.
     * 
     * @return
     *     possible object is
     *     {@link DomainExprType }
     *     
     */
    public DomainExprType getDomainExpr() {
        return domainExpr;
    }

    /**
     * Imposta il valore della proprietà domainExpr.
     * 
     * @param value
     *     allowed object is
     *     {@link DomainExprType }
     *     
     */
    public void setDomainExpr(DomainExprType value) {
        this.domainExpr = value;
    }

    /**
     * Recupera il valore della proprietà serviceRef.
     * 
     * @return
     *     possible object is
     *     {@link ServiceRefType }
     *     
     */
    public ServiceRefType getServiceRef() {
        return serviceRef;
    }

    /**
     * Imposta il valore della proprietà serviceRef.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceRefType }
     *     
     */
    public void setServiceRef(ServiceRefType value) {
        this.serviceRef = value;
    }

    /**
     * Recupera il valore della proprietà listValueExpr.
     * 
     * @return
     *     possible object is
     *     {@link ListValueExprType }
     *     
     */
    public ListValueExprType getListValueExpr() {
        return listValueExpr;
    }

    /**
     * Imposta il valore della proprietà listValueExpr.
     * 
     * @param value
     *     allowed object is
     *     {@link ListValueExprType }
     *     
     */
    public void setListValueExpr(ListValueExprType value) {
        this.listValueExpr = value;
    }

}
