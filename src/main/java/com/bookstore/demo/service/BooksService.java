package com.bookstore.demo.service;

import com.bookstore.demo.BooksApiDelegate;
import org.openapitools.model.Book;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Service
public class BooksService implements BooksApiDelegate {

    private Map<UUID, Book> booksMap = new HashMap<>();

    @Override
    public ResponseEntity<List<Book>> listBooks() {
        return ResponseEntity.ok(booksMap.values().stream().toList());
    }

    @Override
    public ResponseEntity<Book> registerBook(Book book) {
        return new ResponseEntity<>(booksMap.put(book.getIsbn(), book), HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<Book> getBook(final UUID isbn) {
        return ResponseEntity.ok(booksMap.get(isbn));
    }

    @Override
    public ResponseEntity<Void> deleteBook(final UUID isbn) {
        booksMap.remove(isbn);
        return ResponseEntity.ok().build();
    }
}
