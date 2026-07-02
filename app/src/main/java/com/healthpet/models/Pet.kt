package com.healthpet.models

data class Pet(
    val id: Long,
    val name: String,
    val type: PetType,
    val breed: String
)