package com.leeturner.intellijfactor.language

import com.intellij.lang.Language

object FactorLanguage : Language("Factor", "Factor", "text/x-factor", "application/x-factor", "text/factor") {
    override fun isCaseSensitive() = true
    override fun getDisplayName() = "Factor"
}