package Data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {
    public static Connection connect() {
        Connection conexion = null;
        try {
            String url = "jdbc:mysql://localhost:3306/validation_db"; 
            String user = "root";
            String password = "";
            conexion = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conexion;
    }
}
