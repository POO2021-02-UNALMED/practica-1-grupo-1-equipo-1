from Calendario.planificador import Planificador
from persistencia.serializacion import Serializador

class Calendario():
    calendarios = []

    def __init__ (self, nombre, planificadores = [], clases = []):
        #from python.persistencia.serializacion import Serializador
        self._nombre = nombre
        self._planificadores = planificadores
        self._clases = clases
        Calendario.calendarios.append(self)
        Serializador.guardarCalendarios(Calendario.calendarios)

    def agregarPlanificador(self, planificador):
        self._planificadores.append(planificador)
        return planificador.nombre + " ha sido añadido al calendario " + self._nombre

    def mostrarPlanificadores(self):
        l = ""
        for p in self._planificadores:
            l += "-Planificador: " + p.getNombre() + "\n" + p.mostrarDias()
            return l
    
    @classmethod
    def mostrarCalendarios(cls):
        #from python.persistencia.serializacion import Serializador
        Serializador.calendariosGuardados() #sera necesario usar esta funcion al iniciar para no perder los objetos guardados anteriormente
        Calendario.calendarios += Serializador.calen
        Serializador.asignaturasGuardadas()
        Serializador.clasesGuardadas()
        Serializador.notasGuardadas()

        l = ""
        for c in cls.calendarios:
            l += 'Calendario: ' + c.getNombre() + "\n" + c.mostrarPlanificadores()
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