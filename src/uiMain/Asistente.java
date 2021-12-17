package uiMain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import gestorAplicacion.horario.*;
import gestorAplicacion.tareas.*;

import BaseDatos.deserializador;

public class Asistente implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<Calendario> calendarios = new ArrayList<Calendario> ();
	private List<Planificador> planificadores = new ArrayList<Planificador> ();
	private List<Asignatura> asignaturas = new ArrayList<Asignatura> ();
	private List<Clase> clases = new ArrayList<Clase> ();
	private List<Dia> dias = new ArrayList<Dia> ();
	private List<Tarea> tareas = new ArrayList<Tarea> ();
	
	public Asistente() {
		deserializador.deserializar(this);
	}
	
	public Calendario crearCalendario(String nombre) {
		Calendario calen = new Calendario(nombre);
		calendarios.add(calen);
		return calen;
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
			if(calen.nombre.equals(nombre)) return calen;
		}
		return null;
	}
	
	public Planificador nuevoPlanificador(String nombre, ArrayList<Dia> dias) {
		Planificador plan = new Planificador(nombre, dias);
		planificadores.add(plan);
		return plan;
	}
	
	
	public Planificador nuevoPlanificador(String nombre) {
		Planificador plan = new Planificador(nombre);
		planificadores.add(plan);
		return plan;
	}
	
	public Planificador nuevoPlanificador(ArrayList<Dia> dias) {
		Planificador plan = new Planificador(dias);
		planificadores.add(plan);
		return plan;
	}
	
	public Planificador buscarPlanificador(int id) {
		Iterator<Planificador> iterator = planificadores.iterator();
		while (iterator.hasNext()) {
			Planificador plan = (Planificador) iterator.next();
			if(plan.getId() == id) return plan;
		}
		return null;
	}
	
	public Asignatura nuevaAsignatura(String profesor, String nombre) {
		Asignatura asig = new Asignatura(profesor, nombre);
		asignaturas.add(asig);
		return asig;
	}
	
	public Asignatura buscarAsignatura(String nombre) {
		Iterator<Asignatura> iterator = asignaturas.iterator();
		while (iterator.hasNext()) {
			Asignatura asig = (Asignatura) iterator.next();
			if(asig.nombre.equals(nombre)) return asig;
		}
		return null;
	}
	
	public Clase nuevaClase(String Inicio, String Fin, Dia dia, Asignatura asig) {
		Clase clase = new Clase(Inicio, Fin, dia, asig);
		clases.add(clase);
		return clase;
	}
	
	public Clase buscarClase(int id) {
		Iterator<Clase> iterator = clases.iterator();
		while (iterator.hasNext()) {
			Clase clase = (Clase) iterator.next();
			if(clase.id == id) return clase;
		}
		return null;
	}
	
	public Dia nuevoDia(String etiqueta, ArrayList<Tarea> tareas, String fecha) {
		Dia dia = new Dia(etiqueta, tareas, fecha);
		dias.add(dia);
		return dia;
	}
	
	public Dia nuevoDia(ArrayList<Tarea> tareas, String fecha) {
		Dia dia = new Dia(tareas, fecha);
		dias.add(dia);
		return dia;
	}
	
	public Dia nuevoDia(String etiqueta, String fecha, int plan) {
		Dia dia = new Dia(etiqueta, fecha);
		for(int i=0;i<planificadores.size();i++) {
			if(planificadores.get(i).getId()==plan) {
				planificadores.get(i).agregarDia(dia);
				System.out.println(planificadores.get(i).getDias().size());
			}
		}
		dias.add(dia);
		return dia;
	}
	
	
	public Dia buscarDia(String etiqueta) {
		Iterator<Dia> iterator = dias.iterator();
		while (iterator.hasNext()) {
			Dia dia = (Dia) iterator.next();
			if(dia.etiqueta.equals(etiqueta)) return dia;
		}
		return null;
	}
	
	public void ingresarDia(Dia dia, int plan) {
		
	}
	
	
	public Proyecto nuevoProyecto(String titulo, Asignatura asig, String fecha) {
		Proyecto proy = new Proyecto(titulo, asig, fecha);
		tareas.add(proy);
		return proy;
	}
	
	public Tarea buscarTarea(String titulo) {
		Iterator<Tarea> iterator = tareas.iterator();
		while (iterator.hasNext()) {
			Tarea t = (Tarea) iterator.next();
			if(t.titulo.equals(titulo)) return t;
		}
		return null;		
	}
	
	public void dividirTarea(Proyecto proy, int numero) {
		proy.dividirTarea(numero);
	}
	
	public void nuevaNota(String titulo, String descripcion, Tarea tarea) {
		tarea.agregarNota(titulo, descripcion);
		
	}
	
	
	public void mostrarCalendarios() {
		String mostrar="-------------------------\n";
		for(int i=0;i<this.calendarios.size();i++) {

			Calendario cal = calendarios.get(i);
			
			mostrar+=cal.getNombre()+"\n";
			for(int j=0;j<cal.getPlanificadores().size();j++) {
				Planificador plan = cal.getPlanificadores().get(j);
				mostrar+="--"+plan.toString()+"\n";
				System.out.println(plan.getDias().size());
				for(int k=0;k<plan.getDias().size();k++) {
					Dia dia=plan.getDias().get(k);
					mostrar+="----"+dia.getEtiqueta()+"\n";
				}
			}
			
		
			
		}
		System.out.println(mostrar);
	}
	
	
	
	
	
	public List<Calendario> getCalendarios(){
		return  calendarios;
	}

	public List<Planificador> getPlanificadores() {
		// TODO Auto-generated method stub
		return planificadores;
	}

	public List<Dia> getDias() {
		return dias;
	}
	public List<Asignatura> getAsignaturas() {
		return asignaturas;
	}
	public List<Clase> getClases() {
		return clases;
	}
	public List<Tarea> getTareas() {
		return tareas;
	}
	
	
	
	
	
	
	public void setCalendarios(List<Calendario> readObject) {
		this.calendarios = readObject;
		Calendario.calendarios = (ArrayList<Calendario>) readObject;
	}

	public void setPlanificadores(List<Planificador> readObject) {
		this.planificadores = readObject;
	}
	public void setAsignaturas(List<Asignatura> readObject) {
		this.asignaturas = readObject;
	}
	public void setClases(List<Clase> readObject) {
		this.clases = readObject;
	}
	public void setDias(List<Dia> readObject) {
		this.dias = readObject;
	}
	public void setTareas(List<Tarea> readObject) {
		this.tareas = readObject;
	}
	


}