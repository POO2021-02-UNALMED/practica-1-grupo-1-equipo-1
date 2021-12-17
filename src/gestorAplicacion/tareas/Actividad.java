package gestorAplicacion.tareas;

import gestorAplicacion.horario.Asignatura;

public class Actividad extends Tarea{
	
	String descripcion;
	
	public Actividad(String titulo, Asignatura asignatura, String fechaEntrega) {
		super(titulo, asignatura, fechaEntrega);
	}


	
	@Override
	void cambiarEstado() {
		this.estado = Estado.completada;
 	}
	
	
}
