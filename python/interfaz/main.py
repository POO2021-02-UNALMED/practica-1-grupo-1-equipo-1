from tkinter import *
from ventana import Ventana
from menuPrincipal import MenuPrincipal

if __name__ == "__main__":

    #Creación de la ventana principal y configuracion general
    window = Tk()
    window.title("Proyecto 2")
    window.geometry("500x650")
    window.option_add('*tearOff', FALSE)
    window.resizable(False, False)


    v1 = Ventana(window, padx=20, pady=20, bg='white')
    v1.grid(row=1, column=1)

    P1 = Ventana(v1, bg="blue", padx=10, pady=10)
    P1.grid(row=1, column=1)

    P2 = Ventana(v1, bg="green", padx=10, pady=10)
    P2.grid(row=1, column=2)

    P3 = Label(P1, text="Bienvenido")
    P3.config(width=27, height=3)
    P3.grid(row=1, column=1)

    P4 = Ventana(P1, bg="red", width=210, height=200)
    P4.grid(row=2, column=1)


    P5 = Label(P2, text="Bienvenidosdfasas\nsdfasdfasdfasdfasdfasd")
    P5.config(width=27, height=3)
    P5.grid(row=1, column=1)


    P6 = Ventana(P2, bg="red", width=210, height=200)
    P6.grid(row=2, column=1)

    def ingresarAlSistema():

        v1.grid_forget()

        ventanaSistema2 = Frame(window, width=100, height=100)
        ventanaSistema2.config(bg="black", padx=10, pady=10)
        ventanaSistema2.grid(row=1, column=1)



        


    botonIngresar = Button(P4, text="Ingresar al sistema", command=ingresarAlSistema)
    botonIngresar.grid(row=2, column=1)





    menubar = MenuPrincipal(window)
    window['menu'] = menubar

    window.mainloop()