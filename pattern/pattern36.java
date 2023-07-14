package pattern;
import java.util.Scanner;
public class pattern36 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int val = 1;
        for(int i =1;i<=n;i++){
            for(int j= 1;j<=i;j++){
                if(i%2!=0){
                    System.out.print(val);
                }
                else{
                    if(j==1|| i==j){
                        System.out.print(val);
                    }
                    else{
                        System.out.print("0");
                    }
                }
            }
            System.out.println();
        }
        scn.close(); 
    }
}
