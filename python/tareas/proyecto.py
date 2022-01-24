from tarea import tarea
from actividad import actividad

class proyecto(tarea): 
    def __init__(self, titulo, asignatura, fechaDeEntrega):
        self.actividades =[]
        super().__init__(titulo, asignatura, fechaDeEntrega)

    
