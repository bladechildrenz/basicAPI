package com.example.demo

import org.springframework.data.jpa.repository.JpaRepository

interface TestRepository : JpaRepository<Book, Long> {
    fun findByName(name: String): List<Book>
}