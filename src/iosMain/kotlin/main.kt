package com.notes

import platform.UIKit.UIViewController
import androidx.compose.ui.window.ComposeUIViewController

fun MainViewController(): UIViewController = ComposeUIViewController {
    NotesApp()
}