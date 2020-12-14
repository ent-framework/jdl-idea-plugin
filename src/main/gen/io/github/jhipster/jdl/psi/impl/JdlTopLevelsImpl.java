// This is a generated file. Not intended for manual editing.
package io.github.jhipster.jdl.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static io.github.jhipster.jdl.psi.JdlTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import io.github.jhipster.jdl.psi.*;

public class JdlTopLevelsImpl extends ASTWrapperPsiElement implements JdlTopLevels {

  public JdlTopLevelsImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull JdlVisitor visitor) {
    visitor.visitTopLevels(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof JdlVisitor) accept((JdlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<JdlTopLevelItem> getTopLevelItemList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, JdlTopLevelItem.class);
  }

}
