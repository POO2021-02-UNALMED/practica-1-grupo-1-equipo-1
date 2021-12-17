package BaseDatos; 

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

import gestorAplicacion.horario.*;
import gestorAplicacion.tareas.*;
import uiMain.Asistente;

public class deserializador {
	
	
	private static File rutaTemp = new File("C:\\Users\\Sebastian G\\Documents\\GitHub\\practica-1-grupo-1-equipo-1\\src\\BaseDatos\\temp");
	@SuppressWarnings("unchecked")
	public static void deserializar(Asistente asist) {
		File[] docs = rutaTemp.listFiles();
		FileInputStream fis;
		ObjectInputStream ois;
		
		for(File file: docs) {
			if(file.getAbsolutePath().contains("Calendario")) {
				try {
					fis=new FileInputStream(file);
					ois = new ObjectInputStream(fis);
					asist.setCalendarios((List<Calendario>) ois.readObject());
				}catch (FileNotFoundException e) {
					e.printStackTrace();
				}catch(IOException e){
					e.printStackTrace();
				}catch(ClassNotFoundException e) {
					e.printStackTrace();
				}
			}else if(file.getAbsolutePath().contains("Planificador")) {
				try {
					fis = new FileInputStream(file);
					ois = new ObjectInputStream(fis);
					
					asist.setPlanificadores((List<Planificador>) ois.readObject());
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}catch (IOException e) {
					e.printStackTrace();
				}catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
			}else if(file.getAbsolutePath().contains("Asignatura")) {
				try {
					fis = new FileInputStream(file);
					ois = new ObjectInputStream(fis);
					
					asist.setAsignaturas((List<Asignatura>) ois.readObject());
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}catch (IOException e) {
					e.printStackTrace();
				}catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
			}else if(file.getAbsolutePath().contains("Clase")) {
				try {
					fis = new FileInputStream(file);
					ois = new ObjectInputStream(fis);
					
					asist.setClases((List<Clase>) ois.readObject());
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}catch (IOException e) {
					e.printStackTrace();
				}catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
			}else if(file.getAbsolutePath().contains("Dia")) {
				try {
					fis = new FileInputStream(file);
					ois = new ObjectInputStream(fis);
					
					asist.setDias((List<Dia>) ois.readObject());
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}catch (IOException e) {
					e.printStackTrace();
				}catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
			}else if(file.getAbsolutePath().contains("Tarea")) {
				try {
					fis = new FileInputStream(file);
					ois = new ObjectInputStream(fis);
					
					asist.setTareas((List<Tarea>) ois.readObject());
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}catch (IOException e) {
					e.printStackTrace();
				}catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
			}
		}
		
		
		
	}
}
