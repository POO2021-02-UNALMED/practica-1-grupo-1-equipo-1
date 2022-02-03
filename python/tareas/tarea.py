from tareas.estado import estado
from tareas.nota import nota
from persistencia.serializacion import Serializador
from revErrores.revErrores import revErrores
#los objetos de esta clase son las tareas a realizar que seran guardadas dentro de los dias
class tarea:
    def __init__(self, titulo, asignatura, fechaDeEntrega):
        revErrores.formatoFecha(fechaDeEntrega)
        self.titulo = titulo
        self.asignatura = asignatura
        self.fechaDeEntrega = fechaDeEntrega
        self.estado = estado.sinCompletar.value
        self.notas = []
        Serializador.tar.append(self)
        Serializador.guardarTareas(Serializador.tar)


    def reagendarTarea(self, nuevaFecha): #cambia la fecha de la tarea
        self.fechaDeEntrega = nuevaFecha
    
    def cambiarEstado(self): #cambia el estado de la tarea de Sincompletar a completada
        self.estado = estado.completada.value

    def agergarNotas(self, titulo, descripcion): #se crea un objeto de tipo nota para tener una especie de descripcion para la tarea
        notaActual = nota(titulo, descripcion)

        self.notas.append(notaActual)



    def GetTitulo(self):
        return self.titulo

    def SetTitulo(self, titulo):
        self.titulo = titulo

    def GetAsignatura(self):
        return self.asignatura

    def SetAsignatura(self, asignatura):
        self.asignatura = asignatura

    def GetFechaDeEntrega(self):
        return self.fechaDeEntrega

    def SetFechaDeEntrega(self, fechaDeEntrega):
        self.fechaDeEntrega = fechaDeEntrega

    def GetEstado(self):
        return self.estado

    def GetNotas(self):
        return self.notas