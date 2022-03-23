package tallerclase11;

import java.util.Objects;

public class Idiomas{
	
	
	private String idiomaNuevo;
	
	
	public String getIdiomaNuevo() {
		return idiomaNuevo;
	}
	public void setIdiomaNuevo(String idiomaNuevo) {
		this.idiomaNuevo = idiomaNuevo;
	}
	@Override
	public int hashCode() {
		return Objects.hash(idiomaNuevo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Idiomas other = (Idiomas) obj;
		return Objects.equals(idiomaNuevo, other.idiomaNuevo);
	}
	
	
}
