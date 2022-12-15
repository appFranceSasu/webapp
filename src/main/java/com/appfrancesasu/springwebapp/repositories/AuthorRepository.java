package com.appfrancesasu.springwebapp.repositories;

import com.appfrancesasu.springwebapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
