package gestorAplicacion.tareas;
import gestorAplicacion.horario.Asignatura; 

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Tarea {
	 public String titulo;
	 Asignatura asignatura;
	 String fechaEntrega;
	 Estado estado=Estado.asignada;
	 ArrayList<Nota> notas;
	 
	 Tarea(String titulo, Asignatura asignatura, String fechaEntrega){
		 this.titulo = titulo;
		 this.asignatura= asignatura;
		 this.fechaEntrega = fechaEntrega;
	 }
	 
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
	
	 
	 
	 abstract void cambiarEstado();
	 
	 
	 void agregarNota(String titulo, String descripcion) {
		 notas.add(new Nota(titulo, descripcion));
	 }
		
}
	 

 