package tallerclase41.Servlets;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tallerclase41.Utilitarias.CargarValidar;

@WebServlet("/DatosServlet")
public class DatosServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.getWriter().print("Hola funciona");
		CargarValidar validar = new CargarValidar(req);
		System.out.println((String)req.getParameter("nombre"));
		if(validar.isEmpty()) {
			
		}else {
			
		}
		
		
		
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//resp.getWriter().print("Hola funciona");
	}
}
