from tareas.proyecto import proyecto
from tareas.tarea import tarea

#Objetos de tipo tarea y proyecto pero que a diferencia de proyecto solo admite objetos que solo sean tipo tarea
class actividad(proyecto, tarea):
    def __init__(self, titulo, asignatura, fechaDeEntrega, estado):
        self.descripcion
        super().__init__(titulo, asignatura, fechaDeEntrega, estado)
    
    


    