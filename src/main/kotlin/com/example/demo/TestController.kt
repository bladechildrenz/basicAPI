package com.example.demo

import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController(private val testService: TestService) {

    @GetMapping("")
    fun findAllBook(): List<Book> =
        testService.findAllBook()

    @GetMapping("/{id}")
    fun findById(@PathVariable id: Long) =
        testService.findByBookId(id)

    @PostMapping("/searchName")
    fun findByBookName(@RequestBody searchBookNameRequest: SearchBookNameRequest): List<Book> =
        testService.findByBookName(searchBookNameRequest.name)

    @PostMapping("/addBook")
    fun addBook(@RequestBody book: Book): Book =
        testService.addBook(book)

    @PostMapping("/updateBook") //put
    fun updateBook(@RequestBody book: Book): Book? =
        testService.updateBook(book.id, book)

    @DeleteMapping("/{id}")
    fun deleteBook(@PathVariable id: Long) =
        testService.deleteBook(id)

}
