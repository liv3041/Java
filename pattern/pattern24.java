package pattern;
import java.util.Scanner;

public class pattern24 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nsp = 1;
        int nst = (n/2);
        for(int i = 1;i<=n;i++){
            int j;
           for(j=0;j<=nst;j++){
            System.out.print("*");
           } 
            for (int k=0;k<nsp-1;k++){
                System.out.print(" ");
            }
            for(j=1;j<=nst;j++){
                System.out.print("*");
            }
            System.out.println();
            if(i<=n/2){
                nsp+=1;
                nst--;
            }
            else{
                nsp-=1;
                nst++;
            }
        }
        scn.close();
    }
    
}
