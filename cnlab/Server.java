package cnlab;
import java.io.*;  
import java.net.*;  

public class Server {
    public static void main(String[] args) {
        try{  
            ServerSocket a=new ServerSocket(6666);  
            Socket s=a.accept();//establishes connection   
            DataInputStream dis=new DataInputStream(s.getInputStream());  
            String  str=(String)dis.readUTF();  
            System.out.println(" Message: " +str);  
            a.close();  
            }
            catch(Exception e){
                System.out.println(e);
            }  
        }  
    }
    