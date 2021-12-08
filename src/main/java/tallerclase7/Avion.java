package tallerclase7;

import tallerclase7.interfaces.Aterrizable;

public class Avion extends Voladores implements Aterrizable{
	
	private String nombre;
	private Double velMax;
	private String color;
	private String marca;
	private Integer cnt_asientos;
	
	
	
	
	public Avion(String nombre, Double velMax, String color, String marca, Integer cnt_asientos) {
		
		this.nombre = nombre;
		this.velMax = velMax;
		this.color = color;
		this.marca = marca;
		this.cnt_asientos = cnt_asientos;
	}

	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return this.nombre;
	}

	@Override
	public Double getVelocidadMaxima() {
		// TODO Auto-generated method stub
		return this.velMax;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMarca() {
		return marca;
	}

	public Integer getCnt_asientos() {
		return cnt_asientos;
	}
	
	public String permisoDeAterrizaje() {
		// TODO Auto-generated method stub
		return "Soy un avion y puedo Aterrizar";
	}

	@Override
	public String toString() {
		return "Avion [nombre=" + nombre + ", velMax=" + velMax + ", color=" + color + ", marca=" + marca
				+ ", cnt_asientos=" + cnt_asientos + ", \n permisoDeAterrizaje()=" + permisoDeAterrizaje() + "]";
	}
	
}
