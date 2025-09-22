package pe.edu.upc.easyshop.features.auth.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import pe.edu.upc.easyshop.ui.theme.EasyShopTheme

@Composable
fun Login(viewModel: LoginViewModel, onLogin: () -> Unit){

    val username =  viewModel.username.collectAsState()

    val password = viewModel.password.collectAsState()



    val email = remember {
        mutableStateOf(value = "")
    }

    val isVisible = remember {
        mutableStateOf(value = false)
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center
    ) {
        OutlinedTextField(
            value = email.value,
            onValueChange = {
                email.value = it
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            leadingIcon = {
                Icon(Icons.Default.Email, contentDescription = null )
            },
            placeholder = {
                Text("Email")
            }
        )
        OutlinedTextField(
            value = password,
            onValueChange = {
                password = it
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            leadingIcon = {
                Icon(Icons.Default.Lock, contentDescription = null )
            },
            visualTransformation =
                if(isVisible.value){
                    VisualTransformation.None
                }else{
                    PasswordVisualTransformation()
                },
            trailingIcon = {
                IconButton(
                    onClick = {
                        isVisible.value = !isVisible.value
                    }
                ) {
                    Icon(
                        if(isVisible.value) Icons.Default.Visibility
                        else{
                        Icons.Default.VisibilityOff},
                        contentDescription = null
                    )
                }
            },
            placeholder = {
                Text("Password")
            }
        )
        Button(
            onClick = {
                viewModel.login()
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)

        ) {
            Text("Sign In")
        }
    }
}

@Preview
@Composable
fun LoginPreview(){
    EasyShopTheme {
        Login(getLoginViewModel()) {}
    }
}