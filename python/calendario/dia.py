from python.revErrores.revErrores import revErrores
from tareas.tarea import *

class Dia():

    def __init__(self, etiqueta, fecha, tareas = []):
        revErrores.formatoFecha(fecha)
        self._etiqueta = etiqueta
        self._fecha = fecha
        self._tareas = tareas
    
    def agregarTarea(self, tarea):
        self._tareas.append(tarea)
    
    def mostrarTarea(self):
        l = ""
        for t in self._tareas:
            l += "---" + t.GetTitulo() + "\n"
        return l 

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