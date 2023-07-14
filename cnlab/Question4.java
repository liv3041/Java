package cnlab;
import java.net.*;  
import java.io.*;  

public class Question4 {
    public static void main(String[] args) {
        try{
            ServerSocket a =new ServerSocket(3333);  
            Socket s=a.accept();  
            DataInputStream d_in=new DataInputStream(s.getInputStream());  
            DataOutputStream d_out=new DataOutputStream(s.getOutputStream());  
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
            
            String str="",st="";  
            while(!str.equals("stop")){  
            str=d_in.readUTF();  
            System.out.println("client says: "+str);  
            st=br.readLine();  
            d_out.writeUTF(st);  
            d_out.flush();  
            }  
            d_in.close();  
            s.close();  
            a.close(); 
        }
        catch(Exception e){
            System.out.println(e);
        }  
    }
}
