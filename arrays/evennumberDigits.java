package arrays;
import java.util.Scanner;
public class evennumberDigits {
    static Scanner scn = new Scanner(System.in);
    public static int[] inputArray(){
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<arr.length;i++){
            arr[i] = scn.nextInt();
        }
        return arr;
    }
   public static int findNumbers(int[] nums){
       int digits = 0;
       int cnt =0;
       for(int i = 0;i<nums.length-1;i++){
                 if(nums[i]!=0){
                    int n = nums[i];
                  //  int rem=n%10;
                   digits++;
                   n=n/10;
                 }
               if (digits%2==0){
               cnt++;
           }
       }
       return cnt;
   }

    public static void main(String[] args) {
        int [] arr = inputArray();
        int a = findNumbers(arr);
        System.out.println(a);
    }
}
