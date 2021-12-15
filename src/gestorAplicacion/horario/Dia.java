package gestorAplicacion.horario;

import java.util.ArrayList;

import gestorAplicacion.tareas.Tarea;

public class Dia {
	private String etiqueta; //nombre-descripcion que el usuario quiera dar al dia EJ: "Dia de trabajo"
	protected ArrayList<Tarea> tareas; //lista de tareas correspondiente al dia
	
	public Dia() {
		//constructor vacio, los atributos se pueden cambiar con sus get y set
	}
	
	public Dia(String etiqueta, ArrayList<Tarea> tareas) {
		//constructor con etiqueta y tarea
		this.etiqueta = etiqueta;
		this.tareas = tareas;
	}
	
	public Dia(ArrayList<Tarea> tareas) {
		//contructor con etiqueta por defecto
		this("Dia", tareas);
	}
	
	public void setEtiqueta(String etiqueta) {
		this.etiqueta = etiqueta;
	}
	
	public String getEtiqueta() {
		return etiqueta;
	}
	
	public void setTareas(ArrayList<Tarea> tareas) {
		this.tareas = tareas;
	}
	
	public ArrayList<Tarea> getTareas() { //imprime el titulo de las todas los objetos Tarea asociadas al objeto Dia
		return this.tareas;
	}
}