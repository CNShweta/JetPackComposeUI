package com.training.vogueui.navigation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Icon
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import com.training.vogueui.R

@Composable
fun AppToolBar(modifier: Modifier= Modifier){
    TopAppBar(backgroundColor = Color.Black) {
        Box(contentAlignment = Alignment.Center, modifier = modifier.fillMaxSize()) {
            Icon(painter = painterResource(id = R.drawable.ic_vogue_icon), contentDescription = "vogue icon", tint = Color.White)
        }
    }
}
