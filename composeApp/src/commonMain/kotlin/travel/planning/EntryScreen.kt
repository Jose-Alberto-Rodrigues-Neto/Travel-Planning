package travel.planning

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.ui.tooling.preview.Preview
import ui.components.DefaultButton

@Preview
@Composable
fun EntryScreen(){
    Column {
        DefaultButton(
            modifier = Modifier.fillMaxWidth().padding(10.dp),
            title = "Login",
            onClick = { }
        )
        DefaultButton(
            modifier = Modifier.fillMaxWidth().padding(10.dp),
            title = "Sign Up",
            onClick = { }
        )
    }

}