package tallerclase9.service.impl;

import java.util.List;
import java.util.Scanner;

import tallerclase9.dao.GenericDao;
import tallerclase9.dao.impl.JDBCDaoBase;
import tallerclase9.domain.Alumno;
import tallerclase9.domain.AlumnoPorMateria;
import tallerclase9.domain.DatosDBMemoria;
import tallerclase9.domain.Entity;
import tallerclase9.domain.Materia;
import tallerclase9.service.AlumnoPorMateriaService;
import tallerclase9.service.AlumnoServicie;
import tallerclase9.service.MateriaService;
import tallerclase9.service.excep.RegistroHaSidoBorrado;

public class MenuServiceImpl {

	DatosDBMemoria BD = new DatosDBMemoria();

	public void getMenu() {
		int opc;
		Scanner teclado = new Scanner(System.in);
		Boolean loop = true;
		do {
			System.out.println("¿Que desea realizar?");
			System.out.println(" 1.Inscribir\n 2.Eliminar Inscripcion o Alumno \n 3.Buscar Inscripcion \n 4.Crear Alumno");
			opc = teclado.nextInt();

			switch (opc) {
			case 1:
				inscribir(teclado);
				loop = false;
				break;
			case 2:
				eliminar(teclado);
				loop = false;
				break;
			case 3:
				try {
					getInscripcion(teclado);
				} catch (RegistroHaSidoBorrado e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				loop = false;
				break;
			case 4:
				crearAlumno(teclado);
				loop = false;
				break;
			default:
				loop = true;
				break;
			}

		} while (loop);

	}

	public void eliminar(Scanner teclado) {
		System.out.println("¿Que desea eliminar?");
		System.out.println("1.Inscripcion");
		System.out.println("2.Alumno");
		int opc = teclado.nextInt();
		boolean loop=true;
		do {
			switch (opc) {
			case 1:
				System.out.println("Inserte el id de la inscripcion a eliminar:");
				opc=teclado.nextInt();
				AlumnoPorMateriaService inscripciones = new AlumnoPorMateriaServiceImpl();
				inscripciones.establecerbd(BD);
				AlumnoPorMateria inscripcion = inscripciones.findId(opc);
				if(inscripcion != null) {
					inscripciones.delete(inscripcion);
				}else {
					System.out.println("No se a encontrado el registro.");
				}
				loop=false;
				break;
			case 2:
				System.out.println("Inserte el id del alumno a eliminar:");
				opc=teclado.nextInt();
				AlumnoServicie alumnos = new AlumnoServiceImpl();
				alumnos.establecerbd(BD);
				Alumno alumno = alumnos.findId(opc);
				if(alumno != null) {
					alumnos.delete(alumno);
				}else {
					System.out.println("No se a encontrado el registro.");
				}
				loop=false;
				break;
			default:
				loop=true;
				break;
			}
		} while (loop);
		getMenu();
	}

	public void inscribir(Scanner teclado) {

		System.out.println("Seleccione el Alumno a inscribir:");
		AlumnoServicie alumno = new AlumnoServiceImpl();
		alumno.establecerbd(BD);
		MateriaService materia = new MateriaServiceImpl();
		materia.establecerbd(BD);
		// conexion con BD

		List<Alumno> alumnos = alumno.findAll(new Alumno(null, null, null));
		List<Materia> materias = materia.findAll(new Materia(null, null));
		for (Alumno aux : alumnos) {
			System.out.println(aux.getId() + " " + aux.getNombre() + " " + aux.getApellido() + " Matricula: "
					+ aux.getMatricula());
		}

		Integer opc = teclado.nextInt();
		// busqueda de alumno por ID:
		Alumno alumnoescogido = null;
		for (Alumno aux : alumnos) {
			if (opc.equals(aux.getId())) {
				alumnoescogido = alumno.findId(opc);
			}
		}

		System.out.println("Seleccione la Materia a inscribir para el alumno : " + alumnoescogido.getNombre() + " "
				+ alumnoescogido.getApellido());
		Materia materiaescogida = null;
		for (Materia aux : materias) {
			System.out.println(aux.getId() + " " + aux.getCurso() + " " + aux.getTurno());
		}
		opc = teclado.nextInt();
		for (Materia aux : materias) {
			if (opc.equals(aux.getId())) {
				materiaescogida = materia.findId(opc);
			}
		}

		AlumnoPorMateriaService inscripciones = new AlumnoPorMateriaServiceImpl();
		inscripciones.establecerbd(BD);

		inscripciones
				.save(new AlumnoPorMateria(getIdListaInscripciones(), materiaescogida.getId(), alumnoescogido.getId()));
		System.out.println("inscripcion exitosa!");
		inscripciones.findId(opc);
		getMenu();
	}

	public void getInscripcion(Scanner teclado) throws RegistroHaSidoBorrado {
		System.out.println("Digite el número identificador de la inscripción");
		Integer opc = teclado.nextInt();
		if(opc !=null) {
		AlumnoPorMateriaService inscripciones = new AlumnoPorMateriaServiceImpl();
		inscripciones.establecerbd(BD);

		AlumnoPorMateria inscripcion = inscripciones.findId(opc);
		if(inscripcion!= null) {
		System.out.println("La inscripcion [" + inscripcion.getId() + "] " + inscripcion.getIdMateria() + " - "
				+ inscripcion.getIdMatricula() + " corresponde a:");
		AlumnoServicie alumnos = new AlumnoServiceImpl();
		MateriaService materias = new MateriaServiceImpl();

		alumnos.establecerbd(BD);
		materias.establecerbd(BD);

		Alumno alum = alumnos.findId(inscripcion.getIdMatricula());
		Materia materia = materias.findId(inscripcion.getIdMateria());
		//generando error
		if(alum ==null || materia == null) {
			throw new RegistroHaSidoBorrado("Al parecer el alumno o la materia han sido eliminados, despues de hacer un registri de inscripcion.");
		}else {
			System.out.println("\n");
			System.out.println(alum.getNombre() + " " + alum.getApellido() + " Materia inscrita: " + materia.getCurso()
					+ " en la " + materia.getTurno() + "\n");
			getMenu();
		}
		
		}else {
			System.out.println("No se a encontrado registros");
			getMenu();
		}
		}else {
			System.out.println("Seleccion incorrecta.");
			getMenu();
		}
	}

	public Integer getIdListaAlumnos() {
		AlumnoServicie alumno = new AlumnoServiceImpl();
		alumno.establecerbd(BD);
		List<Alumno> alumnos = alumno.findAll(new Alumno(null, null, null));
		Integer newId = 0;
		for (Alumno aux : alumnos) {
			newId = aux.getId();
			// 4System.out.println(aux.getId());
		}
		return newId + 1;
	}

	public Integer getIdListaInscripciones() {
		AlumnoPorMateriaService inscripcion = new AlumnoPorMateriaServiceImpl();
		inscripcion.establecerbd(BD);
		List<AlumnoPorMateria> inscripciones = inscripcion.findAll(new AlumnoPorMateria(null, null, null));
		Integer newId = 0;
		for (AlumnoPorMateria aux : inscripciones) {
			newId = aux.getId();
			// 4System.out.println(aux.getId());
		}
		return newId + 1;
	}

	public void crearAlumno(Scanner teclado) {
		AlumnoServicie newAlumno = new AlumnoServiceImpl();
		newAlumno.establecerbd(BD);
		System.out.println("Ingrese el nombre del nuevo alumno:");
		String nombre = teclado.next();
		System.out.println("Ingrese el apellido del nuevo alumno:");
		String apellido = teclado.next();
		System.out.println("Ingrese el número de matricula:");
		Integer matricula = teclado.nextInt();
		System.out.println(getIdListaAlumnos());
		newAlumno.save(new Alumno(getIdListaAlumnos(), nombre, apellido, matricula));
		System.out.println("Registro exitoso.");
		getMenu();
	}
}
