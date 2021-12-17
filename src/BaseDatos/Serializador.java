package BaseDatos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;

import uiMain.Asistente;

public class Serializador {
	private static File rutaTemp = new File("C:\\Users\\Sebastian G\\Documents\\GitHub\\practica-1-grupo-1-equipo-1\\src\\BaseDatos\\temp");
	
	
	public static void serializar(Asistente asist) {
		FileOutputStream fos;
		ObjectOutputStream oos;
		File[] docs = rutaTemp.listFiles();
		PrintWriter pw;
		
		
		
		for(File file:docs) {
			try {
				pw = new PrintWriter(file);
			} catch(FileNotFoundException e){
				e.printStackTrace();
			}
		}
		for(File file:docs) {
			if(file.getAbsolutePath().contains("Calendario")) {
				try {
					fos = new FileOutputStream(file);
					oos = new ObjectOutputStream(fos);
					oos.writeObject(asist.getCalendarios());
				} catch(FileNotFoundException e) {
					e.printStackTrace();
				} catch(IOException e) {
					e.printStackTrace();
				}
			} else if(file.getAbsolutePath().contains("Planificador")) {
				try {
					fos = new FileOutputStream(file);
					oos = new ObjectOutputStream(fos);
					oos.writeObject(asist.getPlanificadores());
				} catch(FileNotFoundException e) {
					e.printStackTrace();
				} catch(IOException e) {
					e.printStackTrace();
				}
			}else if(file.getAbsolutePath().contains("Dia")) {
				try {
					fos = new FileOutputStream(file);
					oos = new ObjectOutputStream(fos);
					oos.writeObject(asist.getDias());
				} catch(FileNotFoundException e) {
					e.printStackTrace();
				} catch(IOException e) {
					e.printStackTrace();
				}
			}else if(file.getAbsolutePath().contains("Asignatura")) {
				try {
					fos = new FileOutputStream(file);
					oos = new ObjectOutputStream(fos);
					oos.writeObject(asist.getAsignaturas());
				} catch(FileNotFoundException e) {
					e.printStackTrace();
				} catch(IOException e) {
					e.printStackTrace();
				}
			}else if(file.getAbsolutePath().contains("Clase")) {
				try {
					fos = new FileOutputStream(file);
					oos = new ObjectOutputStream(fos);
					oos.writeObject(asist.getClases());
				} catch(FileNotFoundException e) {
					e.printStackTrace();
				} catch(IOException e) {
					e.printStackTrace();
				}
			}else if(file.getAbsolutePath().contains("Tarea")) {
				try {
					fos = new FileOutputStream(file);
					oos = new ObjectOutputStream(fos);
					oos.writeObject(asist.getTareas());
				} catch(FileNotFoundException e) {
					e.printStackTrace();
				} catch(IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
