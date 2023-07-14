package arrays;
import java.util.Scanner;
public class Consecutivenumbers{
    static Scanner scn = new Scanner(System.in);
    public static int [] inputArray(){
        int n = scn.nextInt();
        int [] arr = new int[n];
        
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == 0 || arr [i] == 1){
                arr[i]=scn.nextInt();
            }
        }
        return arr;

    }
    public static int findMaxconsecutiveOnes(int [] nums){
        int cnt = 0;
        
        for(int i=0;i<nums.length-1;i++){
            if(nums[i] == 1 && nums[i+1] == 1 ){
                cnt++;
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        int [] arr = inputArray();
        int a = findMaxconsecutiveOnes(arr);
        System.out.println(a);
    }
}
