package com.notes

import androidx.compose.ui.window.Window
import org.jetbrains.skiko.wasm.onWasmReady

fun main() {
    onWasmReady {
        Window("Notes App") {
            NotesApp()
        }
    }
}