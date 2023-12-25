import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DbConnect {
    private static DbConnect instance =  null;
    private static Connection con;

    private DbConnect(){
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/prepads", "root", "");
            System.out.println("Connection Done");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public static DbConnect GetInstance(){
        if (instance == null) {
            return new DbConnect();
        }
        return instance;
    }

    public static Connection getCon() {
        return con;
    }
}
