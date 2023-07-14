package pattern;
import java.util.Scanner;

public class pattern13 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nsp = 0; // no of spaces
        int nst = 2*n-1;   // no of stars
        for (int i =0; i<=n;i++){
            for(int k=1; k<=nsp;k++){
                System.out.print("\t");
            }
           for(int j = 1; j<=nst;j++){
                System.out.print("*\t");
            }
           
            System.out.println();
            nsp++;
            nst-=2;
        }
        scn.close();
    }
    
}
