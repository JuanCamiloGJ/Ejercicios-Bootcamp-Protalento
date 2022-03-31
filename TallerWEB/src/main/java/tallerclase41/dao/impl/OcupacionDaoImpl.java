package tallerclase41.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import tallerclase41.dao.OcupacionDao;
import tallerclase41.domain.Ocupacion;
import tallerclase41.domain.Persona;
import tallerclase41.jdbc.AdminConexiones;

public class OcupacionDaoImpl implements OcupacionDao{

	@Override
	public List<Ocupacion> findAll() {
		// TODO Auto-generated method stub
		List<Ocupacion> ocupaciones = new ArrayList<>();
		String sql = "SELECT * FROM ocupaciones";
		
		try(Connection con = AdminConexiones.obtenerConexion();
			PreparedStatement ps = con.prepareStatement(sql);
				){
			ResultSet rs= ps.executeQuery();
			
			while(rs.next()) {
				
				ocupaciones.add(new Ocupacion(rs.getInt(1), rs.getString(2)));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return ocupaciones;
	}

	@Override
	public Boolean create(Ocupacion persoan) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean update(Ocupacion persona) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean delete(Integer idPersona) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Persona findById(Integer idPersona) {
		// TODO Auto-generated method stub
		return null;
	}

}
