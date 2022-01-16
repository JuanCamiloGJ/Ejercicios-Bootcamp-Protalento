package tallerclase9.domain;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class DatosDBMemoria<R>  {

	// LinkedList para ahorrarme los datos duplicados recuerda
	private  List<Alumno> bdAlumnos = new LinkedList<Alumno>();
	private  List<Materia> bdMaterias = new LinkedList<Materia>();
	private  List<AlumnoPorMateria> inscripcion = new LinkedList<AlumnoPorMateria>();

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

		Materia materia1 = new Materia(10, "Español", "Mañana");
		bdMaterias.add(materia1);

		materia1 = new Materia(20, "Ingles", "Mañana");
		bdMaterias.add(materia1);

		materia1 = new Materia(30, "Matematicas", "Mañana");
		bdMaterias.add(materia1);

		materia1 = new Materia(40, "Programación", "Mañana");
		bdMaterias.add(materia1);

		materia1 = new Materia(50, "Economia", "Mañana");
		bdMaterias.add(materia1);

		Materia materia2 = new Materia(15, "Español", "Tarde");
		bdMaterias.add(materia2);

		materia2 = new Materia(25, "Ingles", "Tarde");
		bdMaterias.add(materia2);

		materia2 = new Materia(35, "Matematicas", "Tarde");
		bdMaterias.add(materia2);

		materia2 = new Materia(45, "Programación", "Tarde");
		bdMaterias.add(materia2);

		materia2 = new Materia(55, "Economia", "Tarde");
		bdMaterias.add(materia2);

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

	public void setRegistro(R entity) {
		if (entity.getClass().equals(Alumno.class)) {
			bdAlumnos.add((Alumno) entity);
		} else if (entity.getClass().equals(Materia.class)) {
			bdMaterias.add((Materia) entity);
		} else if (entity.getClass().equals(AlumnoPorMateria.class)) {
			inscripcion.add((AlumnoPorMateria) entity);
		}
	}

	public List<?> findAll(R entity) {
		if (entity.getClass().equals(Alumno.class)) {
			return getBdAlumnos();
		} else if (entity.getClass().equals(Materia.class)) {
			return getBdMaterias();
		} else if (entity.getClass().equals(AlumnoPorMateria.class)) {
			return getInscripcion();
		} else {
			return null;
		}
	}

	public R findId(Integer id, Class clazz) {
		if (clazz.equals(Alumno.class)) {
			for (Alumno aux : bdAlumnos) {
				if (id.equals(aux.getId())) {
					return (R) aux;
				}
			}
		} else if (clazz.equals(Materia.class)) {
			for (Materia aux : bdMaterias) {
				if (id.equals(aux.getId())) {
					return (R) aux;
				}
			}
		} else if (clazz.equals(AlumnoPorMateria.class)) {
			for (AlumnoPorMateria aux : inscripcion) {
				if (id.equals(aux.getId())) {
					return (R) aux;
				}
			}
		} else {
			return null;
		}
		return null;
	}
	public void delete(R Entity) {
		if(Entity.getClass().equals(AlumnoPorMateria.class)) {
			System.out.println("entro");
			AlumnoPorMateria ins= (AlumnoPorMateria) Entity;
			Iterator<AlumnoPorMateria> itr= inscripcion.iterator();
			AlumnoPorMateria insList=null;
			while(itr.hasNext()) {
			insList=itr.next();
				if(insList.getId().equals(ins.getId())) {
					itr.remove();
				};
				
			}
		}else if(Entity.getClass().equals(Alumno.class)) {
			Alumno alm = (Alumno)Entity;
			Iterator<Alumno> itr = bdAlumnos.iterator();
			while(itr.hasNext()) {
				if(itr.next().getId().equals(alm.getId())) {
					itr.remove();
				}
			}
		}
	}

}
