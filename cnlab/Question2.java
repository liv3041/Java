package cnlab;
import java.net.*; 
import java.util.*;

public class Question2 {
    public static void main(String[] args) {
        String hostname; 
		Scanner scn = new Scanner(System.in); 
		System.out.println("Enter the name of host: "); 
		hostname = scn.nextLine(); 
		try { 
			InetAddress address = InetAddress.getByName(hostname);
			System.out.println("IP address: " + address.getHostAddress());
			System.out.println("Host name : " + address.getHostName());  
			} 
		catch (UnknownHostException ex) {
		     System.out.println("Could not find " + hostname); 
		}
        scn.close();
	} 
}    