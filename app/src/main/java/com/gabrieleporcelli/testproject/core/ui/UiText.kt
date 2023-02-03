package com.example.spotme_setup.core.ui

import androidx.annotation.StringRes
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource

sealed interface UiText {
    data class DynamicString(val value: String) : UiText
    data class StringResource(
        @StringRes val resId: Int,
        val args: List<Any> = listOf(),
    ) : UiText

    @Composable
    fun asString(): String =
        when (this) {
            is DynamicString -> value
            is StringResource -> stringResource(id = resId, *args.toTypedArray())
        }
}