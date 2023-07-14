package arrays;
import java.util.Scanner;

public class helprahultosearch {
    static Scanner scn  = new Scanner(System.in);
    public static int[] takeinput(){
        int n = scn.nextInt();
        int [] arr = new int [n];
        for(int i = 0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
      
        return arr;
    }
    public static int helpingrahul(int [] arr , int item){
         int lo =0;
        int hi = arr.length-1; 
       while(lo<=hi){
            int mid = (lo+hi)/2;
          if(arr[mid]==item){
              return mid;
          }
          if(arr[lo]<arr[hi]){
              if(item>=arr[lo]&&item<arr[mid]){
                  hi=mid-1;
              }
              else{
                  lo=mid+1;
              }
          }
          else{
              if(item>arr[mid]&&item<=hi){
                  lo=mid+1;
              }
              else{
                  hi=mid-1;
              }
          }
       }
       return -1;
    }
    public static void main(String[] args) {
        int [] arr = takeinput();
        int item = scn.nextInt();
        int a = helpingrahul(arr,item);
        System.out.println(a);
    }
}
