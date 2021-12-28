package com.sahanmondal.imagesearcher.api

import com.sahanmondal.imagesearcher.data.UnsplashPhoto

data class UnsplashResponse(
    val results : List<UnsplashPhoto>
)