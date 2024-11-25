import { Observable } from '@nativescript/core'
import { Note, NoteColor } from './Note'

export class NotesViewModel extends Observable {
    private notes: Note[] = []

    constructor() {
        super()
    }

    addNote(title: string, content: string, color: NoteColor = NoteColor.WHITE): Note {
        const note = new Note(title, content, color)
        this.notes.push(note)
        this.notifyPropertyChange('notes', this.notes)
        return note
    }

    deleteNote(id: string) {
        this.notes = this.notes.filter(note => note.id !== id)
        this.notifyPropertyChange('notes', this.notes)
    }

    shareNote(id: string, email: string) {
        const note = this.notes.find(note => note.id === id)
        if (note) {
            note.sharedWith.push(email)
            this.notifyPropertyChange('notes', this.notes)
        }
    }
}