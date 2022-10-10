import java.sql.*;

public class GFG {
	public static void main(String arg[])
	{
		Connection connection = null;
		try {
			// below two lines are used for connectivity.
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(
				"jdbc:mysql://localhost:7867/record1",
				"root", "root@7867");

			// record1 is database
			// root is name of database
			// root@7867 is password of database

			Statement statement;
			statement = connection.createStatement();
			ResultSet resultSet;
			resultSet = statement.executeQuery(
				"select * from student");
			int id;
			String name;
			String city;
			String country;
			while (resultSet.next()) {
				id = resultSet.getInt("ID");
				name = resultSet.getString("NAME").trim();
				city = resultSet.getString("CITY").trim();
				country = resultSet.getString("COUNTRY").trim();
				System.out.println("ID : " + id
								+ " NAME : " + name
								+ " CITY : " + city
								+ " COUNTRY : " + country);
			}
			resultSet.close();
			statement.close();
			connection.close();
		}
		catch (Exception exception) {
			System.out.println(exception);
		}
	} // function ends
} // class ends



/*
DATABASE


mysql> show databases;
+--------------------+
| Database           |
+--------------------+
| information_schema |
| mysql              |
| performance_schema |
| record1            |
| sys                |
| youtube            |
+--------------------+
6 rows in set (0.04 sec)

mysql> use record1;
Database changed
mysql> show tables;
+-------------------+
| Tables_in_record1 |
+-------------------+
| laptops           |
| student           |
+-------------------+
2 rows in set (0.00 sec)

mysql> select * from student;
+----------+----------+---------+---------+
| ID       | NAME     | CITY    | COUNTRY |
+----------+----------+---------+---------+
|       23 | ankit    | delhi   | ind     |
|       24 | sanket   | lucknow | india   |
|      234 | ishant   | lucknow | india   |
|      246 | sumit    | lucknow | india   |
|     2334 | aman     | kanpur  | india   |
| 24234236 | ramsingh | lucknow | india   |
+----------+----------+---------+---------+
6 rows in set (0.04 sec)

mysql>



OUTPUT..........................
ID : 23 NAME : ankit CITY : delhi COUNTRY : ind
ID : 24 NAME : sanket CITY : lucknow COUNTRY : india
ID : 234 NAME : ishant CITY : lucknow COUNTRY : india
ID : 246 NAME : sumit CITY : lucknow COUNTRY : india
ID : 2334 NAME : aman CITY : kanpur COUNTRY : india
ID : 24234236 NAME : ramsingh CITY : lucknow COUNTRY : india

*/
