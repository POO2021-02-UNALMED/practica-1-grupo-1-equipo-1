from proyecto import proyecto
from tareas import tarea

class actividad(proyecto, tarea):
    def __init__(self, titulo, asignatura, fechaDeEntrega, estado):
        self.descripcion
        super().__init__(titulo, asignatura, fechaDeEntrega, estado)

    