package gestorAplicacion.horario;

import java.util.ArrayList;

import gestorAplicacion.tareas.Tarea;

public class Planificador {
	private final int id; //id UNICA para reconocer el planificador
	private String nombre; //nombre que el usuario quiera darle
	private ArrayList<Dia> dias; //numero de dias que el usuario necesita para su planificacion
	
	public Planificador(int id, String nombre, ArrayList<Dia> dias) {
		//constructor con todos los atributos
		this.id = id;
		this.nombre = nombre;
		this.dias = dias;
	}
	
	public Planificador(int id, ArrayList<Dia> dias) {
		//constructor con nombre por defecto
		this(id, "Lista de Tareas", dias);
	}
	
	public void posponerTarea(int dia, int tarea, String fecha) {
		
	}
	
	public void agregarDia(Dia dia) {
		this.dias.add(dia);
	}
	
	public ArrayList<Dia> getDias() {
		return dias;
	}
	
	public int getId() {
		return id;
	}
	
}