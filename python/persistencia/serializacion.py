import pickle
from Calendario.calendario import *
from Calendario.dia import Dia
from Calendario.planificador import Planificador
from tareas.tarea import *
from Calendario.asignatura import asignatura
from Calendario.Clase import clase


class Serializador():

    def serializar(objeto):
        picklefile = open('ObjetosCalendario', 'wb')
        pickle.dump(objeto, picklefile)
        picklefile.close

    def deserializar():
        picklefile = open('ObjetosCalendario', 'rb')
        objeto = pickle.load(picklefile)
        pickle.close()
        return objeto