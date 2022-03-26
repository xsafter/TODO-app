package com.example.todo_app.listeners;

import com.google.firebase.database.DatabaseError;

public abstract class MyValueEventListener<T> {
    public abstract void onValue(T value);

    public void onException(Exception e) {
    }

    public void onDatabaseError(DatabaseError e) {
    }
}
