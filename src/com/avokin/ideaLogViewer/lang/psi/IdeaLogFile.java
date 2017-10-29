package com.avokin.ideaLogViewer.lang.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import org.jetbrains.annotations.NotNull;

public class IdeaLogFile extends PsiFileBase {
    public IdeaLogFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, com.avokin.ideaLogViewer.lang.psi.IdeaLogLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return com.avokin.ideaLogViewer.lang.psi.IdeaLogFileType.INSTANCE;
    }
}