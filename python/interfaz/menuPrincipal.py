from tkinter import *

from ventana import Ventana

class MenuPrincipal(Menu):
    def __init__(self, window):
        super().__init__(window)

        
        def cerrarApp():
            window.destroy()



        menu1 = Menu(self)
        self.add_cascade(menu = menu1, label="Opciones")
        menu1.add_command(label = "Descripcion")
        menu1.add_command(label = "Salir", command=cerrarApp)
