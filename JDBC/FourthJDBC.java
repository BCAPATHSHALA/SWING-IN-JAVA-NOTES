// How to insert the data dynamically in table using PreparedStatement via JAVA program
import java.sql.*;
import java.io.*;

class FourthJDBC
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
			
			//User Input
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Enter name: ");
			String name=br.readLine();

			System.out.print("Enter city: ");
			String city=br.readLine();

			//III)  Set the values to the query
			pstmt.setString(1,name);
			pstmt.setString(2,city);
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
INPUT:
Enter name: SANOJ NISHAD
Enter city: Tundla UP Firozabad
inserted data

OUTPUT:
mysql> select * from table1;
+-----+--------------+---------------------+
| tId | tName        | tCity               |
+-----+--------------+---------------------+
|   1 | Manoj Kumar  | Tundla UP           |
|   2 | SANOJ NISHAD | Tundla UP Firozabad |
+-----+--------------+---------------------+
2 rows in set (0.00 sec)

mysql>
*/