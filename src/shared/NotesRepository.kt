package com.notes.shared

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import java.util.UUID

class NotesRepository {
    private val _notes = MutableStateFlow<List<Note>>(emptyList())
    val notes: Flow<List<Note>> = _notes.asStateFlow()

    fun addNote(title: String, content: String, color: NoteColor = NoteColor.WHITE): Note {
        val note = Note(
            id = UUID.randomUUID().toString(),
            title = title,
            content = content,
            color = color
        )
        _notes.update { currentNotes -> currentNotes + note }
        return note
    }

    fun updateNote(note: Note) {
        _notes.update { currentNotes ->
            currentNotes.map { if (it.id == note.id) note else it }
        }
    }

    fun deleteNote(noteId: String) {
        _notes.update { currentNotes ->
            currentNotes.filter { it.id != noteId }
        }
    }

    fun shareNote(noteId: String, email: String) {
        _notes.update { currentNotes ->
            currentNotes.map { note ->
                if (note.id == noteId) {
                    note.copy(sharedWith = note.sharedWith + email)
                } else note
            }
        }
    }
}