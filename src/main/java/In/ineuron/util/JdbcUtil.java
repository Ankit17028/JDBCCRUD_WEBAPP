package In.ineuron.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;





//Using hikaricp configuration for connection pooling



//@SuppressWarnings("unused")
public class JdbcUtil {

	private JdbcUtil() {

	}                                                      
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getJdbcConnection() throws FileNotFoundException, SQLException, IOException  {
		String dbLoc = "E:\\ServletPrograms\\JDBCMVAPP\\src\\main\\java\\In\\ineuron\\properties\\db.properties";
		HikariConfig config = new HikariConfig(dbLoc);
		HikariDataSource dataSource = new HikariDataSource(config);
		Connection connection = dataSource.getConnection();
		return connection;
		
		
		
	}

	@SuppressWarnings("unused")
	private static Connection physicalConnection() throws FileNotFoundException, IOException, SQLException {
		String dbLoc = "E:\\ServletPrograms\\JDBCMVAPP\\src\\main\\java\\In\\ineuron\\properties\\db.properties";
		FileInputStream fis = new FileInputStream(dbLoc);
		Properties properties = new Properties();
		properties.load(fis);
		String url = properties.getProperty("url");
		String username = properties.getProperty("user");
		String password = properties.getProperty("password");
		Connection connection = DriverManager.getConnection(url, username, password);
		return connection;
	}
	
}
