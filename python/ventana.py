from tkinter import *

class Ventana(Frame):
    def __init__(self, window, **kwargs):
        

        if('padx' in kwargs):
            super().__init__(window)
            self.config(padx=kwargs['padx'], pady=kwargs['pady'])

        elif('width' in kwargs):
            super().__init__(window, width=kwargs['width'], height=kwargs['height'])
    
    def cerrarVentana(self):
        self.grid_forget()

    def mostrarVentana(self):
        self.grid(row=1, column=1)

        

         