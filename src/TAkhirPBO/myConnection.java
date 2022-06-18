package TAkhirPBO;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Fathir Maula. S/222011503/2KS4
 */
public class myConnection {
    public static Connection getConnection(){
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/takhirpbo", "root","");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return conn;
    }
}
