package pattern;
import java.util.Scanner;


public class pattern27 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int st = 2*n+1;
        int nsp =0;
       for(int i=1;i<=n;i++){
            for(int k=1;k<=nsp;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=st;j++){
               System.out.print("*");
          }
            System.out.println();
            st-=2;
            nsp++;
        }
        int sp = n;
        int nst = 1;
        for(int j = 1;j<=n+1;j++){
           
            for(int k= 1;k<=sp;k++){
                System.out.print(" ");
            }
            for(int i= 1;i<=nst;i++){
               System.out.print("*");
            }
            System.out.println();
            sp--;
            nst+=2;
            
        }
        scn.close();
    }
    
}
