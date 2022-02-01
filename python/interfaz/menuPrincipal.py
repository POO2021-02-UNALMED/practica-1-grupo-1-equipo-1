from tkinter import *

from ventana import Ventana

class MenuPrincipal(Menu):
    def __init__(self, window, *args):
        super().__init__(window)
        menu1 = Menu(self)
        
        def cerrarApp():
            if(args[0]=="Inicio"):
                window.destroy()

            


        if(args[0]=="Inicio"):    
            self.add_cascade(menu = menu1, label="Opciones")
            menu1.add_command(label = "Descripcion")
            menu1.add_command(label = "Salir", command=cerrarApp)

