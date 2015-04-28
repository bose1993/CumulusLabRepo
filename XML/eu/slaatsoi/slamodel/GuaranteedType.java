//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2015.04.28 alle 02:17:59 PM CEST 
//


package eu.slaatsoi.slamodel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per GuaranteedType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="GuaranteedType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.slaatsoi.eu/slamodel}AnnotatedType">
 *       &lt;choice>
 *         &lt;element name="State" type="{http://www.slaatsoi.eu/slamodel}GuaranteedStateType"/>
 *         &lt;element name="Action" type="{http://www.slaatsoi.eu/slamodel}GuaranteedActionType"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GuaranteedType", propOrder = {
    "state",
    "action"
})
public class GuaranteedType
    extends AnnotatedType
{

    @XmlElement(name = "State")
    protected GuaranteedStateType state;
    @XmlElement(name = "Action")
    protected GuaranteedActionType action;

    /**
     * Recupera il valore della proprietà state.
     * 
     * @return
     *     possible object is
     *     {@link GuaranteedStateType }
     *     
     */
    public GuaranteedStateType getState() {
        return state;
    }

    /**
     * Imposta il valore della proprietà state.
     * 
     * @param value
     *     allowed object is
     *     {@link GuaranteedStateType }
     *     
     */
    public void setState(GuaranteedStateType value) {
        this.state = value;
    }

    /**
     * Recupera il valore della proprietà action.
     * 
     * @return
     *     possible object is
     *     {@link GuaranteedActionType }
     *     
     */
    public GuaranteedActionType getAction() {
        return action;
    }

    /**
     * Imposta il valore della proprietà action.
     * 
     * @param value
     *     allowed object is
     *     {@link GuaranteedActionType }
     *     
     */
    public void setAction(GuaranteedActionType value) {
        this.action = value;
    }

}
