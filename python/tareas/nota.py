class nota:
    def __init__(self, titulo, descripcion):
        self.titulo = titulo
        self.descripcion = descripcion

    def getTitulo(self):
        return self.titulo

    def setTitulo(self, titulo):
        self.titulo = titulo

    def getDescripcion(self):
        return self.descripcion

    def setDescripcion(self, descripcion):
        self.descripcion = descripcion