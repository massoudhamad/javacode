import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestJDBC {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/ebookshop";
        String username = "root";
        String password = "Admin123!";

        try {
            // Load the MySQL JDBC driver
            // Class.forName("com.mysql.cj.jdbc.Driver");
            Class.forName("com.mysql.jdbc.Driver");

            // Establish the connection to the database
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);

            // If the connection is successful, print a success message
            System.out.println("JDBC connected to MySQL successfully!");

            // Close the connection
            connection.close();
        } catch (ClassNotFoundException e) {
            System.err.println("Error: MySQL JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.err.println("Error: Unable to connect to MySQL.");
            e.printStackTrace();
        }
    }
}
