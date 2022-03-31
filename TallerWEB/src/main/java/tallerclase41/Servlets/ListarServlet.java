package tallerclase41.Servlets;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tallerclase41.domain.Persona;
import tallerclase41.service.PersonaService;
import tallerclase41.service.impl.PersonaServiceImpl;

@WebServlet("/ListarServlet")
public class ListarServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PersonaService persona = new PersonaServiceImpl();
		
		List<Persona> personas = persona.findAll();
		Map<Integer, Persona> personasMap = new LinkedHashMap<>();
		for(Persona aux: personas) {
			personasMap.put(aux.getDocumento(), aux);
		}
		
		req.setAttribute("listadoPersonas", personasMap);
		getServletContext().getRequestDispatcher("/listar.jsp").forward(req, resp);
	}
}
