package pattern;
import java.util.Scanner;

public class pattern17 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nr = 2*n-1;
        int nsp = 2*n-2; //spaces
        int k = 1;
        for(int i = 1; i<= nr; i++){
            //loop for spaces
            for(int p = 1;p<=nsp;p++){
                System.out.print(" ");

            }
            //loop for stars
            for(int j=1;j<=k;j++){
                if(j%2==0){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
             }
             System.out.println();
             if(i<=nr/2){
                 k+=2;
                 nsp-=2;
             }
             else{
                 k-=2;
                 nsp+=2;

             }

        }
        scn.close();

    }
    
}
