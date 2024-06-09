package com.example.aidar_badirov_hw_4_1

import java.io.Serializable

data class User(
    val name: String,
    val email: String,
    val password: Int
) : Serializable
