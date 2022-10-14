/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbcNet;
import java.sql.*;

/**
 *
 * @author MANOJ NISHAD
 */
public class SelectJDBC {
    
    public static void main(String[] args) {
        try {
            Connection con=ConnectionProvider1.getConnection();
            
            String query="select * from student";
            
            Statement stmt=con.createStatement();
            ResultSet set=stmt.executeQuery(query);
            
            while(set.next())
            {
                int id = set.getInt("ID");
                String name=set.getString("NAME");
                String city=set.getString("CITY");
                String country=set.getString("COUNTRY");
                
                System.out.println(name+" : "+id+" : "+city+": "+country+" : ");
                
            }
            
            con.close();
        } catch (Exception e) {
        }
    }
    
}
