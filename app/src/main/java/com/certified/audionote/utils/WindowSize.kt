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

package com.certified.audionote.utils

import android.app.Activity
import androidx.compose.runtime.*
import androidx.window.layout.*

/**
 * Created by MJ Jacobs on 2024/12/28 at 14:04
 */

@Composable
fun calculateWindowSize(
    activity: Activity,
    windowWidthSizeClassChange: @Composable (windowSize: WindowSizeClass) -> Unit = {},
    windowHeightSizeClassChange: @Composable (windowSize: WindowSizeClass) -> Unit = {},
) {
    val metrics = WindowMetricsCalculator.getOrCreate().computeCurrentWindowMetrics(activity)
    
    val widthDp = metrics.bounds.width() / activity.resources.displayMetrics.density
    val heightDp = metrics.bounds.height() / activity.resources.displayMetrics.density
    
    when {
        widthDp < 600f -> {
            //  99.96% of phones in portrait
            windowWidthSizeClassChange(WindowSizeClass.COMPACT)
        }
        
        widthDp < 840f -> {
            //  93.73% of tablets in portrait
            windowWidthSizeClassChange(WindowSizeClass.MEDIUM)
        }
        
        else -> {
            //  97.22% of tablets in landscape
            windowWidthSizeClassChange(WindowSizeClass.EXPANDED)
        }
    }
    
    when {
        heightDp < 480f -> {
            //  99.78 of phones in landscape
            windowHeightSizeClassChange(WindowSizeClass.COMPACT)
        }
        
        heightDp < 900f -> {
            //  96.56% of tablets in landscape and 97.59% of phones in portrait
            windowHeightSizeClassChange(WindowSizeClass.MEDIUM)
        }
        
        else -> {
            //  94.25% of tablets in portrait
            windowHeightSizeClassChange(WindowSizeClass.EXPANDED)
        }
    }
}

enum class WindowSizeClass {
    COMPACT,
    MEDIUM,
    EXPANDED
}