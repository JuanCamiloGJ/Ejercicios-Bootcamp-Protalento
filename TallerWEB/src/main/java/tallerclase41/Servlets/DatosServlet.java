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
import tallerclase41.service.PersonaService;
import tallerclase41.service.impl.PersonaServiceImpl;

@WebServlet("/DatosServlet")
public class DatosServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.getWriter().print("Hola funciona");
		CargarValidar validar = new CargarValidar(req);
		PersonaService persona = new PersonaServiceImpl();
		System.out.println((String)req.getParameter("nombre"));
		Persona nuevapersona =null;		
			try {
				//validar.getPersona, me retorna un obj persona.
				nuevapersona = validar.getPersona();

			} catch (Exception e) {
				System.err.println("Hay un dato vacio - Error");
				getServletContext().getRequestDispatcher("/error.jsp").forward(req, resp);
				
			}
			Boolean estado = persona.create(nuevapersona);
			if( estado ) {
				System.out.println("Registro insertado");
				getServletContext().getRequestDispatcher("/success.jsp").forward(req, resp);					
			}else {
				System.err.println("Ha ocurrido un error");
				getServletContext().getRequestDispatcher("/error.jsp").forward(req, resp);
			}
			
		}
		
		
		
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//resp.getWriter().print("Hola funciona");
	}
}
