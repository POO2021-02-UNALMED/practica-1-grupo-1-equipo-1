class  asignatura:
    def __init__(self, profesor, nombre):
        self._profesor = profesor
        self.nombre = nombre

    def setProfesor(self, profesor):
        self.profesor = profesor

    def getProfesor(self):
        return self.profesor