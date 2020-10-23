package com.book.function.book;

import com.book.pojo.Book;

import java.sql.*;

public class BookDaoImpl implements BookDao  {

    private final Connection conn;

    public BookDaoImpl(String url, String uid, String upw) throws SQLException, ClassNotFoundException {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        conn = DriverManager.getConnection(url, uid, upw);
    }

    @Override
    public int insertBook(Book book) throws SQLException {
        String sql = "insert into book values(?, ?, ?, ?)";

        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, book.getId());
        pstmt.setString(2, book.getName());
        pstmt.setString(3, book.getWriter());

        return pstmt.executeUpdate();
    }

    @Override
    public void bookListByTitle(String name, boolean rent) throws SQLException {
        String sql = "select * from book " + "where name = ?";

        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, name);
        ResultSet rs = pstmt.executeQuery();

        if (rent) {

        } else {
            while (rs.next()) {
                System.out.println("책이름: " + rs.getString("name"));
                System.out.println("저자: " + rs.getString("writer"));
                System.out.println("대여 여부: " + rs.getString("writer"));
            }
        }
    }

    @Override
    public void bookListByWriter(String writer, boolean rent) throws SQLException {
        String sql = "select * from book where writer = ?";

        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, writer);
        ResultSet rs = pstmt.executeQuery();

        if (rent) {

        } else {
            while (rs.next()) {
                System.out.println("책이름: " +  rs.getString("name"));
                System.out.println("저자: " + rs.getString("writer"));
                System.out.println("대여 여부: " + rs.getString("writer"));
            }
        }
    }

    public boolean isBookExists(String id) throws SQLException {
        String sql = "select count(*) from book where bno = ?";

        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, id);
        ResultSet resultSet = pstmt.executeQuery();
        resultSet.next();

        return resultSet.getInt(1) > 0;
    }

    public boolean bookAvaliablity(String id) throws SQLException {
        final String sql = "select count(*) from rental where rental_bno = ? and return_date is null";

        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, id);
        ResultSet resultSet = pstmt.executeQuery();
        resultSet.next();

        return resultSet.getInt(1) <= 0;
    }

}
