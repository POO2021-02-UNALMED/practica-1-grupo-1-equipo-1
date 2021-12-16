package uiMain;

import java.util.ArrayList;
import java.util.List;
import gestorAplicacion.horario.*;
import gestorAplicacion.tareas.*;

public class Asistente {
	private List<Calendario> calendarios = new ArrayList<Calendario> ();
	private List<Planificador> planificadores = new ArrayList<Planificador> ();
	private List<Asignatura> asignaturas = new ArrayList<Asignatura> ();
	private List<Clase> clases = new ArrayList<Clase> ();
	private List<Dia> dias = new ArrayList<Dia> ();
	private List<Tarea> tareas = new ArrayList<Tarea> ();
	private List<Nota> notas = new ArrayList<Nota> ();
	
	public Asistente() {
		
	}
	
	public Calendario nuevoCalendario(String nombre, ArrayList<Planificador> planificadores, ArrayList<Clase> clases) {
		Calendario calen = new Calendario(nombre, planificadores, clases);
		calendarios.add(calen);
		return calen;
	}
}
