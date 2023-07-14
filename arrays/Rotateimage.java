package arrays;
import java.util.Scanner;
public class Rotateimage {
    static Scanner scn = new Scanner(System.in);
    public static int[][] takeinput(){
        int n = scn.nextInt();
        int[][] arr = new int [n][n];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                arr[i][j]=scn.nextInt();
            }
        }
        return arr;
    }
    public static void rotatinganticlockwise(int[][] arr){
       for(int i = arr.length-1;i>=0;i--){
            for(int j =0;j<arr.length;j++){
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int [][] arr= takeinput();
        rotatinganticlockwise(arr);
    }
}
