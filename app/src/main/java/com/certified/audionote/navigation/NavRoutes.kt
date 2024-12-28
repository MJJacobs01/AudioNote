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

import androidx.navigation.*

/**
 * Created by MJ Jacobs on 2024/12/28 at 13:50
 */

fun NavHostController.goToEditNote(noteId: String) {
    navigate(EditNote(noteId = noteId))
}

fun NavHostController.goToAddNote() {
    navigate(AddNote)
}

fun NavHostController.goToSettings(){
    navigate(Settings)
}

fun NavHostController.goToHome(){
    navigate(Home)
}

fun NavHostController.goToAbout(){
    navigate(About)
}