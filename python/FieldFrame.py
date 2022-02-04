
from shutil import ExecError
from tkinter import *
from revErrores.revErrores import revErrores
from errorAplicacion.errorAplicacion import errorAplicacion
from tkinter import messagebox


class FieldFrame(Frame):
    def __init__(self, window, accion):
        super().__init__(window, padx=20, pady=20)
        self.config()
        self.accion = accion
        fila=2
        

        atributo = Label(self, text="Atributo")
        atributo.grid(row=1, column=1)

        valor = Label(self, text="Valor")
        valor.grid(row=1, column=2)

        

        if(accion=="asignatura"):


            Label2 = Label(self, text="Nombre:")
            Label2.grid(row=fila, column=1)
            nombre = Entry(self)
            nombre.grid(row=fila, column=2)
            fila=fila+1


            label1 = Label(self, text="Profesor:")
            label1.grid(row=fila, column=1)
            profesor = Entry(self)
            profesor.grid(row=fila, column=2)
            fila=fila+1




        elif(accion=="clase"):


            Label1 = Label(self, text="Hora de inicio:")
            Label1.grid(row=fila, column=1)
            horaInicio = Entry(self)
            horaInicio.grid(row=fila, column=2)
            fila=fila+1

            label2 = Label(self, text="Hora de finalización:")
            label2.grid(row=fila, column=1)
            HoraFinal = Entry(self)
            HoraFinal.grid(row=fila, column=2)
            fila=fila+1

            label3 = Label(self, text="Asignatura:")
            label3.grid(row=fila, column=1)
            Asignatura = Entry(self)
            Asignatura.grid(row=fila, column = 2)
            fila=fila+1

            label4 = Label(self, text="Dia:")
            label4.grid(row=fila, column=1)
            Dia = Entry(self)
            Dia.grid(row=fila, column=2)
            fila=fila+1

        elif(accion=="dia"):
            Label1 = Label(self, text="Etiqueta:")
            Label1.grid(row=fila, column=1)
            self.etiqueta = Entry(self)
            self.etiqueta.grid(row=fila, column=2)
            fila=fila+1

            label2 = Label(self, text="Fecha:")
            label2.grid(row=fila, column=1)
            self.fecha = Entry(self)
            self.fecha.grid(row=fila, column=2)
            fila=fila+1

        elif(accion=="planificador"):
            Label1 = Label(self, text="Nombre:")
            Label1.grid(row=fila, column=1)
            nombre = Entry(self)
            nombre.grid(row=fila, column=2)
            fila=fila+1
        
        elif(accion=="calendario"):
            Label1 = Label(self, text="Nombre:")
            Label1.grid(row=fila, column=1)
            nombre = Entry(self)
            nombre.grid(row=fila, column=2)
            fila=fila+1
        
        elif(accion=="nota"):

            Label1 = Label(self, text="titulo:")
            Label1.grid(row=fila, column=1)
            titulo = Entry(self)
            titulo.grid(row=fila, column=2)
            fila=fila+1

            label2 = Label(self, text="Descripcion:")
            label2.grid(row=fila, column=1)
            descripcion = Entry(self)
            descripcion.grid(row=fila, column=2)
            fila=fila+1

        elif(accion=="proyecto"):


            Label1 = Label(self, text="titulo:")
            Label1.grid(row=fila, column=1)
            self.titulo = Entry(self)
            self.titulo.grid(row=fila, column=2)
            fila=fila+1

            label2 = Label(self, text="Asignatura:")
            label2.grid(row=fila, column=1)
            self.asignatura = Entry(self)
            self.asignatura.grid(row=fila, column=2)
            fila=fila+1

            label3 = Label(self, text="Fecha de entrega:")
            label3.grid(row=fila, column=1)
            self.fechaDeEntrega = Entry(self)
            self.fechaDeEntrega.grid(row=fila, column = 2)
            fila=fila+1

        else:
            Label1 = Label(self, text="Escoge una opción")
            Label1.grid(row=2, column=1)

        borrar = Button(self, command=self.borrarConsulta, width=15, height=1, text="Enviar consulta")
        borrar.grid(row=fila, column=2)




    def borrarConsulta(self):
        if self.accion == "dia":
            try:
                if self.etiqueta.get() == "" or self.fecha.get() == "":
                    raise errorAplicacion("campos de texto vacios")
                revErrores.formatoFecha(self.fecha.get())
            except errorAplicacion as e:
                error = messagebox.showinfo(title="Manejo de errores de la Aplicación",  message=e.toString())
                print(e)
                return
        elif self.accion == "proyecto":
            try:
                if self.titulo.get() == "" or self.asignatura.get() == "" or self.fechaDeEntrega.get() == "":
                    raise errorAplicacion("campos de texto vacios")
                revErrores.formatoFecha(self.fechaDeEntrega.get())
            except errorAplicacion as e:
                error = messagebox.showinfo(title="Manejo de errores de la Aplicación",  message=e.toString())
                print(e)
                return
        self.grid_forget()
        

    



