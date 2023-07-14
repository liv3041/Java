package arrays;
import java.util.Scanner;
public class Minimumelement {
    static Scanner scn = new Scanner(System.in);
    public static int[] takeinput(){
        int n = scn.nextInt();
        int [] arr = new int[n];
        for(int i = 0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
        return arr;
    }
    public static int minimumelement(int[] nums){
       int min = Integer.MAX_VALUE;
       for(int i = 0;i<nums.length;i++){
           if(nums[i]<min){
               min = nums[i];
           }
       }
       return min;
    }
    public static void main(String[] args) {
        int[] arr = takeinput();
        int n = minimumelement(arr);
        System.out.println(n);
    }
}
