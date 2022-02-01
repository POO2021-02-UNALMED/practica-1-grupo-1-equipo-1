from errorAplicacion.errorTexto.errorTexto import *

class errorFormatoFecha(errorTexto):
    def __init__(self, error):
        super().__init__("error de formato de fecha: " + error)