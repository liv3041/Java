package basics;
import java.util.Scanner;
public class SumofFirstNNaturalnumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int count =1;
        int sum =0;
        while(count<=n){
            sum=sum+count; // Sum of n Natural Numbers
            count=count+1;
        }
        System.out.println("The sum is: "+sum);

        scn.close();
    }
    
}
