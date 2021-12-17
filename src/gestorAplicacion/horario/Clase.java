package gestorAplicacion.horario;
import java.io.Serializable;

public class Clase implements Serializable{
	private static int generadorId = 0;
	public final int id;
    public String horaInicio;
    public String horaFin;
    public Dia dia;
    private Asignatura asignatura;

    public Asignatura getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }

    public Clase(String horaInicio, String horaFin, Dia dia, Asignatura asignatura) {
    	int x = generadorId;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.dia = dia;
        this.id = x;
        this.asignatura = asignatura;
        generadorId += 1;
        
    }

    public void setHoraInicio(String inicio) {
        horaInicio = inicio;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraFin(String fin) {
        horaInicio = fin;
    }

    public String getHoraFin() {
        return horaFin;
    }

    public void setDia(Dia dia) {
        this.dia = dia;
    }

    public Dia getDia() {
        return dia;
    }
}