from python.errorAplicacion.errorAplicacion import *

class errorTexto(errorAplicacion):
    def __init__(self, error):
        super().__init__("error de texto: " + error)