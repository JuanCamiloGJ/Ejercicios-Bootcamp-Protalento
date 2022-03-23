package tallerclase9.service.impl;

import java.util.List;

import tallerclase9.dao.GenericDao;
import tallerclase9.domain.DatosDBMemoria;
import tallerclase9.service.GenericService;

public class AbstractBaseService<T> implements GenericService<T> {
	protected GenericDao<T> genericDao;
	protected DatosDBMemoria<T> BD;

	
	
	
	public AbstractBaseService(GenericDao<T> genericDao) {
		this.genericDao = genericDao;
	}
	public void establecerbd(DatosDBMemoria<T> BD) {
		genericDao.establecerbd(BD);
	}
	
	public void save(T entity) {
		// TODO Auto-generated method stub
		genericDao.save(entity);
	}


	public T findId(Integer id) {
		// TODO Auto-generated method stub
		
		return genericDao.findId(id);
	}

	
	public void update(T entity) {
		// TODO Auto-generated method stub
		genericDao.update(entity);
	}

	
	public void delete(T entity) {
		// TODO Auto-generated method stub
		genericDao.delete(entity);
	}

	
	public List findAll(T entity) {
		// TODO Auto-generated method stub
		return genericDao.findAll(entity);
	}

}
