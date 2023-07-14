package recursion;
import java.util.Scanner;

public class tillingproblem {
    static Scanner scn = new Scanner(System.in);
    public static int countways(int n , int m){
        int count[]= new int[n+1];
        count[0]=0;
        for(int i=0;i<=n;i++){
            if(i>m){
                count[i]=count[i-1]+count[i-m];
            }
           else if(i<m||i==1){
                count[i]=1;
            }
           
            else{
                count[i]=2;
            }
           
        }
        return count[n];
    }
public static void main(String[] args) {
    int t = scn.nextInt(); //test case
    for(int i=0;i<t;i++){
    int n = scn.nextInt();
    int m = scn.nextInt();
   System.out.println(countways(n,m));
    }

}
}
