/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbcNet;

//import com.sun.jdi.connect.spi.Connection;
import java.sql.*;

/**
 *
 * @author MANOJ NISHAD
 */
public class ConnectionProvider1 {
    
      private static Connection con;
    public static Connection getConnection(){
        try{
            if(con==null)
            {
                Class.forName("com.mysql.cj.jdbc.Driver");
                
                con=DriverManager.getConnection("jdbc:mysql://localhost:7867//record1","root","root@7867");
                
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
        return con;
    }
    
}
