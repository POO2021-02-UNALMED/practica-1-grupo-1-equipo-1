package gestorAplicacion.horario;

public class Clase {
    public String horaInicio;
    public String horaFin;
    public String dia;

    public Clase(String horaInicio, String horaFin, String dia) {
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.dia = dia;
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

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getDia() {
        return dia;
    }
}