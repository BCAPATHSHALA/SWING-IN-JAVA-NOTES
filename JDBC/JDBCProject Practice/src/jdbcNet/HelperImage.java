/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbcNet;
import java.awt.Image;
import java.io.InputStream;
import java.sql.*;
import javax.imageio.ImageIO;
import javax.swing.*;

/**
 *
 * @author MANOJ NISHAD
 */
public class HelperImage {
    
    public static ImageIcon getImageIconById(int id, Connection con)
    {
        ImageIcon icon=null;

        try
        {

            String q="select pic from images where id=?";
            
            PreparedStatement pstmt=con.prepareStatement(q);
            pstmt.setInt(1, id);
            ResultSet set=pstmt.executeQuery();
            
            if(set.next())
            {
                Blob b=set.getBlob("pic");
                InputStream is=b.getBinaryStream();
                Image image=ImageIO.read(is);
                icon=new ImageIcon(image);
            }
            
  
            
            
        }catch(Exception e)
        {


        }
        return icon;
      
    }
    
}
