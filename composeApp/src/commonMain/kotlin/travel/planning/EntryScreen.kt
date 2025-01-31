package travel.planning

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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
            contentScale = ContentScale.Crop,
            painter = painterResource(Res.drawable.LoginBackground),
            contentDescription = "Login Banner"
        )
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(bottom = 24.dp, start = 16.dp, end = 16.dp, top = 150.dp),
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(
                    text = "Travel Planning",
                    fontSize = 42.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF1D1D1D),
                    fontFamily = FontFamily.Serif
                )

                Text(
                    modifier = Modifier.padding(vertical = 20.dp),
                    text = "Organize, planeje e viva sua melhor viagem.",
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Medium,
                    color = Color(0xFF2F2F2F),
                    textAlign = TextAlign.Center
                )
            }

            Column(
                modifier = Modifier.fillMaxWidth(),
            ){
                DefaultButton(
                    modifier = Modifier.fillMaxWidth().padding(5.dp),
                    title = "Login",
                    onClick = {
                        println("Login")
                    }
                )
                DefaultButton(
                    modifier = Modifier.fillMaxWidth().padding(5.dp),
                    title = "Sign Up",
                    onClick = { }
                )
        }

        }

    }


}