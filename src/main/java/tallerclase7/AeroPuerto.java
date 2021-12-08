package tallerclase7;

import tallerclase7.interfaces.Aterrizable;

public class AeroPuerto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ATENCIÓN!! Hay 4 objetos pendientes para el aterrizaje. para aterrizar deben identificarse. \n");
		Avion obj1 = new Avion("Avión Comercial", 700.6, "Blanco", "Boeing 787", 789);
		Helicoptero obj2 = new Helicoptero("Helicoptero privado", 320.5, "Black", "Bell Helicopter");
		Ovni obj3 = new Ovni("Ovni de otro Planeta", 4000.5, "Gris");
		SuperMan obj4 = new SuperMan("SuperMan", 800.0, "Clark Kent");
		
		Object [] voladores = new Object[]{obj1,obj2,obj3,obj4};
		
		for(Object aux: voladores) {
			
			if(aux instanceof Aterrizable) {
				
				System.out.println("Hola me reporto soy,"+aux.toString()+"\n");
			}else {
				System.out.println("Hola me reporto soy,"+aux.toString()+ " NO TENGO PERMISOS PARA ATERRIZAR");
			}
		}
		
	}

}
