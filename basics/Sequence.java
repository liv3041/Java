package basics;
import java.util.Scanner;
public class Sequence {
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        Boolean flag = true;
        for(int i = 1;i<=n;i++){
            int S = scn.nextInt();
            if(i == S|| i+1== S+1 || S>0){
               flag = true;
            }
            else{
                flag = false;
            }
        }
        System.out.println(flag);
        scn.close();
    }
}
