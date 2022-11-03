package com.training.vogueui.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.graphics.Color.Companion.Transparent
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import com.training.vogueui.ui.theme.VogueUITheme
import com.training.vogueui.ui.theme.label2
import com.training.vogueui.ui.theme.subtitle
import com.training.vogueui.util.loadImageUsingGlide

/**
 * ImageComponent is the Composable for all image instances
 *
 * @property imageUrl url of the image to be loaded into Image Composable
 * @property brandName brand name of fashion show
 * @property seasonName season name of fashion show
 * @property showFashionShowDetails boolean to indicate visibility of fashion show details
 */
@Composable
fun ImageComponent(
    imageUrl: String,
    brandName: String? = null,
    seasonName: String? = null,
    showFashionShowDetails: Boolean = false
) {
    ConstraintLayout {
        val (placeholderImage, fashionShowDetail) = createRefs()
        val image = loadImageUsingGlide(imageUrl = imageUrl).value

        image?.let {
            Image(
                bitmap = it.asImageBitmap(),
                contentDescription = "placeholder",
                modifier = Modifier
                    .fillMaxWidth()
                    .constrainAs(placeholderImage) {
                        top.linkTo(parent.top)
                        bottom.linkTo(parent.bottom)
                        absoluteLeft.linkTo(parent.absoluteLeft)
                    }
            )
        }

        if (showFashionShowDetails) {
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
                    },
                contentAlignment = Alignment.BottomStart
            ) {
                Column(
                    modifier = Modifier.padding(bottom = 4.dp)
                ) {
                    brandName?.let {
                        Text(
                            text = it.uppercase(),
                            style = MaterialTheme.typography.label2
                        )
                    }
                    Spacer(Modifier.height(4.dp))
                    seasonName?.let {
                        Text(
                            text = it.uppercase(),
                            style = MaterialTheme.typography.subtitle
                        )
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ImageComponentPreview() {
    VogueUITheme {
        ImageComponent(
            "https://assets.vogue.com/photos/629e0a01363baa7e460ac736/master/w_2240,c_limit/00001-givenchy-resort-2023-credit-brand.jpg",
            "Givenchy",
            "Resort 2023",
            true
        )
    }
}
