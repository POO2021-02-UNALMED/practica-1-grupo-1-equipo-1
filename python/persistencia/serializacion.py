import pickle

class Serializador():

    calen = [] #lista de calendarios guardados
    plan = [] #lista de planificadores guardados
    dias = [] #lista de dias guardados
    tar = [] #lista de tareas guardados
    clases = [] #lista de clases guardados
    asig = [] #lista de asignaturas guardados
    notas = [] #lista de notas guardados

    #hay dos tipos de funciones una guarda los objetos en archivos y la otra los deserializa

    def guardarCalendarios(objeto):
        from calendario.calendario import Calendario
        picklefile = open('ObjetosCalendario', 'wb')
        pickle.dump(objeto, picklefile)
        picklefile.close

    def calendariosGuardados():
        from calendario.calendario import Calendario
        picklefile = open('ObjetosCalendario', 'rb')
        Serializador.calen += pickle.load(picklefile)
        picklefile.close

    def guardarPlanificadores(objeto):
        from calendario.planificador import Planificador
        picklefile = open('ObjetosPlanificador', 'wb')
        pickle.dump(objeto, picklefile)
        picklefile.close

    def PlanificadoresGuardados():
        from calendario.planificador import Planificador
        picklefile = open('ObjetosPlanificador', 'rb')
        Serializador.plan += pickle.load(picklefile)
        picklefile.close

    def guardarDias(objeto):
        from calendario.dia import Dia
        picklefile = open('ObjetosDia', 'wb')
        pickle.dump(objeto, picklefile)
        picklefile.close

    def diasGuardados():
        from calendario.dia import Dia
        picklefile = open('ObjetosDia', 'rb')
        Serializador.dias += pickle.load(picklefile)
        picklefile.close

    def guardarTareas(objeto):
        from tareas.tarea import tarea
        picklefile = open('ObjetosTarea', 'wb')
        pickle.dump(objeto, picklefile)
        picklefile.close

    def tareasGuardadas():
        from tareas.tarea import tarea
        picklefile = open('ObjetosTarea', 'rb')
        Serializador.tar += pickle.load(picklefile)
        picklefile.close

    def guardarClases(objeto):
        from calendario.Clase import clase
        picklefile = open('ObjetosClase', 'wb')
        pickle.dump(objeto, picklefile)
        picklefile.close

    def clasesGuardadas():
        from calendario.Clase import clase
        picklefile = open('ObjetosClase', 'rb')
        Serializador.clases += pickle.load(picklefile)
        picklefile.close

    def guardarAsignaturas(objeto):
        from calendario.asignatura import asignatura
        picklefile = open('ObjetosAsignatura', 'wb')
        pickle.dump(objeto, picklefile)
        picklefile.close

    def asignaturasGuardadas():
        from calendario.asignatura import asignatura
        picklefile = open('ObjetosAsignatura', 'rb')
        Serializador.asig += pickle.load(picklefile)
        picklefile.close

    def guardarNotas(objeto):
        from tareas.nota import nota
        picklefile = open('ObjetosNota', 'wb')
        pickle.dump(objeto, picklefile)
        picklefile.close

    def notasGuardadas():
        from tareas.nota import nota
        picklefile = open('ObjetosNota', 'rb')
        Serializador.notas += pickle.load(picklefile)
        picklefile.close