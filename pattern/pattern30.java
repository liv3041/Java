package pattern;
import java.util.Scanner;

public class pattern30 {
    public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
       int n = scn.nextInt();
       int st = 1;
       int sp = 2*n-1;
       for(int i = 1;i<=n+1;i++){
           for(int j = 1;j<=st;j++){
               System.out.print("*");
              
           }
           for(int k = 1;k<=sp;k++){
            System.out.print(" ");
           }
          int j = 1;
          if(i==n+1){
              j =2;
          }
           for(;j<=st;j++){
               System.out.print("*");
              
           }
           System.out.println();
           st++;
           sp-=2;
        }
         int nsp = 0;
	    int nst = n;
	    for(int i = 0;i<=n;i++){
	        for(int j = 1;j<=nst;j++){
	            System.out.print("*");
	        }
	        for(int k = 0;k<=nsp;k++){
	            System.out.print(" ");
	        }
	       
	        for(int j = 1;j<=nst;j++){
	            System.out.print("*");
	        }
	        System.out.println();
	        nst--;
	        nsp+=2;
        }
       scn.close();
    }
}
