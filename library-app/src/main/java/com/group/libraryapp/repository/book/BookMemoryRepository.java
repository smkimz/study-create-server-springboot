package com.group.libraryapp.repository.book;

import com.group.libraryapp.service.book.BookRepository;
import org.springframework.stereotype.Repository;

@Repository
public class BookMemoryRepository implements BookRepository {

//    private final List<Book> books = new ArrayList<Book>();

    @Override
    public void saveBook() {
//        books.add(new Book());
    }
}
