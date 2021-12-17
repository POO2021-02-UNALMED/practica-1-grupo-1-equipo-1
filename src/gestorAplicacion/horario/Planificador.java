package gestorAplicacion.horario;

import java.util.ArrayList;

//Con los objetos de esta clase los calendarios manejan las tareas asignadas a los dias

public class Planificador {
	private static int generadorId = 0; //ayuda a llevar una cuenta de los objetos creados(atributo de clase) para asignar una Id distinta a todos automaticamente
	public final int id; //id UNICA para reconocer el planificador
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
	
	public Planificador(String nombre){
		this.nombre = nombre;
		this.id = generadorId;
		this.dias = new ArrayList<Dia>();
		generadorId+=1;
	}
	
	public void posponerTarea(String dia, String tarea, String fecha) {
		for(int i= 0; i < dias.size(); i++) {
			if(dias.get(i).getEtiqueta() == dia) {
				Dia d = dias.get(i);
				for(int j= 0; j < d.getTareas().size(); i++) {
					if(d.getTareas().get(j).titulo == tarea) {
						d.getTareas().get(j).setFechaEntrega(fecha);
						return;
					}
				}
			}
		}
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

	public ArrayList<Float> medidorCarga() {
		final int mult = 3;
		ArrayList<Float> params = new ArrayList<Float>();
		for(Dia d : dias) {
			float dayLoad = (float)d.tareas.size();
			String dateS[] = d.getFecha().split("-");
			int date = Integer.parseInt(dateS[0]) + Integer.parseInt(dateS[1])*31 + Integer.parseInt(dateS[2])*30*12;
			for(Dia d_ : dias) {
				if(d != d_) {
					String dateS_[] = d_.getFecha().split("-");
					int date_ = Integer.parseInt(dateS_[0]) + Integer.parseInt(dateS_[1])*31 + Integer.parseInt(dateS_[2])*30*12;
					if(date_ >= date) {
						dayLoad = dayLoad + (float)mult*((float)d_.tareas.size())/(((float)date_ - (float)date + 1.0f)*((float)date_ - (float)date + 1.0f));
					}
				}
			}
			params.add(dayLoad);
		}
		return params;
	}

	public float medidorCarga(String fecha) {
		final int mult = 3;
		float dayLoad = 0.0f;
		String dateS[] = fecha.split("-");
		int date = Integer.parseInt(dateS[0]) + Integer.parseInt(dateS[1])*31 + Integer.parseInt(dateS[2])*30*12;
		for(Dia d_ : dias) {
			String dateS_[] = d_.getFecha().split("-");
			int date_ = Integer.parseInt(dateS_[0]) + Integer.parseInt(dateS_[1])*31 + Integer.parseInt(dateS_[2])*30*12;
			if(date_ >= date) {
				dayLoad = dayLoad + (float)mult*((float)d_.tareas.size())/(((float)date_ - (float)date + 1.0f)*((float)date_ - (float)date + 1.0f));
			}
		}
		return dayLoad;
	}
	
	public String toString() {
		return "Planificador: " + this.nombre + " ID: " + this.id;
	}
}