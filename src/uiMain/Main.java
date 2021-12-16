package uiMain;

import java.util.Scanner;

import gestorAplicacion.horario.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static long readlong () {
		return sc.nextLong();
	}
	
	static String readln () {
		sc.nextLine ();
		return sc.nextLine ();
	}
	
	public static void main (String args[]) {
		Asistente asist = new Asistente();
		int opcion;
		
		do {
			System.out.println("¿Que operacion desea realizar?");
			System.out.println(" 1: Nuevo Calendario");
			System.out.println(" 2: Nuevo Planificador");
			System.out.println(" 3:");
			System.out.println(" 4");
			System.out.println(" 5");
			System.out.println(" 6");
			System.out.println(" 7");
			System.out.println(" 8");
			opcion = (int) readlong ();
			
			switch (opcion) {
				case 1: nuevoCalendario (asist) ;break;
				case 2:;break;
				
			}
		} while (opcion != 0);
	}
	
	static void nuevoCalendario(Asistente asist) {
		System.out.print ("Nombre del calendario: ");
		String nombre = readln();
		System.out.print("inserte numero de planificadores: ");
		int x = (int) readlong();
		
		for(int i = 0; i < x+1; i ++) {
			System.out.print ("Insertar Id del planificador: ");
			int id = (int) readlong();
			Planificador plan = asist.buscarPlanificador(id);
		}
	}
}
