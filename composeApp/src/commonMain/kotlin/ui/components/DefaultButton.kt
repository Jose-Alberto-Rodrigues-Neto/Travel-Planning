package ui.components

import androidx.compose.foundation.layout.heightIn
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun DefaultButton(
    modifier: Modifier,
    title: String,
    iconRes: Int? = null,
    onClick: ()->Unit
){
    Button(
        modifier = modifier
            .heightIn(min = 52.dp),
        onClick = {onClick()}
    ){
        Text(
            text = title,
            //style = Typography. dps de colocar o material3 nos ve
        )
    }
}