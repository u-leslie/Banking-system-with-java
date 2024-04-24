package dao;

import models.Customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BankDao {
    private Connection connection;

    public BankDao() {
        try {
            this.connection = DBconn.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
            // Handle the exception appropriately, e.g., log it and throw a custom exception
        }
    }

    public boolean registerCustomer(Customer customer) {
        try {
            String query = "INSERT INTO customers (username, password, age, account_type, balance) VALUES (?, ?, ?, ?, 0.00)";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                preparedStatement.setString(1, customer.getUsername());
                preparedStatement.setString(2, customer.getPassword());
                preparedStatement.setInt(3, customer.getAge());
                preparedStatement.setString(4, customer.getAccountType());

                int rowsAffected = preparedStatement.executeUpdate();
                return rowsAffected > 0;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Handle the exception appropriately
            return false;
        }
    }

    public boolean authenticateCustomer(String username, String password) {
        try {
            String query = "SELECT * FROM customers WHERE username = ? AND password = ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                preparedStatement.setString(1, username);
                preparedStatement.setString(2, password);

                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    return resultSet.next();
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Handle the exception appropriately
            return false;
        }
    }

    public Customer getCustomerDetails(String username) {
        try {
            String query = "SELECT * FROM customers WHERE username = ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                preparedStatement.setString(1, username);

                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    if (resultSet.next()) {
                        Customer customer = new Customer();
                        customer.setId(resultSet.getInt("id"));
                        customer.setUsername(resultSet.getString("username"));
                        customer.setPassword(resultSet.getString("password"));
                        customer.setAge(resultSet.getInt("age"));
                        customer.setAccountType(resultSet.getString("account_type"));
                        customer.setBalance(resultSet.getDouble("balance"));
                        return customer;
                    } else {
                        return null; // Customer not found
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Handle the exception appropriately
            return null;
        }
    }

    // Other methods for deposit, withdraw, check balance, etc.

    // Close the database connection when the object is no longer needed
    public void closeConnection() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Handle the exception appropriately
        }
    }
}
