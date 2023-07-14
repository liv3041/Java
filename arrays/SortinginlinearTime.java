package arrays;
import java.util.Scanner;

public class SortinginlinearTime {
   static Scanner scn = new Scanner(System.in);
 
    public static int[] Sorting(){
        int n = scn.nextInt(); 
        int[] arr = new int [n];
        int lo = 0;
        int mid = 0;
        int hi = arr.length-1;
        int temp;
        for(int i = 0;i<arr.length;i++){
            if ( arr[i] == 0 || arr[i] == 1|| arr[i]==2){
                arr[i]=scn.nextInt();
            }
        }
        while(mid<=hi){
            if(arr[mid]==0){
                temp = arr[lo];
                arr[lo]=arr[mid];
                arr[mid]=temp;
                lo++;
                mid++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
                temp = arr[mid];
                arr[mid]=arr[hi];
                arr[hi]=temp;
                hi--;
            }
         
        }
      return arr;
}
   public static void display (int[] arr){
              for(int i = 0;i<arr.length;i++){
                  System.out.println(arr[i]);
              }
   }
    public static void main(String[] args) {
            int [] arr = Sorting();
            display (arr);
       }
   
}
