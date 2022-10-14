/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbcNet;

//import com.sun.jdi.connect.spi.Connection;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
//import java.sql.*;

/**
 *
 * @author MANOJ NISHAD
 */
public class UpdateJDBC {
    
    public static void main(String[] args) {
        try {
            Connection con=(Connection) ConnectionProvider1.getConnection();
            
            String q="update student set NAME=? , CITY=? , COUNTRY=? , ID=? ";
            
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            
            System.out.println("Enter new name: ");
            String name=br.readLine();
            
            System.out.println("Enter new city: ");
            String city=br.readLine();
            
            System.out.println("Enter new country: ");
            String country=br.readLine();
            
            System.out.println("Enter new id: ");
            int id=Integer.parseInt(br.readLine());
            
            PreparedStatement pstmt=con.prepareStatement(q);
            
            pstmt.setString(1,name);
            pstmt.setString(2,city);
            pstmt.setString(3,country);
            
            pstmt.setInt(4,id);
            
            pstmt.executeUpdate();
            
            System.out.println("done............");
            
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
            
    
}
