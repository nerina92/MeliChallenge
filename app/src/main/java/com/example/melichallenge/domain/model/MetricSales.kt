package com.example.melichallenge.domain.model

import kotlinx.serialization.Serializable

@Serializable
data class MetricSales (
    val period: String,
    val completed: Int
    )
