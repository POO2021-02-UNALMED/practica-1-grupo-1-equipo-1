from Calendario.planificador import Planificador
from persistencia.serializacion import Serializador

class Calendario(): #Esta clase es la base de toda la aplicion, guarda todos los planificadores y tambien todos los objetos creados
    calendarios = []

    def __init__ (self, nombre, planificadores = [], clases = []):
        #from python.persistencia.serializacion import Serializador
        self._nombre = nombre
        self._planificadores = planificadores
        self._clases = clases
        Calendario.calendarios.append(self)
        Serializador.guardarCalendarios(Calendario.calendarios)

    def agregarPlanificador(self, planificador): #añade un planificador al calendario
        self._planificadores.append(planificador)
        return planificador.nombre + " ha sido añadido al calendario " + self._nombre

    def mostrarPlanificadores(self): #muestra los planificadores dentro de un calendario con su dias y als tareas en estos
        l = ""
        for p in self._planificadores:
            l += "-Planificador: " + p.getNombre() + "\n" + p.mostrarDias()
            return l
    
    @classmethod
    def mostrarCalendarios(cls): #muestra todos los objetos de tipo calendario con su planificadores, los dias en estos, y las tareas en cada dia
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