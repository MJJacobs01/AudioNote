/*
 * Copyright (c) 2023 Samson Achiaga
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.certified.audionote.ui.theme

import androidx.compose.foundation.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.*

/**
 * Created by MJ Jacobs on 2024/12/28 at 13:20
 */

val DarkColor = darkColorScheme(
    primary = primaryDark,
    secondary = primaryDarkDark,
    tertiary = primaryDarkerDark,
    onPrimary = accentDark,
    onSecondary = black
)

val LightColor = lightColorScheme(
    primary = primaryLight,
    secondary = primaryDarkLight,
    tertiary = primaryDarkerLight,
    onPrimary = accentLight,
    onSecondary = black
)

@Composable
fun AudioNoteTheme(
    isDarkTheme:Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val color = if (isDarkTheme) DarkColor else LightColor
    
    MaterialTheme(
        colorScheme = color,
        typography = typography,
        content = content
    )
}