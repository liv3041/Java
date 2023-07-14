package pattern;
import java.util.Scanner;
public class pattern33 {
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int st =n;
        int nst =1;
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=st;j++){
                System.out.print(j);
            }
            
            if (i>=2){
                
               for(int k =1;k<=nst;k++){
                    System.out.print("*");
                }
                nst+=2;  
            }
           System.out.println();
           
            st--;
        }
        scn.close();
    }
}
