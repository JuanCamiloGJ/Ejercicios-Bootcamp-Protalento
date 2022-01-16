package tallerclase9.dao.impl;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import tallerclase9.dao.GenericDao;
import tallerclase9.domain.Alumno;
import tallerclase9.domain.AlumnoPorMateria;
import tallerclase9.domain.DatosDBMemoria;
import tallerclase9.domain.Entity;
import tallerclase9.domain.Materia;

public class JDBCDaoBase<T extends Entity> implements GenericDao<T> {
	
	protected Class<T> clazz;
	protected DatosDBMemoria<T> BD;
	public JDBCDaoBase() {
		this.clazz = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
		
	}
	public void establecerbd(DatosDBMemoria<T> BD) {
		this.BD=BD;
	}
	@Override
	public void save(T entity) {
		// TODO Auto-generated method stub
		
		
		BD.setRegistro(entity);
		
		
		
	}

	@Override
	public T findId(Integer id) {
		// TODO Auto-generated method stub
		return BD.findId(id, clazz);
	}

	@Override
	public void update(T entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(T entity) {
		// TODO Auto-generated method stub
		BD.delete(entity);
	}

	@Override
	public List findAll(T entity) {
		// TODO Auto-generated method stub
		
		return BD.findAll(entity);
	}

}
