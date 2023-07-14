package basics;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n = scn.nextInt();
        int cnt=0;
        for(int i = 1;i<=n;i++){
            if(n%i==0){
                cnt++;
            }
        }
        if(cnt==2){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
        }
        scn.close();

    }
    
}
