package travel.planning.previews

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import travel.planning.EntryScreen
import ui.components.DefaultButton

@Preview
@Composable
fun PreviewScree(){
    Box(
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        DefaultButton(
            modifier = Modifier,
            title = "Login",
        ) { }
    }
}