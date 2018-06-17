import java.sql.*;
import javax.swing.JOptionPane;

public class JavaConnect {
    Connection conn=null;
    
    public static Connection ConnecrDb(){
        //add class path
            /*
            1.load jdbc driver
            2.create connection
            3.create statement object
            4.Execute query
            5.Process results
            6.close connection
            */
        try{
            //Class.forName("org.mysql.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","");
            return conn;
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }
}
