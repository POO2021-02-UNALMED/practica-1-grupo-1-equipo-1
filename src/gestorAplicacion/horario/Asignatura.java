package gestorAplicacion.horario;
import java.util.ArrayList;

public class Asignatura {
    private String profesor;
    private String nombre;
    private ArrayList<Clase> clases;

    public Asignatura(String profesor, String nombre, ArrayList<Clase> clases) {
        this.profesor = profesor;
        this.nombre = nombre;
        this.clases = clases;
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

    public ArrayList<Clase> getClases() {
        return clases;
    }

    public void addClase(Clase clase) {//Agrega un objeto clase al arrayList clases
        clases.add(clase);
    }
}
