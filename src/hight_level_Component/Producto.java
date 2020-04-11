package hight_level_Component;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.microsoft.sqlserver.jdbc.SQLServerException;

public class Producto {
	get_connection connection;
	Connection connect;
	Producto producto;
	Statement Query;
	ResultSet listaProductos;
	
	
	// atributos del objeto******************************************************************************************/
	
	int idProducto;
	String nameProducto;
	double PrecioProducto;
	double descuentoProdcuto;
	String descripcion;
	/******************************************************************************************************************/
	
	public Producto () throws SQLServerException {
		connection=new get_connection();
		connect=connection.get_connection_data();
		
		
	}
	
	
	
	// Se debe usar esta practica para poder:	1. Evitar hacer casting en cada clase de bajo nivel. 2. Hay mayor dinamica al procesar cada objeto 
	
	
	public ArrayList<Producto> cargarListaProduto() throws SQLException {
		producto= new Producto();
		ArrayList<Producto> listaObjetosProducto= new ArrayList<Producto>();
		
		Query=connect.createStatement();
		listaProductos=Query.executeQuery("select  * from Productos");
		while (listaProductos.next()) {
			producto.idProducto=listaProductos.getInt("idProducto");
			producto.nameProducto=listaProductos.getString("nameProducto");
			producto.PrecioProducto=listaProductos.getDouble("PrecioProducto");
			producto.descuentoProdcuto=listaProductos.getDouble("descuentoProdcuto");
			producto.descripcion=listaProductos.getString("descripcion");
			listaObjetosProducto.add(producto); // cada que se reescribe el mismo objeto produto (misma ubicacion en memoria) se crea un nuevo objeto en el ArrayList
		}
		
		
		return listaObjetosProducto;
		
	}
	
	public boolean actualizarProducto() {
		return false;
		
	}
	
	public boolean insertarProducto() {
		
	}
	
	public boolean borrarProducto() {
		
	}
	

}
