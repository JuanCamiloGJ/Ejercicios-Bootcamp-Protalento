package tallerclase9.service.impl;


import tallerclase9.dao.impl.AlumnoDaoImpl;
import tallerclase9.domain.Alumno;
import tallerclase9.service.AlumnoServicie;

public class AlumnoServiceImpl extends AbstractBaseService<Alumno> implements AlumnoServicie {

	public AlumnoServiceImpl() {
		super(new AlumnoDaoImpl());
		// TODO Auto-generated constructor stub
	}


}
