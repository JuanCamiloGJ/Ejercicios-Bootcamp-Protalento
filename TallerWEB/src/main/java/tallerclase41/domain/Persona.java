package tallerclase41.domain;

import java.util.Date;

public class Persona {
	private String nombre;
	private String apellido;
	private String ocupacion;
	private Integer edad;
	private Integer documento;
	private Date fechaNacimiento;
	
	public Persona(String nombre, String apellido, String ocupacion, Integer edad, Integer documento,
			Date fechaNacimiento) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.ocupacion = ocupacion;
		this.edad = edad;
		this.documento = documento;
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getOcupacion() {
		return ocupacion;
	}
	public void setOcupacion(String ocupacion) {
		this.ocupacion = ocupacion;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	public Integer getDocumento() {
		return documento;
	}
	public void setDocumento(Integer documento) {
		this.documento = documento;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	
}
