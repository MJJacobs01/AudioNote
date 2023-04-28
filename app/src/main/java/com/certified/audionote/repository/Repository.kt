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

package com.certified.audionote.repository

import com.certified.audionote.database.AudioNotesDAO
import com.certified.audionote.model.Note
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class Repository @Inject constructor(private val audioNotesDAO: AudioNotesDAO) {

    val allNotes: Flow<List<Note>?> = audioNotesDAO.getAllNotes()
    suspend fun insertNote(note: Note) = audioNotesDAO.insertNote(note)

    suspend fun updateNote(note: Note) = audioNotesDAO.updateNote(note)

    suspend fun deleteNote(note: Note) = audioNotesDAO.deleteNote(note)

    fun getNote(noteId: Int): Flow<Note> = audioNotesDAO.getNote(noteId)
}