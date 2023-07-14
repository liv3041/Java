package arrays;
import java.util.Scanner;
import java.lang.Math;

public class kthroot {
    public static double multiply(double mid,int k){
        double ans =1.0;
        for(int i=0;i<k;i++){
            ans = ans*mid;
        }
        return ans;

    }

    public static void greatestInteger(int n , int k){
       
        double low = 0;
        double high = n-1;
        double epsilon = 1e-16;
        while((high-low)>epsilon){
            double mid =(low+high)/2.0;
            if(multiply(mid,k)<=n){
                
                 low=mid;
            }
            else{
                high=mid;
            }
            
        }
        System.out.println(Math.round(low));
        
        
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int testcase = scn.nextInt();
        for(int i =0;i<testcase;i++){
            int n = scn.nextInt();
            int k = scn.nextInt();
           greatestInteger(n, k);
           
        }
            scn.close();
        
       

    }
}

