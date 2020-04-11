	package low_level_Component;

import java.sql.Connection;
import java.sql.SQLException;

import hight_level_Component.Iconnection;

public class My_sql_connection implements Iconnection {
	Connection connnect;

	public My_sql_connection(){
		connnect=null;

		
	}
	@Override
	public Connection connectToDatabase() {
		
		return null;
	}

	@Override
	public void closeConnection() throws SQLException {
		this.connnect.close();
	}

}
