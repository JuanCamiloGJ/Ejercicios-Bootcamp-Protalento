package tallerclase9.aplicacion;

import java.util.List;

import tallerclase9.domain.Alumno;
import tallerclase9.domain.DatosDBMemoria;
import tallerclase9.domain.Materia;

public class PruebBaseDatosCodigo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DatosDBMemoria bd= new DatosDBMemoria();
		
		bd.setRegistro(new Alumno(8, "Pedro", "Ponte", 34));
		List<Alumno> listaalumnos= bd.getBdAlumnos();
		for(Alumno e : listaalumnos) {
			System.out.println(e.getNombre());
		}
		List<Materia> listaMaterias = bd.getBdMaterias();
		
		for(Materia e: listaMaterias) {
			System.out.println(e.getCurso()+"  "+ e.getTurno());
		}
	}

}
