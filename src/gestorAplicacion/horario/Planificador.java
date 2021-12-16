package gestorAplicacion.horario;

import java.util.ArrayList;

//Con los objetos de esta clase los calendarios manejan las tareas asignadas a los dias

public class Planificador {
	private static int generadorId = 0; //ayuda a llevar una cuenta de los objetos creados(atributo de clase) para asignar una Id distinta a todos automaticamente
	private final int id; //id UNICA para reconocer el planificador
	private String nombre; //nombre que el usuario quiera darle
	private ArrayList<Dia> dias; //dias en los que el usuario necesita tener sus tareas
	
	public Planificador(String nombre, ArrayList<Dia> dias) {
		//constructor con todos los atributos
		this.id = generadorId ; //El ID se genera segun se vallan creando los objetos
		this.nombre = nombre;
		this.dias = dias;
		generadorId += 1; //cada que se crea un objeto este modifica el metodo de clase generadorId
	}
	
	public Planificador(ArrayList<Dia> dias) {
		//constructor con nombre por defecto
		this("Lista de Tareas", dias);
	}
	
	public void posponerTarea(int dia, int tarea) {
		this.dias.get(dia).tareas.get(tarea).cambiarEstado();
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
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String toString() {
		return "Planificador: " + this.nombre + " ID: " + this.id;
	}
}