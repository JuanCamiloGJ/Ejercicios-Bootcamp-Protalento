package tallerclase41.dao.impl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import tallerclase41.dao.PersonaDao;
import tallerclase41.domain.Persona;
import tallerclase41.jdbc.AdminConexiones;

public class PersonaDaoImpl implements PersonaDao {

	@Override
	public List<Persona> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean create(Persona persoan) {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO personas ( nombre, apellido, ocupacion, edad, documento, fechaNacimiento ) VALUES ( ?, ?, ?, ?, ?, ?);";
		Boolean estado=false;
		try(Connection con = AdminConexiones.obtenerConexion();
			PreparedStatement ps = con.prepareStatement(sql);
				){
			ps.setString(1, persoan.getNombre());
			ps.setString(2, persoan.getApellido());
			ps.setString(3, persoan.getOcupacion());
			ps.setInt(4, persoan.getEdad());
			ps.setInt(5, persoan.getDocumento());
			ps.setDate(6, (Date) persoan.getFechaNacimiento());
			
			estado = ps.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return estado;
	}

	@Override
	public Boolean update(Persona persona) {
		return null;
		// TODO Auto-generated method stub

	}

	@Override
	public Boolean delete(Integer idPersona) {
		return null;
		// TODO Auto-generated method stub

	}

	@Override
	public Persona findById(Integer idPersona) {
		// TODO Auto-generated method stub
		return null;
	}

}
