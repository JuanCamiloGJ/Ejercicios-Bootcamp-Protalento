package tallerclase6;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Escuela {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		// creamos array con posiciones determinadas por usuario
		System.out.println("Ingrese la cantidad de alumnos a procesar:");

		validarEntero(entrada);

		Alumno[] alumnos = new Alumno[entrada.nextInt()];
		// pedimos la cantidad de notas que se tomaron
		System.out.println("Ingrese cuantos examenes realizó a los alumnos.");
		validarEntero(entrada);
		int cantExamenes = entrada.nextInt();

		System.out.println("-----------INGRESE LOS DATOS DEL ALUMNO--------");

		for (int i = 0; i < alumnos.length; i++) {

			Alumno dataAlumno = new Alumno(cantExamenes);

			System.out.println("Ingrese el nombre del alumno");
			dataAlumno.setNombre(entrada.next());

			System.out.println("Ingrese el apellido del alumno");
			dataAlumno.setApellido(entrada.next());

			boolean condicion = true;

			double[] notasAlumno = dataAlumno.getCantidadExamenes();

			for (int j = 0; j < dataAlumno.getCantidadExamenes().length; j++) {

				while (condicion) {
					System.out.println("Ingrese la nota que obtuvo el alumno en el examen: " + (j + 1) + " (0 - 10)");

					validarNota(entrada);

					double nota = entrada.nextDouble();

					if (nota >= 0 && nota <= 10) {

						notasAlumno[j] = nota;
						condicion = false;

					}
				}
				condicion = true;

			}

			dataAlumno.setCantidadExamenes(notasAlumno);

			alumnos[i] = dataAlumno;
		}

		encuentraNotas(alumnos);// encuentra las notas más altas y más bajas por examen

		alumnosPromocionan(alumnos);// promedia las notas de los examanes y promociona o no dependiendo el promedio
									// de cada estudiante
		entrada.close();
	}

	private static void alumnosPromocionan(Alumno[] alumnos) {
		String listaPromocionados = "";
		String listaNoPromocionados = "";
		for (int i = 0; i < alumnos.length; i++) {
			Alumno alumnoPromocion = alumnos[i];
			double[] notasAlumno = alumnoPromocion.getCantidadExamenes();
			double promedioAlumno = 0.0;
			for (int j = 0; j < notasAlumno.length; j++) {// suma todas las notas
				promedioAlumno += notasAlumno[j];
			}
			promedioAlumno = (promedioAlumno / notasAlumno.length);// promedio

			if (promedioAlumno >= 7) {// promociona
				listaPromocionados += "El Alumno: " + alumnoPromocion.getNombre() + " " + alumnoPromocion.getApellido()
						+ " tiene un promedio de " + new DecimalFormat("#.0").format(promedioAlumno)
						+ " por lo cual Promociona la materia. \n";
			} else {// no promociona
				listaNoPromocionados += "El Alumno: " + alumnoPromocion.getNombre() + " "
						+ alumnoPromocion.getApellido() + " tiene un promedio de "
						+ new DecimalFormat("#.0").format(promedioAlumno) + " por lo cual NO Promociona la materia. \n";
			}
		}
		System.out.println(
				"-------------------------------------ALUMNOS QUE PROMOCIONAN------------------------------------");
		System.out.println(listaPromocionados);
		System.out.println(
				"-------------------------------------ALUMNOS QUE NO PROMOCIONAN---------------------------------");
		System.out.println(listaNoPromocionados);
	}

	private static void encuentraNotas(Alumno[] alumnos) {
		double notaMenorAlumnos = 10;
		double notaMayorAlumnos = 0;
		String nombreAlumnoMenor = "";
		String nombreAlumnoMayor = "";
		System.out.println("-------------------------NOTAS DE CADA EXAMEN-----------------------");
		for (int i = 0; i < alumnos[0].getCantidadExamenes().length; i++) {

			for (int j = 0; j < alumnos.length; j++) {
				// obtiene el array de notas de un alumno en la posicion j del array alumnos
				double[] notasAlumno = alumnos[j].getCantidadExamenes();
				// identifica la menor nota por examen y quienes tuvieron dicha nota
				if (notasAlumno[i] <= notaMenorAlumnos) {//

					if (notaMenorAlumnos > notasAlumno[i]) {

						nombreAlumnoMenor = "";

					}

					notaMenorAlumnos = notasAlumno[i];

					nombreAlumnoMenor += alumnos[j].getNombre() + ", ";

				}

				// identifica la mayor nota por examen y quienes tuvieron dicha nota
				if (notasAlumno[i] >= notaMayorAlumnos) {

					if (notaMayorAlumnos < notasAlumno[i]) {

						nombreAlumnoMayor = "";

					}

					notaMayorAlumnos = notasAlumno[i];

					nombreAlumnoMayor += alumnos[j].getNombre() + ", ";

				}

			}
			System.out.println("----------------------------EXAMEN " + (i + 1) + " ---------------------------");
			System.out.println("El alumno con la nota más alta del examen " + (i + 1) + " es: " + nombreAlumnoMayor
					+ " con: " + notaMayorAlumnos);
			System.out.println("El alumno con la nota más baja del examen " + (i + 1) + " es: " + nombreAlumnoMenor
					+ " con: " + notaMenorAlumnos);

			notaMenorAlumnos = 10;
			notaMayorAlumnos = 0;

		}

	}

	private static void validarNota(Scanner entrada) {
		while (!entrada.hasNextDouble()) {
			System.out.println("Valor no valido");
			entrada.next();
			System.out.println("Ingrese un numero entero o decimal positivo. Ejemplo (1,0 - 2,0 - 3,0 ... 9,10)");
		}
	}

	private static void validarEntero(Scanner entrada) {
		while (!entrada.hasNextInt()) {
			System.out.println("Valor no valido");
			entrada.next();
			System.out.println("Ingrese un numero entero positivo. Ejemplo (1,2,3...10)");
		}
	}

}
