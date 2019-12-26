package com.example.databinding.model

data class User(
    val name: String ?= null,
    val age: Int? = null,
    val company: String? = null,
    val address: String? = null,
    val phone: String? = null
)