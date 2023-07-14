package basics;
import java.util.Scanner;

public class UserInput {
        public static void main(String[] args){
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
            System.out.println("The required number is " + n);
            scn.close();
        }
    }