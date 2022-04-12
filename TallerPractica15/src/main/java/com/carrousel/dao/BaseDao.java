package com.carrousel.dao;

import java.util.Collection;

public interface BaseDao <T> {
	
	
	public Collection<T> findAll() throws Exception;
	
	public Boolean update(T entity) throws Exception;
}
