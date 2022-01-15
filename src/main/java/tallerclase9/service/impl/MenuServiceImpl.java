package tallerclase9.service.impl;

import java.util.List;
import java.util.Scanner;

import tallerclase9.domain.Alumno;
import tallerclase9.domain.DatosDBMemoria;
import tallerclase9.domain.Materia;
import tallerclase9.service.AlumnoServicie;
import tallerclase9.service.MateriaService;

public class MenuServiceImpl {
	
	DatosDBMemoria BD = new DatosDBMemoria();
	public void getMenu() {
		int opc;
		Scanner teclado = new Scanner(System.in);
		Boolean loop=true;
		do {
			System.out.println("¿Que desea realizar?");
			System.out.println(" 1.Inscribir\n 2.Eliminar Inscripcion \n 3.Buscar Inscripcion \n 4.Crear Alumno");
			opc = teclado.nextInt();
			
			switch (opc) {
			case 1:
				inscribir(teclado);
				loop=false;
				break;
			case 2:
				loop=false;
				break;
			case 3:
				loop=false;
				break;
			case 4:
				crearAlumno();
				loop=false;
				break;
			default:
				loop=true;
				break;
			}
			
		}while(loop);
		
		
		
		
	}
	public void inscribir(Scanner teclado) {
		
		System.out.println("Seleccione el Alumno a inscribir:");
		AlumnoServicie alumno = new AlumnoServiceImpl();
		alumno.establecerbd(BD);
		MateriaService materia = new MateriaServiceImpl();
		materia.establecerbd(BD);
		//conexion con BD
		
		List<Alumno> alumnos = alumno.findAll(new Alumno(null, null, null));
		List<Materia> materias = materia.findAll(new Materia(null, null));
		for(Alumno aux: alumnos ) {
			System.out.println(aux.getId()+" "+aux.getNombre()+" "+aux.getApellido());
		}
		
		Integer idAlumno = teclado.nextInt();
		//busqueda de alumno por ID:
		for(Alumno aux: alumnos) {
			if(idAlumno.equals(aux.getId())) {
				alumno.findId(idAlumno);
			}
		}
		
		System.out.println("Seleccione la Materia a inscribir para el alumno : ");
		
		
		
		
	}
	public void crearAlumno() {
		AlumnoServicie newAlumno= new AlumnoServiceImpl();
		newAlumno.establecerbd(BD);
		newAlumno.save(new Alumno(8, "Juan", "Garcia", 56));
		inscribir(new Scanner(System.in));
	}
}
