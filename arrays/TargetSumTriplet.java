package arrays;
import java.util.Scanner;
import java.util.Arrays;
public class TargetSumTriplet {
    static Scanner scn = new Scanner(System.in);
    public static int[] takeinput(){
        int n = scn.nextInt();
        int[] arr= new int[n];
        for(int i =0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
        Arrays.sort(arr);
        return arr;
    }
    public static void sum_triplet(int[] arr){
        int target = scn.nextInt();
        for(int i =0;i<arr.length;i++){
        int left = i+1;
        int right = arr.length-1;
        while(left<right){
            
                if(arr[i]+arr[left]+arr[right]==target){
                    System.out.println(arr[i]+", "+arr[left]+" and "+arr[right]);
                    left++;
                    right--;
                }
                 
              if(arr[i]+arr[left]+arr[right]>target){
                  right--;
              }
              if(arr[i]+arr[left]+arr[right]<target){
                  left++;
              }
        }
                
            }
        }
        public static void main(String[] args) {
            int[] arr= takeinput();
            sum_triplet(arr);
        }
    }