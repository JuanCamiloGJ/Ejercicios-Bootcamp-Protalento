package tallerclase9.domain;

import java.util.Objects;

public class AlumnoPorMateria implements Entity {
	private Integer id;
	private Integer idMateria;
	private Integer idMatricula;
	
	
	public AlumnoPorMateria(Integer idMateria, Integer idMatricula) {
		this.idMateria = idMateria;
		this.idMatricula = idMatricula;
	}
	
	public AlumnoPorMateria(Integer id, Integer idMateria, Integer idMatricula) {
		this.id = id;
		this.idMateria = idMateria;
		this.idMatricula = idMatricula;
	}

	public Integer getId() {
		// TODO Auto-generated method stub
		return id;
	}

	public void setId(Integer id) {
		// TODO Auto-generated method stub
		this.id = id;
	}

	public Integer getIdMateria() {
		return idMateria;
	}

	public void setIdMateria(Integer idMateria) {
		this.idMateria = idMateria;
	}

	public Integer getIdMatricula() {
		return idMatricula;
	}

	public void setIdMatricula(Integer idMatricula) {
		this.idMatricula = idMatricula;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, idMateria, idMatricula);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AlumnoPorMateria other = (AlumnoPorMateria) obj;
		return Objects.equals(id, other.id) && Objects.equals(idMateria, other.idMateria)
				&& Objects.equals(idMatricula, other.idMatricula);
	}
	
	

}
