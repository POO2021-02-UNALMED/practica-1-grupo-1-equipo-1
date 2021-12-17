package BaseDatos;
import gestorAplicacion.horario.*;
import gestorAplicacion.tareas.*;

import java.util.ArrayList;

public class SaveCalendar {
    public static void save(Calendario calendar, String filePath) { //Guarda un calendario en el archivo especificado (no elimina los objetos que se encuentran en el mismo)
        ObjFileManager.saveObjToFile(calendar, filePath);
    }

    public static void save(ArrayList<Object> calendar, String filePath) { //Guarda un arreglo de objetos en el archivo especificado(Elimina todos los demas objetos en el mismo)
        ObjFileManager.saveObjToFile(calendar, filePath, false);
    }

    public static ArrayList<Object> get(String filePath) { //Devuelve un arreglo con los objetos en el archivo especificado
        return ObjFileManager.getObjFromFile(filePath);
    }

    public static String getCalendarData(String filePath) { //Funcionalidad Imprimir calendaros, devuelve un string con los objetos ordenados.
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
                        data += "           Estado: " + t.getEstado() + "\n\n";
                    }
                }
            }
            data += "   Clases: \n";
            for(Clase obj : calendar.getClases()) {
                data += "       Id: " + obj.id + '\n';
                data += "       Asignatura: " + obj.getAsignatura().getNombre() + '\n';
                data += "       Dia de la semana: " + obj.getDia() + '\n';
                data += "       Hora de inicio: " + obj.getHoraInicio() + '\n';
                data += "       Hora de finalizacion: " + obj.getHoraFin() + "\n\n";
            }
        }
        return data;
    }
}
