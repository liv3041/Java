package basics;
import java.util.Scanner;

public class UppercaseOrLowercase {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println(" Enter Character: ");
        char ch = scn.next().charAt(0);
        if(ch>=65 && ch<= 90){
            System.out.println("UpperCase");
        }
        else if(ch>=97&& ch<=122){
            System.out.println("LowerCase");
        }
        else{
            System.out.println("Invalid Character!!");
        }

        scn.close();

    }
    

    
}
