package arrays;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class maximumSubarraysum {
    static Scanner scn = new Scanner(System.in);
    public static int[] takeinput()throws IOException{
         int n = scn.nextInt();
        int[] arr = new int[n];
        // space seperated Input
        BufferedReader sb = new BufferedReader(new InputStreamReader(System.in));
         String s[] = sb.readLine().split(" ");
        for(int i= 0;i<s.length;i++){
            arr[i]=Integer.parseInt(s[i]);
        }
        return arr;
        
       
}
    public static int maximumSubarraySum(int[] nums){
        int max_sum =0;
        int cur_sum =0;
        for(int i=0;i<nums.length;i++){
            cur_sum += nums[i];
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
    public static void main(String[] args) throws IOException {
        int n= scn.nextInt();
        for(int i=0;i<n;i++){
        int[] arr = takeinput();
        int a = maximumSubarraySum(arr);
        System.out.println(a);
        }
    }
}
