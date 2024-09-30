package com.personal.notetakingapp.controller;

import com.personal.notetakingapp.model.Notes;
import com.personal.notetakingapp.repository.NotesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.OK;

@RequestMapping("/notes")
@RestController
public class NotesController {
    private NotesRepository notesRepository;
    @Autowired
    NotesController(NotesRepository notesRepository){
        this.notesRepository = notesRepository;
    }

    @PostMapping
    public ResponseEntity<Notes> saveNotes(Notes notes){
        Notes results = notesRepository.save(notes);
        return new ResponseEntity<>(results,OK);
    }
}
