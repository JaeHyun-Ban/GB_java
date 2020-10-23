package com.book.function.book;

import com.book.pojo.Book;

import java.sql.SQLException;

public interface BookDao {
    public int insertBook(Book book) throws SQLException;
    public void bookListByTitle(String name, boolean rent) throws SQLException;
    public void bookListByWriter(String writer, boolean rent) throws SQLException;

}
