package tallerclase41.Utilitarias;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

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
			this.nombre.equals("") || 
			this.apellido.equals("") ||
			this.documento.equals("") ||
			this.edad.equals(null) ||
			this.ocupacion.equals("") ||
			this.f_nacimiento.equals(null)
		) {
			
			return true;
		}else {
			return false;	
		}
		
		
		
	}
}
