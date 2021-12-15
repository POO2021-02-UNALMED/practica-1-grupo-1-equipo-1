package gestorAplicacion.tareas;
import gestorAplicacion.horario.Asignatura; 

import java.util.ArrayList;

public abstract class Tarea {
	 String titulo;
	 Asignatura asignatura;
	 String fechaEntrega;
	 
	 public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Asignatura getAsignatura() {
		return asignatura;
	}
	public void setAsignatura(Asignatura asignatura) {
		this.asignatura = asignatura;
	}
	public String getFechaEntrega() {
		return fechaEntrega;
	}
	public void setFechaEntrega(String fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	public ArrayList<Nota> getNotas() {
		return notas;
	}
	public void setNotas(ArrayList<Nota> notas) {
		this.notas = notas;
	}
	Estado estado;
	 ArrayList<Nota> notas;
	 
	 
	 void cambiarEstado() {}
	 void agregarNota() {}
	 void editarNota() {}
	 void dividirTarea() {}
	 
}
 