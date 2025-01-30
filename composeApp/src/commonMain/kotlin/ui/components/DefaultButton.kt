package ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.heightIn
import androidx.compose.material.Button
import androidx.compose.material.ButtonColors
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
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
        onClick = {onClick()},
        colors = ButtonDefaults.buttonColors(backgroundColor = Color.DarkGray, contentColor = Color.White),
    ){
        Text(
            text = title,
            //style = Typography. dps de colocar o material3 nos ve
        )
    }
}