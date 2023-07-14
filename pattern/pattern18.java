package pattern;
import java.util.Scanner;

public class pattern18 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();
       int nsp = 2*n-2 ;
        int nr = 2*n-1;
        int nst = n;
        for(int i = 1; i<=nr; i++){
           for(int k = 1; k<=nsp;k++ ){
                System.out.print(" ");
           }
            for(int j = 1; j<=nst;j++){
                System.out.print("*");
            }
            System.out.println();
            if(i<=nr/2){
                nsp+=2;
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
