package pattern;
import java.util.Scanner;

public class Fibbonacci {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
       int a = 0;
       int b = 1;
       int c =0;
       // int nst = (n*(n+1))/2;
        for(int i = 1;i<=n;i++){
              for(int j = 1;j<=i;j++){
            System.out.print(c + "\t");
        }
        System.out.println();
        c=a+b;
        a=b;
        b=c;
    }
    scn.close();
        }
        
    }

