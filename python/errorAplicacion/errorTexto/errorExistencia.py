from python.errorAplicacion.errorTexto.errorTexto import *

class errorOrdenFecha(errorTexto):
    def __init__(self, error):
        super().__init__("no se ha encontrado el valor especificado")