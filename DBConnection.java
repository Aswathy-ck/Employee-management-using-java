import java.sql.Connection;
import java.sql.DriverManager;



public class DBConnection {
    static Connection conn = null;
    public static Connection connect(){
        try{
            String url = "jdbc:mysql://localhost:3306/employee";
            String username = "root";
            String password = "root";

            conn = DriverManager.getConnection(url, username, password);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return conn;

    }
}
