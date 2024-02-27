package com.group.libraryapp.repository.book;

import com.group.libraryapp.service.book.BookRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Primary
@Repository
public class BookMySqlRepository implements BookRepository {

    @Override
    public void saveBook() {

    }
}
