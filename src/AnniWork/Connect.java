
package AnniWork;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Connect {
    
     static Connection con=null;
    public static Connection ConnectToDB() {
        try {
             con=DriverManager.getConnection("jdbc:mysql://localhost:3306/movierecSystem","root","kanishka");
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
}
}