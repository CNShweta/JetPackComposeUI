package com.training.vogueui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.training.vogueui.navigation.BottomNavigationView
import com.training.vogueui.navigation.Navigation

@Composable
fun HomeScreen(){
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colors.background
    ) {
        val navController = rememberNavController()
        Scaffold(bottomBar = { BottomNavigationView(navController) }) {
            Navigation(Modifier,navController)
        }
    }
}
