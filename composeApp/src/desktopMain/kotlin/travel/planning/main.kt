package travel.planning

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import ui.components.screen.EntryScreen

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Travel Planning",
    ) {
        EntryScreen()
    }
}