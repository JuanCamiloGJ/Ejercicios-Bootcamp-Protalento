package com.carrousel.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;

import com.carrousel.dao.ImagenDao;
import com.carrousel.domain.Imagen;
import com.carrousel.jbdc.AdminConexiones;

public class ImagenDaoImpl implements ImagenDao {

	@Override
	public Collection<Imagen> findAll() throws Exception {
		// TODO Auto-generated method stub
		String sql = "SELECT * From carrousel";
		Collection<Imagen> imagenescarrousel = new ArrayList<>();
		Imagen imagen;
		try(Connection con = AdminConexiones.obtenerConexion();
			PreparedStatement ps = con.prepareStatement(sql)){
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				imagen= new Imagen(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getBoolean(4));
				imagenescarrousel.add(imagen);		
			}
			
		}catch(Exception e) {
			throw  new Exception("No pudo cargar las imagenes de la bd", e);
		}
		
		return imagenescarrousel;
	}

	@Override
	public Boolean update(Imagen entity) throws Exception {
		// TODO Auto-generated method stub
		String sql = "UPDATE carrousel SET descripcion=?, imagen=?, activo=? WHERE id=?";
		Boolean estado=true;
		Imagen imagen = entity;
		try(Connection con = AdminConexiones.obtenerConexion();
			PreparedStatement ps = con.prepareStatement(sql)){
			ps.setString(1, imagen.getDescripcion());
			ps.setString(2, imagen.getImagen());
			ps.setBoolean(3, imagen.getActivo());
			ps.setInt(4, imagen.getId());
			
			estado = Boolean.parseBoolean(ps.executeUpdate()+"");
			
		}catch(Exception e) {
			throw  new Exception("No pudo actualizar los datos de la imagen", e);
		}
		
		return estado;
	}

}
