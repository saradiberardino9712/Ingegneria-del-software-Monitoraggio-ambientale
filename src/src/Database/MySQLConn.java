package Database;

import java.io.FileInputStream;
import java.sql.*;
import java.util.Properties;

public class MySQLConn {
	
	public static Connection getConnection() throws SQLException {
		Connection conn = null;
		try (FileInputStream f = new FileInputStream("db.properties")) {
			// load the properties file
			Properties pros = new Properties();
			pros.load(f);
			// assign db parameters
			String url = pros.getProperty("url");
			String user = pros.getProperty("user");
			String password = pros.getProperty("password");
			conn=DriverManager.getConnection(url,user,password);
		}
		catch (Exception e){
			e.printStackTrace();
		}
		return conn;
	}
}
