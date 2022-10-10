//PROGRAM01: How to connect MySQL with the JAVA program via JDBC
import java.sql.*;
class FirstJDBC
{
	public static void main(String[] args) 
	{
		try
		{
			//Step01: Load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			//Step02: Creating a connection
			String url="jdbc:mysql://localhost:7867/youtube";
			String username="root";
			String pass="root@7867";

			Connection con=DriverManager.getConnection(url,username,pass);

			if(con.isClosed())
			{
				System.out.println("Connection is closed");
			}
			else 
			{
				System.out.println("Connection is created....");
			}

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}