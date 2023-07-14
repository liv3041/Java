from tkinter import *
from tkinter import Tk
from tkinter import filedialog
from pygame import mixer
import os
from PIL import Image , ImageTk
# Creating root window for python mp3 music player
root = Tk()                  # initialising the main window
root.title('Music player project by Anjali Verma')  #setting title
root.geometry("920x670+290+85")              #dimensions
root.configure(bg="#0f1a2b")               #backgroundcolor
root.resizable(False,False)       
mixer.init()                   
#Create music player functions to player mp3
def Add_Music():                            # function for adding music from directory
    path = filedialog.askdirectory()
    if path:
        os.chdir(path)
        songs = os.listdir(path)
        for song in songs:
            if song.endswith(".mp3"):
                Playlist.insert(END,song)
def Play_Music():
    print("Playing....")
    Music_Name = Playlist.get(ACTIVE)
    print(Music_Name[0:-4])
    
    mixer.music.load(Playlist.get(ACTIVE))
    mixer.music.play()
#icon
# win = Tk()
# win.geometry("750x270")
# canvas = Canvas(win,width=600,height=400)
# canvas.pack()
# img=Image.open("D:\Java\leetcode\player.png")
# resized_image = img.resize((300,205),Image.Resampling.LANCZOS)
# new_image = ImageTk.PhotoImage(resized_image)
# canvas.create_image(10,10,anchor=NW,image=new_image)
# win.mainloop()
Icon_Image= PhotoImage(file="D:\Java\leetcode\player.png")
root.iconphoto(False,Icon_Image)
Top_Image=PhotoImage(file="D:\Java\leetcode\logo.png")
Label(root,image=Top_Image,bg="#0f1a2b").pack()
#logo
logo_Image = PhotoImage(file="D:\Java\leetcode\logo.png")
Label(root,image=logo_Image,bg="#0f1a2b").place(x=65,y=115)
#Creating music Player buttons
Button_Play =PhotoImage(file="D:\Java\leetcode\play.png")
Button(root,image=Button_Play,bg="#0f1a2b",bd=0,command=Play_Music).place(x=100,y=400)

Button_Play =PhotoImage(file="D:\Java\leetcode\stop.png")
Button(root,image=Button_Play,bg="#0f1a2b",bd=0,command=mixer.music.stop).place(x=30,y=500)
 
Button_Play =PhotoImage(file="D:\Java\leetcode\pause.png")
Button(root,image=Button_Play,bg="#0f1a2b",bd=0,command=mixer.music.pause).place(x=200,y=500)

#music
Menu = PhotoImage(file="D:\Java\leetcode\menu.png")
Label(root,image=Menu,bg="#0f1a2b").pack(padx=10,pady=50,side=RIGHT)

Frame_Music = Frame(root,bd=2,relief=RIDGE)
Frame_Music.place(x=330,y=350,width=560,height=250)
Button(root,text="Add Music", width=100,font=("Times new roman",10),bg="#21b3de",command=Add_Music).place(x=330,y=300)
Scroll =Scrollbar(Frame_Music)
Playlist = Listbox(Frame_Music,width =100,font=("Times new Roman",10),bg="#333333",fg="grey",selectbackground="lightblue",cursor="hand2",bd=0,yscrollcommand=Scroll.set)
Scroll.config(command=Playlist.yview)
Scroll.pack(side=RIGHT,fill=Y)
Playlist.pack(side=LEFT,fill=BOTH)
root.mainloop()


