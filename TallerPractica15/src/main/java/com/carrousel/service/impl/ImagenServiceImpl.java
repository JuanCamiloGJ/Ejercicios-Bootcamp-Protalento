package com.carrousel.service.impl;

import java.util.Collection;

import com.carrousel.dao.ImagenDao;
import com.carrousel.dao.impl.ImagenDaoImpl;
import com.carrousel.domain.Imagen;
import com.carrousel.service.ImagenService;

public class ImagenServiceImpl implements ImagenService, ImagenDao {
	ImagenDao img = new ImagenDaoImpl();
	@Override
	public Collection<Imagen> findAll() throws Exception {
		// TODO Auto-generated method stub
		return img.findAll();
	}

}
