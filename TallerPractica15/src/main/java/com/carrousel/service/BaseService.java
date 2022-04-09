package com.carrousel.service;

import java.util.Collection;

public interface BaseService <T>{
	public Collection<T> findAll() throws Exception;
}
