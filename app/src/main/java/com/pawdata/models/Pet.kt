package com.pawdata.models

data class Pet(
    val id: Long,
    val name: String,
    val type: PetType,
    val breed: String
)