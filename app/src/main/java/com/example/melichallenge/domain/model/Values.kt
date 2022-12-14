package com.example.melichallenge.domain.model

import kotlinx.serialization.Serializable

@Serializable
data class Values (
    val name: String?,
    val struct: ValueStruct?,
    val source: String,
    val id: String?
        )