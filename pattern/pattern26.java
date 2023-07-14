package pattern;
import java.util.Scanner;

public class pattern26 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nr = 2*n+1;
        int u =1;
        int k = 1;
        int nsp = 2*n-1;
        for(int i=1;i<=nr;i++){
            int j;
          
            for (j= 1;j<=k;j++){
                System.out.print("*");
            }
            for(int p = 1;p<=nsp;p++){
                System.out.print(" ");
                
            }
            if(i==5&&j==nr){
                System.out.print("");
            }
            for(j =1;j<=u;j++){
                System.out.print("*");
               
                
            }
            System.out.println();
            if(i<=nr/2){
                k+=1;
                u+=1;
                nsp-=2;
                
            }
            else{
               
                
                    
                k-=1;
                u-=1;
                nsp+=2;

                
        
            }
        }
        scn.close();
    }
    
}
