package arrays;
import java.util.Scanner;
import java.util.Arrays;
public class Targetsumpair {
    static Scanner scn = new Scanner(System.in);
    public static void sumpair(){
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
        Arrays.sort(arr);
        int target = scn.nextInt();
        int left =0;
        int right=arr.length-1;
        while(left<right){
            if(arr[left]+arr[right]>target){
                  right--;
            }
            else{
                left++;
            }
            if(arr[left]+arr[right]==target){
                System.out.println(arr[left]+" and "+arr[right]);
            }
        }
    }
    public static void main(String[] args) {
        sumpair();
    }
}
