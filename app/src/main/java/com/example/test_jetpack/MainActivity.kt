package com.example.test_jetpack

import android.os.Bundle
import android.widget.Space
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PersonalData(name = "carlos")

        }
    }
    @Composable
    private fun PersonalData(name:String){
        MaterialTheme{
            Column() {
                Column(
                    Modifier
                        .padding(20.dp)
                        .fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
                    Image(painter = painterResource(R.drawable.captura_de_pantalla_2022_05_22_195103), contentDescription = "User", Modifier.height(100.dp) )
                    Spacer(modifier = Modifier.height(10.dp))
                    Text(text = "Hola Mi nombre es $name", style = MaterialTheme.typography.h6, fontWeight = FontWeight.Black)
                    Text(text = "Desarrollando app con jetpack")
                }
                Column() {
                    Text( text= "Poema Favorito", fontWeight = FontWeight.Medium)
                    Text(text = "Two roads diverged in a yellow wood,")
                    Text(text = "And sorry I could not travel both")
                    Text(text = "And be one traveler, long I stood")
                    Text(text = "And looked down one as far as I could")
                    Text(text = "To where it bent in the undergrowth;")
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(text = "Then took the other, as just as fair,")
                    Text(text = "And having perhaps the better claim,")
                    Text(text = "Because it was grassy and wanted wear;")
                    Text(text = "Though as for that the passing there")
                    Text(text = "Had worn them really about the same,")
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(text = "And both that morning equally lay")
                    Text(text = "In leaves no step had trodden black.")
                    Text(text = "Oh, I kept the first for another day!")
                    Text(text = "Yet knowing how way leads on to way,")
                    Text(text = "I doubted if I should ever come back.")
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(text = "I shall be telling this with a sigh")
                    Text(text = "Somewhere ages and ages hence:")
                    Text(text = "Two roads diverged in a wood, and I-")
                    Text(text = "I took the one less traveled by,")
                    Text(text = "And that has made all the difference.")
                    Spacer(modifier = Modifier.height(10.dp))
                    Text(text = "BY ROBERT FROST", fontSize = 10.sp, fontStyle = FontStyle.Italic )
                }
            }


        }

    }
    @Preview
    @Composable
    fun PreviewPersonalData(){
        PersonalData(name = "Carlos")

    }
}

