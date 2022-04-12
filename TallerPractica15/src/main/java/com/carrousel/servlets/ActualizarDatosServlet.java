package com.carrousel.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.carrousel.domain.Imagen;
import com.carrousel.service.ImagenService;
import com.carrousel.service.impl.ImagenServiceImpl;
@WebServlet("/ActualizarDatosServlet")
public class ActualizarDatosServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Integer id = Integer.parseInt(req.getParameter("id"));
		String url = (String) req.getParameter("url");
		String descripcion = (String) req.getParameter("des");
		boolean activo = (Boolean.parseBoolean(req.getParameter("act")));
		
		if(url.isEmpty() || url.isBlank() || descripcion.isEmpty() || descripcion.isBlank()) {
			req.setAttribute("error", "Los campos url y descripcion no pueden estar vacios.");
			getServletContext().getRequestDispatcher("/ListadoImagenesServlet").forward(req, resp);
		}else {
			
			Imagen img = new Imagen(id, descripcion, url, activo);
			
			ImagenService imagen = new ImagenServiceImpl();
			try {
				imagen.update(img);
				req.setAttribute("succes", "La imagen con ID: " +img.getId()+ " a sido modificada.");
				getServletContext().getRequestDispatcher("/ListadoImagenesServlet").forward(req, resp);
			} catch (Exception e) {
				req.setAttribute("error", e.getMessage());
				getServletContext().getRequestDispatcher("/ListadoImagenesServlet").forward(req, resp);
			}
			
			
		}
	
	}
	
}
