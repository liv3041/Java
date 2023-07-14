package arrays;
import java.util.Scanner;
public class UpperBoundandLowerbound {
    static Scanner scn = new Scanner(System.in);
    public static int[] takeinput(){
        int n = scn.nextInt();
        int [] arr = new int [n];
        for(int i =0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
        return arr;
    }
    public static int lowerbound(int [] arr,int x){
         int low =0;
         int high = arr.length-1;
         int ans =-1;
         while(low<=high){
             int mid = (low+high)/2;
             if(arr[mid]==x){
                 ans=mid;
                 high = mid-1;
             }
             else if(x<arr[mid]){
                 high=mid-1;
             }
             else{
                 low=mid+1;
             }
         }
         return ans;
    }
    public static int upperbound(int[] arr , int x){
        int low=0;
         int high = arr.length-1;
         int ans=-1;
         while(low<=high){
             int mid =(low+high)/2;
             if(arr[mid]==x){
                 ans=mid;
                 low=mid+1;
             }
             else if(x<arr[mid]){
                 high = mid-1;
             }
             else{
                 low=mid+1;
             }
         }
         return ans;
    }
    public static void main(String[] args) {
        int [] arr = takeinput();
        int query = scn.nextInt();
       for(int i =0;i<query;i++){
           int x = scn.nextInt();
           int a = lowerbound(arr,x);
           int b = upperbound(arr,x);
           System.out.println(a+"\t"+b);
       }
    }
}
