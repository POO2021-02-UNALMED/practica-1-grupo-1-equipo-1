package gestorAplicacion.horario;

import java.util.ArrayList;

public class Planificador {
	private static int generadorId = 0; //ayuda a llevar una cuenta de los objetos creados(atributo de clase)
	private final int id; //id UNICA para reconocer el planificador
	private String nombre; //nombre que el usuario quiera darle
	private ArrayList<Dia> dias; //numero de dias que el usuario necesita para su planificacion
	
	public Planificador(String nombre, ArrayList<Dia> dias) {
		//constructor con todos los atributos
		this.id = generadorId + 1; //El ID se genera segun se vallan creando los objetos
		this.nombre = nombre;
		this.dias = dias;
		generadorId += 1;
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
}