from python.errorAplicacion.errorNull.errorNull import *

class errorOrdenFecha(errorNull):
    def __init__(self, error):
        super().__init__("no se ha encontrado el valor especificado")