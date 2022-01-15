package tallerclase9.domain;

import java.util.Objects;

public class Alumno implements Entity {
	private Integer id;
	private String nombre;
	private String apellido;
	private Integer matricula;
	
	
	
	public Alumno(String nombre, String apellido, Integer matricula) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.matricula = matricula;
	}
	
	public Alumno(Integer id, String nombre, String apellido, Integer matricula) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.matricula = matricula;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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
	public Integer getMatricula() {
		return matricula;
	}
	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, matricula);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alumno other = (Alumno) obj;
		return Objects.equals(id, other.id) && Objects.equals(matricula, other.matricula);
	}
	
	
}
