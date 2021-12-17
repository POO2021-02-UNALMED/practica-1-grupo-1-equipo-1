package gestorAplicacion.horario;

import java.util.ArrayList;
import java.io.Serializable;

import gestorAplicacion.tareas.Tarea;

//En los objetos de esta clase se guardaran las tareas a realizar durante este dia

public class Dia implements Serializable{
	public String etiqueta; //nombre-descripcion que el usuario quiera dar al dia EJ: "Dia de trabajo"
	protected ArrayList<Tarea> tareas; //lista de tareas correspondiente al dia
	private String fecha;
	
	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public Dia(String etiqueta, ArrayList<Tarea> tareas) { //constructor con etiqueta y tarea
		this.etiqueta = etiqueta;
		this.tareas = tareas;
	}
	
	public Dia(ArrayList<Tarea> tareas) { //contructor con etiqueta por defecto
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
	
	public ArrayList<Tarea> getTareas() { 
		return this.tareas;
	}
}