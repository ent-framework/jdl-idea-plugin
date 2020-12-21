package io.github.jhipster.jdl.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.ResolveState;
import com.intellij.psi.scope.PsiScopeProcessor;
import com.intellij.psi.search.SearchScope;
import com.intellij.psi.tree.IElementType;
import io.github.jhipster.jdl.psi.JdlPsiCompositeElement;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class JdlPsiCompositeElementImpl extends ASTWrapperPsiElement implements JdlPsiCompositeElement {

  public JdlPsiCompositeElementImpl(@NotNull ASTNode node) {
    super(node);
  }

  @Override
  public IElementType getTokenType() {
    return getNode().getElementType();
  }

  @Override
  public String toString() {
    return getTokenType().toString();
  }

  @NotNull
  @Override
  public SearchScope getUseScope() {
    // LocalSearchScope enables in-place rename. See DartRefactoringSupportProvider.isInplaceRenameAvailable() and its usages.
//    DartComponentType type = DartComponentType.typeOf(this);
//    if (type == DartComponentType.LOCAL_VARIABLE) {
//      // this -> name, parent -> component, but we need next component up the tree.
//      DartComponent parentComponent = PsiTreeUtil.getParentOfType(getParent(), DartComponent.class);
//      return new LocalSearchScope(parentComponent != null ? parentComponent : getContainingFile());
//    }
//    // too large scope doesn't affect performance (usages are searched via Analysis Server) but helps to solve corner cases
//    return GlobalSearchScope.allScope(getProject());
    return null;
  }
//
//  @Override
//  public boolean processDeclarations(@NotNull PsiScopeProcessor processor,
//      @NotNull ResolveState state,
//      PsiElement lastParent,
//      @NotNull PsiElement place) {
//    return processDeclarationsImpl(this, processor, state, lastParent)
//        && super.processDeclarations(processor, state, lastParent, place);
//  }
//
//  public static boolean processDeclarationsImpl(@Nullable PsiElement context,
//      PsiScopeProcessor processor,
//      ResolveState state,
//      @Nullable PsiElement lastParent) {
//    if (context == null) {
//      return true;
//    }
//    for (DartComponentName element : getDeclarationElementToProcess(context, lastParent)) {
//      if (!processor.execute(element, state)) {
//        return false;
//      }
//    }
//    return true;
//  }
//
//  private static Set<DartComponentName> getDeclarationElementToProcess(@NotNull PsiElement context, @Nullable PsiElement lastParent) {
//    final PsiElement[] children = context.getChildren();
//    final Set<DartComponentName> result =
//        DartControlFlowUtil.getSimpleDeclarations(children, lastParent, context instanceof DartStatements);
//
//    for (PsiElement child : children) {
//      if (child instanceof DartFormalParameterList) {
//        final DartFormalParameterList formalParameterList = (DartFormalParameterList)child;
//        final List<DartNormalFormalParameter> normalFormalParameterList =
//            new ArrayList<>(formalParameterList.getNormalFormalParameterList());
//        final DartOptionalFormalParameters optionalFormalParameters = formalParameterList.getOptionalFormalParameters();
//        if (optionalFormalParameters != null) {
//          normalFormalParameterList.addAll(
//              ContainerUtil.map(optionalFormalParameters.getDefaultFormalNamedParameterList(),
//                  DartDefaultFormalNamedParameter::getNormalFormalParameter)
//          );
//        }
//        for (DartNormalFormalParameter parameter : normalFormalParameterList) {
//          final DartComponentName componentName = parameter.findComponentName();
//          if (componentName != null) {
//            result.add(componentName);
//          }
//        }
//      }
//
//      if (child instanceof DartTypeParameters) {
//        for (DartTypeParameter typeParameter : ((DartTypeParameters)child).getTypeParameterList()) {
//          result.add(typeParameter.getComponentName());
//        }
//      }
//
//      if (child instanceof DartImportStatement) {
//        ContainerUtil.addIfNotNull(result, ((DartImportStatement)child).getImportPrefix());
//      }
//
//      if (child instanceof DartCatchPart) {
//        result.addAll(((DartCatchPart)child).getComponentNameList());
//      }
//    }
//
//    if (context instanceof DartForStatement) {
//      final DartForLoopPartsInBraces loopPartsInBraces = ((DartForStatement)context).getForLoopPartsInBraces();
//      final DartForLoopParts loopParts = loopPartsInBraces == null ? null : loopPartsInBraces.getForLoopParts();
//      final DartForInPart forInPart = loopParts == null ? null : loopParts.getForInPart();
//      final DartComponentName componentName = forInPart == null ? null : forInPart.getComponentName();
//      if (componentName != null) {
//        result.add(componentName);
//      }
//      final DartVarAccessDeclaration varDeclaration = forInPart == null ? null : forInPart.getVarAccessDeclaration();
//      if (varDeclaration != null) {
//        result.add(varDeclaration.getComponentName());
//      }
//      final DartVarDeclarationList varDeclarationList = loopParts == null ? null : loopParts.getVarDeclarationList();
//      if (varDeclarationList != null) {
//        DartControlFlowUtil.addFromVarDeclarationList(result, varDeclarationList);
//      }
//    }
//
//    return result;
//  }
}