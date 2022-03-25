package tallerclase41.Utilitarias;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import tallerclase41.domain.Persona;

public class CargarValidar {
	
	private String nombre = null;
	private String apellido = null;
	private String documento = null;
	private String edad = null;
	private String ocupacion = null;
	private Date f_nacimiento = new Date();
	
	public CargarValidar(HttpServletRequest req) {
		
		this.nombre = req.getParameter("nombre");
		this.apellido = req.getParameter("apellido");
		this.documento = req.getParameter("documento");
		this.edad = req.getParameter("edad");
		this.ocupacion = req.getParameter("ocupacion");
		SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
		
		try {
			this.f_nacimiento = formato.parse(req.getParameter("fechanacimiento"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println(nombre +" "+ apellido +" "+ documento +" "+ edad+" "+ ocupacion+" "+ f_nacimiento);
		
	}
	
	public Boolean isEmpty() {
		
		
		if(
			this.nombre.isBlank() || 
			this.apellido.isBlank()||
			this.documento.isBlank() ||
			this.edad.isBlank() ||
			this.ocupacion.isBlank() ||
			this.f_nacimiento.equals(null)
		) {
			
			return true;
		}else {
			return false;	
		}
		
		
		
	}
	
	public Persona getPersona() throws Exception {
		Persona persona = null;
		if(!this.isEmpty()) {
			persona = new Persona(nombre, apellido, ocupacion, Integer.parseInt(edad) , Integer.parseInt(documento), f_nacimiento);
		}else {
			throw new Exception("La persona tiene datos vacios o null");
		}
		
		return persona;
	}
}
