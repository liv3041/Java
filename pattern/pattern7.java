package pattern;
import java.util.Scanner;

public class pattern7 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        if (n%2!=0){
        int nsp = n-1;
        int nst = 1;
        int sp =1;
        int st=1 ;
        int val;
        int cnt = n/2;
        int a;
        for(int i =1;i<=n;i++){
            val = i;
              a = cnt;
            for(int k=1;k<=nsp;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=nst;j++){
                 if(i<=(n+1)/2){
                System.out.print(val);
                   val--;
                }
                else{
                    if(i>=5){
                        System.out.print(a);
                        a--;
                    }
                }
                
               }
            if(i==2){
                sp=1;
                st=2;
            }
            for(int k=1;k<=sp;k++){
                 System.out.print(" ");
            }
            int j=1;
            if(i==n || i==1){
                j=2;
            }
            for(;j<=st;j++){
                System.out.print(j);
            }
            System.out.println();
            if(i>=5){
                cnt--;
            }
           if(i<=n/2){
                nsp-=2;
                nst++;
                sp+=2;
                st++;
            }
            else{
                nsp+=2;
                nst--;
                sp-=2;
                st--;
            }
        }
    }
        scn.close();

    }
    
}
