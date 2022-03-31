package com.example.todo_app.models.domain;

import androidx.annotation.NonNull;

import com.example.todo_app.models.application.User;

public class Note {
    public String name;
    public String description;
    public long creationDate;
    public String priority;
    public User user;
    public boolean done;
    public Note(){}

    public Note(String name, String description, long creationDate, String priority, User user, boolean done) {
        this.name = name;
        this.description = description;
        this.creationDate = creationDate;
        this.priority = priority;
        this.user = user;
        this.done = done;
    }

    @Override
    public String toString() {
        return "Note{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", creationDate=" + creationDate +
                ", priority='" + priority + '\'' +
                ", user=" + user +
                ", done=" + done +
                '}';
    }
}
