package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class DatabaseUtil {

    static Connection connect(){
        String URL = "jdbc:mysql://localhost:3306/bank_management";
        String username = "root";
        String password = "BomScoob112004@";
        try {
            Connection connection = DriverManager.getConnection(URL, username, password);
            return connection;
        } catch (SQLException e) {
            e.getStackTrace();
        }
        return null;
    }

    static void disconnect(Connection connection){
        try {
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
