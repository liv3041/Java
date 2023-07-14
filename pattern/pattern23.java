package pattern;
import java.util.Scanner;

public class pattern23 {
    public static void main(String[] args) {
        Scanner scn= new Scanner (System.in);
        int n = scn.nextInt();
        int nst = n;
        int nsp = 0;
        for (int i= 1;i<=n;i++){
            for(int j=1;j<=nst;j++){
                System.out.print("*");
            }
            for(int k=1;k<=nsp;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=nst;j++){
                System.out.print("*");
            }
            System.out.println();
            if(i<=n/2){
                nsp=+2;
                nst--;
            }
            else{
                nsp-=2;
                nst++;
            }
        }
        scn.close();
    }
    
}
