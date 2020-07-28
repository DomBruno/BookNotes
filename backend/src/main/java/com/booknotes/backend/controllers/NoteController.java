package com.booknotes.backend.controllers;

import com.booknotes.backend.services.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public class NoteController {

        @RestController
        @RequestMapping("/notes") // optional
        public class NoteController
        {
            @Autowired
            private NoteService noteService;

        }
    }
