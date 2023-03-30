package com.bookstore.demo.service;

import com.bookstore.demo.BooksApiDelegate;
import org.openapitools.model.Book;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.UUID;

@Service
public class BooksService implements BooksApiDelegate {

    private HashMap<UUID, Book> booksMap = new HashMap<>();

    @Override
    public ResponseEntity<List<Book>> listBooks() {
        System.out.println("Getting books");
        return ResponseEntity.ok(booksMap.values().stream().toList());
    }

    @Override
    public ResponseEntity<Book> registerBook(Book book) {
        return ResponseEntity.ok(booksMap.put(book.getIsbn(), book));
    }

    @Override
    public ResponseEntity<Book> getBook(final UUID isbn) {
        System.out.println("Getting book " + isbn);
        return ResponseEntity.ok(booksMap.get(isbn));
    }

    @Override
    public ResponseEntity<Void> deleteBook(final UUID isbn) {
        booksMap.remove(isbn);
        return ResponseEntity.ok().build();
    }
}
