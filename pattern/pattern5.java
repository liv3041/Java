package pattern;
import java.util.Scanner;

public class pattern5 {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        int n = scn.nextInt();
        for(int i = 1; i<=n;i++){
            //loop for the spaces
            for(int j = n-i;j>=0;j--){
                System.out.print("\t");
            }
            //loop for the stars
            for(int k=1;k<=i;k++){
                System.out.print("*\t");
            }
            System.out.println();
        }
        scn.close();
    }
    
}
