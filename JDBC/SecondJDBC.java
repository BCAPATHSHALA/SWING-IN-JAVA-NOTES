// How to insert the table in database via JAVA program
import java.sql.*;

class SecondJDBC
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
			String q="create table table1(tId int(20) primary key auto_increment, tName varchar(200) not null, tCity varchar(400))";
			//II) Create a statement
			Statement stmt = con.createStatement();
			//III) Insert the table in database
			stmt.executeUpdate(q); 

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
mysql> show tables;
+-------------------+
| Tables_in_youtube |
+-------------------+
| table1            |
+-------------------+
1 row in set (0.00 sec)

mysql> desc table1;
+-------+--------------+------+-----+---------+----------------+
| Field | Type         | Null | Key | Default | Extra          |
+-------+--------------+------+-----+---------+----------------+
| tId   | int          | NO   | PRI | NULL    | auto_increment |
| tName | varchar(200) | NO   |     | NULL    |                |
| tCity | varchar(400) | YES  |     | NULL    |                |
+-------+--------------+------+-----+---------+----------------+
3 rows in set (0.00 sec)
*/