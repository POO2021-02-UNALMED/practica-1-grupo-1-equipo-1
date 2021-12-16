package uiMain;

import java.util.ArrayList;
import java.util.Scanner;

import gestorAplicacion.horario.*;
import gestorAplicacion.tareas.*;

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
			System.out.println("¿Que operacion deseas realizar?");
			System.out.println(" 0: Salir del programa");
			System.out.println(" 1: Crear Calendario");
			System.out.println(" 2: Crear Planificador");
			System.out.println(" 3: Crear Asignatura");
			System.out.println(" 4: Crear Clase");
			System.out.println(" 5: Crear Proyecto");
			System.out.println(" 6: Crear Dia");
			System.out.println(" 7: ");
			System.out.println(" 8:");
			opcion = (int) readlong ();
			
			switch (opcion) {
				case 1: nuevoCalendario (asist) ; break;
				case 2: nuevoPlanificador (asist); break;
				case 3: nuevaAsignatura (asist); break;
				case 4: nuevaClase (asist); break;
				case 5: nuevoProyecto (asist); break;
				case 6: nuevoDia (asist); break;

			}
		} while (opcion != 0);
	}
	
	static void nuevoCalendario(Asistente asist) {
		System.out.print ("Nombre del calendario: ");
		String nombre = readln();
		System.out.print("Inserte el numero de planificadores a agregar: ");
		int x = (int) readlong();
		ArrayList<Planificador> plans = new ArrayList<Planificador> ();
		
		for(int i = 0; i < x+1; i ++) {
			System.out.print ("Insertar Id del planificador que deseas agregar: ");
			int id = (int) readlong();
			Planificador plan = asist.buscarPlanificador(id);
			plans.add(plan);
		}
		
		System.out.print ("Inserte numero de clases: ");
		int c = (int) readlong();
		ArrayList <Clase> clase = new ArrayList<Clase> ();
		
		for(int i = 0; i < x+1; i ++) {
			System.out.print ("Insertar Id de la clase que deseas agregar: ");
			int id = (int) readlong();
			Clase cl = asist.buscarClase(id);
			clase.add(cl);
		}
		
		asist.nuevoCalendario(nombre, plans, clase);
	}
	
	static void nuevoPlanificador(Asistente asist) {
		System.out.print ("Nombre del planificador(para nombre por defecto escribe def): ");
		String nombre = readln();
		System.out.print("Inserte numero de dias a agregar: ");
		int x = (int) readlong();
		ArrayList<Dia> dias = new ArrayList<Dia> ();
		
		for(int i = 0; i < x+1; i ++) {
			System.out.print ("Insertar nombre del dia que deseas agregar: ");
			String nom = readln();
			Dia dia = asist.buscarDia(nom);
			dias.add(dia);
		}
		
		if(nombre != "def") {
			asist.nuevoPlanificador(nombre, dias);
		} else {
			asist.nuevoPlanificador(dias);
		}
	}
	
	static void nuevaAsignatura(Asistente asist) {
		System.out.print ("Nombre del profesor: ");
		String prof = readln();
		System.out.print ("Nombre de la asignatura: ");
		String nombre = readln();
		System.out.print("Inserte numero de dias a agregar: ");
		int x = (int) readlong();
		ArrayList<Clase> clases = new ArrayList<Clase> ();
		
		for(int i = 0; i < x+1; i ++) {
			System.out.print ("Insertar Id de la clase que deseas agregar: ");
			int id = (int) readlong();
			Clase clase = asist.buscarClase(id);
			clases.add(clase);
		}
		
		asist.nuevaAsignatura(prof, nombre, clases);
	}
	
	static void nuevaClase(Asistente asist) {
		System.out.print ("Hora de inicio: ");
		String inicio = readln();
		System.out.print ("Hora de fin: ");
		String fin = readln();
		System.out.print ("Dia de la clase(nombre del dia): ");
		String dia =  readln();
		
		asist.nuevaClase(inicio, fin, dia);
	}
	
	static void nuevoProyecto(Asistente asist) {
		System.out.print ("Titulo del proyecto: ");
		String titulo = readln();
		System.out.print ("Nombre de la Asignatura a la que pertenece el proyecto: ");
		String nombre = readln();
		Asignatura asig = asist.buscarAsignatura(nombre);
		System.out.print ("Fecha de entrega del proyecto: ");
		String fecha =  readln();
		
		asist.nuevoProyecto(titulo, asig, fecha);
	}
	
	static void nuevoDia(Asistente asist) {
		System.out.print ("Etiqueta o nombre del dia (para nombre por defecto escribir def): ");
		String etiqueta = readln();
		System.out.print("Inserte el numero de tareas agregar: ");
		int x = (int) readlong();
		ArrayList<Tarea> tareas = new ArrayList<Tarea> ();
		
		for(int i = 0; i < x+1; i ++) {
			System.out.print ("Insertar titulo de la tarea: ");
			String titulo = readln();
			Tarea tarea = asist.buscarTarea(titulo);
			tareas.add(tarea);
		}
		if(etiqueta != "def") {
			asist.nuevoDia(etiqueta, tareas);
		} else {
			asist.nuevoDia(tareas);
		}
	}
}
