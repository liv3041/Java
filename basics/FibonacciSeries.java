package basics;
import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a=0;
        int b=1;
        int i=1;
        int c =0;
        System.out.println("Fibonacci Series :");
        while(i<=n){
            c = a+b;
            a=b;
            b=c;
            i=i+1;
            System.out.print("\t " +c);
            
        }
        
        scn.close();

    }
    
}
