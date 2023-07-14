package arrays;
import java.util.Scanner;
public class aggresivecows {
    static Scanner scn = new Scanner(System.in);
    public static int[] takeinput(int n){
      
        int [] arr = new int [n];
        for(int i =0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
        return arr;
    }
    public static Boolean isPossible(int[] stalls , int k , int mid){
       int no_of_cows =1;
       int lastpos=stalls[0];
        for(int i=0;i<stalls.length;i++){
            if(stalls[i]-lastpos>=mid){
                lastpos = stalls[i];
                no_of_cows++;
                if(no_of_cows==k){
                    return true;
                }
                //lastpos = stalls[i];
            }
        } 
        return false;
    }
    public static int aggresive_cows(int[] stalls , int k){
        int s = 0;
       /* int max = -1;
        for(int i =0;i<stalls.length;i++){
            max = Integer.max(max,stalls[i]);
        }
        int e = max;
        */
        int e = stalls.length-1;
        int ans =-1;
        while(s<=e){
            int mid=(s+e)/2;
            if(isPossible(stalls,k,mid)){
                ans = mid;
                s = mid+1;
               }
            else{
                e=mid-1;  
            
            }
        }
        return ans;

    }
    public static void main(String[] args) {
        int n = scn.nextInt();
        int k = scn.nextInt();
        int [] stalls = takeinput(n);
        int a = aggresive_cows(stalls,k);
        System.out.println(a);
    }
}
