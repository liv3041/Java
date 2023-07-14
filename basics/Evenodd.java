package basics;
import java.util.Scanner;

public class Evenodd {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Input Number:");
        int n = scn.nextInt();
        if (n%2==0){
            System.out.println("The number is even");
        }
        else
          System.out.println("The number is odd ");
        scn.close();
    }

    
}
