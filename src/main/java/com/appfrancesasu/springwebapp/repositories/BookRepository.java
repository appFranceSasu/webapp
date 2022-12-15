package com.appfrancesasu.springwebapp.repositories;

import com.appfrancesasu.springwebapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {

}
