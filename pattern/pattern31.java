package pattern;
import java.util.Scanner;
public class pattern31 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
       int n = scn.nextInt();
       int st = 1;
       int sp = 2*n-1;
       int val = n;
       for(int i = 1;i<=n+1;i++){
           int a = val;
          for(int j = 1;j<=st;j++){
            System.out.print(a +"\t");
               if(i<=n+1){
                   a--;
                }
             }
           for(int k = 1;k<=sp;k++){
            System.out.print("\t");
           }
        int j = 1;
          if(i==n+1){
              j=2;
              a=0;
          }
           for(;j<=st;j++){
              if(i<=n+1){
               a++;
             }
            System.out.print(a+"\t");
              
           }
           System.out.println();
           st++;
           sp-=2;
        }
        int nsp = 0;
	    int nst = n;
        int value = n;
	    for(int i = 0;i<=n;i++){
            int  b = value;
	        for(int j = 1;j<=nst;j++){
	            System.out.print(b +"\t");
               if(i<=n+1){
                   b--;
                }
	        }
	        for(int k = 0;k<=nsp;k++){
	            System.out.print("\t");
	        }
	       
	        for(int j = 1;j<=nst;j++){
                if(i<=n+1){
                    b++;
                  }
                System.out.print(b +"\t");
	        }
	        System.out.println();
	        nst--;
	        nsp+=2;
        }
       scn.close();
    }
}
