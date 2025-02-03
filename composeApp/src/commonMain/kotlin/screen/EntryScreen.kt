package ui.components.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource
import org.jetbrains.compose.ui.tooling.preview.Preview
import travelplanning.composeapp.generated.resources.Lobster_Regular
import travelplanning.composeapp.generated.resources.LoginBackground
import travelplanning.composeapp.generated.resources.Res
import travelplanning.composeapp.generated.resources.app_name
import travelplanning.composeapp.generated.resources.app_slogan
import ui.components.DefaultButton
import org.jetbrains.compose.resources.Font
import travelplanning.composeapp.generated.resources.Sora_Regular

@Preview
@Composable
fun EntryScreen() {
    BoxWithConstraints(
        modifier = Modifier.fillMaxSize()
    ) {
        when{
            maxWidth>600.dp -> EntryScreenDesktop(maxWidth)
            else -> EntryScreenMobile()
        }
    }
}

@Composable
fun EntryScreenDesktop(maxWidth: Dp) {

    val lobster = FontFamily(Font(Res.font.Lobster_Regular))
    val soraRegular = FontFamily(Font(Res.font.Sora_Regular))

    Row(
        modifier = Modifier
    ) {
        Image(
            modifier = Modifier
                .fillMaxWidth(0.5f)
                .fillMaxHeight(),
            contentScale = ContentScale.Crop,
            painter = painterResource(Res.drawable.LoginBackground),
            contentDescription = "Login Banner"
        )

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(),
            verticalArrangement = Arrangement.SpaceAround
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Text(
                    text = stringResource(Res.string.app_name),
                    fontSize =
                        if (maxWidth < 800.dp){
                            42.sp
                        }else{
                            54.sp
                        },
                    fontWeight = FontWeight.Bold,
                    color = Color(red = 12, green = 0, blue = 139),
                    fontFamily = lobster
                )
                Text(
                    modifier = Modifier.padding(vertical = 20.dp),
                    text = stringResource(Res.string.app_slogan),
                    fontSize = 20.sp,
                    fontFamily = soraRegular,
                    fontWeight = FontWeight.Medium,
                    color = Color(red = 51, green = 35, blue = 102),
                    textAlign = TextAlign.Center
                )
            }
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp)
            ){
                DefaultButton(
                    modifier = Modifier.fillMaxWidth().padding(5.dp),
                    title = "Login",
                    color = Color(red = 52, green = 199, blue = 89),
                    onClick = {
                        println("Login")
                    }
                )
                DefaultButton(
                    modifier = Modifier.fillMaxWidth().padding(5.dp),
                    title = "Sign Up",
                    color = Color.LightGray,
                    onClick = { }
                )
            }

        }
    }

}

@Composable
fun EntryScreenMobile() {

    val lobster = FontFamily(Font(Res.font.Lobster_Regular))
    val soraRegular = FontFamily(Font(Res.font.Sora_Regular))

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
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text(
                text = stringResource(Res.string.app_name),
                fontSize = 42.sp,
                fontWeight = FontWeight.Bold,
                color = Color(red = 12, green = 0, blue = 139),
                fontFamily = lobster
            )

            Text(
                modifier = Modifier.padding(vertical = 20.dp),
                text = stringResource(Res.string.app_slogan),
                fontSize = 20.sp,
                fontWeight = FontWeight.Medium,
                color = Color(red = 51, green = 35, blue = 102),
                textAlign = TextAlign.Center,
                fontFamily = soraRegular
            )
        }

        Column(
            modifier = Modifier.fillMaxWidth(),
        ) {
            DefaultButton(
                modifier = Modifier.fillMaxWidth().padding(5.dp),
                title = "Login",
                color = Color(red = 52, green = 199, blue = 89),
                onClick = {
                    println("Login")
                }
            )
            DefaultButton(
                modifier = Modifier.fillMaxWidth().padding(5.dp),
                title = "Sign Up",
                color = Color.LightGray,
                onClick = { }
            )
        }

    }
}