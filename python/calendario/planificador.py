class Planificador():
    generadorID = 0 #fjkshf
    def __init___(self, nombre, dias = []):
        self._dias = dias
        self._nombre = nombre
        self._ID = Planificador.generadorID
        Planificador.generadorID += 1
    
    def agregarDia(self, dia):
        self._dias.append(dia)
    
    def mostrarDias(self):
        l = ""
        for d in self._dias:
            l += "--" + d._nombre + "\n" + d.mostrarTarea()
        return l 

    def setNombre(self, nombre):
        self._nombre = nombre

    def getNombre(self):
        return self._nombre

    def setDias(self, dias):
        self._dias = dias

    def getDias(self):
        return self._dias

    def getID(self):
        return self._ID