package BaseDatos;
import gestorAplicacion.horario.Calendario;

public class SaveCalendar {
    public static void save(Calendario calendar, String filePath) {
        ObjFileManager.deleteFromFile(filePath);
        ObjFileManager.saveObjToFile(calendar, filePath);
    }

    public static Calendario get(String filePath) {
        return (Calendario)ObjFileManager.getObjFromFile(filePath).get(0);
    }
}
