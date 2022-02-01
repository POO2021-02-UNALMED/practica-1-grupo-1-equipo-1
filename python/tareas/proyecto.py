
from tareas.tarea import tarea
from tareas.actividad import actividad
from tareas.estado import estado

class proyecto(tarea): 
    def __init__(self, titulo, asignatura, fechaDeEntrega):
        self.actividades =[]
        super().__init__(titulo, asignatura, fechaDeEntrega)

    def dividirTarea(self, num, *args):
        for i in range(0, num):

            fragmentoDeTarea = actividad("Actividad "+(i+1)+"de "+self.titulo, self.asignatura, args[i], estado.sinCompletar.value)
            self.actividades.append(fragmentoDeTarea)
    

    def completaProyecto(self):
        completada = True
        for i in self.actividades:
            if(i.estado==estado.sinCompletar.value):
                completada = False

        if(completada):
            self.estado = estado.completada.value