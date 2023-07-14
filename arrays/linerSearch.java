package arrays;
import java.util.Scanner;
public class linerSearch {
    static Scanner scn = new Scanner(System.in);
    public static int[] takeinput(){
        int n = scn.nextInt();
        int[] arr = new int [n];
       for(int i = 0;i<arr.length;i++){
           arr[i] = scn.nextInt();
       }
       return arr;
    }
    public static int linearsearch(int[] nums,int item){
        for(int i = 0;i<nums.length;i++){
            if(nums[i] == item){
            
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int item = scn.nextInt();
        int[] arr = takeinput();
        int n= linearsearch(arr,item);
        System.out.println(n);
    }
}
