import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBWorked {

    private static final String URL = "jdbc:mysql://localhost:3306/school?autoReconnect=true&useSSL=false&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";

    private Connection connection;

    public DBWorked() {
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection( ) {
       return connection;
    }
}
