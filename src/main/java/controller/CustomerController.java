package controller;

import person.Customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;

public class CustomerController {

    Connection connection = DatabaseUtil.connect();
    public void addCustomer(Customer customer){
        SimpleDateFormat timeFormat = new SimpleDateFormat("DD/MM/yyyy HH:mm:ss");
        String dateTime = timeFormat.format(LocalDateTime.now());
        String sql = "INSERT INTO customers(customer_id, firstname, lastname, contact_number, email, address, register_date)" +
                "value (?,?,?,?,?,?,?)";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, customer.getId());
            preparedStatement.setString(2, customer.getFirstname());
            preparedStatement.setString(3, customer.getLastname());
            preparedStatement.setString(4, customer.getContactNumber());
            preparedStatement.setString(5, customer.getEmail());
            preparedStatement.setString(6, customer.getAddress());
            preparedStatement.setString(7, dateTime);
            preparedStatement.close();
            connection.close();
        } catch (SQLException e){
            e.getStackTrace();
        }
    }

    public void deleteCustomerById(String id){
        String deleteCmd = "DELETE FROM customers" +
                "WHERE customer_id = ?";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(deleteCmd);
            preparedStatement.setString(1, id);
            preparedStatement.close();
            connection.close();
        } catch (SQLException e){
            e.getStackTrace();
        }
    }

}
