package pattern;
import java.util.Scanner;
public class pattern34 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nsp = n+1;
        int val = 1;
        int nst = 1;
        for(int i = 1;i<=n;i++){
            int   a = val;
            for(int j=1;j<=nst;j++){
                System.out.print(j+"\t");
               
            }
            for(int k= 1;k<=nsp;k++){
                System.out.print("\t");
            }
            int j = 1;
            if(i==n){
                j=2;
                a=0;
            }
            for(;j<=nst;j++){
                System.out.print(a+"\t");
                if(i<n){
                    a++;
                }
               
               
            }
            System.out.println();
            nsp-=2;
            nst++;
        }
        scn.close();
    }
}
