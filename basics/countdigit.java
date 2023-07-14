package basics;
import java.util.Scanner;
public class countdigit {
    public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
       int n = scn.nextInt();
       int digits = 0;
       while(n!=0){
           int rem = n%10;
           digits++;
           n=n/10;
        }
        System.out.println(digits);
       scn.close();
    }
}
