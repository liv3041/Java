package pattern;
import java.util.Scanner;

public class pattern29 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        for(int i = 1; i<=n;i++){
            int val = i;
            for(int j = 1;j<=i;j++){
                if( j==1 &&i== 1){
                  System.out.print(1);
                }
                else if((j==1 && i>=2)|| i==j){
                    System.out.print(val-1);
                }
                else{
                   System.out.print("0");
                }
            }
            System.out.println();
            val--;
        }
        scn.close();
    }
    
}
