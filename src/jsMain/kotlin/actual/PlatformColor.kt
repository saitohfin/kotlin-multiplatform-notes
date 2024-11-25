package com.notes.actual

import org.jetbrains.compose.web.css.Color
import com.notes.shared.NoteColor

actual fun NoteColor.toColor(): Color = when (this) {
    NoteColor.WHITE -> Color("#FFFFFF")
    NoteColor.RED -> Color("#FF0000")
    NoteColor.ORANGE -> Color("#FFA500")
    NoteColor.YELLOW -> Color("#FFFF00")
    NoteColor.GREEN -> Color("#00FF00")
    NoteColor.BLUE -> Color("#0000FF")
    NoteColor.PURPLE -> Color("#800080")
}