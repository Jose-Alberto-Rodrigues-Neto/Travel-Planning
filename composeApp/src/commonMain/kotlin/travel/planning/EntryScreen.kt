package travel.planning

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import org.jetbrains.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun EntryScreen(){
    Button(
        modifier = Modifier
            .fillMaxWidth(0.8f),
        onClick = {  },
        content = {
            Text(text = "Login")
        },
    )
}