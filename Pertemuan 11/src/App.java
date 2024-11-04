import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class App {

    // Jangan tentukan nama database, cukup sampai `localhost:3306`
    static final String DB_URL = "jdbc:mysql://localhost:3306/";
    static final String USER = "root";
    static final String PASS = "1234";

    public static void main(String[] args) {
        try (Connection con = DriverManager.getConnection(DB_URL, USER, PASS);
             Statement stmt = con.createStatement()) {
            String sql = "CREATE DATABASE firstdb";
            stmt.executeUpdate(sql);
            System.out.println("Database Created Successfully");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
