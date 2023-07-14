package cnlab;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Question1 {
    public static void main(String[] args) {
        InetAddress ip;
        String hostname;
        try {
            ip = InetAddress.getLocalHost();
            hostname = ip.getHostName();
            System.out.println("IP address : " + ip);
            System.out.println("Local Hostname : " + hostname);
 
        } catch (UnknownHostException e) {
 
            e.printStackTrace();
        }
    }
    
}
