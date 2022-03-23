package tallerclase9.aplicacion;

import tallerclase9.domain.Alumno;
import tallerclase9.service.AlumnoServicie;
import tallerclase9.service.impl.AlumnoServiceImpl;

public class FuncionDao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alumno estu = new Alumno("pedro", "gacria", 5);
		
		
		AlumnoServicie service= new AlumnoServiceImpl();
		
		service.save(estu);
	}

}
