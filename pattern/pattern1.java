package pattern;
import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner( System.in);
        int n = scn.nextInt();
        int i = 1;
        while(i<=n){
            System.out.print("*");
            System.out.print("\n");
            i=i+1;
        }
        scn.close();
        
    }
}
