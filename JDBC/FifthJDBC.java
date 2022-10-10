// How to insert the image to Database using PreparedStatement via JAVA program
import java.sql.*;
import java.io.*;

class FifthJDBC
{
	public static void main(String[] args) 
	{
		try
		{
			//Step01: Load the JDBC Driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			//Step02: Create the connection
			String url="jdbc:mysql://localhost:7867/youtube";
			String username="root";
			String password="root@7867";
			Connection con=DriverManager.getConnection(url,username,password);

			//Step03: create the query and a statement

			//I) Create a query
			String q="insert into images(pic) values(?)";
			//II) Get the PreparedStatement object
			PreparedStatement pstmt = con.prepareStatement(q);

			//III)  Set the values to the query
			FileInputStream fis=new FileInputStream("C:/Users/MANOJ NISHAD/Desktop/mypic.png.jpg");
			pstmt.setBinaryStream(1,fis,fis.available());
			//IV) Insert the data value in table
			pstmt.executeUpdate(); 

			System.out.println("inserted data");

			//Step05: Close the connection
			con.close();

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}