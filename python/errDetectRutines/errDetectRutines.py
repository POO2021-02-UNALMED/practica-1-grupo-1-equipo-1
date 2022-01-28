from python.errorAplicacion.errorAplicacion import *
from python.errorAplicacion.errorTexto.errorFormatoFecha import *
from python.errorAplicacion.errorTexto.errorOrdenFecha import *

class errDetectRutines():
    @classmethod
    def formatoFecha(cls, fecha):
        if len(fecha) != 10:
            raise errorFormatoFecha("Error al escribir la fecha")
            #return "Error al escribir la fecha"
        if fecha[2] != '-' or fecha[5] != '-':
            raise errorFormatoFecha("Error al escribir el formato")
            #return "Error al escribir el formato"
        try:
            d=int(fecha[:2])
            m=int(fecha[3:5])
            a=int(fecha[6:])

            if d > 31 or d < 1:
                raise errorFormatoFecha("Error con los limites del dia")
                #return "Error con los limites del dia"
            if m < 1 or m > 12:
                raise errorFormatoFecha("Error con los limites del mes")
                #return "Error con los limites del mes"

        except ValueError:
            raise errorFormatoFecha("Error al escribir los numeros")
            #return "Error al escribir los numeros"

    @classmethod
    def compararFechas(cls, fechaIn, fechaFin):
        cls.formatoFecha(fechaIn)
        cls.formatoFecha(fechaFin)

        d=int(fechaIn[:2])
        m=int(fechaIn[3:5])
        a=int(fechaIn[6:])
        cmd1 = d+m*31+a*31*12

        d=int(fechaFin[:2])
        m=int(fechaFin[3:5])
        a=int(fechaFin[6:])
        cmd2 = d+m*31+a*31*12

        if cmd1 > cmd2:
            raise errorOrden("No se pueden utilizar fechas despues de la entrega")


    def errorDeTipo():
        pass

if __name__ == "__main__":
    try:
        errDetectRutines.compararFechas("13-12-7890", "14-12-7890")

    except errorAplicacion as e:
        print(e)

    else:
        print("works!!")