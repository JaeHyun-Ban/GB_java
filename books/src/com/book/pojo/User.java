package com.book.pojo;

public class User {
    private String id;
    private String name;
    private String phone;

    public User() {    }

    public User(String id, String name, String phone) {
        this.id = id;
        this.name = name;
        this.phone = phone;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}


/*

create table users(
    id varchar2(50) primary key,
    name varchar2(50),
    phone varchar2(50)
);


* */