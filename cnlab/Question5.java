package cnlab;
import java.net.*;  
import java.io.*; 


public class Question5 {
    private static ServerSocket servSocket;
    private static final int PORT = 8080;
    public static void main(String[] args){
        try{
            servSocket = new ServerSocket(PORT);
        }
        catch (IOException e){
            System.out.println("Unable to set up port!");
            System.exit(1);
        }
        do
        {
            try{
                Socket client = servSocket.accept();
                System.out.println("New Client Accepted.");
                ClientHandler handler = new ClientHandler(client);
                handler.start();
            }
            catch (IOException e){
                System.out.println("Unable to Accept the Client!");
                System.exit(1);
            }
           
            
        }while (true);

    }

}

class ClientHandler extends Thread
{

    private Socket client;
    private BufferedReader in;
    private PrintWriter out;
    public ClientHandler(Socket socket)
    {
        client = socket;
        try
        {
            in = new BufferedReader(new InputStreamReader(client.getInputStream()));
            out = new PrintWriter(client.getOutputStream(),true);

        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
public void run()
{
    try{
        String received;
        do{
            received = in.readLine();
            out.println("BOT: " + received);
        }
        while(!received.equals("stop"));
     }
     catch(IOException e)
     {
         e.printStackTrace();
        }
        finally
        {
            try
            {
                if (client!=null)
                {
                    System.out.println("Closing down connection...");
                    client.close();
                }
            }
            catch(IOException e)
            {
                e.printStackTrace();
          }
        }
    }
}
