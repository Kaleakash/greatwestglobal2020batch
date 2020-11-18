package resource;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {

static Connection con;
	public static Connection getDbConnection() {
	//Connection con=null;
	try {
	Class.forName("oracle.jdbc.driver.OracleDriver");
	con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orcl", "scott", "tiger");
	} catch (Exception e) {
				System.out.println("Error in Db Connection "+e);
	}
	return con;
	}
	
	
	
	void closeResource() {
		try {
			con.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
