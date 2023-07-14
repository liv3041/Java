package arrays;
import java.util.Scanner;
public class InsertionSort {
    static Scanner scn = new Scanner(System.in);
    public static int[] takeinput(){
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
        return arr;
    }
    public static void insertionsort(int[] arr){
      for(int i=0;i<=arr.length-1;i++){
          int val=arr[i];
          int j =i-1;
          while(j>=0&&arr[j]>val){
              arr[j+1]=arr[j];
              j--;
          }
          arr[j+1]=val;
      }
        System.out.println("Sorted Array:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
    }
    public static void main(String[] args) {
        int[] arr = takeinput();
        insertionsort(arr);
    }
}
