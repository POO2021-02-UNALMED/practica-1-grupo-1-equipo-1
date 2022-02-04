
from distutils import command
from email.mime import image
from tkinter import *
from tkinter import messagebox
from ventana import Ventana
from menuPrincipal import MenuPrincipal
from FieldFrame import FieldFrame
# from calendario.calendario import Calendario

if __name__ == "__main__":


    #Creación de la ventana principal y configuracion general

    # Calendario.mostrarCalendarios()

    window = Tk() 
    window.title("Proyecto 2")
    window.geometry("500x650")
    window.option_add('*tearOff', FALSE)
    window.resizable(False, False)


    v1 = Ventana(window, padx=20, pady=20)
    v1.grid(row=1, column=1)

    P1 = Ventana(v1, padx=10, pady=10)
    P1.grid(row=1, column=1)

    P2 = Ventana(v1,  padx=10, pady=10)
    P2.grid(row=1, column=2)

    P3 = Label(P1, text="Bienvenido")
    P3.config(width=27, height=3)
    P3.grid(row=1, column=1)

    P4 = Ventana(P1, width=210, height=200)
    P4.grid(row=2, column=1)

    
    P6 = Ventana(P2, width=210, height=200)
    P6.grid(row=2, column=1)
    
    fotoSebastian = PhotoImage(file="imagenes/Sebastian.png")
    fotoJose = PhotoImage(file="imagenes/Jose.png")
    fotoDeumek = PhotoImage(file="imagenes/Deumek.png")

    

    imagenBiografias = Label(P6, width=210, height=400, image=fotoSebastian)
    imagenBiografias.grid(row=1, column=1)

    def infoSebastian():
        P5.config(text="Soy Sebastián Gaviria Montoya\nestudiante de ingenieria de sistemas de la \nuniversidad Nacional de Colombia", command=infoDeumek)
        imagenBiografias.config(image=fotoSebastian)

    def infoJose():
        P5.config(text="Estudiante de ciencias de la computación \nen la universidad nacional de Colombia", command=infoSebastian)
        imagenBiografias.config(image=fotoJose)


    def infoDeumek():
       
        
        P5.config(text="Estudiante de ciencias de la computación \nen la universidad nacional de Colombia", command=infoJose)
        imagenBiografias.config(image=fotoDeumek)
          
            
        


    P5 = Button(P2, text="Soy Sebastián Gaviria Montoya\nestudiante de ingenieria de sistemas de la \nuniversidad Nacional de Colombia", command=infoDeumek)
    P5.config(width=30, height=5)
    P5.grid(row=1, column=1)



    









    ventanaSistema = Frame(window, width=300, height=500)
    ventanaSistema.config(bg="white", padx=10, pady=100)

    tituloOperacion = Label(ventanaSistema, text="Escoge una operacion a realizar", bg="grey",width=68, height=3)
    tituloOperacion.grid(row=1, column=1)
    descripcionOperacion = Label(ventanaSistema, text="Selecciona en el menú de procesos y consultas una operación que quieras realizar", bg="white", pady=50)
    descripcionOperacion.grid(row=2, column=1)  

    menubar = MenuPrincipal(window, "Inicio")








    # Ingreso al sistema 

    def ingresarAlSistema():
        v1.cerrarVentana()
        ventanaSistema.grid(row=1, column=1)
        frameDatos = Frame(ventanaSistema)
        frameDatos.grid(row=3, column=1)
        def salirAlInicio():
            ventanaSistema.grid_forget()
            v1.mostrarVentana()
            window['menu'] = menubar


        def crearAsignatura():
            tituloOperacion.config(text="Crear asignatura")
            descripcionOperacion.config(text="Llena todos los campos para crear una nueva asignatura")
            frameDatos = FieldFrame(ventanaSistema, "asignatura")
            frameDatos.grid(row=3, column=1)


        def crearClase():
            tituloOperacion.config(text="Crear clase")
            descripcionOperacion.config(text="Llena todos los campos para crear una nueva clase")
            frameDatos = FieldFrame(ventanaSistema, "clase")
            frameDatos.grid(row=3, column=1)
        
        def crearDia():
            tituloOperacion.config(text="Crear dia")
            descripcionOperacion.config(text="Llena todos los campos para crear un nuevo dia")
            frameDatos = FieldFrame(ventanaSistema, "dia")
            frameDatos.grid(row=3, column=1)

        def crearPlanificador():
            tituloOperacion.config(text="Crear planificador")
            descripcionOperacion.config(text="Llena todos los campos para crear un nuevo planificador")
            frameDatos = FieldFrame(ventanaSistema, "planificador")
            frameDatos.grid(row=3, column=1)

        def crearCalendario():
            tituloOperacion.config(text="Crear calendario")
            descripcionOperacion.config(text="Llena todos los campos para crear un nuevo calendario")
            frameDatos = FieldFrame(ventanaSistema, "calendario")
            frameDatos.grid(row=3, column=1)
        
        def crearProyecto():
            tituloOperacion.config(text="Crear proyecto")
            descripcionOperacion.config(text="Llena todos los campos para crear un nuevo proyecto")
            frameDatos = FieldFrame(ventanaSistema, "proyecto")
            frameDatos.grid(row=3, column=1)

        def aplicacion():
            messagebox.showinfo("Calendario", "En esta aplicación podrás crear, organizar y manejar tus horarios y actividades por medio de calendarios")

        def informacion():
            messagebox.showinfo("Creadores", "Sebastián Gaviria Montoya, Deumek Hernandez Zuleta y Jose Miguel Sanchez Gonzalez")

        menubar2 = Menu(window)

        archivo = Menu(menubar2)
        archivo.add_command(label = "Aplicación", command=aplicacion)
        archivo.add_command(label = "Salir", command=salirAlInicio)

        procesosYConsultas = Menu(menubar2)

        Asignaturas = Menu(procesosYConsultas)
        Asignaturas.add_command(label = "Crear asignatura", command=crearAsignatura)

        Clase = Menu(procesosYConsultas)
        Clase.add_command(label = "Crear clase", command=crearClase)
        Clase.add_command(label = "Reagendar clase")

        dia = Menu(procesosYConsultas)
        dia.add_command(label = "Crear dia", command=crearDia)
        dia.add_command(label = "Agregar tareas")
        dia.add_command(label = "Mostrar tareas")

        planificador = Menu(procesosYConsultas)
        planificador.add_command(label = "Crear planificador", command=crearPlanificador)
        planificador.add_command(label = "Agregar días")
        planificador.add_command(label = "Mostrar días")



        calendario = Menu(procesosYConsultas)
        calendario.add_command(label = "Crear calendario", command=crearCalendario)
        calendario.add_command(label = "Agregar planificador")
        calendario.add_command(label = "Mostrar planificadores")
        calendario.add_command(label = "Mostrar calendarios")





        proyecto = Menu(procesosYConsultas)
        proyecto.add_command(label = "Crear proyecto", command=crearProyecto)
        proyecto.add_command(label = "Dividir tarea")

        

        procesosYConsultas.add_cascade(menu = Asignaturas, label="Asignaturas")
        procesosYConsultas.add_cascade(menu = Clase, label="Clases")
        procesosYConsultas.add_separator()
        procesosYConsultas.add_cascade(menu = dia, label="Dia")
        procesosYConsultas.add_cascade(menu = planificador, label="Planificador")
        procesosYConsultas.add_cascade(menu = calendario, label="Calendario")
        procesosYConsultas.add_separator()
        procesosYConsultas.add_cascade(menu = proyecto, label="Proyecto")


        ayuda = Menu(menubar2)
        ayuda.add_command(label = "Acerca de", command=informacion)


        menubar2.add_cascade(menu = archivo, label="Archivo")
        menubar2.add_cascade(menu = procesosYConsultas, label="Procesos y consultas")
        menubar2.add_cascade(menu = ayuda, label="Ayuda")

        window['menu'] = menubar2





    calen1 = PhotoImage(file="imagenes/calen.png")
    calen2 = PhotoImage(file="imagenes/calen1.png")
    calen3 = PhotoImage(file="imagenes/calen2.png")



    # Ultimas configuraciones de inicio de aplicacion
    def Calen1():
        imagenCalendarios.config(image=calen1, command=Calen2)
    def Calen3():
        imagenCalendarios.config(image=calen3, command=Calen1)
    def Calen2():
        imagenCalendarios.config(image=calen2, command=Calen3)


    imagenCalendarios = Button(P4, image=calen1, command=Calen2)
    imagenCalendarios.config(width=150, height=250)
    imagenCalendarios.grid(row=1, column=1)


    botonIngresar = Button(P4, text="Ingresar al sistema", command=ingresarAlSistema)
    botonIngresar.grid(row=2, column=1)

    window['menu'] = menubar
    window.mainloop()