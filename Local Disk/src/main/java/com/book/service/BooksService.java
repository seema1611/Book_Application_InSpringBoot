package com.book.service;

import com.book.model.Books;
import com.book.repository.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BooksService implements BooksSeriveInterface {
    @Autowired
    BooksRepository booksRepository;

    @Override
    //getting all books record by using the method findaAll() of CrudRepository
    public List<Books> getAllBooks() {
        List<Books> books = new ArrayList<Books>();
        booksRepository.findAll().forEach(books1 -> books.add(books1));
        return books;
    }


    //getting a specific record by using the method findById() of CrudRepository
    @Override
    public Books getBooksById(int id) {
        return booksRepository.findById(id).get();
    }


    //saving a specific record by using the method save() of CrudRepository
    @Override
    public void saveOrUpdate(Books books) {
        booksRepository.save(books);
    }

    //deleting a specific record by using the method deleteById() of CrudRepository
    @Override
    public void delete(int id) {
        booksRepository.deleteById(id);
    }

    //updating a record
    @Override
    public void update(Books books, int bookid) {
        booksRepository.save(books);
    }
}