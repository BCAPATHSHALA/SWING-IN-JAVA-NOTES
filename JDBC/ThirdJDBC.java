// How to insert the data in table using PreparedStatement via JAVA program
import java.sql.*;

class ThirdJDBC
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
			String q="insert into table1(tName,tCity) values(?,?)";
			//II) Get the PreparedStatement object
			PreparedStatement pstmt = con.prepareStatement(q);
			//III)  Set the values to the query
			pstmt.setString(1,"Manoj Kumar");
			pstmt.setString(2,"Tundla UP");
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

/*
OUTPUT:
mysql> select * from table1;
Empty set (0.00 sec)

mysql> select * from table1;
+-----+-------------+-----------+
| tId | tName       | tCity     |
+-----+-------------+-----------+
|   1 | Manoj Kumar | Tundla UP |
+-----+-------------+-----------+
1 row in set (0.00 sec)
*/