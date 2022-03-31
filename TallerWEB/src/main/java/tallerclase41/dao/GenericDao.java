package tallerclase41.dao;

import java.util.List;

import tallerclase41.domain.Persona;

public interface GenericDao<T> {
	
	public List<T>findAll();
	public Boolean create(T persoan);
	public Boolean update(T persona);
	public Boolean delete(Integer idPersona);
	public Persona findById(Integer idPersona);
}
