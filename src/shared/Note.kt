package com.notes.shared

import kotlinx.datetime.Clock
import kotlinx.datetime.Instant
import kotlinx.serialization.Serializable

@Serializable
data class Note(
    val id: String,
    var title: String,
    var content: String,
    var color: NoteColor = NoteColor.WHITE,
    var sharedWith: List<String> = emptyList(),
    val createdAt: Instant = Clock.System.now(),
    var updatedAt: Instant = Clock.System.now()
)

enum class NoteColor {
    WHITE,
    RED,
    ORANGE,
    YELLOW,
    GREEN,
    BLUE,
    PURPLE
}