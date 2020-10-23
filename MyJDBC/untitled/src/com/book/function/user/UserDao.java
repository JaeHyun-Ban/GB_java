package com.book.function.user;

import com.book.pojo.User;

import java.sql.SQLException;

public interface UserDao {
    int userUpdate(String name) throws SQLException;
    int insertUser(User vo) throws SQLException;
}
