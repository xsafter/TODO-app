package com.example.todo_app.models.application;

import com.example.todo_app.models.domain.UserD;

import java.util.Date;

public class User extends UserD {
//    public String id;
//    public Date creationDate;

    public User(UserD userD) {
        this.name = userD.name;
//        this.id = id;
//        this.creationDate = new Date(userD.createDate);
        this.createDate = userD.createDate;
    }
}
