package basics;
import java.util.Scanner;
public class AnybasetoDecimal {
   public static int anybasetoDecimal(int snum , int sb) {
       int multiplier = 1;
       int ans =0;
       while(snum!=0){
           int rem = snum%10;
           ans = ans+(rem*multiplier);
           multiplier=multiplier*sb;
           snum=snum/10;
       }
       return ans;
   }
   public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
       int snum=scn.nextInt();
       int sb = scn.nextInt();
       int n = anybasetoDecimal(snum,sb);
       System.out.println(n);
       scn.close();
   }
}
