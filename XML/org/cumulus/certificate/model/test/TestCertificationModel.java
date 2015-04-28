//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2015.04.28 alle 02:17:59 PM CEST 
//


package org.cumulus.certificate.model.test;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.cumulus.certificate.model.CommonCertificationModelType;


/**
 * <p>Classe Java per TestCertificationModel complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TestCertificationModel">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cumulus.org/certificate/model}CommonCertificationModelType">
 *       &lt;sequence>
 *         &lt;element name="CertificationModelTemplateID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Collectors" type="{http://www.cumulus.org/certificate/model/test}CollectorType"/>
 *         &lt;element name="Context" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TestCertificationModel", propOrder = {
    "certificationModelTemplateID",
    "collectors",
    "context"
})
public class TestCertificationModel
    extends CommonCertificationModelType
{

    @XmlElement(name = "CertificationModelTemplateID", required = true)
    protected String certificationModelTemplateID;
    @XmlElement(name = "Collectors", required = true)
    protected CollectorType collectors;
    @XmlElement(name = "Context")
    protected Object context;

    /**
     * Recupera il valore della proprietà certificationModelTemplateID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificationModelTemplateID() {
        return certificationModelTemplateID;
    }

    /**
     * Imposta il valore della proprietà certificationModelTemplateID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificationModelTemplateID(String value) {
        this.certificationModelTemplateID = value;
    }

    /**
     * Recupera il valore della proprietà collectors.
     * 
     * @return
     *     possible object is
     *     {@link CollectorType }
     *     
     */
    public CollectorType getCollectors() {
        return collectors;
    }

    /**
     * Imposta il valore della proprietà collectors.
     * 
     * @param value
     *     allowed object is
     *     {@link CollectorType }
     *     
     */
    public void setCollectors(CollectorType value) {
        this.collectors = value;
    }

    /**
     * Recupera il valore della proprietà context.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getContext() {
        return context;
    }

    /**
     * Imposta il valore della proprietà context.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setContext(Object value) {
        this.context = value;
    }

}
