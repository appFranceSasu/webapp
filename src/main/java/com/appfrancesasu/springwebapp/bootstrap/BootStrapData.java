package com.appfrancesasu.springwebapp.bootstrap;

import com.appfrancesasu.springwebapp.domain.Author;
import com.appfrancesasu.springwebapp.domain.Book;
import com.appfrancesasu.springwebapp.domain.Publisher;
import com.appfrancesasu.springwebapp.repositories.AuthorRepository;
import com.appfrancesasu.springwebapp.repositories.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;


     public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository){
         this.authorRepository = authorRepository;
         this.bookRepository = bookRepository;
     }


    @Override
    public void run(String... args) throws Exception {

        Publisher publisher = new Publisher();
        publisher.setName("SFG Publishing");
        publisher.setCity("St Petersburg");
        publisher.setState("FL");

        Author eric = new Author("eric","Evans");
        Book ddd = new Book("Domain Driven Design","33344344");
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);
        ddd.setPublisher(publisher);


        authorRepository.save(eric);
        bookRepository.save(ddd);

        Author rod = new Author("Rod", "Johnson");
        Book noEJB = new Book("J2EE Development without EJB", "4343454353");
        rod.getBooks().add(noEJB);
        noEJB.getAuthors().add(rod);

        authorRepository.save(rod);
        bookRepository.save(noEJB);

        System.out.println("Started in Bootstrap");
        System.out.println("Numbers of books: "+bookRepository.count());

    }
}
