package basics;
import java.util.Scanner;
public class DecimaltoOctal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int multiplier = 1;
        int ans = 0;
        int a = 10;
        while(n!=0){
            int rem = n%8;
            ans = ans+(rem*multiplier);
            multiplier = multiplier*a;
            n=n/8;
        }
        System.out.println(ans);
        scn.close();
    }
}
