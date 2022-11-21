package com.training.vogueui.dummyresponse

import com.training.vogueui.model.FashionShow

fun getLatestShows(): ArrayList<FashionShow> {
    return arrayListOf(
        FashionShow(
            "https://assets.vogue.com/photos/6374b66680a2e070d3ba3180/master/pass/00001-cult-gaia-resort-2023-credit-brand.jpg",
            "Cult Gaia",
            "Resort 2023"
        ),
        FashionShow(
            "https://assets.vogue.com/photos/6374edbfbef03ca674096261/master/pass/00001-berluti-spring-2023-menswear-credit-brand.jpg",
            "Berluti",
            "Spring 2023 Menswear"
        ),
        FashionShow(
            "https://assets.vogue.com/photos/63736cab39d0839de993233d/master/pass/00001-emilio-pucci-resort-2023-credit-brand.jpg",
            "Emilio Pucci",
            "Resort 2023"
        ),
        FashionShow(
            "https://assets.vogue.com/photos/63724b9ce7812feb894e5d3f/master/pass/00001-the-attico-resort-2023-credit-vito-fernicola.jpg",
            "The Attico",
            "Resort 2023"
        )
    )
}
