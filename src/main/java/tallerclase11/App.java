package tallerclase11;

import java.util.ArrayList;
import java.util.LinkedList;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona pj1= new Persona("Español", "Juan");
		
		pj1.aprenderNuevoIdioma("Español");//la collection HashSet no agrega idiomas iguales
		pj1.aprenderNuevoIdioma("Ingles");
		pj1.aprenderNuevoIdioma("Español");
		
		System.out.println("Hola soy: "+pj1.getNombre() +" y hablo estos idiomas: ");
		pj1.getIdiomas();
		System.out.println("Mi idioma Nativo es el: " +pj1.getIdiomaNativo() +"\n \n");
		
		Persona pj2= new Persona("Frances", "Camilo");
		pj2.aprenderNuevoIdioma("Español");
		pj2.aprenderNuevoIdioma("Ingles");
		
		System.out.println("Hola soy: "+pj2.getNombre() +" y hablo estos idiomas: ");
		pj2.getIdiomas();
		System.out.println("Mi idioma Nativo es el: " +pj2.getIdiomaNativo() +"\n \n");
		
		Persona pj3= new Persona("Italiano", "Pedro");
		pj3.aprenderNuevoIdioma("Frances");
		pj3.aprenderNuevoIdioma("Ingles");
		
		System.out.println("Hola soy: "+pj3.getNombre() +" y hablo estos idiomas: ");
		pj3.getIdiomas();
		System.out.println("Mi idioma Nativo es el: " +pj3.getIdiomaNativo() +"\n \n");
		
		ArrayList<Persona> grupo1= new ArrayList<Persona>();
		grupo1.add(pj1);
		grupo1.add(pj2);
		grupo1.add(pj3);
		System.out.println("\n\n Estas perosnas hablan Ingles:");
		quienesHablanEsteIdioma(grupo1, "Ingles");
		System.out.println("\n\n Estas perosnas hablan Frances:");
		quienesHablanEsteIdioma(grupo1, "frances");
		
	}

	private static void quienesHablanEsteIdioma(ArrayList<Persona> grupo, String idioma) {
		for(Persona aux: grupo) {
			
			if(aux.getIdiomaEspecifico(idioma).equalsIgnoreCase(idioma)) {
				System.out.println(aux.getNombre());
			}
		}
	}

}
