package tallerclase9.dao.impl;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import tallerclase9.dao.GenericDao;
import tallerclase9.domain.Entity;

public class JDBCDaoBase<T extends Entity> implements GenericDao<T> {
	
	protected Class<T> clazz;
	
	public JDBCDaoBase() {
		this.clazz = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	}

	@Override
	public void save(T entity) {
		// TODO Auto-generated method stub
		System.out.println("funciona!");
	}

	@Override
	public T findId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(T entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(T entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List findAll(T entity) {
		// TODO Auto-generated method stub
		return null;
	}

}
