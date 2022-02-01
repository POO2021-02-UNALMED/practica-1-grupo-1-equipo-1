import pickle
from calendario.calendario import *
from calendario.dia import Dia
from calendario.planificador import Planificador
from tareas.tarea import *
from calendario.asignatura import asignatura
from calendario.Clase import clase


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