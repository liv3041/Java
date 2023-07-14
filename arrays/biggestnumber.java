package arrays;
import java.util.Scanner;
import java.util.Arrays;
public class biggestnumber {
    static Scanner scn = new Scanner(System.in);
    public static int[] takeinput(){
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
        return arr;
    }
    public static void tocompare(int[] arr){
             Arrays.toString(arr);
        for(int i =0;i<arr.length;i++){
            for(int j = 0;j<arr.length-1-i;++j){
               if(arr[j]<arr [j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
               }
            }
        }
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
    public static void main(String[] args) {
        int[] arr = takeinput();
        tocompare(arr);
    }
}
