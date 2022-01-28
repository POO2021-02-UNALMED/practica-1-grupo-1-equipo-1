from python.errorAplicacion.errorFechas.errorFechas import *

class errorOrden(errorFechas):
    def __init__(self, error):
        super().__init__("error de orden de fechas: " + error)