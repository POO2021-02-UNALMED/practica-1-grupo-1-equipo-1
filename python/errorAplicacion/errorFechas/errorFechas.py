from python.errorAplicacion.errorAplicacion import *

class errorFechas(errorAplicacion):
    def __init__(self, error):
        super().__init__("error de fecha: " + error)