package dao;

import java.sql.*;

public class DBconn {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/bankSystem";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(JDBC_URL, USER, PASSWORD);
    }
    public static void insertUserData(String username, String password, int age) {
        String customerInsertQuery = "INSERT INTO customer (username, password, age) VALUES (?, ?, ?)";

        try (Connection connection = getConnection();
             PreparedStatement customerInsertStatement = connection.prepareStatement(customerInsertQuery, Statement.RETURN_GENERATED_KEYS)) {

            customerInsertStatement.setString(1, username);
            customerInsertStatement.setString(2, password);
            customerInsertStatement.setInt(3, age);

            int rowsAffected = customerInsertStatement.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Customer data inserted successfully.");
            } else {
                System.out.println("Failed to insert customer data.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static double checkBalance(String username) {
        String balanceQuery = "SELECT balance FROM customer WHERE username = ?";

        try (Connection connection = getConnection();
             PreparedStatement balanceStatement = connection.prepareStatement(balanceQuery)) {

            balanceStatement.setString(1, username);

            try (ResultSet balanceResult = balanceStatement.executeQuery()) {
                if (balanceResult.next()) {
                    double balance = balanceResult.getDouble("balance");

                    // Check for NULL or missing balance
                    if (!balanceResult.wasNull()) {
                        return balance;
                    } else {
                        System.out.println("Balance is NULL or missing for user: " + username);
                    }
                } else {
                    System.out.println("No balance found for user: " + username);
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return 0.0;
    }

    public static void depositAmount(String username, double amount) {
        String query = "UPDATE customer SET balance = balance + ? WHERE username = ?";

        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            preparedStatement.setDouble(1, amount);
            preparedStatement.setString(2, username);

            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Deposit successful.");
            } else {
                System.out.println("Failed to deposit.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void withdrawAmount(String username, double amount) {
        String query = "UPDATE customer SET balance = balance - ? WHERE username = ?";

        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            preparedStatement.setDouble(1, amount);
            preparedStatement.setString(2, username);

            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Deposit successful.");
            } else {
                System.out.println("Failed to deposit.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static boolean authenticateUser(String username, String password) {
        String query = "SELECT * FROM customer WHERE username = ? AND password = ?";
        boolean isAuthenticated = false;

        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);

            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    isAuthenticated = true; // Authentication is successful if there is a match
                }
            }

        } catch (SQLException e) {
            e.printStackTrace(); // Change this to your logging mechanism
        }

        return isAuthenticated;
    }



}
