package com.book.pojo;

public class Book {
    private String id;
    private String name;
    private String writer;

    public Book() { }

    public Book(String id, String name, String writer) {
        this.id = id;
        this.name = name;
        this.writer = writer;
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

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }
}
/*

create table book(
    bno NUMBER(10) primary key,
    name varchar2(50),
    writer varchar2(50),
    regdate date default sysdate
);

* */