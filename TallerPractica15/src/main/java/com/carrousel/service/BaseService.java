package com.carrousel.service;

import java.util.Collection;

import com.carrousel.domain.Imagen;

public interface BaseService <T>{
	public Collection<T> findAll() throws Exception;
	Boolean update(T entity) throws Exception;
}
