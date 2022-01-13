package tallerclase9.domain;

import java.util.ArrayList;
import java.util.List;

public class DatosDBMemoria {
	private List<Alumno> bdAlumnos= new ArrayList<Alumno>();
	private List<Materia> bdMaterias = new ArrayList<Materia>();
	private List<AlumnoPorMateria> inscripcion = new ArrayList<AlumnoPorMateria>();
	
	public DatosDBMemoria() {
		// TODO Auto-generated constructor stub
		Alumno alumno1 = new Alumno(1, "Juan", "Garcia", 1);
		bdAlumnos.add(alumno1);
		alumno1 = new Alumno(2, "Angela", "Meneses", 2);
		bdAlumnos.add(alumno1);
		alumno1 = new Alumno(3, "Camilo", "Jimenez", 3);
		bdAlumnos.add(alumno1);
		alumno1 = new Alumno(4, "Maria", "Yara", 4);
		bdAlumnos.add(alumno1);
	}
	
	public List<Alumno> getBdAlumnos() {
		return bdAlumnos;
	}
	public void setBdAlumnos(List<Alumno> bdAlumnos) {
		this.bdAlumnos = bdAlumnos;
	}
	public List<Materia> getBdMaterias() {
		return bdMaterias;
	}
	public void setBdMaterias(List<Materia> bdMaterias) {
		this.bdMaterias = bdMaterias;
	}
	public List<AlumnoPorMateria> getInscripcion() {
		return inscripcion;
	}
	public void setInscripcion(List<AlumnoPorMateria> inscripcion) {
		this.inscripcion = inscripcion;
	}
	
	public void agregarAlumno(Alumno entity) {
		bdAlumnos.add(entity);
	}
	public void agregarMateria(Materia entity) {
		bdMaterias.add(entity);
		
	}
	public void agregarInscripcion(AlumnoPorMateria entity) {
		inscripcion.add(entity);
	}
	
}
