package arrays;
import java.util.Scanner;
public class Matrixsearch {
    static Scanner scn = new Scanner(System.in);
    public static int[][] takeinput(int n , int m){
        int a = n;
        int b = m;
          int [][] arr = new int[a][b];
           for(int i = 0;i<a;i++){
               for(int j = 0;j<b;j++){
                   arr[i][j] = scn.nextInt();
               }
           }
           return arr;
    }
    public static int matrixsearch(int[][] arr,int n, int m){
        int a = n;
        int b = m;
        int x = scn.nextInt();
        for(int i =0;i<a;i++){
            for(int j = 0;j<b;j++){
                if(arr[i][j] == x){
                 return 1;
                }
                
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = takeinput(n,m);
        int item = matrixsearch(arr,n,m);
         System.out.println(item);
    }
}
