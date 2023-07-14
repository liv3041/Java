package arrays;
import java.util.Scanner;
public class columnwiseprint {
    static Scanner scn = new Scanner(System.in);
    public static void twodarraycolumnwiseprint(){
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
              arr[i][j]=scn.nextInt();  
            }
        }
       
            for(int j=0;j<m;j++){
                 if(j%2==0){
                     for(int i=0;i<arr[j].length;i++){
                           System.out.print(arr[i][j]+", ");
                     }
                 }
                 else{
                     for(int i=arr[j].length-1;i>=0;i--){
                         System.out.print(arr[i][j]+", ");
                     }
                 }
            }
         System.out.println("END");  
       
    }
    public static void main(String[] args) {
        twodarraycolumnwiseprint();
    }
}
