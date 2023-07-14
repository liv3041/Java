package basics;
import java.util.Scanner;

public class Series {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int sum;
        int cnt = 0;
        for(int i = 1;i<=100;i++){
              sum = 3*i+2;
             if(sum%n2!=0 && cnt<n1){
                  System.out.println(sum);
                  cnt++;
             }
            
        }
        
        scn.close();
    }
}
