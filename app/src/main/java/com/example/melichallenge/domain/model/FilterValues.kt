package com.example.melichallenge.domain.model

import kotlinx.serialization.Serializable

@Serializable
data class FilterValues (
    val id: String,
    val name: String,
    val path_from_root: List<IdNameObject>?
)
