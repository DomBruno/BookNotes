package com.booknotes.backend.repositories;

import com.booknotes.backend.models.User;
import org.springframework.data.repository.CrudRepository;


public interface UserRepository
        extends CrudRepository<User, int>
{

}

