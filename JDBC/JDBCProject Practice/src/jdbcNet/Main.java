/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbcNet;

//import com.sun.jdi.connect.spi.Connection;
import java.awt.HeadlessException;
import java.sql.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author MANOJ NISHAD
 */
public class Main {
    
    public static void main(String[] args) throws NullPointerException
    {
        try{
            
            Connection c= ConnectionProvider.getConnection();
            
            String q="insert images(pic) values(?)";
            
            PreparedStatement pstmt= c.prepareStatement(q);
            
            JFileChooser jfc=new JFileChooser();
            
            jfc.showOpenDialog(null);
            
            File file = jfc.getSelectedFile();
            
            FileInputStream fis=new FileInputStream(file);
            
            pstmt.setBinaryStream(1,fis,fis.available());
            
            pstmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"success");
            
            
            
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
