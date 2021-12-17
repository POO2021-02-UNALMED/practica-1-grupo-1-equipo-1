package gestorAplicacion.tareas;
import java.io.Serializable;

public class Nota implements Serializable{	
	String titulo;
	String decripcion;
	
	public Nota(String titulo, String descripcion){
		this.titulo=titulo;
		this.decripcion=descripcion;
	}
}
