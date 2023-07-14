package pattern;
import java.util.Scanner;

public class pattern8 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int i =1;
        while(i<=n){
            // space
            int k = 2*i-2;
            while(k>0){
                System.out.print("\t");
                k--;
            }
            int j=i;
            while(j<=n){
                System.out.print("*\t");
                j++;
            }
            i++;
            System.out.println();
        }
        scn.close();
    }
    
}
