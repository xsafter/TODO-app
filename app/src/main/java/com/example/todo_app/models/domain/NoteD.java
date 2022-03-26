package com.example.todo_app.models.domain;

import androidx.annotation.NonNull;

public class NoteD {
    public String name;
    public String description;
    public long creationDate;
    public int priority;
    public String username;
    public NoteD(){}

    public NoteD(String name, String description, long creationDate, int priority, String username) {
        this.name = name;
        this.description = description;
        this.creationDate = creationDate;
        this.priority = priority;
        this.username = username;
    }

    @NonNull
    @Override
    public String toString() {
        return "NoteD{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", creationDate=" + creationDate +
                ", priority=" + priority +
                ", username='" + username + '\'' +
                '}';
    }
}
