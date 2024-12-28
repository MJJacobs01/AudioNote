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
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.*

/**
 * Created by MJ Jacobs on 2024/12/28 at 13:07
 */

//  Light colors
val purple200 = Color(0xFFBB86FC)
val purple500 = Color(0xFF6200EE)
val purple700 = Color(0xFF3700B3)
val teal200 = Color(0xFF03DAC5)
val teal700 = Color(0xFF018786)
val black = Color(0xFF000000)
val white = Color(0xFFFFFFFF)

val accentLight = Color(0xFFFFECF1)
val fragment_background = accentLight
val other_fragment_background = Color(0xFF986977)
val primaryLight = Color(0xFFEFB8C8)
val primaryDarkLight = Color(0xFFD29DAC)
val primaryDarkerLight = Color(0xFF986977)
val micAccentLight = Color(0xFF939094)
val fabBackgroundTintLight = primaryLight
val aboutIconColorLight = Color(0xFFEFB8C8)
val editReminderButtonColorLight = other_fragment_background
val greyLight = Color(0xFFAEAEAE)
val titleTextLight = primaryDarkerLight
val subtitleTextLight = primaryDarkLight

//  Dark colors
val primaryDark = Color(0xFF313033)
val primaryDarkDark = Color(0xFF1C1B1F)
val primaryDarkerDark = black
val accentDark = white
val fragmentBackgroundDark = primaryDark
val otherFragmentBackgroundDark = primaryDarkerDark
val micAccentDark = Color(0xFF939094)
val fabBackgroundTintDark = Color(0xFFEFB8C8)
val aboutIconColorDark = Color(0xFF939094)
val editReminderButtonColorDark = aboutIconColorDark
val greyDark = white
val titleTextDark = white
val subtitleTextDark = white

@Composable
fun dayNightBackgroundColor(): Color = if (isSystemInDarkTheme()) black else white

@Composable
fun statusBarColor(): Color = if (isSystemInDarkTheme()) primaryDarkDark else primaryDarkLight