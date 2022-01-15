package tallerclase9.domain;

import java.util.Objects;

public class Materia implements Entity {
    private Integer id;
	private String curso;
	private String turno;
	
	public Materia(Integer id, String curso, String turno) {
		this.id = id;
		this.curso = curso;
		this.turno = turno;
	}
	
	
	public Materia(String curso, String turno) {
		this.curso = curso;
		this.turno = turno;
	}


	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public String getTurno() {
		return turno;
	}
	public void setTurno(String turno) {
		this.turno = turno;
	}


	@Override
	public int hashCode() {
		return Objects.hash(id);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Materia other = (Materia) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
}
