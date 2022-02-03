from persistencia.serializacion import Serializador

#os objetos de esta clase siren como anotaciones o puntos a tener en cuenta en las tareas
class nota:
    def __init__(self, titulo, descripcion):
        self.titulo = titulo
        self.descripcion = descripcion
        Serializador.notas.append(self)
        Serializador.guardarNotas(Serializador.notas)

    def getTitulo(self):
        return self.titulo

    def setTitulo(self, titulo):
        self.titulo = titulo

    def getDescripcion(self):
        return self.descripcion

    def setDescripcion(self, descripcion):
        self.descripcion = descripcion