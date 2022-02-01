from tareas.estado import estado
from tareas.nota import nota
from persistencia.serializacion import Serializador

class tarea:
    def __init__(self, titulo, asignatura, fechaDeEntrega):
        self.titulo = titulo
        self.asignatura = asignatura
        self.fechaDeEntrega = fechaDeEntrega
        self.estado = estado.sinCompletar.value
        self.notas = []
        Serializador.tar.append(self)
        Serializador.guardarTareas(Serializador.tar)


    def reagendarTarea(self, nuevaFecha):
        self.fechaDeEntrega = nuevaFecha

    
    def cambiarEstado(self):
        self.estado = estado.completada.value

    def agergarNotas(self, titulo, descripcion):
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