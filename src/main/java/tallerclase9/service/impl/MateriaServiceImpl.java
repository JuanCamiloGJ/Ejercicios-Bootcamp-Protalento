package tallerclase9.service.impl;


import tallerclase9.dao.impl.MateriaDaoImpl;
import tallerclase9.domain.Materia;
import tallerclase9.service.MateriaService;

public class MateriaServiceImpl extends AbstractBaseService<Materia> implements MateriaService {

	public MateriaServiceImpl() {
		super(new MateriaDaoImpl());
		// TODO Auto-generated constructor stub
	}


}
