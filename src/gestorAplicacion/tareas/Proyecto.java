package gestorAplicacion.tareas;

import java.util.ArrayList;
import java.util.Scanner;

import gestorAplicacion.horario.Asignatura;

public class Proyecto extends Tarea {
	ArrayList<Actividad> actividades;
	static Scanner sc = new Scanner(System.in);
	
	 public Proyecto(String titulo, Asignatura asignatura, String fechaEntrega){
		 super(titulo, asignatura, fechaEntrega);
	 }
	 
	 

	@Override
	public void cambiarEstado() {
		boolean completo = true;
		boolean proceso = false;
		for(int i=0; i<actividades.size() ; i++) {
			if(actividades.get(i).getEstado()==Estado.completada) {
				proceso=true;
			}
			if(actividades.get(i).getEstado()==Estado.asignada) {
				completo=false;
			}	
		}
		if(completo) {
			this.estado=Estado.completada;
		}
		else if(proceso){
			this.estado=Estado.enProceso;
		}
		
	}
	 
	public void dividirTarea(int numeroDeActividades) {
		for(int i=0; i<numeroDeActividades;i++) {
			System.out.println("Ingresa el titulo de la actividad");
			String tituloActividad = sc.nextLine();
			String fechaEntregaActividad=this.getFechaEntrega();
			while(true) {
				fechaEntregaActividad = sc.nextLine();
				if(fechaEntregaActividad.matches("[1234567890]{2}-[1234567890]{2}-[1234567890]{4}")) {
					break;
				}
				System.out.println("La fecha no se ingresó de forma correcta, vuelva a hacerlo por favor.");
			}
			
			actividades.add(new Actividad(tituloActividad, this.getAsignatura(), fechaEntregaActividad));
			
		}
	}
	
	
}
