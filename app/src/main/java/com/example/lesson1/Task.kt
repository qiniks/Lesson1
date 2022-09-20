package com.example.lesson1

import java.io.Serializable

data class Task(
    var title: String,
    var description: String
) : Serializable
