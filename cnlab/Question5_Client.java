package cnlab;
import java.io.*;
import java.net.*;

public class Question5_Client {
    private static InetAddress host;
	private static final int PORT = 8080;
	private static Socket link;
	private static BufferedReader in;
	private static PrintWriter out;
	private static BufferedReader keyboard;
    public static void main(String[] args) {
        try
		{
			host = InetAddress.getLocalHost();
			link = new Socket(host, PORT);
			in = new BufferedReader(new InputStreamReader(link.getInputStream()));
			out = new PrintWriter(link.getOutputStream(),true);
            keyboard = new BufferedReader(new InputStreamReader(System.in));
            String message, response;
			do
			{
				System.out.print("Enter message ('stop' to exit): ");
				message = keyboard.readLine();
                out.println(message);
                response = in.readLine();
                System.out.println(response);
			}while (!message.equals("stop"));
		}
		catch(UnknownHostException uhEx)
		{
			System.out.println("Host ID not found!");
		}
		catch(IOException e)
		{
            e.printStackTrace();
		}
		finally
		{
			try
			{
				if (link!=null)
				{
					System.out.println("Closing down connection...");
					link.close();
				}
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
    }


    
}
