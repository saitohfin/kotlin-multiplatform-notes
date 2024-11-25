package com.notes.ui

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.*
import androidx.compose.runtime.*
import com.notes.shared.Note
import com.notes.shared.NotesRepository

@Composable
fun NotesScreen(notesRepository: NotesRepository) {
    var showNewNoteDialog by remember { mutableStateOf(false) }
    val notes by notesRepository.notes.collectAsState(initial = emptyList())

    Scaffold(
        floatingActionButton = {
            FloatingActionButton(onClick = { showNewNoteDialog = true }) {
                Icon(Icons.Default.Add, contentDescription = "Add Note")
            }
        }
    ) { padding ->
        LazyColumn(
            modifier = Modifier.padding(padding)
        ) {
            items(notes) { note ->
                NoteCard(
                    note = note,
                    onNoteClick = { /* Open note detail */ },
                    onShareClick = { email ->
                        notesRepository.shareNote(note.id, email)
                    }
                )
            }
        }

        if (showNewNoteDialog) {
            NewNoteDialog(
                onDismiss = { showNewNoteDialog = false },
                onNoteCreated = { title, content, color ->
                    notesRepository.addNote(title, content, color)
                    showNewNoteDialog = false
                }
            )
        }
    }
}