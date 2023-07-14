package arrays;
import java.util.Scanner;
public class binarysearch {
    static Scanner scn = new Scanner(System.in);
    public static int[] takeinput(){
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
        return arr;
    }
    public static int binarySearch(int[] nums,int item){
        int lo = 0;
        int hi = nums.length-1;
        for(;lo<=hi;){
            int mid = (hi+lo)/2;
            if(nums[mid]<item){
                lo=mid+1;
            }
            else if(nums[mid]>item){
                hi=mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
       int arr [] = takeinput();
       int item = scn.nextInt();
        int a = binarySearch(arr,item);
        System.out.println(a);
    }
}
