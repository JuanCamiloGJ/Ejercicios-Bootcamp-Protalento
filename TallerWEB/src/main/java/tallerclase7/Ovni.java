package tallerclase7;

public class Ovni extends Voladores{
	private String nombre;
	private Double velMax;
	private String color;
	
	
	public Ovni(String nombre, Double velMax, String color) {
		
		this.nombre = nombre;
		this.velMax = velMax;
		this.color = color;
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

	@Override
	public String toString() {
		return "Ovni [nombre=" + nombre + ", velMax=" + velMax + ", color=" + color + "]";
	}
	
}
