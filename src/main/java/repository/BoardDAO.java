package repository;

import java.sql.*;

// JDBC Programming
public class BoardDAO {
    private Connection conn;
    //private Statement st; // ? , ? , ?
    private PreparedStatement ps;
    private ResultSet rs; // select SQL
    // 연결동작(접속URL, 아이디, 패스워드)
    public Connection getConnect(){
        String url="jdbc:mysql://localhost:3306/bootcamp";
        String username="root";
        String password="12345";
        try{
            conn=DriverManager.getConnection(url, username, password);
        }catch (Exception e){
            e.printStackTrace();
        }
        return conn;
    }
    // 
}
