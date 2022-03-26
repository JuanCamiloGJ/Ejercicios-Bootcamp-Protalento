package tallerclase41.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class AdminConexiones {

	
	public static Connection obtenerConexion() throws Exception {
		
		String urlhost = "jdbc:postgresql://ec2-3-208-121-149.compute-1.amazonaws.com:5432/d9k0p0uqbrna52";
		String user = "oeirmurxnkotrr";
		String password = "0b15bf42aa901c9e9b2183db0e7f4e36fc8a54cb2bc86923d7a3b3b655a3b67b";
		String driverName = "org.postgresql.Driver";
		
		try {
			java.lang.Class.forName(driverName);
			Connection connection = DriverManager.getConnection(urlhost, user, password);
			return connection;
		} catch (Exception e) {
			// TODO: handle exception
			throw new Exception("Error obteniendo conexion", e);
		}
		
	}
	public static void main(String[] args) {
		try(Connection con = AdminConexiones.obtenerConexion();){
			System.out.println("Conexion obtenida.");
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
