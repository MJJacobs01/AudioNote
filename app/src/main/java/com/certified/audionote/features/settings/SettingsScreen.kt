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

package com.certified.audionote.features.settings

import android.content.res.*
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.*
import androidx.compose.material.icons.*
import androidx.compose.material.icons.automirrored.outlined.*
import androidx.compose.material.icons.outlined.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.*
import androidx.compose.ui.draw.*
import androidx.compose.ui.graphics.vector.*
import androidx.compose.ui.res.*
import androidx.compose.ui.text.*
import androidx.compose.ui.tooling.preview.*
import androidx.compose.ui.unit.*
import com.certified.audionote.R
import com.certified.audionote.ui.theme.*

/**
 * Created by MJ Jacobs on 2024/12/28 at 14:54
 */

@Composable
fun SettingsScreen(
    modifier: Modifier = Modifier
) {
    SettingsScreenContent(
        modifier = modifier
    )
}

@Composable
private fun SettingsScreenContent(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.fillMaxSize(),
        content = {
            //  Display title
            Text(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = largePadding + 24.dp),
                text = stringResource(R.string.display),
                style = TextStyle(
                    color = if (isSystemInDarkTheme()) primaryDark else primaryLight,
                    fontSize = 20.sp
                )
            )
            Spacer(modifier = Modifier.height(normalPadding))
            
            //  Theme selection
            SettingsRowItem(
                icon = Icons.Outlined.BrightnessMedium,
                imageDescription = stringResource(R.string.theme),
                title = stringResource(R.string.theme),
                description = stringResource(R.string.theme_system_default),
                onClick = { /*TODO*/ }
            )
            Spacer(modifier = Modifier.height(normalPadding))
            //  About title
            Text(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = largePadding + 24.dp),
                text = stringResource(R.string.about),
                style = TextStyle(
                    color = if (isSystemInDarkTheme()) primaryDark else primaryLight,
                    fontSize = 20.sp
                )
            )
            Spacer(modifier = Modifier.height(normalPadding))
            
            //  Theme selection
            SettingsRowItem(
                icon = Icons.Outlined.Person,
                imageDescription = stringResource(R.string.developer),
                title = stringResource(R.string.developer),
                description = stringResource(R.string.developer_nick),
                onClick = { /*TODO*/ }
            )
            Spacer(modifier = Modifier.height(normalPadding))
            
            //  Theme selection
            SettingsRowItem(
                icon = Icons.Outlined.Code,
                imageDescription = stringResource(R.string.contribute),
                title = stringResource(R.string.contribute),
                description = stringResource(R.string.contribute_summary),
                onClick = { /*TODO*/ }
            )
            Spacer(modifier = Modifier.height(normalPadding))
            
            //  Theme selection
            SettingsRowItem(
                icon = Icons.AutoMirrored.Outlined.ContactSupport,
                imageDescription = stringResource(R.string.contact_feedback),
                title = stringResource(R.string.contact_feedback),
                description = stringResource(R.string.developer_mail),
                onClick = { /*TODO*/ }
            )
            Spacer(modifier = Modifier.height(normalPadding))
            
            //  Theme selection
            SettingsRowItem(
                icon = Icons.Outlined.Info,
                imageDescription = stringResource(R.string.about),
                title = stringResource(R.string.about),
                description = stringResource(R.string.app_version_licence_and_more),
                onClick = { /*TODO*/ }
            )
            Spacer(modifier = Modifier.height(normalPadding))
        }
    )
}

@Composable
private fun SettingsRowItem(
    icon: ImageVector,
    imageDescription: String,
    title: String,
    description: String,
    onClick: () -> Unit,
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(defaultCornerSize))
            .clickable { onClick() },
        verticalAlignment = Alignment.CenterVertically,
        content = {
            //  Icon
            Icon(
                modifier = Modifier.padding(normalPadding),
                imageVector = icon,
                contentDescription = imageDescription
            )
            
            Column(
                modifier = Modifier.fillMaxWidth(),
                content = {
                    //  Title text field
                    Text(
                        text = title,
                        style = MaterialTheme.typography.titleMedium
                    )
                    
                    Text(
                        text = description,
                        style = MaterialTheme.typography.bodyMedium
                    )
                }
            )
        }
    )
}

@Preview(uiMode = Configuration.UI_MODE_NIGHT_NO, showBackground = true)
@Composable
private fun PreviewSettingsScreenContentLightTheme() {
    AudioNoteTheme {
        SettingsScreenContent()
    }
}

@Preview(uiMode = Configuration.UI_MODE_NIGHT_NO, showBackground = true)
@Composable
private fun PreviewSettingsScreenContentDarkTheme() {
    AudioNoteTheme {
        SettingsScreenContent()
    }
}