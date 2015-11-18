package cseb;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author AlokPal
 */
public class DataBaseConnect {

    public DataBaseConnect() {
    }
       public Connection dbConnect()
        {
                try
                {
                        Class.forName("com.mysql.jdbc.Driver").newInstance();
                        Connection conn = DriverManager.getConnection( "jdbc:mysql://localhost:3306/cseb", "root", "root");

                     //   System.out.println("connected");
                        return conn;

                }
                catch (Exception e)
                {
                        e.printStackTrace();
                        return null;
                }
        }
public int DBInsert(String query)
{
    Connection conn=dbConnect();
    try{
    Statement stmt=conn.createStatement();
   return( stmt.executeUpdate(query));
    }
    catch(SQLException sql)
    {
        JOptionPane.showMessageDialog(null, sql, "SQL Error",JOptionPane.ERROR_MESSAGE);
        return 0;
    }
}

}
