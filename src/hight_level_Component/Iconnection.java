package hight_level_Component;

import java.sql.Connection;
import java.sql.SQLException;

import com.microsoft.sqlserver.jdbc.SQLServerException;

public interface Iconnection {

	public Connection connectToDatabase () throws SQLServerException;
	public void closeConnection() throws SQLException;
	
}
