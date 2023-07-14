package cnlab;
import java.net.*;  
import java.io.*;  

public class Question4_Client {
    public static void main(String[] args) {
        try{
            Socket s=new Socket("LAPTOP-PN6JQ9AA",3333);  
            DataInputStream d_in=new DataInputStream(s.getInputStream());  
            DataOutputStream d_out=new DataOutputStream(s.getOutputStream());  
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
            
            String str="",st="";  
            while(!str.equals("stop")){  
            str=br.readLine();  
            d_out.writeUTF(str);  
            d_out.flush();  
            st=d_in.readUTF();  
            System.out.println("Server says: "+st);  
            }  
            
            d_out.close();  
            s.close();  
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
}
