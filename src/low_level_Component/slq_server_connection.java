package low_level_Component;

import java.sql.Connection;
import java.sql.SQLException;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;

import hight_level_Component.Iconnection;

public class slq_server_connection implements Iconnection{
	
	Connection connect;
	
	public slq_server_connection(){
		
		connect= null;
	}
	
	public Connection connectToDatabase() throws SQLServerException {
		SQLServerDataSource ds=new SQLServerDataSource();
	       ds.setServerName("DESKTOP-J47EMHD\\\\JUANGALVIS");
	       ds.setUser("sa");
	       ds.setPortNumber(1600);
	       ds.setPassword("juansebas9913");
	       ds.setDatabaseName("juliesaer");
	       connect=ds.getConnection();
		return connect;
	}

	@Override
	public void closeConnection() throws SQLException {
		this.connect.close();
		
	}

}
