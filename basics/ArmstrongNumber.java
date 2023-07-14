package basics;
import java.util.Scanner;
import java.lang.Math;
public class ArmstrongNumber {
  public static Boolean armstrongnumber(int n){
        int digits =0;
        int temp =n;
        while(temp>0){
            temp=temp/10;
            digits++;
         }
        temp=n;
        long ans =0;
        while(temp>0){
             int rem =temp%10;
             ans +=(int) (Math.pow(rem,digits));
             temp=temp/10;
            }
            if(n==ans){
                return true;
            }
            else{
                return false;
            }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        if(armstrongnumber(n)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
        scn.close();
    }
}
