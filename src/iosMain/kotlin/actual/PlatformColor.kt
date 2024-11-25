package com.notes.actual

import platform.UIKit.UIColor
import com.notes.shared.NoteColor

actual fun NoteColor.toColor(): UIColor = when (this) {
    NoteColor.WHITE -> UIColor.whiteColor
    NoteColor.RED -> UIColor.redColor
    NoteColor.ORANGE -> UIColor.orangeColor
    NoteColor.YELLOW -> UIColor.yellowColor
    NoteColor.GREEN -> UIColor.greenColor
    NoteColor.BLUE -> UIColor.blueColor
    NoteColor.PURPLE -> UIColor.purpleColor
}