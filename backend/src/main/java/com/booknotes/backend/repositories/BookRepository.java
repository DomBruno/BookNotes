package com.booknotes.backend.repositories;

import com.booknotes.backend.models.Book;
import org.springframework.data.repository.CrudRepository;


public interface BookRepository
        extends CrudRepository<Book, int>
{

}

