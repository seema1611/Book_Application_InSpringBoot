package com.book.service;

import com.book.model.Books;

import java.util.List;

public interface BooksSeriveInterface {

    List<Books> getAllBooks();

    Books getBooksById(int id);

    void saveOrUpdate(Books books);

    void delete(int id);

    void update(Books books, int bookid);
}
