package pattern;
import java.util.Scanner;

public class pattern6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int i = 0;i<=n;i++){
            // loop for spaces
            for(int k=1;k<=i;k++){
                System.out.print("\t");
            }
            //loop for stars
            for(int j=n-i;j>=0;j--){
                System.out.print("*\t");
            }
           
            System.out.println();
        }
        scn.close();
    }
    
}
