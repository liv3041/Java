package basics;
import java.util.Scanner;
public class binarytoDecimal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a = 2;
        int multiplier = 1;
        int ans = 0;
       while(n!=0){
            int rem = n%10;
            ans = ans+ (rem*multiplier);
            multiplier = multiplier*a;
            n = n/10;
           
        }
        System.out.println(ans);
        scn.close();
    }
}
