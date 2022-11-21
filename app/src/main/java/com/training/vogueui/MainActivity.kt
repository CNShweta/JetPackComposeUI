package com.training.vogueui

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.training.vogueui.navigation.Navigation
import com.training.vogueui.ui.theme.VogueUITheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            VogueUITheme {
                HomeScreen()
                ComposableLifecycle { _, event ->
                    Log.d("lifecycle", event.toString())
                }
            }
        }
    }
}
