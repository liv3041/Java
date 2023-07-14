package basics;
import java.util.Scanner;


public class ElseIfDemo { 
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println(" Input number: ");
        int age = scn.nextInt();
        if(age<= 11){
            System.out.print("Child");
        }
         
        
    
        
        scn.close();
    }
    
}
