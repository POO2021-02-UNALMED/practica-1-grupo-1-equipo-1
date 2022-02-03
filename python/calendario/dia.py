from python.revErrores.revErrores import revErrores
from tareas.tarea import *
from persistencia.serializacion import Serializador

#Esta clase seran los dias que haran parte de cada planificador y contendra las tareas a realizar o para entregar dicho dia
class Dia():

    def __init__(self, etiqueta, fecha, tareas = []):
        revErrores.formatoFecha(fecha)
        self._etiqueta = etiqueta
        self._fecha = fecha
        self._tareas = tareas
        Serializador.dias.append(self)
        Serializador.guardarDias(Serializador.dias)
    
    def mostrarTarea(self): #muestra las tareas almacenadas en el dia
        Serializador.diasGuardados()
        Serializador.tareasGuardadas()

        l = ""
        for t in self._tareas:
            l += "---" + t.GetTitulo() + "\n"
        return l

    def agragarTarea(self, tarea): #toma una tarea y si la echa coincide con el dia la agrega
        if tarea.fechaDeEntrega == self._fecha:
            self._tareas.append(tarea)
        else:
            return 'La fecha de entrega de esta tarea no coincide con el dia' 

    def setEtiqueta(self, eti):
        self._etiqueta = eti

    def getEtiqueta(self):
        return self._etiqueta

    def setFecha(self, fecha):
        revErrores.formatoFecha
        self._fecha = fecha

    def getFecha(self):
        return self._fecha
    
    def setTareas(self, tareas):
        self._tareas = tareas

    def getTareas(self):
        return self._tareas