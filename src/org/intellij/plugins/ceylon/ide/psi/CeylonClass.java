package org.intellij.plugins.ceylon.ide.psi;

import com.intellij.psi.PsiNameIdentifierOwner;
import com.intellij.psi.StubBasedPsiElement;
import org.intellij.plugins.ceylon.ide.psi.stub.ClassStub;
import org.jetbrains.annotations.Nullable;

public interface CeylonClass extends CeylonPsi.ClassOrInterfacePsi, PsiNameIdentifierOwner, CeylonNamedDeclaration, CeylonTypedDeclaration, StubBasedPsiElement<ClassStub> {

    @Nullable
    String getQualifiedName();

    boolean isInterface();
}
