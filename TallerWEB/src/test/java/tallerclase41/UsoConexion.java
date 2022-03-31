package tallerclase41;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import tallerclase41.domain.Persona;
import tallerclase41.service.GenericService;
import tallerclase41.service.impl.PersonaServiceImpl;

public class UsoConexion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
		Date f_nacimiento = new Date();
		try {
			f_nacimiento = formato.parse("2022-05-27");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Persona pj  = new Persona("pedro", "diaz", "jardinero", 35, 12345678, f_nacimiento);

		GenericService persona = new PersonaServiceImpl();
		persona.create(pj);
		System.out.println("Registro exitoso");
		
	}

}
