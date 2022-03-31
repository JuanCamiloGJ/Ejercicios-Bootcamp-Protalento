package tallerclase41.service.impl;

import java.util.List;

import tallerclase41.dao.OcupacionDao;
import tallerclase41.dao.impl.OcupacionDaoImpl;
import tallerclase41.domain.Ocupacion;
import tallerclase41.domain.Persona;
import tallerclase41.service.OcupacionService;

public class OcupacionServiceImpl implements OcupacionService {
	
	OcupacionDao ocupacion = new OcupacionDaoImpl();
	@Override
	public List<Ocupacion> findAll() {
		// TODO Auto-generated method stub
		return ocupacion.findAll();
	}

	@Override
	public Boolean create(Ocupacion persoan) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean update(Ocupacion persona) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean delete(Integer idPersona) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Persona findById(Integer idPersona) {
		// TODO Auto-generated method stub
		return null;
	}

}
