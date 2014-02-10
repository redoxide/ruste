/*
* generated by Xtext
*/
package de.redoxi.ruste.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import de.redoxi.ruste.services.RustGrammarAccess;

public class RustParser extends AbstractContentAssistParser {
	
	@Inject
	private RustGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected de.redoxi.ruste.ui.contentassist.antlr.internal.InternalRustParser createParser() {
		de.redoxi.ruste.ui.contentassist.antlr.internal.InternalRustParser result = new de.redoxi.ruste.ui.contentassist.antlr.internal.InternalRustParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getAttrAccess().getAlternatives(), "rule__Attr__Alternatives");
					put(grammarAccess.getItemAccess().getAlternatives(), "rule__Item__Alternatives");
					put(grammarAccess.getModItemAccess().getAlternatives_2(), "rule__ModItem__Alternatives_2");
					put(grammarAccess.getEnumVariantAccess().getAlternatives_2(), "rule__EnumVariant__Alternatives_2");
					put(grammarAccess.getTraitMethodAccess().getAlternatives_0(), "rule__TraitMethod__Alternatives_0");
					put(grammarAccess.getTraitMethodAccess().getAlternatives_9(), "rule__TraitMethod__Alternatives_9");
					put(grammarAccess.getImplMethodAccess().getAlternatives_0(), "rule__ImplMethod__Alternatives_0");
					put(grammarAccess.getExprAccess().getAlternatives(), "rule__Expr__Alternatives");
					put(grammarAccess.getPatAccess().getAlternatives(), "rule__Pat__Alternatives");
					put(grammarAccess.getPatRangeAccess().getAlternatives(), "rule__PatRange__Alternatives");
					put(grammarAccess.getPatEnumAccess().getAlternatives_1(), "rule__PatEnum__Alternatives_1");
					put(grammarAccess.getPatEnumAccess().getAlternatives_1_0_2(), "rule__PatEnum__Alternatives_1_0_2");
					put(grammarAccess.getPathAccess().getAlternatives_3_1(), "rule__Path__Alternatives_3_1");
					put(grammarAccess.getPathAccess().getAlternatives_3_2_1(), "rule__Path__Alternatives_3_2_1");
					put(grammarAccess.getTypeAccess().getAlternatives(), "rule__Type__Alternatives");
					put(grammarAccess.getPrimitiveTypeAccess().getAlternatives(), "rule__PrimitiveType__Alternatives");
					put(grammarAccess.getVariantAccess().getAlternatives(), "rule__Variant__Alternatives");
					put(grammarAccess.getLiteralAccess().getAlternatives(), "rule__Literal__Alternatives");
					put(grammarAccess.getNumberLitAccess().getValueAlternatives_0(), "rule__NumberLit__ValueAlternatives_0");
					put(grammarAccess.getVisibilityAccess().getAlternatives(), "rule__Visibility__Alternatives");
					put(grammarAccess.getItemAttrAccess().getGroup(), "rule__ItemAttr__Group__0");
					put(grammarAccess.getItemAttrAccess().getGroup_2(), "rule__ItemAttr__Group_2__0");
					put(grammarAccess.getAttrWithListAccess().getGroup(), "rule__AttrWithList__Group__0");
					put(grammarAccess.getAttrWithListAccess().getGroup_3(), "rule__AttrWithList__Group_3__0");
					put(grammarAccess.getLiteralAttrAccess().getGroup(), "rule__LiteralAttr__Group__0");
					put(grammarAccess.getItemAndAttrsAccess().getGroup(), "rule__ItemAndAttrs__Group__0");
					put(grammarAccess.getModItemAccess().getGroup(), "rule__ModItem__Group__0");
					put(grammarAccess.getModItemAccess().getGroup_2_1(), "rule__ModItem__Group_2_1__0");
					put(grammarAccess.getFnItemAccess().getGroup(), "rule__FnItem__Group__0");
					put(grammarAccess.getFnItemAccess().getGroup_2(), "rule__FnItem__Group_2__0");
					put(grammarAccess.getFnItemAccess().getGroup_2_2(), "rule__FnItem__Group_2_2__0");
					put(grammarAccess.getFnItemAccess().getGroup_4(), "rule__FnItem__Group_4__0");
					put(grammarAccess.getFnItemAccess().getGroup_4_1(), "rule__FnItem__Group_4_1__0");
					put(grammarAccess.getFnItemAccess().getGroup_6(), "rule__FnItem__Group_6__0");
					put(grammarAccess.getTypeItemAccess().getGroup(), "rule__TypeItem__Group__0");
					put(grammarAccess.getTypeItemAccess().getGroup_2(), "rule__TypeItem__Group_2__0");
					put(grammarAccess.getTypeItemAccess().getGroup_2_2(), "rule__TypeItem__Group_2_2__0");
					put(grammarAccess.getStructItemAccess().getGroup(), "rule__StructItem__Group__0");
					put(grammarAccess.getStructItemAccess().getGroup_2(), "rule__StructItem__Group_2__0");
					put(grammarAccess.getStructItemAccess().getGroup_2_2(), "rule__StructItem__Group_2_2__0");
					put(grammarAccess.getStructItemAccess().getGroup_5(), "rule__StructItem__Group_5__0");
					put(grammarAccess.getEnumItemAccess().getGroup(), "rule__EnumItem__Group__0");
					put(grammarAccess.getEnumItemAccess().getGroup_2(), "rule__EnumItem__Group_2__0");
					put(grammarAccess.getEnumItemAccess().getGroup_2_2(), "rule__EnumItem__Group_2_2__0");
					put(grammarAccess.getEnumItemAccess().getGroup_5(), "rule__EnumItem__Group_5__0");
					put(grammarAccess.getEnumVariantAccess().getGroup(), "rule__EnumVariant__Group__0");
					put(grammarAccess.getEnumVariantAccess().getGroup_1(), "rule__EnumVariant__Group_1__0");
					put(grammarAccess.getEnumVariantAccess().getGroup_1_2(), "rule__EnumVariant__Group_1_2__0");
					put(grammarAccess.getEnumVariantAccess().getGroup_2_0(), "rule__EnumVariant__Group_2_0__0");
					put(grammarAccess.getEnumVariantAccess().getGroup_2_0_2(), "rule__EnumVariant__Group_2_0_2__0");
					put(grammarAccess.getEnumVariantAccess().getGroup_2_1(), "rule__EnumVariant__Group_2_1__0");
					put(grammarAccess.getEnumVariantAccess().getGroup_2_1_2(), "rule__EnumVariant__Group_2_1_2__0");
					put(grammarAccess.getTraitItemAccess().getGroup(), "rule__TraitItem__Group__0");
					put(grammarAccess.getTraitItemAccess().getGroup_2(), "rule__TraitItem__Group_2__0");
					put(grammarAccess.getTraitItemAccess().getGroup_2_2(), "rule__TraitItem__Group_2_2__0");
					put(grammarAccess.getTraitMethodAccess().getGroup(), "rule__TraitMethod__Group__0");
					put(grammarAccess.getTraitMethodAccess().getGroup_4(), "rule__TraitMethod__Group_4__0");
					put(grammarAccess.getTraitMethodAccess().getGroup_4_2(), "rule__TraitMethod__Group_4_2__0");
					put(grammarAccess.getTraitMethodAccess().getGroup_6(), "rule__TraitMethod__Group_6__0");
					put(grammarAccess.getTraitMethodAccess().getGroup_6_1(), "rule__TraitMethod__Group_6_1__0");
					put(grammarAccess.getTraitMethodAccess().getGroup_8(), "rule__TraitMethod__Group_8__0");
					put(grammarAccess.getImplItemAccess().getGroup(), "rule__ImplItem__Group__0");
					put(grammarAccess.getImplItemAccess().getGroup_1(), "rule__ImplItem__Group_1__0");
					put(grammarAccess.getImplMethodAccess().getGroup(), "rule__ImplMethod__Group__0");
					put(grammarAccess.getImplMethodAccess().getGroup_3(), "rule__ImplMethod__Group_3__0");
					put(grammarAccess.getImplMethodAccess().getGroup_3_2(), "rule__ImplMethod__Group_3_2__0");
					put(grammarAccess.getImplMethodAccess().getGroup_5(), "rule__ImplMethod__Group_5__0");
					put(grammarAccess.getImplMethodAccess().getGroup_5_1(), "rule__ImplMethod__Group_5_1__0");
					put(grammarAccess.getImplMethodAccess().getGroup_7(), "rule__ImplMethod__Group_7__0");
					put(grammarAccess.getExternBlockAccess().getGroup(), "rule__ExternBlock__Group__0");
					put(grammarAccess.getForeignFnAccess().getGroup(), "rule__ForeignFn__Group__0");
					put(grammarAccess.getForeignFnAccess().getGroup_3(), "rule__ForeignFn__Group_3__0");
					put(grammarAccess.getForeignFnAccess().getGroup_3_1(), "rule__ForeignFn__Group_3_1__0");
					put(grammarAccess.getForeignFnAccess().getGroup_5(), "rule__ForeignFn__Group_5__0");
					put(grammarAccess.getStaticItemAccess().getGroup(), "rule__StaticItem__Group__0");
					put(grammarAccess.getStaticItemAccess().getGroup_3(), "rule__StaticItem__Group_3__0");
					put(grammarAccess.getBlockAccess().getGroup(), "rule__Block__Group__0");
					put(grammarAccess.getGenericParamDeclAccess().getGroup(), "rule__GenericParamDecl__Group__0");
					put(grammarAccess.getGenericParamDeclAccess().getGroup_1(), "rule__GenericParamDecl__Group_1__0");
					put(grammarAccess.getGenericParamDeclAccess().getGroup_1_2(), "rule__GenericParamDecl__Group_1_2__0");
					put(grammarAccess.getArgAccess().getGroup(), "rule__Arg__Group__0");
					put(grammarAccess.getPatWildcardAccess().getGroup(), "rule__PatWildcard__Group__0");
					put(grammarAccess.getPatIdentAccess().getGroup(), "rule__PatIdent__Group__0");
					put(grammarAccess.getPatBoxedAccess().getGroup(), "rule__PatBoxed__Group__0");
					put(grammarAccess.getPatOwnedAccess().getGroup(), "rule__PatOwned__Group__0");
					put(grammarAccess.getPatBorrowedAccess().getGroup(), "rule__PatBorrowed__Group__0");
					put(grammarAccess.getPatTupleAccess().getGroup(), "rule__PatTuple__Group__0");
					put(grammarAccess.getPatTupleAccess().getGroup_2(), "rule__PatTuple__Group_2__0");
					put(grammarAccess.getPatVectorAccess().getGroup(), "rule__PatVector__Group__0");
					put(grammarAccess.getPatVectorAccess().getGroup_2(), "rule__PatVector__Group_2__0");
					put(grammarAccess.getPatCharRangeAccess().getGroup(), "rule__PatCharRange__Group__0");
					put(grammarAccess.getPatNumberRangeAccess().getGroup(), "rule__PatNumberRange__Group__0");
					put(grammarAccess.getPatEnumAccess().getGroup(), "rule__PatEnum__Group__0");
					put(grammarAccess.getPatEnumAccess().getGroup_1_0(), "rule__PatEnum__Group_1_0__0");
					put(grammarAccess.getPatEnumAccess().getGroup_1_0_2_2(), "rule__PatEnum__Group_1_0_2_2__0");
					put(grammarAccess.getPatEnumAccess().getGroup_1_0_2_2_1(), "rule__PatEnum__Group_1_0_2_2_1__0");
					put(grammarAccess.getPatEnumAccess().getGroup_1_1(), "rule__PatEnum__Group_1_1__0");
					put(grammarAccess.getPatEnumAccess().getGroup_1_1_3(), "rule__PatEnum__Group_1_1_3__0");
					put(grammarAccess.getFieldPatAccess().getGroup(), "rule__FieldPat__Group__0");
					put(grammarAccess.getFieldPatAccess().getGroup_1(), "rule__FieldPat__Group_1__0");
					put(grammarAccess.getPathAccess().getGroup(), "rule__Path__Group__0");
					put(grammarAccess.getPathAccess().getGroup_1(), "rule__Path__Group_1__0");
					put(grammarAccess.getPathAccess().getGroup_3(), "rule__Path__Group_3__0");
					put(grammarAccess.getPathAccess().getGroup_3_2(), "rule__Path__Group_3_2__0");
					put(grammarAccess.getPrimitiveTypeAccess().getGroup_0(), "rule__PrimitiveType__Group_0__0");
					put(grammarAccess.getPrimitiveTypeAccess().getGroup_1(), "rule__PrimitiveType__Group_1__0");
					put(grammarAccess.getPrimitiveTypeAccess().getGroup_2(), "rule__PrimitiveType__Group_2__0");
					put(grammarAccess.getPrimitiveTypeAccess().getGroup_3(), "rule__PrimitiveType__Group_3__0");
					put(grammarAccess.getPrimitiveTypeAccess().getGroup_4(), "rule__PrimitiveType__Group_4__0");
					put(grammarAccess.getTupleTypeAccess().getGroup(), "rule__TupleType__Group__0");
					put(grammarAccess.getTupleTypeAccess().getGroup_2(), "rule__TupleType__Group_2__0");
					put(grammarAccess.getStructTypeAccess().getGroup(), "rule__StructType__Group__0");
					put(grammarAccess.getStructTypeAccess().getGroup_2(), "rule__StructType__Group_2__0");
					put(grammarAccess.getStructTypeAccess().getGroup_2_2(), "rule__StructType__Group_2_2__0");
					put(grammarAccess.getStructTypeAccess().getGroup_5(), "rule__StructType__Group_5__0");
					put(grammarAccess.getBoxedPointerAccess().getGroup(), "rule__BoxedPointer__Group__0");
					put(grammarAccess.getOwnedPointerAccess().getGroup(), "rule__OwnedPointer__Group__0");
					put(grammarAccess.getBorrowedPointerAccess().getGroup(), "rule__BorrowedPointer__Group__0");
					put(grammarAccess.getStructFieldAccess().getGroup(), "rule__StructField__Group__0");
					put(grammarAccess.getEnumTypeAccess().getGroup(), "rule__EnumType__Group__0");
					put(grammarAccess.getEnumTypeAccess().getGroup_2(), "rule__EnumType__Group_2__0");
					put(grammarAccess.getEnumTypeAccess().getGroup_2_2(), "rule__EnumType__Group_2_2__0");
					put(grammarAccess.getEnumTypeAccess().getGroup_5(), "rule__EnumType__Group_5__0");
					put(grammarAccess.getStructVariantAccess().getGroup(), "rule__StructVariant__Group__0");
					put(grammarAccess.getStructVariantAccess().getGroup_1(), "rule__StructVariant__Group_1__0");
					put(grammarAccess.getStructVariantAccess().getGroup_1_2(), "rule__StructVariant__Group_1_2__0");
					put(grammarAccess.getStructVariantAccess().getGroup_4(), "rule__StructVariant__Group_4__0");
					put(grammarAccess.getTupleVariantAccess().getGroup(), "rule__TupleVariant__Group__0");
					put(grammarAccess.getTupleVariantAccess().getGroup_3(), "rule__TupleVariant__Group_3__0");
					put(grammarAccess.getCrateAccess().getItemsAssignment(), "rule__Crate__ItemsAssignment");
					put(grammarAccess.getItemAttrAccess().getAttrsAssignment_1(), "rule__ItemAttr__AttrsAssignment_1");
					put(grammarAccess.getItemAttrAccess().getAttrsAssignment_2_1(), "rule__ItemAttr__AttrsAssignment_2_1");
					put(grammarAccess.getAttrWithListAccess().getIdentAssignment_0(), "rule__AttrWithList__IdentAssignment_0");
					put(grammarAccess.getAttrWithListAccess().getAttrsAssignment_2(), "rule__AttrWithList__AttrsAssignment_2");
					put(grammarAccess.getAttrWithListAccess().getAttrsAssignment_3_1(), "rule__AttrWithList__AttrsAssignment_3_1");
					put(grammarAccess.getLiteralAttrAccess().getIdentAssignment_0(), "rule__LiteralAttr__IdentAssignment_0");
					put(grammarAccess.getLiteralAttrAccess().getValueAssignment_2(), "rule__LiteralAttr__ValueAssignment_2");
					put(grammarAccess.getItemAndAttrsAccess().getAttrsAssignment_0(), "rule__ItemAndAttrs__AttrsAssignment_0");
					put(grammarAccess.getItemAndAttrsAccess().getItemAssignment_1(), "rule__ItemAndAttrs__ItemAssignment_1");
					put(grammarAccess.getModItemAccess().getIdentAssignment_1(), "rule__ModItem__IdentAssignment_1");
					put(grammarAccess.getModItemAccess().getExternalBodyAssignment_2_0(), "rule__ModItem__ExternalBodyAssignment_2_0");
					put(grammarAccess.getModItemAccess().getItemsAssignment_2_1_1(), "rule__ModItem__ItemsAssignment_2_1_1");
					put(grammarAccess.getFnItemAccess().getIdentAssignment_1(), "rule__FnItem__IdentAssignment_1");
					put(grammarAccess.getFnItemAccess().getParamsAssignment_2_1(), "rule__FnItem__ParamsAssignment_2_1");
					put(grammarAccess.getFnItemAccess().getParamsAssignment_2_2_1(), "rule__FnItem__ParamsAssignment_2_2_1");
					put(grammarAccess.getFnItemAccess().getArgsAssignment_4_0(), "rule__FnItem__ArgsAssignment_4_0");
					put(grammarAccess.getFnItemAccess().getArgsAssignment_4_1_1(), "rule__FnItem__ArgsAssignment_4_1_1");
					put(grammarAccess.getFnItemAccess().getReturnTypeAssignment_6_1(), "rule__FnItem__ReturnTypeAssignment_6_1");
					put(grammarAccess.getFnItemAccess().getBodyAssignment_7(), "rule__FnItem__BodyAssignment_7");
					put(grammarAccess.getTypeItemAccess().getIdentAssignment_1(), "rule__TypeItem__IdentAssignment_1");
					put(grammarAccess.getTypeItemAccess().getParamsAssignment_2_1(), "rule__TypeItem__ParamsAssignment_2_1");
					put(grammarAccess.getTypeItemAccess().getParamsAssignment_2_2_1(), "rule__TypeItem__ParamsAssignment_2_2_1");
					put(grammarAccess.getTypeItemAccess().getTypeAssignment_4(), "rule__TypeItem__TypeAssignment_4");
					put(grammarAccess.getStructItemAccess().getIdentAssignment_1(), "rule__StructItem__IdentAssignment_1");
					put(grammarAccess.getStructItemAccess().getParamsAssignment_2_1(), "rule__StructItem__ParamsAssignment_2_1");
					put(grammarAccess.getStructItemAccess().getParamsAssignment_2_2_1(), "rule__StructItem__ParamsAssignment_2_2_1");
					put(grammarAccess.getStructItemAccess().getFieldsAssignment_4(), "rule__StructItem__FieldsAssignment_4");
					put(grammarAccess.getStructItemAccess().getFieldsAssignment_5_1(), "rule__StructItem__FieldsAssignment_5_1");
					put(grammarAccess.getEnumItemAccess().getIdentAssignment_1(), "rule__EnumItem__IdentAssignment_1");
					put(grammarAccess.getEnumItemAccess().getParamsAssignment_2_1(), "rule__EnumItem__ParamsAssignment_2_1");
					put(grammarAccess.getEnumItemAccess().getParamsAssignment_2_2_1(), "rule__EnumItem__ParamsAssignment_2_2_1");
					put(grammarAccess.getEnumItemAccess().getVariantsAssignment_4(), "rule__EnumItem__VariantsAssignment_4");
					put(grammarAccess.getEnumItemAccess().getVariantsAssignment_5_1(), "rule__EnumItem__VariantsAssignment_5_1");
					put(grammarAccess.getEnumVariantAccess().getIdentAssignment_0(), "rule__EnumVariant__IdentAssignment_0");
					put(grammarAccess.getEnumVariantAccess().getParamsAssignment_1_1(), "rule__EnumVariant__ParamsAssignment_1_1");
					put(grammarAccess.getEnumVariantAccess().getParamsAssignment_1_2_1(), "rule__EnumVariant__ParamsAssignment_1_2_1");
					put(grammarAccess.getEnumVariantAccess().getTypesAssignment_2_0_1(), "rule__EnumVariant__TypesAssignment_2_0_1");
					put(grammarAccess.getEnumVariantAccess().getTypesAssignment_2_0_2_1(), "rule__EnumVariant__TypesAssignment_2_0_2_1");
					put(grammarAccess.getEnumVariantAccess().getFieldsAssignment_2_1_1(), "rule__EnumVariant__FieldsAssignment_2_1_1");
					put(grammarAccess.getEnumVariantAccess().getFieldsAssignment_2_1_2_1(), "rule__EnumVariant__FieldsAssignment_2_1_2_1");
					put(grammarAccess.getTraitItemAccess().getIdentAssignment_1(), "rule__TraitItem__IdentAssignment_1");
					put(grammarAccess.getTraitItemAccess().getParamsAssignment_2_1(), "rule__TraitItem__ParamsAssignment_2_1");
					put(grammarAccess.getTraitItemAccess().getParamsAssignment_2_2_1(), "rule__TraitItem__ParamsAssignment_2_2_1");
					put(grammarAccess.getTraitItemAccess().getMethodsAssignment_4(), "rule__TraitItem__MethodsAssignment_4");
					put(grammarAccess.getTraitMethodAccess().getUnsafeAssignment_0_0(), "rule__TraitMethod__UnsafeAssignment_0_0");
					put(grammarAccess.getTraitMethodAccess().getExternAssignment_0_1(), "rule__TraitMethod__ExternAssignment_0_1");
					put(grammarAccess.getTraitMethodAccess().getVisAssignment_1(), "rule__TraitMethod__VisAssignment_1");
					put(grammarAccess.getTraitMethodAccess().getIdentAssignment_3(), "rule__TraitMethod__IdentAssignment_3");
					put(grammarAccess.getTraitMethodAccess().getParamsAssignment_4_1(), "rule__TraitMethod__ParamsAssignment_4_1");
					put(grammarAccess.getTraitMethodAccess().getParamsAssignment_4_2_1(), "rule__TraitMethod__ParamsAssignment_4_2_1");
					put(grammarAccess.getTraitMethodAccess().getArgsAssignment_6_0(), "rule__TraitMethod__ArgsAssignment_6_0");
					put(grammarAccess.getTraitMethodAccess().getArgsAssignment_6_1_1(), "rule__TraitMethod__ArgsAssignment_6_1_1");
					put(grammarAccess.getTraitMethodAccess().getReturnTypeAssignment_8_1(), "rule__TraitMethod__ReturnTypeAssignment_8_1");
					put(grammarAccess.getTraitMethodAccess().getBodyAssignment_9_0(), "rule__TraitMethod__BodyAssignment_9_0");
					put(grammarAccess.getImplItemAccess().getTraitAssignment_1_0(), "rule__ImplItem__TraitAssignment_1_0");
					put(grammarAccess.getImplItemAccess().getStructAssignment_2(), "rule__ImplItem__StructAssignment_2");
					put(grammarAccess.getImplItemAccess().getMethodsAssignment_4(), "rule__ImplItem__MethodsAssignment_4");
					put(grammarAccess.getImplMethodAccess().getUnsafeAssignment_0_0(), "rule__ImplMethod__UnsafeAssignment_0_0");
					put(grammarAccess.getImplMethodAccess().getExternAssignment_0_1(), "rule__ImplMethod__ExternAssignment_0_1");
					put(grammarAccess.getImplMethodAccess().getIdentAssignment_2(), "rule__ImplMethod__IdentAssignment_2");
					put(grammarAccess.getImplMethodAccess().getParamsAssignment_3_1(), "rule__ImplMethod__ParamsAssignment_3_1");
					put(grammarAccess.getImplMethodAccess().getParamsAssignment_3_2_1(), "rule__ImplMethod__ParamsAssignment_3_2_1");
					put(grammarAccess.getImplMethodAccess().getArgsAssignment_5_0(), "rule__ImplMethod__ArgsAssignment_5_0");
					put(grammarAccess.getImplMethodAccess().getArgsAssignment_5_1_1(), "rule__ImplMethod__ArgsAssignment_5_1_1");
					put(grammarAccess.getImplMethodAccess().getReturnTypeAssignment_7_1(), "rule__ImplMethod__ReturnTypeAssignment_7_1");
					put(grammarAccess.getImplMethodAccess().getBodyAssignment_8(), "rule__ImplMethod__BodyAssignment_8");
					put(grammarAccess.getExternBlockAccess().getAbiAssignment_2(), "rule__ExternBlock__AbiAssignment_2");
					put(grammarAccess.getExternBlockAccess().getFunctionsAssignment_4(), "rule__ExternBlock__FunctionsAssignment_4");
					put(grammarAccess.getForeignFnAccess().getIdentAssignment_1(), "rule__ForeignFn__IdentAssignment_1");
					put(grammarAccess.getForeignFnAccess().getArgsAssignment_3_0(), "rule__ForeignFn__ArgsAssignment_3_0");
					put(grammarAccess.getForeignFnAccess().getArgsAssignment_3_1_1(), "rule__ForeignFn__ArgsAssignment_3_1_1");
					put(grammarAccess.getForeignFnAccess().getReturnTypeAssignment_5_1(), "rule__ForeignFn__ReturnTypeAssignment_5_1");
					put(grammarAccess.getStaticItemAccess().getMutableAssignment_1(), "rule__StaticItem__MutableAssignment_1");
					put(grammarAccess.getStaticItemAccess().getIdentAssignment_2(), "rule__StaticItem__IdentAssignment_2");
					put(grammarAccess.getStaticItemAccess().getTypeAssignment_3_1(), "rule__StaticItem__TypeAssignment_3_1");
					put(grammarAccess.getStaticItemAccess().getExprAssignment_5(), "rule__StaticItem__ExprAssignment_5");
					put(grammarAccess.getExprLiteralAccess().getLiteralAssignment(), "rule__ExprLiteral__LiteralAssignment");
					put(grammarAccess.getExprPathAccess().getPathAssignment(), "rule__ExprPath__PathAssignment");
					put(grammarAccess.getGenericParamDeclAccess().getIdentAssignment_0(), "rule__GenericParamDecl__IdentAssignment_0");
					put(grammarAccess.getGenericParamDeclAccess().getBoundsAssignment_1_1(), "rule__GenericParamDecl__BoundsAssignment_1_1");
					put(grammarAccess.getGenericParamDeclAccess().getBoundsAssignment_1_2_1(), "rule__GenericParamDecl__BoundsAssignment_1_2_1");
					put(grammarAccess.getArgAccess().getPatAssignment_0(), "rule__Arg__PatAssignment_0");
					put(grammarAccess.getArgAccess().getTypeAssignment_2(), "rule__Arg__TypeAssignment_2");
					put(grammarAccess.getPatIdentAccess().getMutableAssignment_0(), "rule__PatIdent__MutableAssignment_0");
					put(grammarAccess.getPatIdentAccess().getIdentAssignment_1(), "rule__PatIdent__IdentAssignment_1");
					put(grammarAccess.getPatBoxedAccess().getPatternAssignment_1(), "rule__PatBoxed__PatternAssignment_1");
					put(grammarAccess.getPatOwnedAccess().getPatternAssignment_1(), "rule__PatOwned__PatternAssignment_1");
					put(grammarAccess.getPatBorrowedAccess().getPatternAssignment_1(), "rule__PatBorrowed__PatternAssignment_1");
					put(grammarAccess.getPatTupleAccess().getPatternsAssignment_1(), "rule__PatTuple__PatternsAssignment_1");
					put(grammarAccess.getPatTupleAccess().getPatternsAssignment_2_1(), "rule__PatTuple__PatternsAssignment_2_1");
					put(grammarAccess.getPatVectorAccess().getPatternsAssignment_1(), "rule__PatVector__PatternsAssignment_1");
					put(grammarAccess.getPatVectorAccess().getPatternsAssignment_2_1(), "rule__PatVector__PatternsAssignment_2_1");
					put(grammarAccess.getPatLiteralAccess().getLiteralAssignment(), "rule__PatLiteral__LiteralAssignment");
					put(grammarAccess.getPatCharRangeAccess().getStartAssignment_0(), "rule__PatCharRange__StartAssignment_0");
					put(grammarAccess.getPatCharRangeAccess().getEndAssignment_2(), "rule__PatCharRange__EndAssignment_2");
					put(grammarAccess.getPatNumberRangeAccess().getStartAssignment_0(), "rule__PatNumberRange__StartAssignment_0");
					put(grammarAccess.getPatNumberRangeAccess().getEndAssignment_2(), "rule__PatNumberRange__EndAssignment_2");
					put(grammarAccess.getPatEnumAccess().getPathAssignment_0(), "rule__PatEnum__PathAssignment_0");
					put(grammarAccess.getPatEnumAccess().getPatternsAssignment_1_0_2_2_0(), "rule__PatEnum__PatternsAssignment_1_0_2_2_0");
					put(grammarAccess.getPatEnumAccess().getPatternsAssignment_1_0_2_2_1_1(), "rule__PatEnum__PatternsAssignment_1_0_2_2_1_1");
					put(grammarAccess.getPatEnumAccess().getFieldPatternsAssignment_1_1_2(), "rule__PatEnum__FieldPatternsAssignment_1_1_2");
					put(grammarAccess.getPatEnumAccess().getFieldPatternsAssignment_1_1_3_1(), "rule__PatEnum__FieldPatternsAssignment_1_1_3_1");
					put(grammarAccess.getFieldPatAccess().getIdentAssignment_0(), "rule__FieldPat__IdentAssignment_0");
					put(grammarAccess.getFieldPatAccess().getPatternAssignment_1_1(), "rule__FieldPat__PatternAssignment_1_1");
					put(grammarAccess.getPathAccess().getSegmentsAssignment_0(), "rule__Path__SegmentsAssignment_0");
					put(grammarAccess.getPathAccess().getSegmentsAssignment_1_1(), "rule__Path__SegmentsAssignment_1_1");
					put(grammarAccess.getPathAccess().getLifetimesAssignment_3_1_0(), "rule__Path__LifetimesAssignment_3_1_0");
					put(grammarAccess.getPathAccess().getGenericTypesAssignment_3_1_1(), "rule__Path__GenericTypesAssignment_3_1_1");
					put(grammarAccess.getPathAccess().getLifetimesAssignment_3_2_1_0(), "rule__Path__LifetimesAssignment_3_2_1_0");
					put(grammarAccess.getPathAccess().getGenericTypesAssignment_3_2_1_1(), "rule__Path__GenericTypesAssignment_3_2_1_1");
					put(grammarAccess.getTupleTypeAccess().getTypesAssignment_1(), "rule__TupleType__TypesAssignment_1");
					put(grammarAccess.getTupleTypeAccess().getTypesAssignment_2_1(), "rule__TupleType__TypesAssignment_2_1");
					put(grammarAccess.getStructTypeAccess().getIdentAssignment_1(), "rule__StructType__IdentAssignment_1");
					put(grammarAccess.getStructTypeAccess().getParamsAssignment_2_1(), "rule__StructType__ParamsAssignment_2_1");
					put(grammarAccess.getStructTypeAccess().getParamsAssignment_2_2_1(), "rule__StructType__ParamsAssignment_2_2_1");
					put(grammarAccess.getStructTypeAccess().getFieldsAssignment_4(), "rule__StructType__FieldsAssignment_4");
					put(grammarAccess.getStructTypeAccess().getFieldsAssignment_5_1(), "rule__StructType__FieldsAssignment_5_1");
					put(grammarAccess.getBoxedPointerAccess().getTypeAssignment_1(), "rule__BoxedPointer__TypeAssignment_1");
					put(grammarAccess.getOwnedPointerAccess().getTypeAssignment_1(), "rule__OwnedPointer__TypeAssignment_1");
					put(grammarAccess.getBorrowedPointerAccess().getTypeAssignment_1(), "rule__BorrowedPointer__TypeAssignment_1");
					put(grammarAccess.getStructFieldAccess().getVisAssignment_0(), "rule__StructField__VisAssignment_0");
					put(grammarAccess.getStructFieldAccess().getIdentAssignment_1(), "rule__StructField__IdentAssignment_1");
					put(grammarAccess.getStructFieldAccess().getTypeAssignment_3(), "rule__StructField__TypeAssignment_3");
					put(grammarAccess.getEnumTypeAccess().getIdentAssignment_1(), "rule__EnumType__IdentAssignment_1");
					put(grammarAccess.getEnumTypeAccess().getParamsAssignment_2_1(), "rule__EnumType__ParamsAssignment_2_1");
					put(grammarAccess.getEnumTypeAccess().getParamsAssignment_2_2_1(), "rule__EnumType__ParamsAssignment_2_2_1");
					put(grammarAccess.getEnumTypeAccess().getVariantsAssignment_4(), "rule__EnumType__VariantsAssignment_4");
					put(grammarAccess.getEnumTypeAccess().getVariantsAssignment_5_1(), "rule__EnumType__VariantsAssignment_5_1");
					put(grammarAccess.getStructVariantAccess().getIdentAssignment_0(), "rule__StructVariant__IdentAssignment_0");
					put(grammarAccess.getStructVariantAccess().getParamsAssignment_1_1(), "rule__StructVariant__ParamsAssignment_1_1");
					put(grammarAccess.getStructVariantAccess().getParamsAssignment_1_2_1(), "rule__StructVariant__ParamsAssignment_1_2_1");
					put(grammarAccess.getStructVariantAccess().getFieldsAssignment_3(), "rule__StructVariant__FieldsAssignment_3");
					put(grammarAccess.getStructVariantAccess().getFieldsAssignment_4_1(), "rule__StructVariant__FieldsAssignment_4_1");
					put(grammarAccess.getTupleVariantAccess().getIdentAssignment_0(), "rule__TupleVariant__IdentAssignment_0");
					put(grammarAccess.getTupleVariantAccess().getTypesAssignment_2(), "rule__TupleVariant__TypesAssignment_2");
					put(grammarAccess.getTupleVariantAccess().getTypesAssignment_3_1(), "rule__TupleVariant__TypesAssignment_3_1");
					put(grammarAccess.getUnitVariantAccess().getIdentAssignment(), "rule__UnitVariant__IdentAssignment");
					put(grammarAccess.getStringLitAccess().getValueAssignment(), "rule__StringLit__ValueAssignment");
					put(grammarAccess.getNumberLitAccess().getValueAssignment(), "rule__NumberLit__ValueAssignment");
					put(grammarAccess.getCharLitAccess().getValueAssignment(), "rule__CharLit__ValueAssignment");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			de.redoxi.ruste.ui.contentassist.antlr.internal.InternalRustParser typedParser = (de.redoxi.ruste.ui.contentassist.antlr.internal.InternalRustParser) parser;
			typedParser.entryRuleCrate();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] {  };
	}
	
	public RustGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(RustGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
