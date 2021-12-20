package ww;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Locale;

public class we {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Locale.setDefault(Locale.ENGLISH);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@192.168.1.253:1521:xe", "SYSTEM","26701070");
			Statement statement = connection.createStatement();
			ResultSet resultSet=statement.executeQuery("select * from users");
		} catch(SQLException e)
		{
			e.printStackTrace();
			
		
		}

	}

}
