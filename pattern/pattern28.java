package pattern;
import java.util.Scanner;

public class pattern28 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
      int n=scn.nextInt();
        int st = 2*n+1;
        int nsp =0;
        int val = n;
       for(int i=1;i<=n;i++){
          int a = val;
            for(int k=1;k<=nsp;k++){
                System.out.print("\t");
            }
            for(int j=1;j<=st;j++){
                System.out.print(a+"\t");
                if(j<=st/2){
                    a--;
                }
                else{
                  a++;
                }
            }
            System.out.println();
            st-=2;
            nsp++;
            val--;
        }
        int sp = n;
        int nst = 1;
        for(int j = 0;j<=n;j++){
           int b = j;
          for(int k= 1;k<=sp;k++){
                System.out.print("\t");
            }
            for(int i= 1;i<=nst;i++){
                System.out.print(b+"\t");
                if(i<=nst/2){
                    b--;
                }
                else{
                    b++;
                }
            }
            System.out.println();
            sp--;
            nst+=2;
        }
        scn.close();
    }

    
}
