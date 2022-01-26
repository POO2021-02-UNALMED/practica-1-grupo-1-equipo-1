class clase:
    _generadorId = 0
    def __init__(self, horaInicio, horaFinal, asignatura, dia):
        self.id = clase._generadorId
        clase._generadorId += 1
        self.horaInicio = horaInicio
        self.horaFinal = horaFinal
        self._asignatura = asignatura
        self._dia = dia

    def getDia(self):
        return self._dia
    
    def setDia(self, dia):
        self._dia =  dia
    
    def getAsignatura(self):
        return self._asignatura

    def setAsignatura(self, asignatura):
        self._asignatura = asignatura

    def reagendarClase(self, dia, horaInicio, horaFinal):
        self._dia = dia
        self.horaInicio = horaInicio
        self.horaFinal = horaFinal