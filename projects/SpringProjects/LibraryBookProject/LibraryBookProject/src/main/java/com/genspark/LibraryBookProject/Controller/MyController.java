package com.genspark.LibraryBookProject.Controller;

import com.genspark.LibraryBookProject.Entity.Book;
import com.genspark.LibraryBookProject.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {

    @Autowired
    private BookService bookService;

    @GetMapping("/")
    public String main() {
        return "<html><h1>Welcome to my home page</h1></html>";
    }

    @GetMapping("/books")
    public List<Book> getBooks() {
        return this.bookService.getAllBooks();
    }

    @GetMapping("/books/{bookId}")
    public Book getBook(@PathVariable String bookId) {
        return this.bookService.getBook(Long.parseLong(bookId));
    }

    @PostMapping("/books")
    public Book addBook(@RequestBody Book book) {
        return this.bookService.addNewBook(book);
    }

    @PutMapping("/books")
    public Book updateBook(@RequestBody Book book) {
        return this.bookService.updateBook(book);
    }

    @DeleteMapping("/books/{bookId}")
    public String deleteBook(@PathVariable String bookId) {
        return this.bookService.deleteBook(Long.parseLong(bookId));
    }


}
