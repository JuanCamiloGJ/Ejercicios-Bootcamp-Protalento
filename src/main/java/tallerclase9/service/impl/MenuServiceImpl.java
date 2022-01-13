package tallerclase9.service.impl;

import java.util.Scanner;

public class MenuServiceImpl {
	public void getMenu() {
		int opc;
		Scanner teclado = new Scanner(System.in);
		Boolean loop=true;
		do {
			System.out.println("¿Que desea realizar?");
			System.out.println(" 1.Inscribir\n 2.Eliminar Inscripcion \n 3.Buscar Inscripcion");
			opc = teclado.nextInt();
			
			switch (opc) {
			case 1:
				loop=false;
				break;
			case 2:
				loop=false;
				break;
			case 3:
				loop=false;
				break;
			default:
				loop=true;
				break;
			}
			
		}while(loop);
		
		
		
		
	}
}
