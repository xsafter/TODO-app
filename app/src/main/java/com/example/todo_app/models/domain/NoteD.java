package com.example.todo_app.models.domain;

import androidx.annotation.NonNull;

import com.example.todo_app.models.application.User;

public class NoteD {
    public String name;
    public String description;
    public long creationDate;
    public String priority;
    public User user;
    public NoteD(){}

    public NoteD(String name, String description, long creationDate, String priority, User user) {
        this.name = name;
        this.description = description;
        this.creationDate = creationDate;
        this.priority = priority;
        this.user = user;
    }

    @Override
    public String toString() {
        return "NoteD{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", creationDate=" + creationDate +
                ", priority='" + priority + '\'' +
                ", user=" + user +
                '}';
    }
}
