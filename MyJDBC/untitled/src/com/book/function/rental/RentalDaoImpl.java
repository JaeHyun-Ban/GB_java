package com.book.function.rental;

import java.sql.*;

public class RentalDaoImpl implements RentalDao {
    private final Connection connection;

    public RentalDaoImpl(String url, String uid, String upw) throws SQLException, ClassNotFoundException {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        connection = DriverManager.getConnection(url, uid, upw);
    }

    public boolean isBookExists(String id) throws SQLException {
        String sql = "select count(*) from book where bno = ?";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, id);
        ResultSet resultSet = preparedStatement.executeQuery();

        return resultSet.getInt(1) > 0;
    }


    public boolean bookAvaliablity(String id) throws SQLException {
        final String sql = "select count(*) from rental where rental_bno = ? and return_date is null";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, id);
        ResultSet resultSet = preparedStatement.executeQuery();

        return resultSet.getInt(1) <= 0;
    }

    public boolean isUserExists(String id) throws SQLException {
        final String sql = "select count(*) from users where id = ?";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, id);
        ResultSet resultSet = preparedStatement.executeQuery();

        return resultSet.getInt(1) > 0;
    }

    @Override
    public int rentBook(String user, String book) throws SQLException {
        final String sql = "insert into rental (rental_id, rental_bno) values (?, ?)";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, user);
        preparedStatement.setString(2, book);

        if(isBookExists(book) && bookAvaliablity(book) && isUserExists(user)) return preparedStatement.executeUpdate();
        return -1;
    }

    @Override
    public int returnBook(String book) throws SQLException {
        final String sql = "update rental set return_date = sysdate where rental_bno = ? and return_date is null";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, book);

        if(!bookAvaliablity(book)) return preparedStatement.executeUpdate();
        else return -1;
    }
}
