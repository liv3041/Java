package arrays;
import java.util.Scanner;
public class SelectionSort {
    static Scanner scn = new Scanner(System.in);
    public static int[] takeinput(){
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
        return arr;
    }
    public static void selectionsort(int[] arr){
        int min;
        for(int i=0;i<arr.length;i++){
            min=i;
            for(int j = 0;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min = j;
                }
                int temp = arr[min];
                arr[min]=arr[j];
                arr[j]=temp;
            }
        }
        System.out.println("Sorted array:");
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
    }
    public static void main(String[] args) {
        int [] arr=takeinput();
        selectionsort(arr);
    }
}
