package pattern;
import java.util.Scanner;
public class pattern37 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nsp = n-1;
        for(int i = 1;i<=n;i++){
            for(int k = 1;k<=nsp;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                if(i==1 || i==n){
                   System.out.print("*");
                }
                else{
                    if(j==1 || j==n){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
            nsp--;
        }
        scn.close();
    }
}
