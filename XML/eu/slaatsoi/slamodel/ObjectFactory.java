//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2015.04.28 alle 02:17:59 PM CEST 
//


package eu.slaatsoi.slamodel;

import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the eu.slaatsoi.slamodel package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ConstraintExpr_QNAME = new QName("http://www.slaatsoi.eu/slamodel", "ConstraintExpr");
    private final static QName _Annotated_QNAME = new QName("http://www.slaatsoi.eu/slamodel", "Annotated");
    private final static QName _InterfaceDeclr_QNAME = new QName("http://www.slaatsoi.eu/slamodel", "InterfaceDeclr");
    private final static QName _Party_QNAME = new QName("http://www.slaatsoi.eu/slamodel", "Party");
    private final static QName _Related_QNAME = new QName("http://www.slaatsoi.eu/slamodel", "Related");
    private final static QName _AgreementTerm_QNAME = new QName("http://www.slaatsoi.eu/slamodel", "AgreementTerm");
    private final static QName _DomainExpr_QNAME = new QName("http://www.slaatsoi.eu/slamodel", "DomainExpr");
    private final static QName _TemplateId_QNAME = new QName("http://www.slaatsoi.eu/slamodel", "TemplateId");
    private final static QName _AgreedAt_QNAME = new QName("http://www.slaatsoi.eu/slamodel", "AgreedAt");
    private final static QName _VariableDeclr_QNAME = new QName("http://www.slaatsoi.eu/slamodel", "VariableDeclr");
    private final static QName _ModelVersion_QNAME = new QName("http://www.slaatsoi.eu/slamodel", "ModelVersion");
    private final static QName _EffectiveFrom_QNAME = new QName("http://www.slaatsoi.eu/slamodel", "EffectiveFrom");
    private final static QName _EventExpr_QNAME = new QName("http://www.slaatsoi.eu/slamodel", "EventExpr");
    private final static QName _FuncExpr_QNAME = new QName("http://www.slaatsoi.eu/slamodel", "FuncExpr");
    private final static QName _InterfaceOperation_QNAME = new QName("http://www.slaatsoi.eu/slamodel", "InterfaceOperation");
    private final static QName _EffectiveUntil_QNAME = new QName("http://www.slaatsoi.eu/slamodel", "EffectiveUntil");
    private final static QName _InterfaceOperationTypeFault_QNAME = new QName("http://www.slaatsoi.eu/slamodel", "Fault");
    private final static QName _InterfaceSpecTypeExtended_QNAME = new QName("http://www.slaatsoi.eu/slamodel", "Extended");
    private final static QName _IDListTypeID_QNAME = new QName("http://www.slaatsoi.eu/slamodel", "ID");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: eu.slaatsoi.slamodel
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EventExprType }
     * 
     */
    public EventExprType createEventExprType() {
        return new EventExprType();
    }

    /**
     * Create an instance of {@link SLA }
     * 
     */
    public SLA createSLA() {
        return new SLA();
    }

    /**
     * Create an instance of {@link AnnotatedType }
     * 
     */
    public AnnotatedType createAnnotatedType() {
        return new AnnotatedType();
    }

    /**
     * Create an instance of {@link MapStndAny }
     * 
     */
    public MapStndAny createMapStndAny() {
        return new MapStndAny();
    }

    /**
     * Create an instance of {@link AgreementPartyType }
     * 
     */
    public AgreementPartyType createAgreementPartyType() {
        return new AgreementPartyType();
    }

    /**
     * Create an instance of {@link InterfaceDeclrType }
     * 
     */
    public InterfaceDeclrType createInterfaceDeclrType() {
        return new InterfaceDeclrType();
    }

    /**
     * Create an instance of {@link VariableDeclrType }
     * 
     */
    public VariableDeclrType createVariableDeclrType() {
        return new VariableDeclrType();
    }

    /**
     * Create an instance of {@link AgreementTermType }
     * 
     */
    public AgreementTermType createAgreementTermType() {
        return new AgreementTermType();
    }

    /**
     * Create an instance of {@link SLATemplate }
     * 
     */
    public SLATemplate createSLATemplate() {
        return new SLATemplate();
    }

    /**
     * Create an instance of {@link FuncExprType }
     * 
     */
    public FuncExprType createFuncExprType() {
        return new FuncExprType();
    }

    /**
     * Create an instance of {@link InterfaceOperationType }
     * 
     */
    public InterfaceOperationType createInterfaceOperationType() {
        return new InterfaceOperationType();
    }

    /**
     * Create an instance of {@link InterfaceOperationPropertyType }
     * 
     */
    public InterfaceOperationPropertyType createInterfaceOperationPropertyType() {
        return new InterfaceOperationPropertyType();
    }

    /**
     * Create an instance of {@link ConstraintExprType }
     * 
     */
    public ConstraintExprType createConstraintExprType() {
        return new ConstraintExprType();
    }

    /**
     * Create an instance of {@link DomainExprType }
     * 
     */
    public DomainExprType createDomainExprType() {
        return new DomainExprType();
    }

    /**
     * Create an instance of {@link InterfaceResourceTypeType }
     * 
     */
    public InterfaceResourceTypeType createInterfaceResourceTypeType() {
        return new InterfaceResourceTypeType();
    }

    /**
     * Create an instance of {@link InvocationType }
     * 
     */
    public InvocationType createInvocationType() {
        return new InvocationType();
    }

    /**
     * Create an instance of {@link ComponentProdOfferingPriceType }
     * 
     */
    public ComponentProdOfferingPriceType createComponentProdOfferingPriceType() {
        return new ComponentProdOfferingPriceType();
    }

    /**
     * Create an instance of {@link MapIdValueExpr }
     * 
     */
    public MapIdValueExpr createMapIdValueExpr() {
        return new MapIdValueExpr();
    }

    /**
     * Create an instance of {@link CustomActionType }
     * 
     */
    public CustomActionType createCustomActionType() {
        return new CustomActionType();
    }

    /**
     * Create an instance of {@link InterfaceType }
     * 
     */
    public InterfaceType createInterfaceType() {
        return new InterfaceType();
    }

    /**
     * Create an instance of {@link EndpointType }
     * 
     */
    public EndpointType createEndpointType() {
        return new EndpointType();
    }

    /**
     * Create an instance of {@link CompoundConstraintExprType }
     * 
     */
    public CompoundConstraintExprType createCompoundConstraintExprType() {
        return new CompoundConstraintExprType();
    }

    /**
     * Create an instance of {@link ListValueExprType }
     * 
     */
    public ListValueExprType createListValueExprType() {
        return new ListValueExprType();
    }

    /**
     * Create an instance of {@link IdValueExprEntryType }
     * 
     */
    public IdValueExprEntryType createIdValueExprEntryType() {
        return new IdValueExprEntryType();
    }

    /**
     * Create an instance of {@link IDListType }
     * 
     */
    public IDListType createIDListType() {
        return new IDListType();
    }

    /**
     * Create an instance of {@link CustomisableType }
     * 
     */
    public CustomisableType createCustomisableType() {
        return new CustomisableType();
    }

    /**
     * Create an instance of {@link CompoundDomainExprType }
     * 
     */
    public CompoundDomainExprType createCompoundDomainExprType() {
        return new CompoundDomainExprType();
    }

    /**
     * Create an instance of {@link GuaranteedActionType }
     * 
     */
    public GuaranteedActionType createGuaranteedActionType() {
        return new GuaranteedActionType();
    }

    /**
     * Create an instance of {@link InterfaceSpecType }
     * 
     */
    public InterfaceSpecType createInterfaceSpecType() {
        return new InterfaceSpecType();
    }

    /**
     * Create an instance of {@link ProductType }
     * 
     */
    public ProductType createProductType() {
        return new ProductType();
    }

    /**
     * Create an instance of {@link TerminationActionType }
     * 
     */
    public TerminationActionType createTerminationActionType() {
        return new TerminationActionType();
    }

    /**
     * Create an instance of {@link PriceModificationType }
     * 
     */
    public PriceModificationType createPriceModificationType() {
        return new PriceModificationType();
    }

    /**
     * Create an instance of {@link TypeConstraintExprType }
     * 
     */
    public TypeConstraintExprType createTypeConstraintExprType() {
        return new TypeConstraintExprType();
    }

    /**
     * Create an instance of {@link SimpleDomainExprType }
     * 
     */
    public SimpleDomainExprType createSimpleDomainExprType() {
        return new SimpleDomainExprType();
    }

    /**
     * Create an instance of {@link ExprType }
     * 
     */
    public ExprType createExprType() {
        return new ExprType();
    }

    /**
     * Create an instance of {@link ValueExprType }
     * 
     */
    public ValueExprType createValueExprType() {
        return new ValueExprType();
    }

    /**
     * Create an instance of {@link ProductOfferingPriceType }
     * 
     */
    public ProductOfferingPriceType createProductOfferingPriceType() {
        return new ProductOfferingPriceType();
    }

    /**
     * Create an instance of {@link PenaltyActionType }
     * 
     */
    public PenaltyActionType createPenaltyActionType() {
        return new PenaltyActionType();
    }

    /**
     * Create an instance of {@link InterfaceRefType }
     * 
     */
    public InterfaceRefType createInterfaceRefType() {
        return new InterfaceRefType();
    }

    /**
     * Create an instance of {@link GuaranteedStateType }
     * 
     */
    public GuaranteedStateType createGuaranteedStateType() {
        return new GuaranteedStateType();
    }

    /**
     * Create an instance of {@link CompoundActionType }
     * 
     */
    public CompoundActionType createCompoundActionType() {
        return new CompoundActionType();
    }

    /**
     * Create an instance of {@link GuaranteedActionDefnType }
     * 
     */
    public GuaranteedActionDefnType createGuaranteedActionDefnType() {
        return new GuaranteedActionDefnType();
    }

    /**
     * Create an instance of {@link CONSTType }
     * 
     */
    public CONSTType createCONSTType() {
        return new CONSTType();
    }

    /**
     * Create an instance of {@link TerminationClauseType }
     * 
     */
    public TerminationClauseType createTerminationClauseType() {
        return new TerminationClauseType();
    }

    /**
     * Create an instance of {@link ServiceRefType }
     * 
     */
    public ServiceRefType createServiceRefType() {
        return new ServiceRefType();
    }

    /**
     * Create an instance of {@link GuaranteedType }
     * 
     */
    public GuaranteedType createGuaranteedType() {
        return new GuaranteedType();
    }

    /**
     * Create an instance of {@link OperativeType }
     * 
     */
    public OperativeType createOperativeType() {
        return new OperativeType();
    }

    /**
     * Create an instance of {@link StndAnyEntryType }
     * 
     */
    public StndAnyEntryType createStndAnyEntryType() {
        return new StndAnyEntryType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConstraintExprType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.slaatsoi.eu/slamodel", name = "ConstraintExpr")
    public JAXBElement<ConstraintExprType> createConstraintExpr(ConstraintExprType value) {
        return new JAXBElement<ConstraintExprType>(_ConstraintExpr_QNAME, ConstraintExprType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnnotatedType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.slaatsoi.eu/slamodel", name = "Annotated")
    public JAXBElement<AnnotatedType> createAnnotated(AnnotatedType value) {
        return new JAXBElement<AnnotatedType>(_Annotated_QNAME, AnnotatedType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InterfaceDeclrType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.slaatsoi.eu/slamodel", name = "InterfaceDeclr")
    public JAXBElement<InterfaceDeclrType> createInterfaceDeclr(InterfaceDeclrType value) {
        return new JAXBElement<InterfaceDeclrType>(_InterfaceDeclr_QNAME, InterfaceDeclrType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgreementPartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.slaatsoi.eu/slamodel", name = "Party")
    public JAXBElement<AgreementPartyType> createParty(AgreementPartyType value) {
        return new JAXBElement<AgreementPartyType>(_Party_QNAME, AgreementPartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InterfaceOperationPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.slaatsoi.eu/slamodel", name = "Related")
    public JAXBElement<InterfaceOperationPropertyType> createRelated(InterfaceOperationPropertyType value) {
        return new JAXBElement<InterfaceOperationPropertyType>(_Related_QNAME, InterfaceOperationPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgreementTermType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.slaatsoi.eu/slamodel", name = "AgreementTerm")
    public JAXBElement<AgreementTermType> createAgreementTerm(AgreementTermType value) {
        return new JAXBElement<AgreementTermType>(_AgreementTerm_QNAME, AgreementTermType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DomainExprType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.slaatsoi.eu/slamodel", name = "DomainExpr")
    public JAXBElement<DomainExprType> createDomainExpr(DomainExprType value) {
        return new JAXBElement<DomainExprType>(_DomainExpr_QNAME, DomainExprType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.slaatsoi.eu/slamodel", name = "TemplateId")
    public JAXBElement<String> createTemplateId(String value) {
        return new JAXBElement<String>(_TemplateId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.slaatsoi.eu/slamodel", name = "AgreedAt")
    public JAXBElement<String> createAgreedAt(String value) {
        return new JAXBElement<String>(_AgreedAt_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VariableDeclrType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.slaatsoi.eu/slamodel", name = "VariableDeclr")
    public JAXBElement<VariableDeclrType> createVariableDeclr(VariableDeclrType value) {
        return new JAXBElement<VariableDeclrType>(_VariableDeclr_QNAME, VariableDeclrType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.slaatsoi.eu/slamodel", name = "ModelVersion")
    public JAXBElement<String> createModelVersion(String value) {
        return new JAXBElement<String>(_ModelVersion_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.slaatsoi.eu/slamodel", name = "EffectiveFrom")
    public JAXBElement<String> createEffectiveFrom(String value) {
        return new JAXBElement<String>(_EffectiveFrom_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EventExprType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.slaatsoi.eu/slamodel", name = "EventExpr")
    public JAXBElement<EventExprType> createEventExpr(EventExprType value) {
        return new JAXBElement<EventExprType>(_EventExpr_QNAME, EventExprType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FuncExprType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.slaatsoi.eu/slamodel", name = "FuncExpr")
    public JAXBElement<FuncExprType> createFuncExpr(FuncExprType value) {
        return new JAXBElement<FuncExprType>(_FuncExpr_QNAME, FuncExprType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InterfaceOperationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.slaatsoi.eu/slamodel", name = "InterfaceOperation")
    public JAXBElement<InterfaceOperationType> createInterfaceOperation(InterfaceOperationType value) {
        return new JAXBElement<InterfaceOperationType>(_InterfaceOperation_QNAME, InterfaceOperationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.slaatsoi.eu/slamodel", name = "EffectiveUntil")
    public JAXBElement<String> createEffectiveUntil(String value) {
        return new JAXBElement<String>(_EffectiveUntil_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.slaatsoi.eu/slamodel", name = "Fault", scope = InterfaceOperationType.class)
    public JAXBElement<List<String>> createInterfaceOperationTypeFault(List<String> value) {
        return new JAXBElement<List<String>>(_InterfaceOperationTypeFault_QNAME, ((Class) List.class), InterfaceOperationType.class, ((List<String> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.slaatsoi.eu/slamodel", name = "Extended", scope = InterfaceSpecType.class)
    public JAXBElement<List<String>> createInterfaceSpecTypeExtended(List<String> value) {
        return new JAXBElement<List<String>>(_InterfaceSpecTypeExtended_QNAME, ((Class) List.class), InterfaceSpecType.class, ((List<String> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.slaatsoi.eu/slamodel", name = "ID", scope = IDListType.class)
    public JAXBElement<List<String>> createIDListTypeID(List<String> value) {
        return new JAXBElement<List<String>>(_IDListTypeID_QNAME, ((Class) List.class), IDListType.class, ((List<String> ) value));
    }

}
