package pattern;
import java.util.Scanner;


public class pattern2 {
    public static void main(String[] args) {
            Scanner scn = new Scanner( System.in);
            int n = scn.nextInt();
            int i,j;
          for(i=1;i<=n;i++){
              for(j=1;j<=n;j++){
                  System.out.print("*");
              }
              System.out.println();
          }
            scn.close();
            
        }
    
}
