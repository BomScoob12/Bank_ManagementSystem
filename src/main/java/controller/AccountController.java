package controller;

import accounts.Account;

import java.sql.*;

public class AccountController {
    private Connection connection = DatabaseUtil.connect();

//    private int getLastId(){
//        String sql = "SELECT account_id FROM accounts " +
//                "ORDER BY account_id DESC " +
//                "LIMIT 1";
//        try {
//            ResultSet resultSet = connection.createStatement().executeQuery(sql);
//            resultSet.next();
//            if (resultSet.getInt(1) == 0){
//                return 1;
//            } else {
//                return resultSet.getInt(1);
//            }
//        } catch (SQLException e){
//            e.getStackTrace();
//        }
//        return -1;
//    }


    //this method is create account.
    public void addAccount(Account account){
        String sql = "INSERT INTO accounts(customer_id, account_id, current_balance, interest_rate, account_type, account_opening_date)" +
                "VALUE (?, ?, ?, ?, ?, ?)";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, account.getAccountId());
            preparedStatement.setInt(2, account.getAccountId());
        } catch (SQLException e){
            e.getStackTrace();
        }

    }
}
