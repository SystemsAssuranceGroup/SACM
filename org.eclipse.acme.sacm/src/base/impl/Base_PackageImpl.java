/**
 */
package base.impl;

import argumentation.Argumentation_Package;
import argumentation.impl.Argumentation_PackageImpl;
import artifact.Artifact_Package;
import artifact.impl.Artifact_PackageImpl;
import assuranceCase.AssuranceCase_Package;
import assuranceCase.impl.AssuranceCase_PackageImpl;
import base.ArtifactElement;
import base.Base_Factory;
import base.Base_Package;
import base.Description;
import base.Element;
import base.ExpressionLangString;
import base.ImplementationConstraint;
import base.LangString;
import base.ModelElement;
import base.MultiLangString;
import base.Note;
import base.SACMElement;
import base.TaggedValue;
import base.UtilityElement;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;
import terminology.Terminology_Package;
import terminology.impl.Terminology_PackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Base_PackageImpl extends EPackageImpl implements Base_Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass langStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionLangStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiLangStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sacmElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass utilityElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass descriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass implementationConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass noteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taggedValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass artifactElementEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see base.Base_Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Base_PackageImpl() {
		super(eNS_URI, Base_Factory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link Base_Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Base_Package init() {
		if (isInited) return (Base_Package)EPackage.Registry.INSTANCE.getEPackage(Base_Package.eNS_URI);

		// Obtain or create and register package
		Object registeredBase_Package = EPackage.Registry.INSTANCE.get(eNS_URI);
		Base_PackageImpl theBase_Package = registeredBase_Package instanceof Base_PackageImpl ? (Base_PackageImpl)registeredBase_Package : new Base_PackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AssuranceCase_Package.eNS_URI);
		AssuranceCase_PackageImpl theAssuranceCase_Package = (AssuranceCase_PackageImpl)(registeredPackage instanceof AssuranceCase_PackageImpl ? registeredPackage : AssuranceCase_Package.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Artifact_Package.eNS_URI);
		Artifact_PackageImpl theArtifact_Package = (Artifact_PackageImpl)(registeredPackage instanceof Artifact_PackageImpl ? registeredPackage : Artifact_Package.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Argumentation_Package.eNS_URI);
		Argumentation_PackageImpl theArgumentation_Package = (Argumentation_PackageImpl)(registeredPackage instanceof Argumentation_PackageImpl ? registeredPackage : Argumentation_Package.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Terminology_Package.eNS_URI);
		Terminology_PackageImpl theTerminology_Package = (Terminology_PackageImpl)(registeredPackage instanceof Terminology_PackageImpl ? registeredPackage : Terminology_Package.eINSTANCE);

		// Create package meta-data objects
		theBase_Package.createPackageContents();
		theAssuranceCase_Package.createPackageContents();
		theArtifact_Package.createPackageContents();
		theArgumentation_Package.createPackageContents();
		theTerminology_Package.createPackageContents();

		// Initialize created meta-data
		theBase_Package.initializePackageContents();
		theAssuranceCase_Package.initializePackageContents();
		theArtifact_Package.initializePackageContents();
		theArgumentation_Package.initializePackageContents();
		theTerminology_Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBase_Package.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Base_Package.eNS_URI, theBase_Package);
		return theBase_Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElement() {
		return elementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLangString() {
		return langStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLangString_Lang() {
		return (EAttribute)langStringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLangString_Content() {
		return (EAttribute)langStringEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpressionLangString() {
		return expressionLangStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpressionLangString_Expression() {
		return (EReference)expressionLangStringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiLangString() {
		return multiLangStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultiLangString_Value() {
		return (EReference)multiLangStringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSACMElement() {
		return sacmElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSACMElement_Gid() {
		return (EAttribute)sacmElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSACMElement_IsCitation() {
		return (EAttribute)sacmElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSACMElement_IsAbstract() {
		return (EAttribute)sacmElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSACMElement_CitedElement() {
		return (EReference)sacmElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSACMElement_AbstractForm() {
		return (EReference)sacmElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUtilityElement() {
		return utilityElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUtilityElement_Content() {
		return (EReference)utilityElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDescription() {
		return descriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImplementationConstraint() {
		return implementationConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNote() {
		return noteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTaggedValue() {
		return taggedValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaggedValue_Key() {
		return (EReference)taggedValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelElement() {
		return modelElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelElement_Name() {
		return (EReference)modelElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelElement_Description() {
		return (EReference)modelElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelElement_ImplementationConstraint() {
		return (EReference)modelElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelElement_Note() {
		return (EReference)modelElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelElement_TaggedValue() {
		return (EReference)modelElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArtifactElement() {
		return artifactElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Base_Factory getBase_Factory() {
		return (Base_Factory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		elementEClass = createEClass(ELEMENT);

		langStringEClass = createEClass(LANG_STRING);
		createEAttribute(langStringEClass, LANG_STRING__LANG);
		createEAttribute(langStringEClass, LANG_STRING__CONTENT);

		expressionLangStringEClass = createEClass(EXPRESSION_LANG_STRING);
		createEReference(expressionLangStringEClass, EXPRESSION_LANG_STRING__EXPRESSION);

		multiLangStringEClass = createEClass(MULTI_LANG_STRING);
		createEReference(multiLangStringEClass, MULTI_LANG_STRING__VALUE);

		sacmElementEClass = createEClass(SACM_ELEMENT);
		createEAttribute(sacmElementEClass, SACM_ELEMENT__GID);
		createEAttribute(sacmElementEClass, SACM_ELEMENT__IS_CITATION);
		createEAttribute(sacmElementEClass, SACM_ELEMENT__IS_ABSTRACT);
		createEReference(sacmElementEClass, SACM_ELEMENT__CITED_ELEMENT);
		createEReference(sacmElementEClass, SACM_ELEMENT__ABSTRACT_FORM);

		utilityElementEClass = createEClass(UTILITY_ELEMENT);
		createEReference(utilityElementEClass, UTILITY_ELEMENT__CONTENT);

		descriptionEClass = createEClass(DESCRIPTION);

		implementationConstraintEClass = createEClass(IMPLEMENTATION_CONSTRAINT);

		noteEClass = createEClass(NOTE);

		taggedValueEClass = createEClass(TAGGED_VALUE);
		createEReference(taggedValueEClass, TAGGED_VALUE__KEY);

		modelElementEClass = createEClass(MODEL_ELEMENT);
		createEReference(modelElementEClass, MODEL_ELEMENT__NAME);
		createEReference(modelElementEClass, MODEL_ELEMENT__DESCRIPTION);
		createEReference(modelElementEClass, MODEL_ELEMENT__IMPLEMENTATION_CONSTRAINT);
		createEReference(modelElementEClass, MODEL_ELEMENT__NOTE);
		createEReference(modelElementEClass, MODEL_ELEMENT__TAGGED_VALUE);

		artifactElementEClass = createEClass(ARTIFACT_ELEMENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		langStringEClass.getESuperTypes().add(this.getElement());
		expressionLangStringEClass.getESuperTypes().add(this.getLangString());
		multiLangStringEClass.getESuperTypes().add(this.getElement());
		sacmElementEClass.getESuperTypes().add(this.getElement());
		utilityElementEClass.getESuperTypes().add(this.getSACMElement());
		descriptionEClass.getESuperTypes().add(this.getUtilityElement());
		implementationConstraintEClass.getESuperTypes().add(this.getUtilityElement());
		noteEClass.getESuperTypes().add(this.getUtilityElement());
		taggedValueEClass.getESuperTypes().add(this.getUtilityElement());
		modelElementEClass.getESuperTypes().add(this.getSACMElement());
		artifactElementEClass.getESuperTypes().add(this.getModelElement());

		// Initialize classes and features; add operations and parameters
		initEClass(elementEClass, Element.class, "Element", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(langStringEClass, LangString.class, "LangString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLangString_Lang(), ecorePackage.getEString(), "lang", null, 0, 1, LangString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLangString_Content(), ecorePackage.getEString(), "content", null, 0, 1, LangString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expressionLangStringEClass, ExpressionLangString.class, "ExpressionLangString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpressionLangString_Expression(), this.getArtifactElement(), null, "expression", null, 0, 1, ExpressionLangString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(multiLangStringEClass, MultiLangString.class, "MultiLangString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMultiLangString_Value(), this.getLangString(), null, "value", null, 1, -1, MultiLangString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sacmElementEClass, SACMElement.class, "SACMElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSACMElement_Gid(), ecorePackage.getEString(), "gid", null, 0, 1, SACMElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSACMElement_IsCitation(), ecorePackage.getEBoolean(), "isCitation", "false", 0, 1, SACMElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSACMElement_IsAbstract(), ecorePackage.getEBoolean(), "isAbstract", "false", 0, 1, SACMElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSACMElement_CitedElement(), this.getSACMElement(), null, "citedElement", null, 0, 1, SACMElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSACMElement_AbstractForm(), this.getSACMElement(), null, "abstractForm", null, 0, 1, SACMElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(utilityElementEClass, UtilityElement.class, "UtilityElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUtilityElement_Content(), this.getMultiLangString(), null, "content", null, 0, 1, UtilityElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(descriptionEClass, Description.class, "Description", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(implementationConstraintEClass, ImplementationConstraint.class, "ImplementationConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(noteEClass, Note.class, "Note", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(taggedValueEClass, TaggedValue.class, "TaggedValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTaggedValue_Key(), this.getMultiLangString(), null, "key", null, 1, 1, TaggedValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelElementEClass, ModelElement.class, "ModelElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelElement_Name(), this.getLangString(), null, "name", null, 0, 1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelElement_Description(), this.getDescription(), null, "description", null, 0, 1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelElement_ImplementationConstraint(), this.getImplementationConstraint(), null, "implementationConstraint", null, 0, -1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelElement_Note(), this.getNote(), null, "note", null, 0, -1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelElement_TaggedValue(), this.getTaggedValue(), null, "taggedValue", null, 0, -1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(artifactElementEClass, ArtifactElement.class, "ArtifactElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //Base_PackageImpl
