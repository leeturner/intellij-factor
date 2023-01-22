package com.leeturner.intellijfactor.language

import com.intellij.openapi.fileTypes.LanguageFileType
import com.intellij.openapi.vfs.VirtualFile

object FactorFileType : LanguageFileType(FactorLanguage) {
    override fun getName() = "Factor"
    override fun getDescription() = "Factor language file"
    override fun getDefaultExtension() = "factor"
    override fun getIcon() = FactorIcons.fileTypeIcon
    override fun getCharset(file: VirtualFile, content: ByteArray): String = "UTF-8"
}