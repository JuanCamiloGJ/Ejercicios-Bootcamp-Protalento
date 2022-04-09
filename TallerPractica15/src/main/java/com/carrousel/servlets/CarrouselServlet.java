package com.carrousel.servlets;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.carrousel.domain.Imagen;
import com.carrousel.service.ImagenService;
import com.carrousel.service.impl.ImagenServiceImpl;
@WebServlet("/CarrouselServlet")
public class CarrouselServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ImagenService imagen = new ImagenServiceImpl();
		Collection<Imagen> imagenes = new ArrayList<>();
		try {
			imagenes = imagen.findAll();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(imagenes != null || imagenes.isEmpty()) {
		 req.setAttribute("imagenes", imagenes);
		 getServletContext().getRequestDispatcher("/index.jsp").forward(req, resp);
		}else {
		req.setAttribute("imagenes", imagenes);
		getServletContext().getRequestDispatcher("/index.jsp").forward(req, resp);
		}
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doPost(req, resp);
	}
}
