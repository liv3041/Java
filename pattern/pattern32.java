package pattern;
import java.util.Scanner;

public class pattern32 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nst = n-1;
        for(int i =1;i<=n;i++){
            for(int j = 1;j<=i;j++){
                System.out.print(j);
            }
            for(int k = 1;k<=nst;k++){
                System.out.print("*");
            }
            System.out.println();
            nst--;
        }
        scn.close();
    }
}
