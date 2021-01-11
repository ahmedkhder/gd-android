package com.getdonate.model.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "country")
data class Country(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val countryName: String,
    val countryFlag: String,
    val countryCode: String
)