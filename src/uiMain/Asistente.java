package uiMain;

import java.util.ArrayList;
import java.util.Iterator;
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
	
	public Calendario buscarCalendario(String nombre) {
		Iterator<Calendario> iterator = calendarios.iterator();
		while (iterator.hasNext()) {
			Calendario calen = (Calendario) iterator.next();
			if(calen.nombre == nombre) return calen;
		}
		return null;
	}
	
	public Planificador nuevoPlanificador(String nombre, ArrayList<Dia> dias) {
		Planificador plan = new Planificador(nombre, dias);
		planificadores.add(plan);
		return plan;
	}
	
	public Planificador nuevoPlanificador(ArrayList<Dia> dias) {
		Planificador plan = new Planificador(dias);
		planificadores.add(plan);
		return plan;
	}
	
	public Planificador buscarCalendario(int id) {
		Iterator<Planificador> iterator = planificadores.iterator();
		while (iterator.hasNext()) {
			Planificador plan = (Planificador) iterator.next();
			if(plan.id == id) return plan;
		}
		return null;
	}
	
	public Asignatura nuevaAsignatura(String profesor, String nombre, ArrayList<Clase> clases) {
		Asignatura asig = new Asignatura(profesor, nombre, clases);
		asignaturas.add(asig);
		return asig;
	}
	
	public Asignatura buscarAsignatura(String nombre) {
		Iterator<Asignatura> iterator = asignaturas.iterator();
		while (iterator.hasNext()) {
			Asignatura asig = (Asignatura) iterator.next();
			if(asig.nombre == nombre) return asig;
		}
		return null;
	}
	
	public Clase nuevaClase(String Inicio, String Fin, String dia) {
		Clase clase = new Clase(Inicio, Fin, dia);
		clases.add(clase);
		return clase;
	}
	
	public Clase buscarClase(String dia, String inicio, String fin) {
		Iterator<Clase> iterator = clases.iterator();
		while (iterator.hasNext()) {
			Clase clase = (Clase) iterator.next();
			if(clase.dia == dia && clase.horaInicio == inicio && clase.horaFin == fin) return clase;
		}
		return null;
	}
	
	public Dia nuevoDia(String etiqueta, ArrayList<Tarea> tareas) {
		Dia dia = new Dia(etiqueta, tareas);
		dias.add(dia);
		return dia;
	}
	
	public Dia nuevoDia(ArrayList<Tarea> tareas) {
		Dia dia = new Dia(tareas);
		dias.add(dia);
		return dia;
	}
	
	public Dia buscarDia(String etiqueta) {
		Iterator<Dia> iterator = dias.iterator();
		while (iterator.hasNext()) {
			Dia dia = (Dia) iterator.next();
			if(dia.etiqueta == etiqueta) return dia;
		}
		return null;
	}
	
	public Proyecto nuevoProyecto() {
		Proyecto proy = new Proyecto();
		tareas.add(proy);
		return proy;
	}
	
	public Actividad nuevaActividad() {
		Actividad act = new Actividad();
		tareas.add(act);
		return act;
	}
	
	public Tarea buscarTarea(String titulo) {
		Iterator<Tarea> iterator = tareas.iterator();
		while (iterator.hasNext()) {
			Tarea t = (Tarea) iterator.next();
			if(t.titulo == titulo) return t;
		}
		return null;		
	}
	
	public String listaCalendarios() {
		Iterator<Calendario> iterator = calendarios.iterator();
		StringBuffer lista = new StringBuffer ();
		while (iterator.hasNext()) {
			Calendario calen = (Calendario) iterator.next();
			lista.append (calen.toString() + "\n");
		}
		return lista.toString();
	}
}
