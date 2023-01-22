package com.leeturner.intellijfactor.language

import com.intellij.openapi.fileTypes.LanguageFileType

object FactorFileType : LanguageFileType(FactorLanguage) {
    override fun getName() = "Factor"
    override fun getDescription() = "Factor language file"
    override fun getDefaultExtension() = "factor"
    override fun getIcon() = FactorIcons.fileTypeIcon
}