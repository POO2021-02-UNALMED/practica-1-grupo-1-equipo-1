package uiMain;

import java.util.ArrayList;
import BaseDatos.Serializador;
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
			System.out.println(" 1: Crear Calendario");
			System.out.println(" 2: Crear Planificador");
			System.out.println(" 3: Crear Asignatura");
			System.out.println(" 4: Crear Clase");
			System.out.println(" 5: Crear Proyecto");
			System.out.println(" 6: Crear Dia");
			System.out.println(" 7: Dividir tarea");
			System.out.println(" 8: Agregar nota");
			System.out.println(" 9: Mostrar calendarios");
			System.out.println(" 10: Terminar");
			opcion = (int) readlong ();
			
			switch (opcion) {
				case 1: nuevoCalendario (asist) ; break;
				case 2: nuevoPlanificador (asist); break;
				case 3: nuevaAsignatura (asist); break;
				case 4: nuevaClase (asist); break;
				case 5: nuevoProyecto (asist); break;
				case 6: nuevoDia (asist); break;
				case 7: dividirProyecto(asist); break;
				case 8: crearNota(asist); break;
				case 9: mostrarCalendarios(asist);break;
				case 10: salirDelSistema(asist); break;
			}
		} while (opcion != 0);
	}
	
	static void nuevoCalendario(Asistente asist) {
		System.out.print ("Nombre del calendario: ");
		String nombre = readln();
		System.out.print("Inserte el numero de planificadores a agregar: ");
		int x = (int) readlong();
		if(x==0) {
			asist.crearCalendario(nombre);
			return;
		}
		
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
		
		for(int i = 0; i < c+1; i ++) {
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
		
		if(x==0) {
			Planificador plan = asist.nuevoPlanificador(nombre);
			
			System.out.println("Inserte el nombre del calendario al que desea ingresar este planeador");
			String nombreCalendario = readln();
			Calendario calen = asist.buscarCalendario(nombreCalendario);
			calen.agregarPlanificador(plan);
			return;
		}
		
		
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
		
		asist.nuevaAsignatura(prof, nombre);
	}
	
	static void nuevaClase(Asistente asist) {
		System.out.print ("Hora de inicio: ");
		String inicio = readln();
		System.out.print ("Hora de fin: ");
		String fin = readln();
		System.out.print ("Etiqueta del dia: ");
		String etiquetaDia = readln();
		
		Dia dia = asist.buscarDia(etiquetaDia);
		
		System.out.print ("Ingrese nombre de la asignatura asociada: ");
		String asig = readln();
		Asignatura as = asist.buscarAsignatura(asig);
		
		Clase clase = asist.nuevaClase(inicio, fin, dia, as);
		
		System.out.println("Ingrese el nombre del calendario al que quieres asignarle esta clase");
		String calen = readln();
		
		Calendario calendario = asist.buscarCalendario(calen);
		calendario.agregarClase(clase);
	}
	
	
	
	
	static void nuevoProyecto(Asistente asist) {
		System.out.print ("Titulo del proyecto: ");
		String titulo = readln();
		System.out.print ("Nombre de la Asignatura a la que pertenece el proyecto: ");
		String nombre = readln();
		Asignatura asig = asist.buscarAsignatura(nombre);
		System.out.print ("Fecha de entrega del proyecto: ");
		String fecha =  readln();
		
		
		Proyecto proy = asist.nuevoProyecto(titulo, asig, fecha);
		
		
		System.out.println("Ingrese la etiqueta del dia al que desea ingresar el proyecto");
		
		String nombreDia = readln();
		
		asist.buscarDia(nombreDia).agregarTarea(proy);
		
	}
	
	
	static void nuevoDia(Asistente asist) {
		System.out.print ("Etiqueta o nombre del dia (para nombre por defecto escribir def): ");
		String etiqueta = readln();
		System.out.println("Ingrese la fecha del dia");
		String fecha = readln();
		System.out.print("Inserte el numero de tareas agregar: ");
		int x = (int) readlong();
		
		if(x==0) {
			System.out.println("Inserte el id del planificador al que desea ingresar este dia");
			int nombrePlanificador = (int)readlong();
			
			asist.nuevoDia(etiqueta, fecha, nombrePlanificador);
			return;
		
			
		}
		
		
		ArrayList<Tarea> tareas = new ArrayList<Tarea> ();
		
		for(int i = 0; i < x+1; i ++) {
			System.out.print ("Insertar titulo de la tarea: ");
			String titulo = readln();
			Tarea tarea = asist.buscarTarea(titulo);
			tareas.add(tarea);
		}
		if(etiqueta != "def") {
			asist.nuevoDia(etiqueta, tareas, fecha);
		} else {
			asist.nuevoDia(tareas, fecha);
		}
	}
	
	static void dividirProyecto(Asistente asist) {
		System.out.println("Inserte el titulo del proyecto que quiera dividir");
		String tituloProy = readln();
		System.out.println("Inserte el número de actividades en las que quiere dividir el proyecto:");
		int numeroDivisiones = (int)readlong();
		
		Tarea proyecto = asist.buscarTarea(tituloProy);
		
		asist.dividirTarea((Proyecto)proyecto, numeroDivisiones);	
	}
	
	static void crearNota(Asistente asist) {
		System.out.println("Inserte el titulo de la nota que desea crear:");
		String titulo = readln();
		System.out.println("Ingrese la descripcion de la nota");
		String descripcion = readln();
		
		System.out.println("Inserte el titulo de la tarea a la que quiere ingresar la nota");
		String tituloTarea = readln();
		
		
		Tarea tarea = asist.buscarTarea(tituloTarea);
		asist.nuevaNota(titulo, descripcion, tarea);
		
	}
	
	static void mostrarCalendarios(Asistente asist) {
		asist.mostrarCalendarios();
		
	}
	
	private static void salirDelSistema(Asistente asist) {
		System.out.println("Vualva pronto");
		Serializador.serializar(asist);
		System.exit(0);
	}
	
	
}
