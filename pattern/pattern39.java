package pattern;
import java.util.Scanner;
public class pattern39{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nst=1;
        int nsp=2*n-3;
        for(int i=1;i<=n;i++){
            int val=1;
            int value=i;
            for(int j=1;j<=nst;j++){
                System.out.print(val+"\t");
                if(i<=n){
                    val++;
                }
            }
            for(int k=1;k<=nsp;k++){
                System.out.print("\t");
            }
            int j=1;
            if(i==n){
                j=2;
                value=n-1;
            }
            for(;j<=nst;j++){
                System.out.print(value+"\t");
                if(i<=n){
                    value--;
                }
            }
            System.out.println();
            nst++;
            nsp-=2;
          
        }
        scn.close();
    }
}