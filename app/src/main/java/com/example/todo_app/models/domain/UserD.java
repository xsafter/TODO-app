package com.example.todo_app.models.domain;

public class UserD {
    public String name;
    public long createDate;

    public UserD() {
    }

    public UserD(String name, long createDate) {
        this.name = name;
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", createDate=" + createDate +
                '}';
    }
}
