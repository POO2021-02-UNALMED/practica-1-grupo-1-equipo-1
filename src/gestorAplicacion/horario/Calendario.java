package gestorAplicacion.horario;

import java.util.ArrayList;
import java.io.Serializable;

import gestorAplicacion.tareas.Tarea;

//Esta clase es la base de toda la aplicacion puesto que de aqui es donde se implementan la mayoria de funcionalidades

public class Calendario implements Serializable{
	
	
	private static final long serialVersionUID = -5027714557234026572L;
	public String nombre;
	private ArrayList<Planificador> planificadores;
	private ArrayList<Clase> clases;
	public static ArrayList<Calendario> calendarios=new ArrayList<Calendario>();
	public Calendario(String nombre, ArrayList<Planificador> planificadores, ArrayList<Clase> clases) {
		this.nombre = nombre;
		this.planificadores = planificadores;
		this.clases = clases;
		calendarios.add(this);
	}
	
	public Calendario(String nombre) {
		this.nombre=nombre;
		this.planificadores = new ArrayList<Planificador>(); 
		this.clases = new ArrayList<Clase>();
		calendarios.add(this);
	}
	
	
	public static String mostrarCalendarios() {
		
		String mostrar="--------------------\n\n";
		for(int i=0; i<calendarios.size();i++) {
			mostrar+=calendarios.get(i).getNombre()+"\n";
			
			for(int j=0; j<calendarios.get(i).planificadores.size();j++) {
				mostrar+="--"+ calendarios.get(i).planificadores.get(j).toString() + "\n";
				System.out.println(calendarios.get(i).planificadores.get(j).getDias().size());
				mostrar+=calendarios.get(i).planificadores.get(j).mostrarDias();
			}
			mostrar+="\n----------------\n\n";
		}
		
		
		
		return mostrar;
	}
	
	public void agregarTarea(int pl, int dia, Tarea tarea) { // pl: posicion planificador en la lista, dia: posicion dia en la lista, tarea: tarea a agregar
		planificadores.get(pl).getDias().get(dia).tareas.add(tarea);
	}
	
	public void reagendarTarea(int pl, int dia, int tarea, String fecha) { //fecha: nueva fecha de entrega de la tarea
		planificadores.get(pl).getDias().get(dia).tareas.get(tarea).setFechaEntrega(fecha);
	}
	
	public void agregarClase(Clase cl) { //cl: clase a agregar
		clases.add(cl);
	}
	
	public void reagendarClase(int cl, String inicio, String fin) { //cl: posicion de la clase en la lista, inicio:nueva hora inicio, fin:nueva hora fin
		clases.get(cl).setHoraInicio(inicio);
		clases.get(cl).setHoraFin(fin);
	}
	
	public void reagendarClase(int cl, String inicio, String fin, Dia dia) { //sobrecarga de reagendarClase para cambiar tambien su atributo dia
		clases.get(cl).setHoraInicio(inicio);
		clases.get(cl).setHoraFin(fin);
		clases.get(cl).setDia(dia);
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setPlanificadores(ArrayList<Planificador> planificadores) {
		this.planificadores = planificadores;
	}
	
	public void agregarPlanificador(Planificador plan) {
		this.planificadores.add(plan);
	}
	
	public ArrayList<Planificador> getPlanificadores() {
		return planificadores;
	}
	
	public void setClases(ArrayList<Clase> clases) {
		this.clases = clases;
	}
	
	public ArrayList<Clase> getClases() {
		return clases;
	}
	
	public String toString() {
		return this.nombre;
	}
}

//metodo de clase: mis calendarios, imprime el nombre de calendario con sus planificadores y nombre de las tareas (idea)