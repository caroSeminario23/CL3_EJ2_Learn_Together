package com.example.learntogether

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learntogether.ui.theme.LearnTogetherTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //enableEdgeToEdge()
        setContent {
            LearnTogetherTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    LearnTogetherApp()
                }
            }
        }
    }
}

@Composable
fun LearnTogetherApp() {
    TarjetaArticulo(
        titulo = stringResource(R.string.titulo_text),
        descripcionBreve = stringResource(R.string.primer_parrafo_text),
        descripcionLarga = stringResource(R.string.segundo_parrafo_text),
        banner = painterResource(R.drawable.bg_compose_background))
}

@Composable
fun TarjetaArticulo(
    titulo: String,
    descripcionBreve: String,
    descripcionLarga: String,
    banner: Painter,
    modifier: Modifier = Modifier
){
    Column(modifier = modifier) {
        Image(
            painter = banner,
            contentDescription = "Banner superior"
        )
        Text(
            text = titulo,
            fontSize = 24.sp,
            modifier = Modifier.padding(16.dp)
        )

        Text(
            text = descripcionBreve,
            modifier = Modifier.padding(start = 16.dp, end = 16.dp),
            textAlign = TextAlign.Justify
        )

        Text(
            text = descripcionLarga,
            modifier = Modifier.padding(16.dp),
            textAlign = TextAlign.Justify
        )
    }
}

@Preview(showBackground = true)
@Composable
fun LearningAppPreview() {
    LearnTogetherTheme {
        LearnTogetherApp()
    }
}