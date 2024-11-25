package com.notes.actual

import androidx.compose.ui.graphics.Color
import com.notes.shared.NoteColor

actual fun NoteColor.toColor(): Color = when (this) {
    NoteColor.WHITE -> Color.White
    NoteColor.RED -> Color.Red
    NoteColor.ORANGE -> Color(0xFFFFA500)
    NoteColor.YELLOW -> Color.Yellow
    NoteColor.GREEN -> Color.Green
    NoteColor.BLUE -> Color.Blue
    NoteColor.PURPLE -> Color(0xFF800080)
}