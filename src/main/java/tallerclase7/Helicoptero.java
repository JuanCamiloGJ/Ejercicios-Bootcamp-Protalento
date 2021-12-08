package tallerclase7;

import tallerclase7.interfaces.Aterrizable;

public class Helicoptero extends Voladores implements Aterrizable{
	private String nombre;
	private Double velMax;
	private String color;
	private String marca;
	
	public Helicoptero(String nombre, Double velMax, String color, String marca) {
		
		this.nombre = nombre;
		this.velMax = velMax;
		this.color = color;
		this.marca = marca;
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

	public String permisoDeAterrizaje() {
		// TODO Auto-generated method stub
		return "Soy un Helicoptero, y puedo aterrizar";
	}

	@Override
	public String toString() {
		return "Helicoptero [nombre=" + nombre + ", velMax=" + velMax + ", color=" + color + ", marca=" + marca
				+ ", \n permisoDeAterrizaje()=" + permisoDeAterrizaje() + "]";
	}
	
}
