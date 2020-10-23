package com.book.function.rental;

import java.sql.SQLException;

public interface RentalDao {
    int rentBook(String user, String book) throws SQLException;
    int returnBook(String id) throws SQLException;
}
