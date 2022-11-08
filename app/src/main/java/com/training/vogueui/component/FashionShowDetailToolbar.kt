package com.training.vogueui.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.training.vogueui.R
import com.training.vogueui.ui.theme.VogueUITheme

@Composable
fun FashionShowDetailToolbar(brandName: String, seasonName: String) {

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.Black),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            modifier = Modifier.padding(start = 17.dp),
            painter = painterResource(id = R.drawable.ic_back),
            contentDescription = "backNavigation",
            tint = Color.White,
        )

        Column(
            modifier = Modifier
                .padding(bottom = 4.dp)
        ) {
            Label2Component(title = brandName)
            Spacer(Modifier.height(4.dp))
            SubtitleComponent(subtitle = seasonName)
        }

        Icon(
            modifier = Modifier.padding(end = 18.5.dp),
            painter = painterResource(id = R.drawable.ic_menu),
            contentDescription = "backNavigation",
            tint = Color.White
        )
    }
}

@Preview(showBackground = true)
@Composable
fun FashionShowDetailToolbarPreview() {
    VogueUITheme {
        FashionShowDetailToolbar(
            brandName = "Givenchy",
            seasonName = "Resort 2023"
        )
    }
}
