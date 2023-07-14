package basics;
import java.util.Scanner;

public class FtoC {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int f = scn.nextInt();
        int c; 
        c =(f-32)*5/9;
        System.out.println(c);
        scn.close();
        
    }
    
}
