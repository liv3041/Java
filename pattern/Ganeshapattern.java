package pattern;
import java.util.Scanner;
public class Ganeshapattern {
    public static void ganeshapattern(int row,int col){
          for(int i=0;i<row;i++){
              for(int j =0;j<col;j++){
                  if(i<row/2){
                      if(j<col/2){
                          if(j==0)
                          System.out.print("*");
                          else
                           System.out.print(" "+" ");
                        }
                        else if(j== col/2)
                        System.out.print(" *");
                        else{
                            if(i==0)
                            System.out.print(" *");
                  }
                }
                else if(i==row/2){
                    System.out.print("* ");
                }
                else{
                    if(j==col/2 || j== col-1){
                        System.out.print("* ");
                    }
                    else if(i == row-1){
                        if(j<=col/2 || j== col-1){
                            System.out.print("* ");
                        }
                        else
                        System.out.print(" "+ " ");
                    }
                    else{
                        System.out.print(" "+" ");
                    }
                }
              
          }
          System.out.println();
    }
}
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int row = scn.nextInt();
        int col=scn.nextInt();
        ganeshapattern(row,col);
        scn.close();
       
        }
    }
