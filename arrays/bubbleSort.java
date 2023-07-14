package arrays;
import java.util.Scanner;
public class bubbleSort {
    // BUBBLE SORT : Sorting by swapping elements
    static Scanner scn = new Scanner(System.in);
    public static int[] takeinput(){
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
        return arr;
    }
    public static void bubblesort(int[] nums){
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length-1-i;j++){
                if(nums[j]>nums[j+1]){
                int temp = nums[j];
                nums[j]=nums[j+1];
                nums[j+1]=temp;
            }
        }
        }
        System.out.println("Sorted array:");
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+"\t");
        }
        
    } 
    public static void main(String[] args) {
         int[] arr = takeinput();
         bubblesort(arr);
        
    }
    
}
