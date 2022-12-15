package com.appfrancesasu.springwebapp.repositories;

import com.appfrancesasu.springwebapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
