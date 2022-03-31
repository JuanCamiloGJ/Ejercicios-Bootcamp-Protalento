package tallerclase41.domain;

public class Ocupacion {
	private Integer id;
	private String ocupacion;
	
	
	public Ocupacion(String ocupacion) {
	
		this.ocupacion = ocupacion;
	}
	public Ocupacion(Integer id, String ocupacion) {
		this.id = id;
		this.ocupacion = ocupacion;
	}
	public String getOcupacion() {
		return ocupacion;
	}
	
	public void setOcupacion(String ocupacion) {
		this.ocupacion = ocupacion;
	}
	public Integer getId() {
		return id;
	}
	
	
	
}   
