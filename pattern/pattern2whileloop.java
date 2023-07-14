package pattern;
import java.util.Scanner;

public class pattern2whileloop {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int i=1;
        while (i<=n){
            int j = 1;
            while(j<=n){
                System.out.print("*");
                j++;
            }
          System.out.println();
          i++;  
        }
        scn.close();
    }
    
}
