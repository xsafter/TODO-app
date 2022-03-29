package com.example.todo_app.models.application;

import com.example.todo_app.models.domain.NoteD;
import com.example.todo_app.models.domain.UserD;

public class Note extends NoteD {
    String id;
    public Note(NoteD noteD, String id) {
        this.name = noteD.name;
        this.description = noteD.description;
        this.creationDate = noteD.creationDate;
        this.priority = noteD.priority;
        this.user = noteD.user;
    }
}
