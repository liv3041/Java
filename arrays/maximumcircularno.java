package arrays;
import java.util.Scanner;
public class maximumcircularno {
    static Scanner scn = new Scanner(System.in);
    public static int[] takeinput(){
        int n = scn.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = scn.nextInt();
        }
        return arr;
    }
    public static int maximumSubarraySum(int[] nums){
        // Kadane's Algorithm
        int max_sum = 0;
        int cur_sum =0;
        for(int i=0;i<nums.length;i++){
           cur_sum =cur_sum + nums[i];
           if(cur_sum>max_sum){
               max_sum=cur_sum;
           }
           else{
               if(cur_sum<0){
                   cur_sum=0;
               }
           }
        }
        return max_sum;
    }
    public static int sum(int[] nums){
        //Reverse Kadane's Algorithm
         int sum =0;
         for(int i =0;i<nums.length;i++){
            sum = sum + nums[i];
       }
       // Inverting the signs of digits in the array
        for(int i=0;i<nums.length;i++){
            nums[i] = -nums[i];
        }
        // Calling the Kadane's Algorithm to find the maximum of the inverted array.
       int min_sum=maximumSubarraySum(nums);
       // Adding the maximum value obtained from the above function to the sum of original array
       System.out.println(min_sum);
        int esum = sum + min_sum;
         return esum;
    }
    public static void main(String[] args) {
        int t = scn.nextInt();
        for(int i =0;i<t;i++){
            int[] arr = takeinput();
            int a = maximumSubarraySum(arr);
            int n = sum(arr);
            //Finding the maximum between kadane's algorithm and reverse kadane's algorithm
             System.out.println(Integer.max(a,n));
        }
       
    }

}
