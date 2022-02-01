
from tkinter import *

window = Tk()
window.title("Hello Word")

window.geometry("600x600")
window.option_add('*tearOff', FALSE)


def evento():
    pass

menubar = Menu(window)

menu1 = Menu(menubar)
menu2 = Menu(menubar)

menubar.add_cascade(menu=menu1, label='Menu1', command=evento)
menubar.add_cascade(menu=menu2, label='Menu2', command=evento)



menu1.add_command(label="item1", command=evento)
menu1.add_command(label="item2", command=evento)
menu2.add_command(label="item3", command=evento)
menu2.add_command(label="item4", command=evento)



window['menu'] = menubar

fr = Frame(window)

fr.config(bg="blue")
fr.config(width="150", height="200")
fr.grid(row=1, column=1)

fr2 = Frame(window)

fr2.config(bg="red")

fr2.grid(row=2, column=2)


lbl = Label(fr2, text="Hello")
lbl.grid(column = 0, row = 0)
txt = Entry(fr2)
txt.grid(column = 1, row = 0)


def clickON():
    lbl.configure(text = txt.get())

    
btn = Button(fr2, text = "Click Me", command = clickON, width="20")
btn.grid(column=1, row=1)

window.mainloop()