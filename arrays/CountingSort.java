package arrays;
import java.util.Scanner;
public class CountingSort {
    static Scanner scn = new Scanner (System.in);
    public static int[] takeInput(int size){
       int [] arr = new int[size];
        for(int i =0;i<size;i++){
            arr[i]=scn.nextInt();
        }
        return arr;
    }
    public static int getmax(int[] arr,int size){
        int max = arr[0];
        for(int i=1;i<size;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;

    }
    public static void countingsort(int [] arr,int size){
        int[] res = new int[size+1];
        int max = getmax(arr,size);
        int[] count = new int[max+1];
        //Initialising count array with 0 element
        for(int i =0;i<max;++i){
            count[i]=0;
        }
        //calculating the frequency of arr[i]
        for(int i=0;i<size;i++){
            count[arr[i]]++;
        }
        /* This loop will find the index of each 
        element of original array in count and place
         the elements in output array*/
         for(int i=1;i<=max;i++){
             count[i]+=count[i-1];
         }
        for(int i=size-1;i>=0;i--){
            res[count[arr[i]]-1]=arr[i];
            count[arr[i]]--;
        }
        for(int i=0;i<size;i++){
            arr[i]=res[i];
        }
        // Printing array
        System.out.println("Sorted array:");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int size = scn.nextInt();
        int[] arr = takeInput(size);
        countingsort(arr,size);
    }
}
