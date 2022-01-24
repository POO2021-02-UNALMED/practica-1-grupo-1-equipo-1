class Calendario():
    calendarios = []

    def __init__ (self, nombre, planificadores = [], clases = []):
        self._nombre = nombre
        self._planificadores = planificadores
        self._clases = clases
        Calendario.calendarios.append(self)

    def agregarPlanificador(self, planificador):
        self._planificadores.append(planificador)
        return planificador.nombre + " ha sido añadido al calendario " + self._nombre

    def mostrarPlanificadores(self):
        l = ""
        for p in self._planificadores:
            l += "-" + p._nombre + "\n" + p.mostrarDias()
            return l
    
    @classmethod
    def mostrarCalendarios(cls):
        l = ""
        for c in cls.calendarios:
            l += c._nombre + "\n" + c.mostrarPlanificadores()
        return l
    
    def setNombre(self, nombre):
        self._nombre = nombre

    def getNombre(self):
        return self._nombre
    
    def setPlanificadores(self, p):
        self._planificadores = p

    def getPlanificadores(self):
        return self._planificadores
    
    def setClases(self, c):
        self._clases = c

    def getClases(self):
        return self._clases