from python.errorAplicacion.errorFechas.errorFechas import *

class errorFormato(errorFechas):
    def __init__(self, error):
        super().__init__("error de formato de fecha: " + error)