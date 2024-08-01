package com.example.appdatabase

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.appdatabase.ui.theme.AppDatabaseTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppPreview()
        }
    }

}

@Composable
fun App(){
    Column(
        Modifier
            .fillMaxSize()
            .padding(16.dp)
            .wrapContentSize(Alignment.Center),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            Modifier.padding(20.dp)
        ) {
            Text(
                text = "App Database",
                fontSize = 26.sp,
                fontWeight = Bold,
            )
        }
        Row(
            Modifier.padding(8.dp)
        ) {
            TextField("Nome:")
        }
        Row(
            Modifier.padding(8.dp)
        ) {
            TextField("Idade:")
        }
        Row(){
            Spacer(modifier = Modifier.height(20.dp))
        }
        Row(
            Modifier.padding(8.dp)
        ) {
            Button(onClick = {}) {
                Text(
                    text = "Cadastrar",
                    fontSize = 20.sp,
                    fontWeight = Bold,
                )
            }
            Spacer(modifier = Modifier.height(150.dp))
        }
    }


}
@Composable
fun TextField(labelValue: String) {
    var text by remember { mutableStateOf(TextFieldValue("")) }
    OutlinedTextField(
        value = text,
        onValueChange = {
            text = it
        },
        label = { Text(text = labelValue) },
        placeholder = { Text(text = labelValue) },
    )
}
@Composable
@Preview
fun AppPreview() {
    AppDatabaseTheme {
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            App()
        }
    }
}