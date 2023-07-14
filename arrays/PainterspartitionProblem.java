package arrays;
import java.util.Scanner;
public class PainterspartitionProblem {
    static Scanner scn = new Scanner(System.in);
    public static int[] takeinput(){
        int n = scn.nextInt();
        int [] boards = new int[n];
        for(int i=0;i<boards.length;i++){
            boards[i]=scn.nextInt();
        }
        return boards;
    }
    public static Boolean isPossible(int[] boards,int painters,int mid){
        int no_of_painters =1;
        int boardsum =0;
        for(int i=0;i<boards.length;i++){
            if(boardsum+boards[i]<=mid){
                boardsum+=boards[i];
            }
            else{
                no_of_painters++;
                if(no_of_painters>painters || boards[i]>mid){
                    return false;
                }
                boardsum=boards[i];
            }
        }
        return true;

    }
    public static int minimumtime(int[] boards, int painters){
        int s =0;
        int sum =0;
        for(int i=0;i<boards.length;i++){
            sum+=boards[i];
        }
        int e=sum;
        int ans=-1;
        while(s<=e){
            int mid=(s+e)/2;
            if(isPossible(boards,painters,mid)){
                ans=mid;
                e=mid-1;
            }
            else{
                s=mid+1;
            }
            
        }
        return ans;
    }
    public static void main(String[] args) {
        int painters = scn.nextInt();
        int [] boards = takeinput();
        int a = minimumtime(boards, painters);
        System.out.println(a);
    }
}
