package tallerclase6;

public class Alumno {
	
	
	public Alumno(int cantidadExamenes) {
		// TODO Auto-generated constructor stub
		nombre="";
		apellido="";
		notaAlumno=0.0;
		numeroExamen=0;
		this.cantidadExamenes= new double[cantidadExamenes];
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getNumeroExamen() {
		return numeroExamen;
	}
	public void setNumeroExamen(int numeroExamen) {
		this.numeroExamen = numeroExamen;
	}
	public double getNotaAlumno() {
		return notaAlumno;
	}
	public void setNotaAlumno(double notaAlumno) {
		this.notaAlumno = notaAlumno;
	}
	
	public double[] getCantidadExamenes() {
		return cantidadExamenes;
	}
	public void setCantidadExamenes(double[] cantidadExamenes) {
		this.cantidadExamenes = cantidadExamenes;
	}

	private String nombre, apellido;
	private int numeroExamen;
	private double notaAlumno;
	private double [] cantidadExamenes;
}
