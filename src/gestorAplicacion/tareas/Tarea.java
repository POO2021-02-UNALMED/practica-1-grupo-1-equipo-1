package gestorAplicacion.tareas;
import gestorAplicacion.horario.Asignatura; 

import java.util.ArrayList;

public abstract class Tarea {
	 String titulo;
	 Asignatura asignatura;
	 String fechaEntrega;
	 Estado estado;
	 ArrayList<Nota> notas;
	 
	 
	 void cambiarEstado() {}
	 void agregarNota() {}
	 void editarNota() {}
	 void dividirTarea() {}
	 
}
 