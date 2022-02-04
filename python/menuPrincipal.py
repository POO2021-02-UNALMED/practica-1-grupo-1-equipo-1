from tkinter import *
from tkinter import messagebox

from ventana import Ventana

class MenuPrincipal(Menu):
    def __init__(self, window, *args):
        super().__init__(window)
        menu1 = Menu(self)
        
        def cerrarApp():
            if(args[0]=="Inicio"):
                window.destroy()

            
        def aplicacion():
            messagebox.showinfo("Calendario", "En esta aplicación podrás crear, organizar y manejar tus horarios y actividades por medio de calendarios")


        if(args[0]=="Inicio"):    
            self.add_cascade(menu = menu1, label="Opciones")
            menu1.add_command(label = "Descripcion", command=aplicacion)
            menu1.add_command(label = "Salir", command=cerrarApp)

