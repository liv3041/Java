package basics;
import java.util.Scanner;
public class GCD {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter dividend and the divisor:");
        int dividend = scn.nextInt();
        int divisor = scn.nextInt();
        while(dividend%divisor!=0){
            int remainder = dividend % divisor;
            dividend = divisor;
            divisor = remainder;

        }

        System.out.print("The GCD is " + divisor);

        scn.close();

    }
    
}
