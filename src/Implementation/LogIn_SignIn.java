package Implementation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

import com.microsoft.sqlserver.jdbc.SQLServerException;

import hight_level_Component.get_connection;

public class LogIn_SignIn {
	get_connection connection;
	Connection connect;
	PreparedStatement Query;
	boolean respuesta=false;
	
	
	public LogIn_SignIn() throws SQLServerException{
		connection=new get_connection();
		connect=connection.get_connection_data();
	}
	
	
	public boolean LoginEmploy(Map<String , String[]> parameters) throws SQLException {
		Query = this.connect.prepareStatement("select  * from Empleado where emailEmpleado=? and passwordEmpleado=?");
		Query.setString(1,parameters.get("username")[0]);
		Query.setString(2, parameters.get("password")[0]);
		ResultSet registro = Query.executeQuery();

		if (registro.next()) {
			respuesta=true;
		} else {
			respuesta=false;
		}
		return respuesta;
	}
	public boolean Login(Map<String , String[]> parameters) throws SQLException {
		System.out.println("Entro");
		Query = this.connect.prepareStatement("select  * from Cliente where emailCliente=? and passwordCliente=?");
		Query.setString(1,parameters.get("username")[0]);
		Query.setString(2, parameters.get("password")[0]);
		ResultSet registro = Query.executeQuery();

		if (registro.next()) {
			respuesta=true;
		} else {
			respuesta=false;
		}
		return respuesta;
	}
	
	public boolean SignUp(Map<String , String[]> parameters) throws SQLException {
		System.out.println("Entro Sign up"); 
		Query = this.connect.prepareStatement("select  * from Cliente where idCliente=?");
		Query.setString(1, parameters.get("numberIdentificacion")[0]);
		ResultSet registro = Query.executeQuery();
		
		if (registro.next()) {
			respuesta=false;
			System.out.println("No resulto");
		} else {

			Query = this.connect.prepareStatement("insert into Cliente (idCliente, firstNameCliente, lastNameCLiente,emailCliente,passwordCliente) values (?,?,?,?,?)");
			Query.setString(1, parameters.get("numberIdentificacion")[0]);
			Query.setString(2, parameters.get("name")[0]);
			Query.setString(3, parameters.get("lastName")[0]);
			Query.setString(4, parameters.get("username")[0]);
			Query.setString(5, parameters.get("password")[0]);
			System.out.println(Query.execute());
			connect.commit();
			respuesta= true;
		}
		
		return respuesta;
	}

}
