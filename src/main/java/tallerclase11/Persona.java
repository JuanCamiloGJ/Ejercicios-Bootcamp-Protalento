package tallerclase11;

import java.util.HashSet;

public class Persona extends Idiomas {
	private String nombre;
	private String idiomaNativo;
	private HashSet<Idiomas> idiomasConocidos = new HashSet<Idiomas>();

	public Persona(String idiomaNativo, String nombre) {

		this.nombre = nombre;
		this.idiomaNativo = idiomaNativo;
		// TODO Auto-generated constructor stub
		Idiomas idioma = new Idiomas();
		idioma.setIdiomaNuevo(idiomaNativo);
		idiomasConocidos.add(idioma);
	}

	public String getNombre() {
		return nombre;
	}

	public String getIdiomaNativo() {
		return idiomaNativo;
	}

	public void aprenderNuevoIdioma(String idiomaNuevo) {
		Idiomas nuevoIdioma = new Idiomas();
		nuevoIdioma.setIdiomaNuevo(idiomaNuevo);

		idiomasConocidos.add(nuevoIdioma);
	}

	public void getIdiomas() {

		for (Idiomas aux : idiomasConocidos) {
			System.out.println(aux.getIdiomaNuevo());
		}
	}

	public String getIdiomaEspecifico(String idiom) {
		for (Idiomas aux : idiomasConocidos) {
			if (aux.getIdiomaNuevo().equalsIgnoreCase(idiom)) {
				return aux.getIdiomaNuevo();
			}
		}
		return "";

	}

}
