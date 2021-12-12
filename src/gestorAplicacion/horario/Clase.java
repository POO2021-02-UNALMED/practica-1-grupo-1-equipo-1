package gestorAplicacion.horario;

public class Clase {
    private int horaInicio;
    private int horaFin;
    private String dia;

    public Clase(int horaInicio, int horaFin, String dia) {
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.dia = dia;
    }

    public void setHoraInicio(int inicio) {
        horaInicio = inicio;
    }

    public int getHoraInicio() {
        return horaInicio;
    }

    public void setHoraFin(int fin) {
        horaInicio = fin;
    }

    public int getHoraFin() {
        return horaFin;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getDia() {
        return dia;
    }
}
