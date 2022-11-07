package com.training.vogueui.dummyresponse

import com.training.vogueui.model.FashionShow

fun getLatestShows(): ArrayList<FashionShow> {
    return arrayListOf(
        FashionShow(
            "Supriya Lele",
            "https://assets.vogue.com/photos/63638da0bed27995a83705c5/master/w_2240,c_limit/00001-supriya-lele-2023-ready-to-wear-credit-brand.jpg"
        ),
        FashionShow(
            "Todo Snyder",
            "https://assets.vogue.com/photos/6362554cb7ffc694db8867d6/master/w_2240,c_limit/00001-todd-snyder-spring-2023-menswear-credit-brand.jpg"
        ),
        FashionShow(
            "Tia Adeola",
            "https://assets.vogue.com/photos/6361028525161163f5e44832/master/w_2240,c_limit/00002-tia-adeola-resort-2023-credit-brand.jpg"
        ),
        FashionShow(
            "Bottega Vebeta",
            "https://assets.vogue.com/photos/635fca2537a9bde5c0cd3433/master/w_2240,c_limit/00001-bottega-veneta-resort-2023-credit-brand.jpg"
        ),
    )
}
