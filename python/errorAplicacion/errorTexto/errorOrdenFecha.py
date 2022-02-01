from errorAplicacion.errorTexto.errorTexto import *

class errorOrdenFecha(errorTexto):
    def __init__(self, error):
        super().__init__("error de orden de fechas: " + error)