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

package com.certified.audionote.navigation

import android.app.Activity
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.*
import com.certified.audionote.ui.theme.*
import com.certified.audionote.utils.*

/**
 * Created by MJ Jacobs on 2024/12/28 at 13:56
 */

//  TODO: 2024/12/28 - Decide on whether to use height or width to measure screen orientation

@Composable
fun AudioNoteNavHost(
    activity: Activity,
) {
    Scaffold(
        content = { paddingValues ->
            Box(
                modifier = Modifier.padding(
                    top = paddingValues.calculateTopPadding().plus(normalPadding),
                    start = normalPadding,
                    end = normalPadding,
                    bottom = paddingValues.calculateBottomPadding().plus(normalPadding)
                )
            ){
                calculateWindowSize(
                    activity = activity,
                    windowWidthSizeClassChange = {
                    
                    },
                    windowHeightSizeClassChange = {
                    
                    }
                )
            }
        }
    )
}