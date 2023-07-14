package pattern;
import java.util.Scanner;
public class pattern38 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nst = (n+1)/2;
        int nsp = -1;
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=nst;j++){
                 System.out.print("*\t");
                }
                for(int k =1;k<=nsp;k++){
                    System.out.print("\t");
                }
                int j=1;
                if(i== 1||i==n){
                    j=2;
                }
                for(;j<=nst;j++){
                    System.out.print("*\t");
                }
                System.out.println();
                if(i<=n/2){
                    nst--;
                    nsp+=2;
                }
                else{
                    nst++;
                    nsp-=2;
                }
            }
            scn.close();
        }
      

    }

