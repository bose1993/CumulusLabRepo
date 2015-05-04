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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per InterfaceRefType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="InterfaceRefType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.slaatsoi.eu/slamodel}AnnotatedType">
 *       &lt;sequence>
 *         &lt;element name="InterfaceLocation" type="{http://www.slaatsoi.eu/slamodel}UUIDType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InterfaceRefType", propOrder = {
    "interfaceLocation"
})
public class InterfaceRefType
    extends AnnotatedType
{

    @XmlElement(name = "InterfaceLocation", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String interfaceLocation;

    /**
     * Recupera il valore della proprietà interfaceLocation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterfaceLocation() {
        return interfaceLocation;
    }

    /**
     * Imposta il valore della proprietà interfaceLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterfaceLocation(String value) {
        this.interfaceLocation = value;
    }

}
