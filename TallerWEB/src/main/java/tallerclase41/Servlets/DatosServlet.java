package tallerclase41.Servlets;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tallerclase41.Utilitarias.CargarValidar;
import tallerclase41.domain.Persona;

@WebServlet("/DatosServlet")
public class DatosServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.getWriter().print("Hola funciona");
		CargarValidar validar = new CargarValidar(req);
		System.out.println((String)req.getParameter("nombre"));
				
			try {
				validar.getPersona();
				System.out.println("Registro insertado");
				getServletContext().getRequestDispatcher("/success.jsp").forward(req, resp);
			} catch (Exception e) {
				System.err.println("Hay un dato vacio - Error");
				getServletContext().getRequestDispatcher("/error.jsp").forward(req, resp);
				
			}
			
		}
		
		
		
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//resp.getWriter().print("Hola funciona");
	}
}
