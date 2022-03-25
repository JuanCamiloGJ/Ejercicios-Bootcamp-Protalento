package tallerclase41;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import tallerclase41.domain.Persona;

public class UsoConexion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
		Date f_nacimiento = new Date();
		try {
			this.f_nacimiento = formato.parse(req.getParameter("fechanacimiento"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Persona pj  = new Persona("pedro", "diaz", "jardinero", 35, 12345678, new);
	}

}
