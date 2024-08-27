package com.davidmaiques.admintareas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.app.NotificationCompat.Style
import com.davidmaiques.admintareas.ui.theme.AdminTareasTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AdminTareasTheme {
                    Greeting(
                        name = "David",
                        modifier = Modifier,
                    )
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {

    Column (modifier= modifier
        .padding(16.dp)
        .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally, // Center content horizontally
        verticalArrangement = Arrangement.Center // Center content vertically
        ) {

        Image(
            painter = painterResource(id = R.drawable.ic_task_completed),
            contentDescription = "Check box",
            modifier = Modifier.size(100.dp),
            )

        Spacer(modifier = Modifier.height(24.dp))

        Text(
            text = "All task completed",
            modifier = modifier.padding(top=24.dp, bottom = 8.dp),
            style = TextStyle(
                fontSize = 30.sp, // Tamaño de fuente grande
                fontWeight = FontWeight.Bold, // Fuente en negrita
                letterSpacing = 1.5.sp // Espaciado entre letras
            ),
        )

        Text(
            text = "Nice work $name",
            textAlign =TextAlign.Center,
            style = TextStyle(
                fontSize = 30.sp,
            ),

        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AdminTareasTheme {
        Greeting("David")
    }
}