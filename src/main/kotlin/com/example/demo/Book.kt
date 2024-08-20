package com.example.demo

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
data class Book(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long = 0,
    var name: String? = null,
    var author: String? = null,
)
