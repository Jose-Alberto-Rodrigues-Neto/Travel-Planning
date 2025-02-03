package screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.widthIn
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.material.TextFieldColors
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
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
import travelplanning.composeapp.generated.resources.login
import ui.components.DefaultButton
import org.jetbrains.compose.resources.Font
import travelplanning.composeapp.generated.resources.EyeOff
import travelplanning.composeapp.generated.resources.Eye
import travelplanning.composeapp.generated.resources.app_name

@Preview
@Composable
fun CreateAccount() {
    var username by rememberSaveable { mutableStateOf("") }
    var email by rememberSaveable { mutableStateOf("") }
    var password by rememberSaveable { mutableStateOf("") }
    var passwordIsVisible by rememberSaveable { mutableStateOf(false) }
    BoxWithConstraints(
        modifier = Modifier.fillMaxSize()
    ) {
        when {
            maxWidth > 600.dp -> CreateAccountDesktop(
                maxWidth = maxWidth,
                username = username,
                onUsernameChange = { username = it },
                email = email,
                onEmailChange = { email = it },
                password = password,
                onPasswordChange = { password = it },
                passwordIsVisible = passwordIsVisible,
                onPasswordIsVisibleChange = { passwordIsVisible = !passwordIsVisible },
                onLogin = { println("Create Account") },
                goToCreateAccount = { println("Go to login") }
            )

            else -> CreateAccountMobile(
                username = username,
                onUsernameChange = { username = it },
                email = email,
                onEmailChange = { email = it },
                password = password,
                onPasswordChange = { password = it },
                passwordIsVisible = passwordIsVisible,
                onPasswordIsVisibleChange = { passwordIsVisible = !passwordIsVisible },
                onLogin = { println("Create Account") },
                goToCreateAccount = { println("Go to login") }
            )
        }
    }
}

@Composable
fun CreateAccountDesktop(
    maxWidth: Dp,
    username: String,
    onUsernameChange: (String) -> Unit,
    password: String,
    onPasswordChange: (String) -> Unit,
    passwordIsVisible: Boolean,
    onPasswordIsVisibleChange: () -> Unit,
    onLogin: () -> Unit,
    goToCreateAccount: () -> Unit,
    email: String,
    onEmailChange: (String) -> Unit
) {

    val lobster = FontFamily(Font(Res.font.Lobster_Regular))

    Row(
        modifier = Modifier.fillMaxSize()
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
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Criar Conta",
                    fontSize = if (maxWidth < 800.dp) 64.sp else 84.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(red = 12, green = 0, blue = 139),
                    fontFamily = lobster
                )
            }
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp)
            ) {
                OutlinedTextField(
                    modifier = Modifier.fillMaxWidth(),
                    value = username,
                    onValueChange = onUsernameChange,
                    label = { Text("Username") },
                    placeholder = { Text("user123") },
                    singleLine = true
                )
                OutlinedTextField(
                    modifier = Modifier.fillMaxWidth(),
                    value = email,
                    onValueChange = onEmailChange,
                    label = { Text("Email") },
                    placeholder = { Text("user123@gmail.com") },
                    singleLine = true
                )
                OutlinedTextField(
                    modifier = Modifier.fillMaxWidth(),
                    value = password,
                    onValueChange = onPasswordChange,
                    label = { Text("Senha") },
                    singleLine = true,
                    visualTransformation = if (passwordIsVisible) VisualTransformation.None else PasswordVisualTransformation(),
                    trailingIcon = {
                        IconButton(
                            onClick = onPasswordIsVisibleChange
                        ) {
                            Icon(
                                modifier = Modifier.size(20.dp),
                                painter = if(passwordIsVisible) painterResource(Res.drawable.Eye) else painterResource(Res.drawable.EyeOff),
                                contentDescription = "Alterar visibilidade da senha"
                            )
                        }
                    }
                )
                DefaultButton(
                    modifier = Modifier.fillMaxWidth().padding(vertical = 15.dp),
                    title = "Criar conta",
                    color = Color(red = 52, green = 199, blue = 89),
                    onClick = onLogin
                )
                TextButton(
                    onClick = goToCreateAccount,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 10.dp, horizontal = 16.dp),
                    enabled = true,
                    colors = ButtonDefaults.buttonColors(
                        contentColor = Color.White,
                        backgroundColor = Color.Transparent
                    ),
                    content = {
                        Text(
                            text = "Já possui uma conta? Faça Login!",
                            fontSize = 16.sp,
                            color = Color.Black.copy(alpha = 0.7f)
                        )
                    }
                )
            }
        }
    }
}

