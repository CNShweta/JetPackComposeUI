package com.training.vogueui.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.graphics.Color.Companion.Transparent
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import com.training.vogueui.R
import com.training.vogueui.ui.theme.VogueUITheme
import com.training.vogueui.ui.theme.label2
import com.training.vogueui.ui.theme.subtitle

@Composable
fun ImageComponent() {
    ConstraintLayout {
        val (placeholderImage, fashionShowDetail) = createRefs()

        Image(
            painter = painterResource(id = R.drawable.givenchy_brand),
            contentDescription = "placeholder",
            modifier = Modifier
                .fillMaxWidth()
                .constrainAs(placeholderImage) {
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                    absoluteLeft.linkTo(parent.absoluteLeft)
                }
        )

        Box(
            Modifier
                .background(
                    brush = Brush.verticalGradient(
                        colors = listOf(
                            Transparent,
                            Black
                        )
                    )
                )
                .fillMaxHeight(0.3F)
                .fillMaxWidth()
                .padding(8.dp)
                .constrainAs(fashionShowDetail) {
                    bottom.linkTo(placeholderImage.bottom)
                    absoluteLeft.linkTo(placeholderImage.absoluteLeft)
                }) {
            Column(
                modifier = Modifier.padding(bottom = 4.dp)
            ) {
                Text(text = "Givenchy".uppercase(), style = MaterialTheme.typography.label2)
                Spacer(Modifier.height(4.dp))
                Text(text = "Resort 2023".uppercase(), style = MaterialTheme.typography.subtitle)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ImageComponentPreview() {
    VogueUITheme {
        ImageComponent()
    }
}
