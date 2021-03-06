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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.cumulus.certificate.model.AbstractPartyType;


/**
 * <p>Classe Java per AnnotatedType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="AnnotatedType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Properties" type="{http://www.slaatsoi.eu/slamodel}MapStndAny"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnnotatedType", propOrder = {
    "text",
    "properties"
})
@XmlSeeAlso({
    AbstractPartyType.class,
    EventExprType.class,
    AgreementPartyType.class,
    InterfaceDeclrType.class,
    VariableDeclrType.class,
    AgreementTermType.class,
    FuncExprType.class,
    InterfaceOperationType.class,
    InterfaceOperationPropertyType.class,
    InterfaceResourceTypeType.class,
    EndpointType.class,
    InterfaceSpecType.class,
    ProductType.class,
    InterfaceRefType.class,
    GuaranteedActionDefnType.class,
    GuaranteedType.class,
    OperativeType.class,
    SLATemplate.class,
    SLA.class
})
public class AnnotatedType {

    @XmlElement(name = "Text", required = true)
    protected String text;
    @XmlElement(name = "Properties", required = true)
    protected MapStndAny properties;

    /**
     * Recupera il valore della proprietà text.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText() {
        return text;
    }

    /**
     * Imposta il valore della proprietà text.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText(String value) {
        this.text = value;
    }

    /**
     * Recupera il valore della proprietà properties.
     * 
     * @return
     *     possible object is
     *     {@link MapStndAny }
     *     
     */
    public MapStndAny getProperties() {
        return properties;
    }

    /**
     * Imposta il valore della proprietà properties.
     * 
     * @param value
     *     allowed object is
     *     {@link MapStndAny }
     *     
     */
    public void setProperties(MapStndAny value) {
        this.properties = value;
    }

}