@Composable
fun CreateAccountMobile(
    username: String,
    password: String,
    onUsernameChange: (String) -> Unit,
    onPasswordChange: (String) -> Unit,
    passwordIsVisible: Boolean,
    onPasswordIsVisibleChange: () -> Unit,
    onLogin: () -> Unit,
    goToCreateAccount: () -> Unit,
    email: String,
    onEmailChange: (String) -> Unit
) {

    val lobster = FontFamily(Font(Res.font.Lobster_Regular))

    Image(
        modifier = Modifier.fillMaxSize(),
        contentScale = ContentScale.Crop,
        painter = painterResource(Res.drawable.LoginBackground),
        contentDescription = "Login Banner",
        colorFilter = ColorFilter.tint(Color.Black.copy(alpha = 0.5f), blendMode = BlendMode.Multiply)
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp, vertical = 20.dp),
        verticalArrangement = Arrangement.SpaceAround,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            modifier = Modifier.padding(top = 70.dp),
            text = "Criar Conta",
            fontSize = 72.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White,
            fontFamily = lobster
        )
        Column(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            OutlinedTextField(
                modifier = Modifier
                    .fillMaxWidth(),
                value = username,
                onValueChange = onUsernameChange,
                label = { Text("Username") },
                placeholder = { Text("user123") },
                singleLine = true,
                colors = TextFieldDefaults.textFieldColors(
                    textColor = Color.White,
                    placeholderColor = Color.White.copy(0.5f),
                    unfocusedLabelColor = Color.White,
                    focusedLabelColor = Color.White,
                    unfocusedIndicatorColor = Color.White,
                    backgroundColor = Color.Black.copy(0.25f)
                )
            )
            OutlinedTextField(
                modifier = Modifier
                    .fillMaxWidth(),
                value = email,
                onValueChange = onEmailChange,
                label = { Text("Email") },
                placeholder = { Text("user123@gmail.com") },
                singleLine = true,
                colors = TextFieldDefaults.textFieldColors(
                    textColor = Color.White,
                    placeholderColor = Color.White.copy(0.5f),
                    unfocusedLabelColor = Color.White,
                    focusedLabelColor = Color.White,
                    unfocusedIndicatorColor = Color.White,
                    backgroundColor = Color.Black.copy(0.25f)
                )
            )
            OutlinedTextField(
                modifier = Modifier
                    .fillMaxWidth(),
                value = password,
                onValueChange = onPasswordChange,
                label = { Text("Senha") },
                singleLine = true,
                visualTransformation = if (passwordIsVisible) VisualTransformation.None else PasswordVisualTransformation(),
                trailingIcon = {
                    IconButton(
                        onClick = onPasswordIsVisibleChange
                    ) {
                        Icon(
                            modifier = Modifier.size(20.dp),
                            painter = if(passwordIsVisible) painterResource(Res.drawable.Eye) else painterResource(Res.drawable.EyeOff),
                            contentDescription = "Alterar visibilidade da senha"
                        )
                    }
                },
                colors = TextFieldDefaults.textFieldColors(
                    textColor = Color.White,
                    unfocusedLabelColor = Color.White,
                    focusedLabelColor = Color.White,
                    unfocusedIndicatorColor = Color.White,
                    trailingIconColor = Color.White,
                    backgroundColor = Color.Black.copy(0.25f)
                )
            )
            DefaultButton(
                modifier = Modifier.fillMaxWidth().padding(vertical = 15.dp),
                title = "Criar Conta",
                color = Color(red = 52, green = 199, blue = 89),
                onClick = onLogin
            )
            TextButton(
                onClick = goToCreateAccount,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 10.dp, horizontal = 16.dp),
                enabled = true,
                colors = ButtonDefaults.buttonColors(
                    contentColor = Color.White,
                    backgroundColor = Color.Transparent
                ),
                content = {
                    Text(
                        text = "Já possui uma conta? Faça login!",
                        fontSize = 16.sp
                    )
                }
            )
        }
        Text(
            text = stringResource(Res.string.app_name),
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White,
            fontFamily = lobster
        )
    }
}