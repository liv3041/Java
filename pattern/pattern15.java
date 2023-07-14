package pattern;
import java.util.Scanner;

public class pattern15 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
       // int nsp = n-1; // no of spaces
        int nst = 2*n-1;   // no of stars
    
        for (int i =1; i<=n;i++){
            int cnt=1;
            int ct=1;
            for(int j = 1; j<=nst;j++){
               if((i+j == 6 || i+j == 8  || i+j== 10 || i+j==12  || i+j==14) && cnt<=i ){
                   System.out.print("*");cnt++;
               }
               else{
                if((i+j == 7 || i+j == 9  || i+j== 11 || i+j==13  || i+j==15) && ct<i ){
                    System.out.print("!");ct++;
                }
                else
                System.out.print(" ");
            }
        }
        System.out.println();
    }
            
            //nsp--;
            // nst+=2;
            scn.close();
        }
    
}
