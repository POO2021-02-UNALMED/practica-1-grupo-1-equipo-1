from persistencia.serializacion import Serializador

#a esta clase pertenecen las asignaturas que van asociadas a una tarea
class  asignatura:
    def __init__(self, profesor, nombre):
        self._profesor = profesor
        self.nombre = nombre
        Serializador.asig.append(self)
        Serializador.guardarAsignaturas(Serializador.asig)


    def setProfesor(self, profesor):
        self.profesor = profesor

    def getProfesor(self):
        return self.profesor