package com.carrousel.servlets;

import java.io.IOException;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.carrousel.domain.Imagen;
import com.carrousel.service.ImagenService;
import com.carrousel.service.impl.ImagenServiceImpl;
@WebServlet("/ListadoImagenesServlet")
public class ListadoImagenesServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ImagenService imagenes = new ImagenServiceImpl();
		
		try {
			Collection<Imagen> imgcoll = imagenes.findAll();
			
			req.setAttribute("imagenes", imgcoll);
			
			getServletContext().getRequestDispatcher("/tabla.jsp").forward(req, resp);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getServletContext().getRequestDispatcher("/index.jsp").forward(req, resp);
			e.printStackTrace();
		}
	
		
	
	}
}
