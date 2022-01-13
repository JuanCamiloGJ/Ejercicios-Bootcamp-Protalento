package tallerclase9.service.impl;


import tallerclase9.dao.impl.AlumnoPorMateriaDaoImpl;
import tallerclase9.domain.AlumnoPorMateria;
import tallerclase9.service.AlumnoPorMateriaService;

public class AlumnoPorMateriaServiceImpl extends AbstractBaseService<AlumnoPorMateria> implements AlumnoPorMateriaService {

	public AlumnoPorMateriaServiceImpl() {
		super(new AlumnoPorMateriaDaoImpl());
		// TODO Auto-generated constructor stub
	}

	

}
