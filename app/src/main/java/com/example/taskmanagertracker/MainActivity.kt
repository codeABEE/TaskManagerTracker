package com.example.taskmanagertracker

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.taskmanagertracker.ui.theme.TaskManagerTrackerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TaskManagerTrackerTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    TaskManagerApp()
                }
            }
        }
    }
}

@Composable
fun TaskManagerApp() {

    TaskManagerCard(
        first_text = stringResource(id = R.string.first_text) ,
        second_Text = stringResource(id = R.string.second_text) ,
        imagePainter = painterResource(id = R.drawable.ic_task_completed) ,
        )

}


@Composable
fun TaskManagerCard(
    first_text: String,
    second_Text: String,
    imagePainter: Painter,
    modifier: Modifier = Modifier)
{
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
        )
    {
        Image(
            painter = imagePainter,
            contentDescription = null,
            modifier = modifier.padding(start = 16.dp, end = 16.dp, bottom = 16.dp),
            alignment = Alignment.Center

            )

        Text(
            text = first_text,
            modifier = modifier.padding(top = 24.dp, bottom = 8.dp),
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold,
            color = Color.Red,
            )

        Text(
            text = second_Text,
           // modifier = modifier.padding(top = 8.dp, start = 8.dp, end = 8.dp),
            fontSize = 16.sp
            )
        
    }


}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    TaskManagerTrackerTheme {
        TaskManagerApp()
    }
}