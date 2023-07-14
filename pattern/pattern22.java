package pattern;
import java.util.Scanner;

public class pattern22 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();
        int nsp =n-1;
        int nst = 1;
       // int sp = 1;
        for(int i=1;i<=n;i++){
            for( int k=1;k<=nsp;k++){
                System.out.print(" ");
            }
            for (int j= 1;j<=nst;j++){
                System.out.print("*");
                if(i>=2&& (j==1|| j==3||j==5)){
                 System.out.print(" ");
                }
            }
            for( int k=1;k<=nsp;k++){
                System.out.print(" ");
            }
           
            
            System.out.println();
            if( i<=n/2){
                nsp-=2;
                nst+=4;
            }
            else{
                nsp+=2;
                nst-=4;
            }
           
           
           

            
        }
        scn.close();
    }
    
}
