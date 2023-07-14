package pattern;
import java.util.Scanner;

public class pattern21 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nsp=n/2;
        int nst = 1;
        for(int i=1;i<=7;i++){
            for(int k =1;k<=nsp;k++){
                System.out.print(" ");
            }
            for(int j= 1;j<=nst;j++){
                System.out.print("*");
            }
            for(int k =1;k<=nsp;k++){
                System.out.print(" ");
            }
            System.out.println();
            if(i<=n/2){
                nsp--;
                nst+=2;
            }
            else{
               nsp++;
               nst-=2;
            }
        }
        scn.close();
        

    }
    
}
