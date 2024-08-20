package com.example.demo

import org.springframework.stereotype.Service

@Service
class TestService(
    private val testRepository: TestRepository
) {
    fun findAllBook(): List<Book> = testRepository.findAll()
    fun findByBookId(id: Long): Book? = testRepository.findById(id).orElse(null)
    fun findByBookName(name : String): List<Book> = testRepository.findByName(name)
    fun addBook(book: Book): Book = testRepository.save(book)
    fun updateBook(id: Long, updateBook: Book): Book? {
        val b = testRepository.findById(id).orElse(null) ?: return null
        b.name = updateBook.name
        b.author = updateBook.author
        return testRepository.save(b)
    }
    fun deleteBook(id: Long) = testRepository.deleteById(id)

}