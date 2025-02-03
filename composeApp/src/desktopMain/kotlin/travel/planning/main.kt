package travel.planning

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import screen.CreateAccount
import screen.LoginScreen

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Travel Planning",
    ) {
        CreateAccount()
    }
}