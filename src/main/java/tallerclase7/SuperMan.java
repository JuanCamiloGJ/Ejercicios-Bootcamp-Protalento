package tallerclase7;

public class SuperMan extends Voladores{
	private String nombre;
	private Double velMax;
	private String identidadOculta;
	
	public SuperMan(String nombre, Double velMax, String identidadOculta) {
	
		this.nombre = nombre;
		this.velMax = velMax;
		this.identidadOculta = identidadOculta;
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

	public String getIdentidadOculta() {
		return identidadOculta;
	}

	@Override
	public String toString() {
		return "SuperMan [nombre=" + nombre + ", velMax=" + velMax + ", identidadOculta=" + identidadOculta + "]";
	}
	
}
