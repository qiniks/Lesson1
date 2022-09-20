package com.example.lesson1.ui.Task

import java.io.Serializable

data class Task(
    var title: String,
    var description: String
) : Serializable
