package com.fahrul.springmongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.fahrul.springmongodb.model.Book;

public interface BookRepository extends MongoRepository<Book, Integer> {

}
