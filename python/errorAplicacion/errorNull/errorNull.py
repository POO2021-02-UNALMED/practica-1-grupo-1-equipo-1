from python.errorAplicacion.errorAplicacion import *

class errorNull(errorAplicacion):
    def __init__(self, error):
        super().__init__("to be decided: " + error)