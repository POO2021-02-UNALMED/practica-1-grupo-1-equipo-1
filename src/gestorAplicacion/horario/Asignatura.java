package gestorAplicacion.horario;
import java.util.ArrayList;
import java.io.Serializable;

public class Asignatura implements Serializable{
    private String profesor;
    public String nombre;

    public Asignatura(String profesor, String nombre) {
        this.profesor = profesor;
        this.nombre = nombre;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
}
