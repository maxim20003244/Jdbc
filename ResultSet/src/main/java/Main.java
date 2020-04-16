import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        DBWorked dbWorked = new DBWorked();


        String query = "select * from user";

        try {
            Statement statement = dbWorked.getConnection().createStatement();
           ResultSet resultSet =statement.executeQuery(query);
            while (resultSet.next()){
                User user = new User();
                user.setId(resultSet.getInt("id"));
                user.setName(resultSet.getString("Name"));
                user.setPassword(resultSet.getString("password"));
                System.out.println(user);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
