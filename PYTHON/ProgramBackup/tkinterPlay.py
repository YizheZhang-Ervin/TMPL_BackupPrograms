import tkinter as tk
import tkinter.messagebox
import pickle

window = tk.Tk()
window.title('WindowName')
window.geometry('500x300')

varBt = tk.StringVar()
l = tk.Label(window, textvariable=varBt, bg='black', fg='white',font=('Arial', 18), width=30, height=2)
l.pack()

btnTest = False
def beatIt():
    global btnTest
    if btnTest == False:
        btnTest = True
        varBt.set('Test ok')
    else:
        btnTest= False
        varBt.set('Test not ok')
b = tk.Button(window, text='BeatIt', font=('Arial', 18), width=10, height=1, command=beatIt)
b.pack()

e1 = tk.Entry(window, show='*', font=('Arial', 14))
e2 = tk.Entry(window, show=None, font=('Arial', 14))
e1.pack()
e2.pack()

def insert_point():
    var = e2.get()
    t.insert('insert', var)
def insert_end():
    var = e2.get()
    t.insert('end', var)
b1 = tk.Button(window, text='insert point', width=10,height=2, command=insert_point)
b1.pack()
b2 = tk.Button(window, text='insert end', width=10,height=2, command=insert_end)
b2.pack()
t = tk.Text(window, height=3)
t.pack()

var1 = tk.StringVar()
l2 = tk.Label(window, bg='blue', fg='yellow',font=('Arial', 18), width=10, textvariable=var1)
l2.pack()
def print_selectionLB():
    value = lb.get(lb.curselection())
    var1.set(value)
b1 = tk.Button(window, text='print selection', width=15, height=2, command=print_selectionLB)
b1.pack()
var2 = tk.StringVar()
var2.set((1,2,3,4))
lb = tk.Listbox(window, listvariable=var2)
list_items = [11,22,33,44]
for item in list_items:
    lb.insert('end', item)
lb.insert(1, 'first')      
lb.insert(2, 'second')   
lb.delete(2)            
lb.pack()

l3 = tk.Label(window, bg='blue', fg='yellow',font=('Arial', 18), width=10, text='l3')
l3.pack()
var3=tk.StringVar()
def print_selectionRB():
    l3.config(text='you have selected ' + var3.get())
r1 = tk.Radiobutton(window, text='Option A', variable=var3, value='A', command=print_selectionRB)
r1.pack()
r2 = tk.Radiobutton(window, text='Option B', variable=var3, value='B', command=print_selectionRB)
r2.pack()
r3 = tk.Radiobutton(window, text='Option C', variable=var3, value='C', command=print_selectionRB)
r3.pack()   

l4 = tk.Label(window, bg='blue', fg='yellow',font=('Arial', 18), width=10, text='l4')
l4.pack()
def print_selectionCB():
    if (var1.get() == 1) & (var2.get() == 0): 
        l4.config(text='I love only Python ')
    elif (var1.get() == 0) & (var2.get() == 1):
        l4.config(text='I love only C++')
    elif (var1.get() == 0) & (var2.get() == 0):
        l4.config(text='I do not love either')
    else:
        l4.config(text='I love both')
var1 = tk.IntVar()
var2 = tk.IntVar()
c1 = tk.Checkbutton(window, text='Python',variable=var1, onvalue=1, offvalue=0, command=print_selectionCB)
c1.pack()
c2 = tk.Checkbutton(window, text='C++',variable=var2, onvalue=1, offvalue=0, command=print_selectionCB)
c2.pack()

l5 = tk.Label(window, bg='blue', fg='yellow',font=('Arial', 18), width=10, text='l5')
l5.pack()
def print_selectionS(v):
    l5.config(text='you have selected ' + v)
s = tk.Scale(window, label='try me', from_=0, to=10, orient=tk.HORIZONTAL, length=200, showvalue=0,tickinterval=2, resolution=0.01, command=print_selectionS)
s.pack()

def hit_me():
    tkinter.messagebox.showinfo(title='Hi', message='你好！')        
    tkinter.messagebox.showwarning(title='Hi', message='有警告！')      
    tkinter.messagebox.showerror(title='Hi', message='出错了！')         
    print(tkinter.messagebox.askquestion(title='Hi', message='你好！'))  
    print(tkinter.messagebox.askyesno(title='Hi', message='你好！'))     
    print(tkinter.messagebox.askokcancel(title='Hi', message='你好！')) 
tk.Button(window, text='hit me', bg='green', font=('Arial', 14), command=hit_me).pack()

window.mainloop()