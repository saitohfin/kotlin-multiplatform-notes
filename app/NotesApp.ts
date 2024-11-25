import { Frame } from '@nativescript/core'
import { NotesViewModel } from './shared/NotesViewModel'

export class NotesApp extends Frame {
    constructor() {
        super()
        this.defaultPage = {
            viewModel: new NotesViewModel(),
            path: "views/notes-page"
        }
    }
}