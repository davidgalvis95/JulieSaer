
package hight_level_Component;

import java.sql.Connection;
import java.sql.SQLException;

import com.microsoft.sqlserver.jdbc.SQLServerException;

import low_level_Component.*;

public class get_connection {
	Iconnection Iconnect;
	Connection connect;
	public get_connection() {
		this.connect=null;
	}
	
	public Connection get_connection_data() throws SQLServerException{
		
		if (constants.connection==1) {
			Iconnect=new My_sql_connection();
		}
		if (constants.connection==2) {
			Iconnect=new slq_server_connection();
		}    
		this.connect=Iconnect.connectToDatabase();
	
		return this.connect;
	}
	public  void close_connection() throws SQLException {
		this.Iconnect.closeConnection();
	}

}
