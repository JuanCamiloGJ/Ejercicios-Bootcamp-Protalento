package tallerclase9.aplicacion;

import java.util.List;

import tallerclase9.domain.Alumno;
import tallerclase9.domain.DatosDBMemoria;

public class PruebBaseDatosCodigo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DatosDBMemoria bd= new DatosDBMemoria();
		List<Alumno> listaalumnos= bd.getBdAlumnos();
		for(Alumno e : listaalumnos) {
			System.out.println(e.getNombre());
		}
	}

}
