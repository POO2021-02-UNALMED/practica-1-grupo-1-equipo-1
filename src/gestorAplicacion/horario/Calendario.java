package gestorAplicacion.horario;

import java.util.ArrayList;

import gestorAplicacion.tareas.Tarea;

public class Calendario {
	private String nombre;
	private ArrayList<Planificador> planificadores;
	private ArrayList<Clase> clases;
	
	
	public Calendario(String nombre, ArrayList<Planificador> planificadores, ArrayList<Clase> clases) {
		this.nombre = nombre;
		this.planificadores = planificadores;
		this.clases = clases;
		
	}
	
	public void agregarTarea(int pl, int dia, Tarea tarea) { // pl: posicion planificador en la lista, dia: posicion dia en la lista, tarea: tarea a agregar
		planificadores.get(pl).getDias().get(dia).tareas.add(tarea);
	}
	
	public void reagendarTarea(int pl, int dia, int tarea, String fecha) { //fecha: nueva fecha de entrega de la tarea
		planificadores.get(pl).getDias().get(dia).tareas.get(tarea).setFechaDeEntrega(fecha);
		this.planificadores.get(pl).posponerTarea(dia, tarea);
	}
	
	public void agregarClase(Clase cl) { //cl: clase a agregar
		clases.add(cl);
	}
	
	public void reagendarClase(int cl, String inicio, String Fin) { //cl: posicion de la clase en la lista, inicio:nueva hora inicio, fin:nueva hora fin
		clases.get(cl).setHoraInicio(inicio);
		clases.get(cl).setHoraFin(Fin);
	}
	
	public void reagendarClase(int cl, String inicio, String Fin, String dia) { //sobrecarga de reagendarClase para cambiar tambien su atributo dia
		clases.get(cl).setHoraInicio(inicio);
		clases.get(cl).setHoraFin(Fin);
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
	
	public ArrayList<Planificador> getPlanificadores() {
		return planificadores;
	}
	
	public void setClases(ArrayList<Clase> clases) {
		this.clases = clases;
	}
	
	public ArrayList<Clase> getClases() {
		return clases;
	}
}

//metodo de clase: mis calendarios, imprime el nombre de calendario con sus planificadores y nombre de las tareas (idea)