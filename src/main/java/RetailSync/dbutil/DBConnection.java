package RetailSync.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 * This class handles database connection setup and management.
 */
public class DBConnection {
    private static Connection conn; // Static connection object

    // Static block to initialize the connection when the class is loaded
    static {
        try {
            // Load the PostgreSQL JDBC Driver
            Class.forName("org.postgresql.Driver");

            // Establish the database connection
            if (conn == null || conn.isClosed()) {
    
            conn = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/retailsync", // Database URL
                    "postgres", // Username
                    "postgres"  // Password
            );
            }

            JOptionPane.showMessageDialog(null, 
                    "Database Connection Established Successfully", 
                    "Success", 
                    JOptionPane.INFORMATION_MESSAGE);
        } 
        catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, 
                    "Error: PostgreSQL Driver not found!", 
                    "Driver Error", 
                    JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
            System.exit(1); // Exit the application in case of driver error
        } 
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, 
                    "Error: Unable to connect to the database!", 
                    "Database Error", 
                    JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
            System.exit(1); // Exit the application in case of connection error
        }
    }

    /**
     * Provides access to the database connection.
     * 
     * @return Connection object to interact with the database
     */
    public static Connection getConnection() {
    try {
        if (conn == null || conn.isClosed()) {
            conn = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/retailsync",
                    "postgres",
                    "postgres"
            );
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, 
                "Error reconnecting to database!", 
                "Database Error", 
                JOptionPane.ERROR_MESSAGE);
        ex.printStackTrace();
    }
    return conn;
}


    /**
     * Closes the database connection.
     */
    public static void closeConnection() {
        try {
            if (conn != null && !conn.isClosed()) {
                conn.close();
                
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, 
                    "Error closing database connection!", 
                    "Database Error", 
                    JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }
}
