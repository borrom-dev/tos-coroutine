package xyz.edsync.toscoroutine

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*
import xyz.edsync.toscoroutine.ui.theme.TosCoroutineTheme
import java.util.concurrent.CountDownLatch
import kotlin.math.log

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TosCoroutineTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background
                ) {
                    Greeting("Android") {
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, work: () -> Unit) {
    Column() {
        Text(text = "Hello $name!")
        Button(onClick = {
            work()
        }) {
            Text(text = "Getting thing done")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    TosCoroutineTheme {
        Greeting("Android") {

        }
    }
}