package pattern;
import java.util.Scanner;



public class pattern11 {
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int i = 1; i<=n;i++){
            for(int j = 1; j<=n;j++){
                if ( j==i){
                    System.out.print("*");
                }
                else{
                    if(j== n-i+1){
                        
                        System.out.print("*");
                    }
                    else
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
        scn.close();
    }
}
