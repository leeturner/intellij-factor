package com.leeturner.intellijfactor.language

import com.intellij.lang.Language

object FactorLanguage : Language("Factor", "text/factor") {
    override fun isCaseSensitive() = true
    override fun getDisplayName() = "Factor"
}