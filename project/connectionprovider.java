package project;
import java.sql.*;

public class connectionprovider {
	public static Connection getCon()
	{
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bbms","rec","root");
			return con;
			
		}
		catch(Exception e)
		{
			return null;
		}
	}

}
