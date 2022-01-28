class errorAplicacion(Exception):
    def __init__(self, error):
        super().__init__("Manejo de errores de la Aplicación: " + error)
        self._error = error

    def toString(self):
        return self._error