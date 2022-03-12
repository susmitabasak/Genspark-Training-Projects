package com.genspark.LibraryBookProject.Service;

import com.genspark.LibraryBookProject.Entity.Book;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface BookService {
    public List<Book> getAllBooks();
    public Book getBook(long bookId);
    public Book addNewBook(Book book);
    public Book updateBook(Book book);
    public String deleteBook(long bookId);
}
