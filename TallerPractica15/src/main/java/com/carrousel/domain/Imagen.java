package com.carrousel.domain;

public class Imagen {
	private Integer id;
	private String descripcion;
	private String imagen;
	private Boolean activo;
	public Imagen() {
		// TODO Auto-generated constructor stub
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	public Boolean getActivo() {
		return activo;
	}
	public void setActivo(Boolean activo) {
		this.activo = activo;
	}
	public Integer getId() {
		return id;
	}
	public Imagen(Integer id, String descripcion, String imagen, Boolean activo) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.imagen = imagen;
		this.activo = activo;
	}

	
	
	
	
	
}
