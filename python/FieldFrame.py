
from tkinter import *



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
            etiqueta = Entry(self)
            etiqueta.grid(row=fila, column=2)
            fila=fila+1

            label2 = Label(self, text="Fecha:")
            label2.grid(row=fila, column=1)
            fecha = Entry(self)
            fecha.grid(row=fila, column=2)
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
            titulo = Entry(self)
            titulo.grid(row=fila, column=2)
            fila=fila+1

            label2 = Label(self, text="Asignatura:")
            label2.grid(row=fila, column=1)
            asignatura = Entry(self)
            asignatura.grid(row=fila, column=2)
            fila=fila+1

            label3 = Label(self, text="Fecha de entrega:")
            label3.grid(row=fila, column=1)
            fechaDeEntrega = Entry(self)
            fechaDeEntrega.grid(row=fila, column = 2)
            fila=fila+1

        else:
            Label1 = Label(self, text="Escoge una opción")
            Label1.grid(row=2, column=1)

        borrar = Button(self, command=self.borrarConsulta, width=15, height=1, text="Enviar consulta")
        borrar.grid(row=fila, column=2)




    def borrarConsulta(self):
        self.grid_forget()
        

    



