package arrays;
import java.util.Scanner;
public class bookallocation {
    static Scanner scn = new Scanner(System.in);
   
    public static int[] takeinput(int n){
       int[] arr= new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
        return arr;
    }
public static int maximum(int[] nums){
          int max= Integer.MIN_VALUE;
          for(int i =0;i<nums.length;i++){
              if(nums[i]>max){
                  max=nums[i];
              }
          }
          return max;
}
public static long sum(int[] nums){
    long sum=0;
    for(int i=0;i<nums.length;i++){
         sum+=nums[i];
    }
    return sum;
}
public static Boolean isfeasible(int[] arr,int k,int res){
    int student =1;
    int sum=0;
    for(int i=0;i<arr.length;i++){
        if(arr[i]>res)
            return false;
        if(sum+arr[i]>res){
            student++;
            sum=sum+arr[i];
        }
        else{
            sum= sum+arr[i];
        }
    }
    return student<=k;
}
public static int minimum_pages(int[] arr,int m){
        int min = maximum(arr);
        int max = (int)sum(arr);
        int ans =Integer.MAX_VALUE;
        while(min<=max){
            int mid=(max+min)/2;
            if(isfeasible(arr,m,mid)){
                ans = mid;
               max=mid-1;
            }
            else{
                min=mid+1;
            }
        }
        return ans;
}
    public static void main(String[] args) {
        int t = scn.nextInt();
        for(int i=0;i<t;i++){
            int n = scn.nextInt();
            int m = scn.nextInt();
            int[] arr = takeinput(n);
            int a= minimum_pages(arr,m);
            System.out.println(a);
            }
    }
}
