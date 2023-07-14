package arrays;
import java.util.Scanner;
public class cbscholarship {
    static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        long n = scn.nextLong();
        long m = scn.nextLong();
        long x = scn.nextLong();
        long y = scn.nextLong();
        long l =0;
        long h = n;
        long ans =-1;
        while(l<h){
            long mid=(l+h)/2;
            long a = mid*x;
            long b = m+((n-mid)*y);
            if(a<=b){
                ans = mid;
                l = mid+1;
            }
            else if(a==b){
                ans = mid;
                break;
            }
            else{
                h=mid-1;
            }
            
        }
        System.out.println(ans);
    }
}
