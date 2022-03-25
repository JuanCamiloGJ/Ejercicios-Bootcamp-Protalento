package tallerclase41.service.impl;

import java.util.List;

import tallerclase41.dao.PersonaDao;
import tallerclase41.dao.impl.PersonaDaoImpl;
import tallerclase41.domain.Persona;
import tallerclase41.service.PersonaService;

public class PersonaServiceImpl implements PersonaService {
	PersonaDao persona = new PersonaDaoImpl();
	@Override
	public List<Persona> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean create(Persona persoan) {
		// TODO Auto-generated method stub
		return persona.create(persoan);
	}

	@Override
	public Boolean update(Persona persona) {
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
