package tallerclase9.dao;

import java.util.List;

import tallerclase9.domain.DatosDBMemoria;

public interface GenericDao<T> {
//CRUDL
	public void save (T entity);
	
	public T findId (Integer id);
	
	public void update (T entity);
	
	public void delete (T entity);
	
	public List findAll (T entity);
	
	public void establecerbd(DatosDBMemoria<T> BD);
	
}
 