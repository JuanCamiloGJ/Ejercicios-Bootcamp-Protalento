package tallerclase41.service;

import java.util.List;


import tallerclase41.domain.Persona;

public interface PersonaService {
	public List<Persona>findAll();
	public Boolean create(Persona persoan);
	public Boolean update(Persona persona);
	public Boolean delete(Integer idPersona);
	public Persona findById(Integer idPersona);
}
