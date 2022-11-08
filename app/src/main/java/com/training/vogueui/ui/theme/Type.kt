package com.training.vogueui.ui.theme

import androidx.compose.material.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.training.vogueui.R

val gothicA1 = FontFamily(
    listOf(
        Font(R.font.gothica1_regular, FontWeight.Normal),
        Font(R.font.gothica1_medium, FontWeight.Medium),
        Font(R.font.gothica1_semibold, FontWeight.SemiBold),
        Font(R.font.gothica1_bold, FontWeight.Bold),
        Font(R.font.gothica1_black, FontWeight.Black),
    )
)

val Typography.title1: TextStyle
@Composable
get() {
    return TextStyle(
        color = Color.White,
        fontFamily = gothicA1,
        fontWeight = FontWeight.SemiBold,
        fontSize = 12.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.8.sp
    )
}

val Typography.label2: TextStyle
    @Composable
    get() {
        return  TextStyle(
            color = Color.White,
            fontFamily = gothicA1,
            fontWeight = FontWeight(550),
            fontSize = 11.sp,
            lineHeight = 12.sp,
            letterSpacing = 1.8.sp
        )
    }

val Typography.subtitle: TextStyle
    @Composable
    get() {
        return  TextStyle(
            color = Color.White,
            fontFamily = gothicA1,
            fontWeight = FontWeight.Normal,
            fontSize = 9.sp,
            lineHeight = 12.sp,
            letterSpacing = 1.2.sp
        )
    }

// Set of Material typography styles to start with
val Typography = Typography(
    body1 = TextStyle(
        color = AquaBlue,
        fontFamily = gothicA1,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp
    ),
    h1 = TextStyle(
        color = TextWhite,
        fontFamily = gothicA1,
        fontWeight = FontWeight.Bold,
        fontSize = 22.sp
    ),
    h2 = TextStyle(
        color = TextWhite,
        fontFamily = gothicA1,
        fontWeight = FontWeight.Bold,
        fontSize = 18.sp
    ),
    body2 = TextStyle(
        color = TextWhite,
        fontFamily = gothicA1,
        fontWeight = FontWeight.Normal,
        fontSize = 8.sp
    )
)
