package pattern;
import java.util.Scanner;
public class pattern35 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nst =1;
        int nsp = n-1;
        int a =1;
        for(int i = 1;i<=n;i++){
            int val =a;
            for(int k = 1;k<=nsp;k++){
                System.out.print("\t");
            }
            for(int j = 1;j<=nst;j++){
                System.out.print(val + "\t");
                if(j<=nst/2){
                     val++;
                }
                else{
                    val--;
                }
            }
            System.out.println();
            nst+=2;
            nsp--;
            a++;
        }
        scn.close();
    }
}
