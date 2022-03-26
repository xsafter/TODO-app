package com.example.todo_app.services;

import androidx.annotation.NonNull;

import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.example.todo_app.listeners.MyValueEventListener;
import com.example.todo_app.models.application.User;
import com.example.todo_app.models.domain.UserD;

public class DatabaseService {
//    public static void addData() {
//        FirebaseDatabase.getInstance()
//                .getReference("test1")
//                .push()
//                .setValue("123");
//    }

    public static DatabaseReference usersRef() {
        return FirebaseDatabase.getInstance()
                .getReference("users");
    }

    public static String addUser(UserD user) {
        DatabaseReference ref = usersRef().push();
        ref.setValue(user);
        return ref.getKey();
//        return usersRef().push().setValue(user);
    }

    public static void getUser(String id, MyValueEventListener<User> listener) {
        usersRef().child(id).addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                UserD userD = snapshot.getValue(UserD.class);
                if (userD == null) {
                    listener.onException(new NullPointerException("Snapshot is null"));
                    return;
                }

                User user = new User(userD, snapshot.getKey());
                listener.onValue(user);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                listener.onDatabaseError(error);
            }
        });
//        return usersRef().push().setValue(user);
    }

//    public static void editUser() {
//
//    }
//
//    public static void deleteUser() {
//
//    }
}
