package BaseDatos;
import gestorAplicacion.horario.*;
import gestorAplicacion.tareas.*;

import java.util.ArrayList;

public class SaveCalendar {
    public static void save(Calendario calendar, String filePath) {
        ObjFileManager.deleteFromFile(filePath);
        ObjFileManager.saveObjToFile(calendar, filePath);
    }

    public static void save(ArrayList<Object> calendar, String filePath) {
        ObjFileManager.saveObjToFile(calendar, filePath, true);
    }

    public static ArrayList<Object> get(String filePath) {
        return (ArrayList<Object>)ObjFileManager.getObjFromFile(filePath);
    }

    public static String getCalendarData(String filePath) {
        String data = new String();
        ArrayList<Object> calendars = get(filePath);
        for(Object o: calendars) {
            Calendario calendar = (Calendario)o;
            data += "Calendario: " + calendar.nombre + '\n';
            for(Planificador obj : calendar.getPlanificadores()) {
                data += "   Planificador: " + obj.id + '\n';
                for(Dia d : obj.getDias()) {
                    data += "       " + d.getEtiqueta() + ": " + d.getFecha() + '\n';
                    for(Tarea t : d.getTareas()) {
                        data += "           Titulo: " + t.getTitulo() + '\n';
                        data += "           Asignatura: " + t.getAsignatura().getNombre() + '\n';
                        data += "           Fecha de entrega: " + t.getFechaEntrega() + '\n';
                        data += "           Estado: " + t.getEstado() + '\n';
                    }
                }
            }
            for(Clase obj : calendar.getClases()) {
                data += "Id: " + obj.id + '\n';
                data += "Asignatura: " + obj.getAsignatura().getNombre() + '\n';
                data += "Dia de la semana: " + obj.getDia() + '\n';
                data += "Hora de inicio: " + obj.getHoraInicio() + '\n';
                data += "Hora de finalizacion: " + obj.getHoraFin() + '\n';
            }
        }
        return data;
    }
}
