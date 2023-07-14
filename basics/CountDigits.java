package basics;
import java.util.Scanner;
public class CountDigits {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int digit = scn.nextInt();
        int cnt = 0;
         int sum =0;
        while(n!=0){
             int rem = n%10;
             if (rem == digit){
                 cnt++;
             }
              sum =(sum*10)+rem;
             n= n/10;
             
        }
        System.out.println(cnt);
        scn.close();
    }
}
