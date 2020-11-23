package resource;
import java.sql.Connection;
import java.sql.DriverManager;
public class DbConnection {
static Connection con;
public static Connection getDbConnection() {
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orcl", "scott", "tiger");
		return con;
	} catch (Exception e) {
		System.out.println("Db Error "+e);
		return null;
	}
}
public void closeResouce() {
	try {
		con.close();
	} catch (Exception e) {
		// TODO: handle exception
	}
}
}
