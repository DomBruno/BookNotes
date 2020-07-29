package com.booknotes.backend.repositories;

import com.booknotes.backend.models.Note;
import org.springframework.data.repository.CrudRepository;


public interface NoteRepository
extends CrudRepository<Note, int>
{

}
