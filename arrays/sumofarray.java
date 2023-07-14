package arrays;
import java.util.Scanner;
//import java.io.*;
public class sumofarray {
    static Scanner scn = new Scanner(System.in);
    public static void sum(int[] a, int[] b , int n , int m){
            int carry = 0;
            int sum =0;
            int i =n-1;
            int j = m-1;
            int k=n-1;
           int[] c = new int[n];
           while(j>=0){
               sum=a[i]+b[j]+carry;
               c[k]=sum%10;
               carry = sum/10;
               k--;
               i--;
               j--;
           }
           while(i>=0){
               sum = a[i]+carry;
               c[k]=sum%10;
               carry=sum/10;
               i--;
               k--;
           }
          int res;
           if(carry==1){
               res=10;
           }
           for(int p =0;p<n;p++){
              System.out.print(c[p]+", ");
           }
           System.out.print("END");
            
    }
    public static void calSum(int[] a,int[] b , int n,int m){
        if(n>=m){
             sum(a,b,n,m);
        }
        else{
            sum(b,a,m,n);
        }
        }
           
    public static void main(String[] args) {
        int  n = scn.nextInt();
        int[] a = new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=scn.nextInt();
        }
        int m = scn.nextInt();
        int[] b = new int[m];
        for(int i=0;i<b.length;i++){
            b[i]=scn.nextInt();
        }
        calSum(a,b,n,m);
    }
}
