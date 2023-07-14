package pattern;
import java.util.Scanner;

public class pattern25 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nst = 1;
        int nsp = n-1;
        for(int i= 1;i<=n;i++){
            for(int k= 1; k<=nsp;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=nst;j++){
                int a =i;
                for(int c=a;c>0;c--){
                    System.out.println(c);
                }
                
                for(int h =1; h<=a;h++){
                    System.out.println(h);
                }
                }
            for(int k= 1; k<=nsp;k++){
                System.out.print(" ");
            }
            System.out.println();
            if(i<=n/2){
                nst+=4;
                nsp-=2;
            }
            else{
                nst-=4;
                nsp+=2;
            }
        }
       scn.close();
    }
    
}
