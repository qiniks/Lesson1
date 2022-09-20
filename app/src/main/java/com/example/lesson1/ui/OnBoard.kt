package com.example.lesson1.ui

import java.io.Serializable

data class OnBoard(
    var image: String? = null,
    var title: String? = null,
    var description: String? = null,
    var isLast: Boolean? = null
):Serializable
