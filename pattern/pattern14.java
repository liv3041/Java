package pattern;
import java.util.Scanner;

public class pattern14 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
       // int nsp = n-1; // no of spaces
        int nst = 2*n-1;   // no of stars
    
        for (int i =1; i<=n;i++){
            int cnt=1;
            for(int j = 1; j<=nst;j++){
               if((i+j == 6 || i+j == 8  || i+j== 10 || i+j==12  || i+j==14) && cnt<=i ){
                   System.out.print("*");cnt++;
               }
               else
                 System.out.print(" ");
                }System.out.println();
            }
            
            //nsp--;
            // nst+=2;
            scn.close();
        }

        

    }
    

