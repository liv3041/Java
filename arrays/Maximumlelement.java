package arrays;
import java.util.Scanner;
public class Maximumlelement {
    static Scanner scn = new Scanner(System.in);
    public static int[] takeinput(){
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
        return arr;
    }
    public static int maximumelementinArray(int [] num){
       int max =Integer.MIN_VALUE;
       for(int i=0;i<num.length;i++){
            if(num[i]>max){
                max=num[i];
            }
       }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = takeinput();
        int n = maximumelementinArray(arr);
        System.out.println(n);
    }
}
