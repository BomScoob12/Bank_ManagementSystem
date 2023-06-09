package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class ConnectionDatabase {

    protected Connection connect(){
        String url = "jdbc:mysql://localhost:3306/banking-management-system";
        String username = "root";
        String password = "xxxxxxxxxxxxxxxx";

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, username, password);
            return con;
        } catch (SQLException | ClassNotFoundException e){
            e.getStackTrace();
        }
        return null;
    }

    protected void disconnect(Connection connection){
        try {
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
