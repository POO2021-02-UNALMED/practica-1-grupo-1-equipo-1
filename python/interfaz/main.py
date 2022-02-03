from multiprocessing.dummy import active_children
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

    ventanaSistema = Frame(window, width=100, height=100)
    ventanaSistema.config(bg="black", padx=10, pady=10)


    menubar = MenuPrincipal(window, "Inicio")










    # Ingreso al sistema 

    def ingresarAlSistema():
        v1.cerrarVentana()
        ventanaSistema.grid(row=1, column=1)

        def salirAlInicio():
            ventanaSistema.grid_forget()
            v1.mostrarVentana()
            window['menu'] = menubar


        menubar2 = Menu(window)

        archivo = Menu(menubar2)
        archivo.add_command(label = "Aplicación")
        archivo.add_command(label = "Salir", command=salirAlInicio)




        procesosYConsultas = Menu(menubar2)

        Asignaturas = Menu(procesosYConsultas)
        Asignaturas.add_command(label = "Crear asignatura")

        Clase = Menu(procesosYConsultas)
        Clase.add_command(label = "Crear clase")
        Clase.add_command(label = "Reagendar clase")

        dia = Menu(procesosYConsultas)
        dia.add_command(label = "Crear dia")
        dia.add_command(label = "Agregar tareas")
        dia.add_command(label = "Mostrar tareas")

        planificador = Menu(procesosYConsultas)
        planificador.add_command(label = "Crear planificador")
        planificador.add_command(label = "Agregar días")
        planificador.add_command(label = "Mostrar días")



        calendario = Menu(procesosYConsultas)
        calendario.add_command(label = "Crear calendario")
        calendario.add_command(label = "Agregar planificador")
        calendario.add_command(label = "Mostrar planificadores")
        calendario.add_command(label = "Mostrar calendarios")


        tarea = Menu(procesosYConsultas)
        tarea.add_command(label = "Crear tarea")
        tarea.add_command(label = "Reagendar tarea")
        tarea.add_command(label = "Cambiar estado")
        tarea.add_command(label = "Agregar nota")



        proyecto = Menu(procesosYConsultas)
        proyecto.add_command(label = "Crear proyecto")
        proyecto.add_command(label = "Dividir tarea")

        

        procesosYConsultas.add_cascade(menu = Asignaturas, label="Asignaturas")
        procesosYConsultas.add_cascade(menu = Clase, label="Clases")
        procesosYConsultas.add_separator()
        procesosYConsultas.add_cascade(menu = dia, label="Dia")
        procesosYConsultas.add_cascade(menu = planificador, label="Planificador")
        procesosYConsultas.add_cascade(menu = calendario, label="Calendario")
        procesosYConsultas.add_separator()
        procesosYConsultas.add_cascade(menu = tarea, label="Tarea")
        procesosYConsultas.add_cascade(menu = proyecto, label="Proyecto")


        ayuda = Menu(menubar2)
        ayuda.add_command(label = "Acerca de")


        menubar2.add_cascade(menu = archivo, label="Archivo")
        menubar2.add_cascade(menu = procesosYConsultas, label="Procesos y consultas")
        menubar2.add_cascade(menu = ayuda, label="Ayuda")

        window['menu'] = menubar2













    # Ultimas configuraciones de inicio de aplicacion


    botonIngresar = Button(P4, text="Ingresar al sistema", command=ingresarAlSistema)
    botonIngresar.grid(row=2, column=1)

    window['menu'] = menubar
    window.mainloop()