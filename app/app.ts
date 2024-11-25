import { Application } from '@nativescript/core'
import { NotesApp } from './NotesApp'

Application.run({ create: () => new NotesApp() })