package tallerclase9.domain;

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

	@Override
	public Integer getId() {
		// TODO Auto-generated method stub
		return id;
	}

	@Override
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
	
	

}
