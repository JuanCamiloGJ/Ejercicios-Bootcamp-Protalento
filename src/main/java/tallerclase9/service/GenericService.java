package tallerclase9.service;

import java.util.List;

public interface GenericService<T> {
//CRUDL
	public void save (T entity);
	
	public T findId (Integer id);
	
	public void update (T entity);
	
	public void delete (T entity);
	
	public List findAll (T entity);
	
}
 