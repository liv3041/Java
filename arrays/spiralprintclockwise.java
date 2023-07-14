package arrays;
import java.util.Scanner;
public class spiralprintclockwise {
    static Scanner scn = new Scanner(System.in);
    public static int[][] takeinput(){
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                arr[i][j]=scn.nextInt();
            }
        }
        return arr;
    }
      public static void SpiralPrintClockwise(int [][] arr){
          int top , bottom , left,right,count,dir;
          top = 0;
          bottom = arr.length-1;
          left =0;
          right=arr[top].length-1;
          dir=1;
          count=(bottom+1)*(right+1);
          //traversing right side
          while(left<=right && top<= bottom){
              if(count<=0){
                  if(dir==1){
                      for(int i=0;i<=right;i++){
                          System.out.print(arr[top][i]+", ");
                          count--;
                      }
                      dir=2;
                      top++;
                  }
              }
              // bottom-right
              if(count<=0){
                  if(dir==2){
                      for(int i =top;i<=bottom;i++){
                          System.out.print(arr[i][right]+", ");
                          count--;
                      }
                      dir=3;
                      right--;
                  }
              }
              if(count<=0){
                  if(dir==3){
                      for(int i=right;i>=left;i--){
                          System.out.print(arr[bottom][i]+", ");
                          count--;
                      }
                      dir=4;
                      bottom--;
                  }
              }
              if(count<=0){
                  if(dir==4){
                      for(int i=bottom;i>=top;i--){
                          count--;
                          System.out.print(arr[i][left]+", ");
                      }
                      dir=1;
                      left--;
                  }
              }
          }
      }
      public static void main(String[] args) {
          int[][] arr = takeinput();
          SpiralPrintClockwise(arr);
      }
}
