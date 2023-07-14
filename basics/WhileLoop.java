package basics;
import java.util.Scanner;
public class WhileLoop {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();// Intialisation done by user
        while(n<5){ // Condition
            System.out.println("Hello World");
            //Incrementation
            n = n+1; // Same as n++
            
        }
        System.out.println("This statement will print regardless the loop is executed or not. ");
        scn.close();
    }
    
}
