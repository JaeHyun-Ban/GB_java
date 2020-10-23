package com.book.function.user;

import com.book.pojo.User;

import java.sql.*;
import java.util.Scanner;

public class UserDaoImpl implements UserDao {

    private final Connection conn;

    public UserDaoImpl(String url, String uid, String upw) throws SQLException, ClassNotFoundException {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        conn = DriverManager.getConnection(url, uid, upw);
    }

    public boolean isUserExists(String id) throws SQLException {
        final String sql = "select count(*) as result from users where id = ?";

        PreparedStatement preparedStatement = conn.prepareStatement(sql);
        preparedStatement.setString(1, id);
        ResultSet resultSet = preparedStatement.executeQuery();
        resultSet.next();

        return resultSet.getInt("result") > 0;
    }


    @Override
    public int insertUser(User vo) throws SQLException {
        String sql = "insert into users values(?, ?, ?)";

        PreparedStatement pstmt= conn.prepareStatement(sql);
        pstmt.setString(1, vo.getId());
        pstmt.setString(2, vo.getName());
        pstmt.setString(3, vo.getPhone());

        if(!isUserExists(vo.getId())) return pstmt.executeUpdate();
        else return -1;
    }

    @Override
    public int userUpdate(String name) throws SQLException {
        String sql = "update users set id = ?, phone = ? where name = ?";
//        String sql_found = "select count(*) from users where id = ?";
//
//        PreparedStatement preparedStatement = conn.prepareStatement(sql_found);
//        preparedStatement.setNString(1, name);
//        ResultSet resultSet = preparedStatement.executeQuery();
//        resultSet.next();
//        
        if(isUserExists(name)) {
            PreparedStatement pstmt = conn.prepareStatement(sql);

            Scanner sc = new Scanner(System.in);
            System.out.print("변경할 ID 입력 : ");
            String n_id = sc.next();
            System.out.print("변경할 Phone 번호 입력 : ");
            String n_phone = sc.next();

            pstmt.setString(1, n_id);
            pstmt.setString(2, n_phone);
            pstmt.setString(3, name);

            return pstmt.executeUpdate();
        } else return 0;
    }
}

