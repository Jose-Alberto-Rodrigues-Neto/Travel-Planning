package travel.planning

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview
import travelplanning.composeapp.generated.resources.LoginBackground
import travelplanning.composeapp.generated.resources.LoginBackgroundSVG
import travelplanning.composeapp.generated.resources.Res
import travelplanning.composeapp.generated.resources.compose_multiplatform
import ui.components.DefaultButton

@Preview
@Composable
fun EntryScreen(){
    Box(
        modifier = Modifier.fillMaxSize()
    ){
        Image(
            modifier = Modifier.fillMaxSize(),
            painter = painterResource(Res.drawable.LoginBackground),
            contentDescription = "Login Banner"
        )
        Column(
            modifier = Modifier.fillMaxHeight().padding(vertical = 15.dp),
            verticalArrangement = Arrangement.Bottom
        ){
            DefaultButton(
                modifier = Modifier.fillMaxWidth().padding(10.dp),
                title = "Login",
                onClick = {
                    println("Login")
                }
            )
            DefaultButton(
                modifier = Modifier.fillMaxWidth().padding(10.dp),
                title = "Sign Up",
                onClick = { }
            )
            TextButton(
                modifier = Modifier.padding(20.dp),
                onClick = {

                },
                colors = ButtonDefaults.textButtonColors(contentColor = Color.Red)
            ){
                Text("Ainda não possui conta? Faça o cadastro")
            }
        }
    }


}