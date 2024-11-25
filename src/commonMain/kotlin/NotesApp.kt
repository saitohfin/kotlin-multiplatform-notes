package com.notes

import androidx.compose.runtime.Composable
import com.notes.shared.NotesRepository
import com.notes.ui.NotesScreen

@Composable
fun NotesApp() {
    val notesRepository = NotesRepository()
    NotesScreen(notesRepository = notesRepository)
}