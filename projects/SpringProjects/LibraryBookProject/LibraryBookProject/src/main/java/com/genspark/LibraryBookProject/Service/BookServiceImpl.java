package com.genspark.LibraryBookProject.Service;

import com.genspark.LibraryBookProject.Entity.Book;
import com.genspark.LibraryBookProject.Repository.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    public BookDao bookDao;

    @Override
    public List<Book> getAllBooks() {
        return this.bookDao.findAll();
    }

    @Override
    public Book getBook(long bookId) {
        return this.bookDao.findByBookId(bookId);
    }

    @Override
    public Book addNewBook(Book book) {
        return this.bookDao.save(book);
    }

    @Override
    public Book updateBook(Book book) {
        return this.bookDao.save(book);
    }

    @Override
    public String deleteBook(long bookId) {
        this.bookDao.deleteById(bookId);
        return "Book deleted";
    }
}
