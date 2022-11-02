package com.training.vogueui.util

import com.facebook.shimmer.Shimmer
import com.facebook.shimmer.ShimmerDrawable

fun getShimmerDrawable(): ShimmerDrawable {
    val shimmer =
        Shimmer.AlphaHighlightBuilder() // The attributes for a ShimmerDrawable is set by this builder
            .setDuration(SHIMMER_DURATION) // how long the shimmering animation takes to do one full sweep
            .setBaseAlpha(SHIMMER_ALPHA) // the alpha of the underlying children
            .setHighlightAlpha(SHIMMER_HIGHLIGHT_ALPHA) // the shimmer alpha amount
            .setDirection(Shimmer.Direction.LEFT_TO_RIGHT)
            .setAutoStart(true)
            .build()

    return ShimmerDrawable().apply {
        setShimmer(shimmer)
    }
}

const val SHIMMER_DURATION = 1500L
const val SHIMMER_ALPHA = 0.9f
const val SHIMMER_HIGHLIGHT_ALPHA = 0.8f
