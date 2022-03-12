package com.genspark.LibraryBookProject.Repository;

import com.genspark.LibraryBookProject.Entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookDao extends JpaRepository<Book, Long> {
    public Book findByBookId(long id);  // if this is not used, you can use findById() which will do the same thing
}
